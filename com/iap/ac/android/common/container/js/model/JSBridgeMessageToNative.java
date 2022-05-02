package com.iap.ac.android.common.container.js.model;

import org.json.JSONObject;

public class JSBridgeMessageToNative {
    public String clientId;
    public String func;
    public String msgType;
    public JSONObject param;

    public String toString() {
        StringBuilder sb = new StringBuilder("JSBridgeMessageToNative{func='");
        sb.append(this.func);
        sb.append('\'');
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", msgType='");
        sb.append(this.msgType);
        sb.append('\'');
        sb.append(", clientId='");
        sb.append(this.clientId);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
