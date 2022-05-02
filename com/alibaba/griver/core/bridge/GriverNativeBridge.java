package com.alibaba.griver.core.bridge;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.NativeCallNotFoundPoint;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.common.log.APILogUtils;
import com.alibaba.ariver.engine.api.point.NativeCallResultPoint;
import com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeGuard;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.security.AccessControlException;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController;
import com.alibaba.ariver.kernel.api.track.EventTrackStore;
import com.alibaba.ariver.kernel.api.track.EventTrackerUtils;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.permission.a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.api.bridge.GriverBridgeCallEvent;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.common.monitor.b;
import com.alibaba.griver.core.utils.i;
import java.util.ArrayList;
import java.util.List;

public class GriverNativeBridge implements NativeBridge {
    public static final String TAG = "GriverNativeBridge";

    /* renamed from: a  reason: collision with root package name */
    private boolean f10287a = false;
    private EngineRouter b;

    /* access modifiers changed from: protected */
    public void onRelease() {
    }

    public void bindEngineRouter(EngineRouter engineRouter) {
        this.b = engineRouter;
    }

    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback) {
        if (!this.f10287a && nativeCallContext != null) {
            return a(nativeCallContext, sendToNativeCallback, true);
        }
        RVLogger.w(TAG, "sendToNative but released!");
        return false;
    }

    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback, boolean z) {
        if (!this.f10287a && nativeCallContext != null) {
            return a(nativeCallContext, sendToNativeCallback, z);
        }
        RVLogger.w(TAG, "sendToNative but released!");
        return false;
    }

    private boolean a(final NativeCallContext nativeCallContext, @Nullable final SendToNativeCallback sendToNativeCallback, boolean z) {
        List<Render> registeredRender;
        SendToRenderCallback takeCallback;
        Page activePage;
        if (nativeCallContext == null) {
            RVLogger.w(TAG, "executeNative but bridgeContext == null!");
            return false;
        }
        if (nativeCallContext.getNode() == null) {
            RVLogger.w(TAG, "executeNative with node == null!!! may cause memory leak");
        }
        nativeCallContext.getStatData().triggerTimeStamp = SystemClock.elapsedRealtime();
        if (nativeCallContext.getRender() == null) {
            if (nativeCallContext.getNode() instanceof Page) {
                nativeCallContext.setRender(((Page) nativeCallContext.getNode()).getRender());
            } else if ((nativeCallContext.getNode() instanceof App) && (activePage = ((App) nativeCallContext.getNode()).getActivePage()) != null) {
                nativeCallContext.setRender(activePage.getRender());
            }
        }
        EngineRouter engineRouter = this.b;
        if (!(engineRouter == null || (registeredRender = engineRouter.getRegisteredRender()) == null)) {
            for (Render next : registeredRender) {
                if (next.getRenderBridge() != null && (takeCallback = next.getRenderBridge().takeCallback(nativeCallContext.getId())) != null) {
                    StringBuilder sb = new StringBuilder("executeNative hit callback! ");
                    sb.append(nativeCallContext.getId());
                    RVLogger.d(TAG, sb.toString());
                    takeCallback.onCallBack(nativeCallContext.getParams());
                    return true;
                }
            }
        }
        if (TextUtils.isEmpty(nativeCallContext.getName())) {
            RVLogger.w(TAG, "cannot dispatch empty API!");
            return true;
        }
        if (b.a(nativeCallContext.getName())) {
            b.a(nativeCallContext);
        }
        BridgeResponseHelper bridgeResponseHelper = new BridgeResponseHelper(new SendToNativeCallback() {
            public void onCallback(final JSONObject jSONObject, boolean z) {
                StringBuilder sb = new StringBuilder(RVTraceKey.RV_JSAPI_onCallback_);
                sb.append(nativeCallContext.getName());
                RVTraceUtils.traceBeginSection(sb.toString());
                NativeCallResultPoint nativeCallResultPoint = GriverNativeBridge.this.getNativeCallResultPoint(nativeCallContext);
                if (nativeCallResultPoint != null) {
                    nativeCallResultPoint.onSendBack(nativeCallContext, jSONObject);
                }
                if (sendToNativeCallback != null) {
                    nativeCallContext.getStatData().callbackTimeStamp = SystemClock.elapsedRealtime();
                    sendToNativeCallback.onCallback(jSONObject, z);
                }
                String jSONUtils = JSONUtils.toString(jSONObject);
                StringBuilder sb2 = new StringBuilder("executeNative jsapi rep name={");
                sb2.append(nativeCallContext.getName());
                sb2.append("} ");
                sb2.append(nativeCallContext.getId());
                sb2.append(" ");
                sb2.append(jSONUtils);
                sb2.append(", keepCallback: ");
                sb2.append(z);
                sb2.append(", stat: ");
                sb2.append(nativeCallContext.getStatData().print());
                RVLogger.d(GriverNativeBridge.TAG, sb2.toString());
                APILogUtils.logApiSendBack(nativeCallContext, jSONObject, jSONUtils);
                StringBuilder sb3 = new StringBuilder(RVTraceKey.RV_JSAPI_onCallback_);
                sb3.append(nativeCallContext.getName());
                RVTraceUtils.traceEndSection(sb3.toString());
                try {
                    GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
                        public void run() {
                            ExtensionPoint.as(GriverBridgeCallEvent.class).node(nativeCallContext.getNode()).create().onBridgeCall(nativeCallContext.getName(), nativeCallContext.getParams(), jSONObject);
                        }
                    });
                } catch (Exception e) {
                    GriverLogger.e(GriverNativeBridge.TAG, "send bridge call exception", e);
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("executeNative jsapi req name={");
        sb2.append(nativeCallContext.getName());
        sb2.append("} ");
        sb2.append(nativeCallContext.getId());
        RVLogger.d(TAG, sb2.toString());
        APILogUtils.logApiDispatch(nativeCallContext);
        if (EventTrackerUtils.isKeyJsApi(nativeCallContext.getName()) && (nativeCallContext.getNode() instanceof Page)) {
            EventTrackStore eventTrackStore = (EventTrackStore) ((Page) nativeCallContext.getNode()).getData(EventTrackStore.class, true);
            if (!eventTrackStore.apiCallIsFull()) {
                String trackerIdWithIndex = EventTrackerUtils.getTrackerIdWithIndex(TrackId.Stub_API_CALL, nativeCallContext.getName());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trackId", (Object) trackerIdWithIndex);
                jSONObject.put("start", (Object) Long.valueOf(SystemClock.elapsedRealtime()));
                if ("rpc".equals(nativeCallContext.getName())) {
                    jSONObject.put("operationType", (Object) nativeCallContext.getParams().getString("operationType"));
                }
                StringBuilder sb3 = new StringBuilder("add jsapi call start: ");
                sb3.append(nativeCallContext.getName());
                RVLogger.d(TAG, sb3.toString());
                eventTrackStore.jsapiCallDict.put(nativeCallContext.getId(), jSONObject);
            }
        }
        String name = nativeCallContext.getName();
        BridgeInterceptor bridgeInterceptor = BridgeInterceptorManager.getInstance().getBridgeInterceptor(name);
        if (bridgeInterceptor != null) {
            BridgeInterceptor.InterceptContext interceptContext = new BridgeInterceptor.InterceptContext();
            interceptContext.context = nativeCallContext.getRender().getActivity();
            interceptContext.page = (Page) nativeCallContext.getRender().getPage();
            interceptContext.jsParameters = nativeCallContext.getParams();
            interceptContext.miniProgramAppID = nativeCallContext.getRender().getAppId();
            interceptContext.miniProgramPageURL = nativeCallContext.getRender().getCurrentUri();
            i.a((Page) nativeCallContext.getNode(), interceptContext);
            if (bridgeInterceptor.willHandleJSAPI(name, interceptContext, new DefaultBridgeCallback(bridgeResponseHelper))) {
                StringBuilder sb4 = new StringBuilder("jsapi: ");
                sb4.append(name);
                sb4.append(" is intercepted by ");
                sb4.append(bridgeInterceptor);
                GriverLogger.d(TAG, sb4.toString());
                return true;
            }
        }
        if (BridgeDispatcher.getInstance().dispatch(nativeCallContext, bridgeResponseHelper, z)) {
            return true;
        }
        StringBuilder sb5 = new StringBuilder("executeNative but not found Extension!");
        sb5.append(nativeCallContext.getName());
        RVLogger.w(TAG, sb5.toString());
        if (z) {
            try {
                if (doCheckPermission(nativeCallContext, bridgeResponseHelper)) {
                    return true;
                }
            } catch (AccessControlException e) {
                StringBuilder sb6 = new StringBuilder("executeNative check failed for legacy call! ");
                sb6.append(nativeCallContext.getName());
                RVLogger.d(TAG, sb6.toString());
                String message = e.getMessage();
                if (message.startsWith("N22")) {
                    bridgeResponseHelper.sendNoRigHtToInvoke(message);
                } else {
                    bridgeResponseHelper.sendNoRigHtToInvoke();
                }
                return true;
            }
        }
        if (ExtensionPoint.as(NativeCallNotFoundPoint.class).node(nativeCallContext.getNode()).useCache(true).create().handleNotFound(nativeCallContext, bridgeResponseHelper)) {
            RVLogger.d(TAG, "executeNative handleNotFound intercepted");
            return true;
        }
        bridgeResponseHelper.sendNotFound();
        return false;
    }

    public boolean doCheckPermission(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        a aVar = new a(nativeCallContext, bridgeResponseHelper, BridgeDispatcher.getInstance().getExtensionManager());
        DefaultAccessController defaultAccessController = new DefaultAccessController();
        defaultAccessController.setAccessControlManagement(aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BridgeGuard(new BridgePermission(nativeCallContext.getName(), nativeCallContext.getName())));
        if (defaultAccessController.check(nativeCallContext.getNode(), arrayList, (AccessController.ApplyCallback) null)) {
            StringBuilder sb = new StringBuilder("executeNative check pending! ");
            sb.append(nativeCallContext.getName());
            RVLogger.d(TAG, sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder("executeNative check success! ");
        sb2.append(nativeCallContext.getName());
        RVLogger.d(TAG, sb2.toString());
        return false;
    }

    public NativeCallResultPoint getNativeCallResultPoint(NativeCallContext nativeCallContext) {
        return ExtensionPoint.as(NativeCallResultPoint.class).node(nativeCallContext.getNode()).create();
    }

    public final void release() {
        if (!this.f10287a) {
            this.f10287a = true;
            onRelease();
        }
    }
}
