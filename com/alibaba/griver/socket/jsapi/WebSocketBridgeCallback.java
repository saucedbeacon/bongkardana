package com.alibaba.griver.socket.jsapi;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.websocket.core.RVWebSocketCallback;
import com.alibaba.fastjson.JSONObject;
import java.io.UnsupportedEncodingException;
import o.getTabbarModel;

public class WebSocketBridgeCallback implements RVWebSocketCallback {

    /* renamed from: a  reason: collision with root package name */
    private Page f9101a;
    private boolean b;
    private String c;

    public WebSocketBridgeCallback(Page page, String str, boolean z) {
        this.f9101a = page;
        this.b = z;
        this.c = str;
    }

    public void onSocketOpen() {
        if (this.f9101a != null) {
            RVLogger.d("AriverAPI:WebSocketBridgeCallback", "enter onSocketOpen. ");
            if (!this.b || TextUtils.isEmpty(this.c)) {
                a("socketOpen", (JSONObject) null);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("socketTaskID", (Object) this.c);
            jSONObject.put("data", (Object) jSONObject2);
            a("onSocketTaskOpen", jSONObject);
        }
    }

    public void onSocketClose() {
        if (this.f9101a != null) {
            RVLogger.d("AriverAPI:WebSocketBridgeCallback", "enter onSocketClose. ");
            if (!this.b || TextUtils.isEmpty(this.c)) {
                a("socketClose", (JSONObject) null);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("socketTaskID", (Object) this.c);
            jSONObject.put("data", (Object) jSONObject2);
            a("onSocketTaskClose", jSONObject);
        }
    }

    public void onSocketMessage(byte[] bArr) {
        if (this.f9101a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", (Object) new String(Base64.encode(bArr, 2), getTabbarModel.ENC));
                jSONObject.put("isBuffer", (Object) Boolean.TRUE);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", (Object) jSONObject);
                if (!this.b || TextUtils.isEmpty(this.c)) {
                    a(RDConstant.SOCKET_MESSAGE, jSONObject2);
                    return;
                }
                jSONObject.put("socketTaskID", (Object) this.c);
                a("onSocketTaskMessage", jSONObject2);
            } catch (UnsupportedEncodingException e) {
                RVLogger.e("AriverAPI:WebSocketBridgeCallback", String.format("create string by buffer error. exception : %s", new Object[]{e.toString()}));
            }
        }
    }

    public void onSocketMessage(String str) {
        if (this.f9101a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) str);
            jSONObject.put("isBuffer", (Object) Boolean.FALSE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (!this.b || TextUtils.isEmpty(this.c)) {
                a(RDConstant.SOCKET_MESSAGE, jSONObject2);
                return;
            }
            jSONObject.put("socketTaskID", (Object) this.c);
            a("onSocketTaskMessage", jSONObject2);
        }
    }

    public void onSocketError(int i, String str) {
        if (this.f9101a != null) {
            RVLogger.d("AriverAPI:WebSocketBridgeCallback", "enter onSocketError. ".concat(String.valueOf(str)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", (Object) Integer.valueOf(i));
            JSONObject jSONObject2 = new JSONObject();
            if (!this.b || TextUtils.isEmpty(this.c)) {
                a("socketError", jSONObject);
                return;
            }
            jSONObject2.put("socketTaskID", (Object) this.c);
            jSONObject.put("data", (Object) jSONObject2);
            a("onSocketTaskError", jSONObject);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        Page page = this.f9101a;
        if (page != null) {
            EngineUtils.sendToRender(page.getRender(), str, jSONObject, (SendToRenderCallback) null);
        }
    }

    public void setPage(Page page) {
        this.f9101a = page;
    }
}
