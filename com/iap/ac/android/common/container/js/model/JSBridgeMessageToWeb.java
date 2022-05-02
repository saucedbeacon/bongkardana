package com.iap.ac.android.common.container.js.model;

import org.json.JSONObject;

public class JSBridgeMessageToWeb {
    private static final String TYPE_CALL = "call";
    private static final String TYPE_CALL_BACK = "callback";
    public String clientId;
    public String func;
    public String msgType = "callback";
    public JSONObject param;

    public JSBridgeMessageToWeb(JSBridgeMessageToNative jSBridgeMessageToNative) {
        this.clientId = jSBridgeMessageToNative.clientId;
        this.func = jSBridgeMessageToNative.func;
    }
}
