package com.alibaba.griver.core.jsapi.worker;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVMonitor;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.engine.api.model.WorkerStore;
import com.alibaba.ariver.engine.api.point.WorkerExceptionPoint;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.api.track.EventAttr;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.PackageQueryPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.proxy.RVPluginResourceManager;
import com.alibaba.ariver.resource.content.ResourcePackagePool;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.iap.ac.android.container.constant.ContainerKeys;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Keep
public class WorkerBridgeExtension implements BridgeExtension {
    private static final String MONITOR_REGISTER_WORK_SUCCESS = "register_work_success";
    private static final String TAG = "AriverEngine:WorkerBridgeExtension";
    private Map<String, Future<BridgeResponse>> mLoadedPlugins = new ConcurrentHashMap();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void registerWorker(@BindingNode(Page.class) Page page, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"worker"}) String str) {
        RVLogger.d(TAG, String.format("Track[Stage] %s, [timeStamp] %d", new Object[]{"renderFrameworkFinish", Long.valueOf(SystemClock.elapsedRealtime())}));
        final String substring = str.substring(0, str.indexOf("?"));
        final RVEngine engineProxy = page.getApp().getEngineProxy();
        EngineRouter engineRouter = engineProxy.getEngineRouter();
        ((WorkerStore) page.getData(WorkerStore.class, true)).workerId = substring;
        ((WorkerStore) page.getApp().getData(WorkerStore.class, true)).workerId = substring;
        if (engineRouter.getWorkerById(substring) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) "installed");
            bridgeCallback.sendJSONResponse(jSONObject);
            try {
                ((RVMonitor) RVProxy.get(RVMonitor.class)).flowLog("register_work_success", "Render registerWork success", "Render", page.getApp() != null ? page.getApp().getAppId() : "", page.getPageURI(), (Map<String, Object>) null);
            } catch (Throwable th) {
                RVLogger.e(TAG, "flowLog exception:", th);
            }
        } else if (TextUtils.isEmpty(substring)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            RVLogger.d(TAG, "REGISTER_WORKER worker: ".concat(String.valueOf(substring)));
            final Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
            final String userAgent = page.getRender().getUserAgent();
            final Page page2 = page;
            final BridgeCallback bridgeCallback2 = bridgeCallback;
            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                public void run() {
                    WorkerBridgeExtension.this.createWorkerInner(page2, bridgeCallback2, substring, engineProxy, applicationContext, userAgent);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void createWorkerInner(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"worker"}) String str, RVEngine rVEngine, Context context, String str2) {
        try {
            Worker createWorker = ExtensionPoint.as(CreateWorkerPoint.class).node(page).create().createWorker(context, page, str, str2);
            if (createWorker != null) {
                RVLogger.d(TAG, "REGISTER_WORKER create ExtensionWorker ".concat(String.valueOf(createWorker)));
            } else {
                RVLogger.d(TAG, "REGISTER_WORKER create NormalWorker");
                createWorker = rVEngine.createWorker(context, page, str, str2);
            }
            page.getApp().getEngineProxy().getEngineRouter().registerWorker(str, createWorker);
            RVLogger.d(TAG, "success setServiceWorkerID ".concat(String.valueOf(str)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) "installed");
            bridgeCallback.sendJSONResponse(jSONObject);
            try {
                ((RVMonitor) RVProxy.get(RVMonitor.class)).flowLog("register_work_success", "Render registerWork success", "Render", page.getApp() != null ? page.getApp().getAppId() : "", page.getPageURI(), (Map<String, Object>) null);
            } catch (Throwable th) {
                RVLogger.e(TAG, "flowLog exception:", th);
            }
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", (Object) F2FPayConstants.OrderStatus.FAILED);
            StringBuilder sb = new StringBuilder("createWorker exception! ");
            sb.append(th2.getMessage());
            jSONObject2.put("exception", (Object) sb.toString());
            bridgeCallback.sendJSONResponse(jSONObject2);
            RVLogger.e(TAG, "createWorker exception!", th2);
            ((EventTracker) RVProxy.get(EventTracker.class)).error(page, "WebEngineError", th2.getMessage()).putAttr(EventAttr.Key_abnormalCode, "registerWorkerError").putAttr(EventAttr.Key_abnormalMsg, th2.getMessage());
            ExtensionPoint.as(WorkerExceptionPoint.class).node(page).create().onCreateWorkerException(th2.getMessage());
        }
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse postMessage(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingParam(name = {"ariver_message"}) String str) {
        String str2 = ((WorkerStore) page.getData(WorkerStore.class, true)).workerId;
        EngineRouter engineRouter = page.getApp().getEngineProxy().getEngineRouter();
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("handlerName", (Object) "message");
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(RVConstants.KEY_POST_MESSAGE, (Object) str);
            jSONObject2.put("data", (Object) jSONObject3);
        } else {
            jSONObject2.put("data", (Object) jSONObject);
        }
        jSONObject2.getJSONObject("data").put(ContainerKeys.PARAM_PAGE_ID, (Object) Long.valueOf(page.getNodeId()));
        jSONObject2.getJSONObject("data").put("viewId", (Object) page.getRender().getRenderId());
        final Worker workerById = engineRouter.getWorkerById(str2);
        if (workerById == null) {
            RVLogger.e(TAG, "postMessage but cannot find worker for workerId: ".concat(String.valueOf(str2)));
            return BridgeResponse.newError(10, "cannot find worker for id: ".concat(String.valueOf(str2)));
        }
        if (workerById.isWorkerReady()) {
            workerById.getWorkerHandler().post(new Runnable() {
                public void run() {
                    workerById.sendJsonToWorker(jSONObject2, (SendToWorkerCallback) null);
                }
            });
        } else {
            workerById.registerWorkerReadyListener(new Worker.WorkerReadyListener() {
                public void onWorkerReady() {
                    workerById.getWorkerHandler().post(new Runnable() {
                        public void run() {
                            workerById.sendJsonToWorker(jSONObject2, (SendToWorkerCallback) null);
                        }
                    });
                }
            });
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public BridgeResponse loadPlugin(@BindingApiContext ApiContext apiContext, @BindingParam(required = true, value = {"plugin"}) String str, @BindingNode(App.class) App app) {
        return BridgeResponse.UNKNOWN_ERROR;
    }

    class PluginFuture implements Future<BridgeResponse> {

        /* renamed from: a  reason: collision with root package name */
        private App f9073a;
        private ApiContext b;
        private Worker c;
        private String d;
        private String e;
        private BridgeResponse f = null;

        public boolean cancel(boolean z) {
            return false;
        }

        public boolean isCancelled() {
            return false;
        }

        PluginFuture(App app, Worker worker, String str, String str2, ApiContext apiContext) {
            this.f9073a = app;
            this.c = worker;
            this.d = str;
            this.e = str2;
            this.b = apiContext;
        }

        public boolean isDone() {
            return this.f != null;
        }

        public synchronized BridgeResponse get() {
            if (this.f != null) {
                return this.f;
            }
            AppModel appModel = (AppModel) this.f9073a.getData(AppModel.class, false);
            if (!(appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getPlugins() == null)) {
                for (PluginModel appId : appModel.getAppInfoModel().getPlugins()) {
                    if (TextUtils.equals(appId.getAppId(), this.d)) {
                        RVLogger.d(WorkerBridgeExtension.TAG, "loadPlugin hit static pluginList!");
                        StringBuilder sb = new StringBuilder("__plugins__/");
                        sb.append(this.d);
                        sb.append("/index.js");
                        BridgeResponse.NamedValue newValue = BridgeResponse.newValue("url", sb.toString());
                        this.f = newValue;
                        return newValue;
                    }
                }
            }
            PluginModel requestPluginModel = ((RVPluginResourceManager) RVProxy.get(RVPluginResourceManager.class)).requestPluginModel(this.f9073a.getAppId(), this.d, this.e, this.f9073a, this.b);
            RVLogger.d(WorkerBridgeExtension.TAG, "loadPlugin requestPluginModel result: ".concat(String.valueOf(requestPluginModel)));
            if (requestPluginModel == null) {
                BridgeResponse.Error newError = BridgeResponse.newError(5, "cannot get pluginModel!");
                this.f = newError;
                return newError;
            }
            ResourceContext resourceContext = ResourceContextManager.getInstance().get(this.f9073a.getAppId());
            ResourcePackage createPluginPackage = ExtensionPoint.as(PackageQueryPoint.class).node(this.f9073a).create().createPluginPackage(requestPluginModel, resourceContext);
            if (createPluginPackage == null) {
                BridgeResponse.Error newError2 = BridgeResponse.newError(5, "cannot create PluginPackage!");
                this.f = newError2;
                return newError2;
            }
            ResourcePackagePool.getInstance().attach(createPluginPackage);
            resourceContext.attachResourcePackage(requestPluginModel.getAppId());
            createPluginPackage.setup(true);
            createPluginPackage.waitForSetup();
            this.c.loadPlugin(this.d);
            StringBuilder sb2 = new StringBuilder("__plugins__/");
            sb2.append(this.d);
            sb2.append("/index.js");
            BridgeResponse.NamedValue newValue2 = BridgeResponse.newValue("url", sb2.toString());
            this.f = newValue2;
            return newValue2;
        }

        public BridgeResponse get(long j, @NonNull TimeUnit timeUnit) {
            return get();
        }
    }
}
