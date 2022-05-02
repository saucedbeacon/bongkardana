package com.iap.ac.android.common.container.js;

import com.iap.ac.android.common.container.js.model.JSBridgeMessageToNative;
import org.json.JSONObject;

public abstract class ContainerBridgeContext {
    private JSBridgeMessageToNative toNativeMsg;

    public abstract boolean sendBridgeResult(String str, Object obj);

    public abstract boolean sendBridgeResult(JSONObject jSONObject);

    public JSBridgeMessageToNative getToNativeMsg() {
        return this.toNativeMsg;
    }

    public void setToNativeMsg(JSBridgeMessageToNative jSBridgeMessageToNative) {
        this.toNativeMsg = jSBridgeMessageToNative;
    }
}
