package com.iap.ac.config.lite.facade.request;

import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AmcsConfigRpcRequest implements Serializable {
    private static String b = e.b("AmcsConfigRpcRequest");

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f9814a;
    public String appId;
    public long lastResponseTime;
    public JSONObject parameters;
    public String tntInstId;
    public String workspaceId;

    public void addParameter(String str, Object obj) {
        if (this.parameters == null) {
            this.parameters = new JSONObject();
        }
        try {
            this.parameters.put(str, obj);
        } catch (JSONException e) {
            ACLog.w(b, "addParameter: failed", e);
        }
    }

    public void addParameters(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (this.parameters == null) {
                this.parameters = new JSONObject();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.parameters.put(next, jSONObject.opt(next));
                } catch (JSONException e) {
                    ACLog.w(b, "addParameter: failed", e);
                }
            }
        }
    }

    public Map<String, Object> convertParameters() {
        if (this.parameters == null) {
            return null;
        }
        this.f9814a = new HashMap();
        Iterator<String> keys = this.parameters.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.f9814a.put(next, this.parameters.opt(next));
            } catch (Exception e) {
                ACLog.w(b, "convertParameters: failed", e);
            }
        }
        return this.f9814a;
    }

    public long getLastResponseTime() {
        return this.lastResponseTime;
    }

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
