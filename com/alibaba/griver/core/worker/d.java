package com.alibaba.griver.core.worker;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5ServiceWorkerHook4Bridge;
import com.alibaba.griver.base.nebula.H5EventDispatchHandler;
import com.alibaba.griver.base.nebula.WorkerApiConfig;
import com.alibaba.griver.core.worker.H5Worker;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.iap.ac.android.container.js.ACJSBridge;

public class d extends b {
    /* access modifiers changed from: private */
    public final App e;
    private final String f = "viewId";
    private EngineRouter g;
    /* access modifiers changed from: private */
    public H5Worker h;
    private Handler i;

    public d(H5Worker h5Worker, App app) {
        super(h5Worker, app);
        this.e = app;
        this.h = h5Worker;
    }

    /* access modifiers changed from: protected */
    public void a(final String str, final JSONObject jSONObject, final H5ServiceWorkerHook4Bridge h5ServiceWorkerHook4Bridge, String str2, int i2) {
        Page activePage = this.e.getActivePage();
        if (activePage == null) {
            RVLogger.d("Griver:WebWorkerControllerProvider", "handleMsgFromJs but page == null! add to pageReady listener.");
            this.e.addPageReadyListener(new App.PageReadyListener() {
                public void onPageReady(Page page) {
                    d.this.a(page, str, jSONObject, h5ServiceWorkerHook4Bridge);
                }
            });
            return;
        }
        a(activePage, str, jSONObject, h5ServiceWorkerHook4Bridge);
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("JSBridgeReady".equals(str)) {
            this.h.b();
            return true;
        }
        RVLogger.d("Griver:WebWorkerControllerProvider", "handleMsgFromWorker msg = ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder();
        sb.append(((c) this.h).p());
        sb.append(ACJSBridge.JSAPI_PREFIX);
        String obj = sb.toString();
        if (!str.startsWith(obj)) {
            obj = str.startsWith("jserror:".concat(String.valueOf(obj))) ? "jserror:".concat(String.valueOf(obj)) : null;
        }
        if (TextUtils.isEmpty(obj)) {
            return false;
        }
        String replaceFirst = str.replaceFirst(obj, "");
        if (TextUtils.isEmpty(replaceFirst)) {
            int indexOf = str.indexOf(ACJSBridge.JSAPI_PREFIX);
            if (indexOf >= 0 && str.length() > indexOf) {
                RVLogger.d("Griver:WebWorkerControllerProvider", "handleMsgFromJS token invalid! prefixStr = ".concat(String.valueOf(str.substring(0, indexOf))));
            }
            return false;
        }
        JSONObject parseObject = JSONUtils.parseObject(replaceFirst);
        if (parseObject == null || parseObject.isEmpty()) {
            return false;
        }
        if (JSONUtils.getJSONObject(parseObject, "data", (JSONObject) null) == null) {
            RVLogger.e("Griver:WebWorkerControllerProvider", "invalid param, handleMsgFromWorker data = null");
        }
        if ("postMessage".equals(parseObject.getString("handlerName"))) {
            a(parseObject);
        } else {
            final String string = parseObject.getString("callbackId");
            if (TextUtils.isEmpty(string)) {
                RVLogger.e("Griver:WebWorkerControllerProvider", "invalid callbackId");
                return false;
            }
            a(parseObject.getString("handlerName"), parseObject, (H5ServiceWorkerHook4Bridge) new H5ServiceWorkerHook4Bridge() {
                public void onReceiveJsapiResult(JSONObject jSONObject) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("responseId", (Object) string);
                    jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject);
                    d.this.h.a((String) null, (String) null, jSONObject2);
                }
            }, this.h.c(), 80);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Handler d(String str) {
        if (WorkerApiConfig.getDefaultAsyncJsApiList().contains(str)) {
            return H5EventDispatchHandler.getAsyncHandler();
        }
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.i;
    }

    /* access modifiers changed from: private */
    public void a(Page page, String str, JSONObject jSONObject, H5ServiceWorkerHook4Bridge h5ServiceWorkerHook4Bridge) {
        final JSONObject jSONObject2 = jSONObject;
        final String str2 = str;
        final Page page2 = page;
        final H5ServiceWorkerHook4Bridge h5ServiceWorkerHook4Bridge2 = h5ServiceWorkerHook4Bridge;
        d(str).post(new Runnable() {
            public void run() {
                if (!d.this.e.isDestroyed()) {
                    JSONObject jSONObject = JSONUtils.getJSONObject(jSONObject2, "data", (JSONObject) null);
                    String string = JSONUtils.getString(jSONObject, "viewId", (String) null);
                    NativeCallContext.Builder node = new NativeCallContext.Builder().name(str2).params(jSONObject).node(page2);
                    StringBuilder sb = new StringBuilder("worker_");
                    sb.append(NativeCallContext.generateUniqueId());
                    d.this.e.getEngineProxy().getBridge().sendToNative(node.id(sb.toString()).render(d.this.a().getRenderById(string)).source(NativeCallContext.FROM_WORKER).build(), new SendToNativeCallback() {
                        public void onCallback(JSONObject jSONObject, boolean z) {
                            if (h5ServiceWorkerHook4Bridge2 != null) {
                                h5ServiceWorkerHook4Bridge2.onReceiveJsapiResult(jSONObject);
                            }
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(final JSONObject jSONObject) {
        if (!this.h.e()) {
            this.h.a((H5Worker.RenderReadyListener) new H5Worker.RenderReadyListener() {
                public void onRenderReady() {
                    d.this.a(jSONObject);
                }
            });
            return;
        }
        RVLogger.d("Griver:WebWorkerControllerProvider", "joMessage is ".concat(String.valueOf(jSONObject)));
        String string = JSONUtils.getString(JSONUtils.getJSONObject(jSONObject, "data", (JSONObject) null), "viewId", (String) null);
        Render renderById = a().getRenderById(string);
        if (renderById != null) {
            renderById.getRenderBridge().sendToRender(RenderCallContext.newBuilder(renderById).action("message").type("call").param(jSONObject).build(), (SendToRenderCallback) null);
            return;
        }
        RVLogger.w("Griver:WebWorkerControllerProvider", "postMessage but cannot find viewId: ".concat(String.valueOf(string)));
    }

    /* access modifiers changed from: private */
    public EngineRouter a() {
        App app;
        if (!(this.g != null || (app = this.e) == null || app.getEngineProxy() == null)) {
            this.g = this.e.getEngineProxy().getEngineRouter();
        }
        return this.g;
    }
}
