package com.iap.ac.config.lite.facade.result;

import androidx.annotation.Nullable;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class AmcsConfigRpcResult implements Serializable {
    @Nullable
    public List<String> deleteKeys;
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo;
    public boolean increment;
    public String responseTime;
    public boolean success;
    @Nullable
    public Map<String, AmcsConfigKeyDetails> updateKeyDetails;
    @Nullable
    public JSONObject updateKeys;

    public long getResponseTime() {
        return ConfigUtils.parseLong(this.responseTime, 0);
    }

    public void setDeleteKeys(@Nullable List<String> list) {
        this.deleteKeys = list;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setResponseTime(String str) {
        this.responseTime = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setUpdateKeyDetails(@Nullable Map<String, AmcsConfigKeyDetails> map) {
        this.updateKeyDetails = map;
    }

    public void setUpdateKeys(@Nullable JSONObject jSONObject) {
        this.updateKeys = jSONObject;
    }

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
