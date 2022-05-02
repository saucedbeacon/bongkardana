package com.alibaba.griver.core.model.amcs;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;

public class AMCSConfigRpcRequest implements Serializable {
    private static String TAG = "AmcsConfigRpcRequest";
    public String appId;
    public long lastResponseTime;
    private JSONObject parameters;
    public String tntInstId;
    public String workspaceId;

    public void addParameter(String str, Object obj) {
        if (this.parameters == null) {
            this.parameters = new JSONObject();
        }
        this.parameters.put(str, obj);
    }

    public void addParameters(JSONObject jSONObject) {
        if (this.parameters == null) {
            this.parameters = new JSONObject();
        }
        if (jSONObject != null && jSONObject.size() > 0) {
            this.parameters.putAll(jSONObject);
        }
    }
}
