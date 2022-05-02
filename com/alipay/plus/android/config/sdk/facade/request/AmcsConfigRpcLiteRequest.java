package com.alipay.plus.android.config.sdk.facade.request;

import com.alibaba.fastjson.JSONObject;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.io.Serializable;
import java.util.Map;

public class AmcsConfigRpcLiteRequest implements Serializable {
    private static String TAG = e.a("AmcsConfigRpcLiteRequest");
    public String appId;
    public String lastResponseTime;
    public JSONObject parameters;
    public String tntInstId;
    public String workspaceId;

    public void addParameter(String str, Object obj) {
        if (str != null) {
            if (this.parameters == null) {
                this.parameters = new JSONObject();
            }
            this.parameters.put(str, obj);
        }
    }

    public void addParameters(Map<String, Object> map) {
        if (map != null) {
            if (this.parameters == null) {
                this.parameters = new JSONObject();
            }
            this.parameters.putAll(map);
        }
    }

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
