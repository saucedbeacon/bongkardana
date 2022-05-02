package com.alibaba.ariver.remotedebug.worker;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.SendToWorkerCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.iap.ac.android.container.js.ACJSBridge;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private EngineRouter f10160a;
    /* access modifiers changed from: private */
    public b b;

    public a(b bVar, EngineRouter engineRouter) {
        this.b = bVar;
        this.f10160a = engineRouter;
    }

    public boolean a(String str) {
        RVLogger.d("AriverRemoteDebug:JsApiHandler", "handleMsgFromWorker msg = ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(RDConstant.KYLIN_BRIDGE)) {
            return c(str);
        }
        return b(str);
    }

    private boolean b(String str) {
        JSONObject parseObject;
        RVLogger.d("AriverRemoteDebug:JsApiHandler", "handleJSMsgFromWorker msg = ".concat(String.valueOf(str)));
        String str2 = ACJSBridge.JSAPI_PREFIX;
        if (!str.startsWith(str2)) {
            str2 = str.startsWith("jserror:".concat(str2)) ? "jserror:".concat(str2) : null;
        }
        if (TextUtils.isEmpty(str2) || (parseObject = JSONUtils.parseObject(str.replaceFirst(str2, ""))) == null || parseObject.isEmpty()) {
            return false;
        }
        if (JSONUtils.getJSONObject(parseObject, "data", (JSONObject) null) == null) {
            RVLogger.e("AriverRemoteDebug:JsApiHandler", "invalid param, handleMsgFromWorker data = null");
        }
        if ("postMessage".equals(parseObject.getString("handlerName"))) {
            a(parseObject);
            return true;
        }
        final String string = parseObject.getString("callbackId");
        if (TextUtils.isEmpty(string)) {
            RVLogger.e("AriverRemoteDebug:JsApiHandler", "invalid callbackId");
            return false;
        }
        a(parseObject.getString("handlerName"), parseObject, new SendToWorkerCallback() {
            public void onCallBack(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("responseId", (Object) string);
                jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject);
                a.this.b.sendMessageToWorker((String) null, (String) null, jSONObject2.toJSONString());
            }
        });
        return true;
    }

    private boolean c(String str) {
        Uri parse = Uri.parse(str);
        RVLogger.d("AriverRemoteDebug:JsApiHandler", parse.toString());
        String scheme = parse.getScheme();
        String host = parse.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append(scheme);
        sb.append("://");
        sb.append(host);
        if (RDConstant.KYLIN_BRIDGE.equalsIgnoreCase(sb.toString())) {
            String queryParameter = parse.getQueryParameter("data");
            RVLogger.d("AriverRemoteDebug:JsApiHandler", "handleSyncJsApiCall data ".concat(String.valueOf(queryParameter)));
            JSONObject parseObject = JSONObject.parseObject(queryParameter);
            if (parseObject != null && !parseObject.isEmpty()) {
                final String string = JSONUtils.getString(parseObject, "action");
                final int i = JSONUtils.getInt(parseObject, "requestId");
                final String string2 = JSONUtils.getString(parseObject, "callback");
                if (!TextUtils.isEmpty(string2)) {
                    RVLogger.d("AriverRemoteDebug:JsApiHandler", "sync hasPermission true");
                    try {
                        a(string, parseObject, new SendToWorkerCallback() {

                            /* renamed from: a  reason: collision with root package name */
                            final long f10162a = System.currentTimeMillis();

                            public void onCallBack(JSONObject jSONObject) {
                                long currentTimeMillis = System.currentTimeMillis() - this.f10162a;
                                StringBuilder sb = new StringBuilder("tinyAppTimeCostLog:");
                                sb.append(string);
                                sb.append(" onReceiveJsapiResult cost ");
                                sb.append(currentTimeMillis);
                                RVLogger.d("AriverRemoteDebug:JsApiHandler", sb.toString());
                                if (jSONObject != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", (Object) "sync");
                                    jSONObject2.put("responseId", (Object) Integer.valueOf(i));
                                    jSONObject2.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject);
                                    jSONObject2.put("callback", (Object) string2);
                                    a.this.b.sendMessageToWorker((String) null, (String) null, jSONObject2.toJSONString());
                                    RVLogger.d("AriverRemoteDebug:JsApiHandler", "sync onReceiveJsapiResult action ");
                                }
                            }
                        });
                        return true;
                    } catch (Exception e) {
                        RVLogger.e("AriverRemoteDebug:JsApiHandler", "handleSyncJsApiCall...e=".concat(String.valueOf(e)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void a(final String str, JSONObject jSONObject, final SendToWorkerCallback sendToWorkerCallback) {
        StringBuilder sb = new StringBuilder("handleMsgFromJs: ");
        sb.append(str);
        sb.append(", param ");
        sb.append(jSONObject);
        RVLogger.d("AriverRemoteDebug:JsApiHandler", sb.toString());
        try {
            JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, "data", (JSONObject) null);
            String string = JSONUtils.getString(jSONObject2, "viewId", (String) null);
            Render renderById = this.f10160a.getRenderById(string);
            if (renderById == null) {
                StringBuilder sb2 = new StringBuilder("handleMsgFromJs: ");
                sb2.append(str);
                sb2.append(", but cannot find viewId for ");
                sb2.append(string);
                RVLogger.w("AriverRemoteDebug:JsApiHandler", sb2.toString());
                return;
            }
            NativeCallContext.Builder render = new NativeCallContext.Builder().name(str).params(jSONObject2).node(renderById.getPage()).render(renderById);
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(System.currentTimeMillis());
            renderById.getEngine().getBridge().sendToNative(render.id(sb3.toString()).build(), new SendToNativeCallback() {
                public void onCallback(JSONObject jSONObject, boolean z) {
                    StringBuilder sb = new StringBuilder("handleMsgFromJs: ");
                    sb.append(str);
                    sb.append(", return ");
                    sb.append(jSONObject);
                    RVLogger.d("AriverRemoteDebug:JsApiHandler", sb.toString());
                    SendToWorkerCallback sendToWorkerCallback = sendToWorkerCallback;
                    if (sendToWorkerCallback != null) {
                        sendToWorkerCallback.onCallBack(jSONObject);
                    }
                }
            });
        } catch (Throwable th) {
            StringBuilder sb4 = new StringBuilder("handleMsgFromJs: ");
            sb4.append(str);
            sb4.append(" exception!");
            RVLogger.e("AriverRemoteDebug:JsApiHandler", sb4.toString(), th);
            if (sendToWorkerCallback != null) {
                sendToWorkerCallback.onCallBack(BridgeResponse.INVALID_PARAM.get());
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        return b(jSONObject, "message");
    }

    public boolean a(JSONObject jSONObject, String str) {
        Render renderById = this.f10160a.getRenderById((String) null);
        if (renderById == null) {
            RVLogger.e("AriverRemoteDebug:JsApiHandler", "handleMessageToTopRender error! can't find target render");
            return false;
        }
        EngineUtils.sendToRender(renderById, this.b, str, jSONObject, (SendToRenderCallback) null);
        return true;
    }

    public boolean b(JSONObject jSONObject, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-362532793, oncanceled);
            onCancelLoad.getMin(-362532793, oncanceled);
        }
        Render renderById = this.f10160a.getRenderById(JSONUtils.getString(JSONUtils.getJSONObject(jSONObject, "data", (JSONObject) null), "viewId", (String) null));
        if (renderById == null) {
            RVLogger.e("AriverRemoteDebug:JsApiHandler", "handleMessage error! can't find target render");
            return false;
        }
        renderById.getRenderBridge().sendToRender(RenderCallContext.newBuilder(renderById).action(str).type("call").param(jSONObject).build(), (SendToRenderCallback) null);
        return true;
    }
}
