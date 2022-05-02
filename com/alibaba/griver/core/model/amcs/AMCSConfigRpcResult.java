package com.alibaba.griver.core.model.amcs;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AMCSConfigRpcResult implements Serializable {
    @Nullable
    public List<String> deleteKeys;
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo;
    public boolean increment;
    public String responseTime;
    public boolean success;
    @Nullable
    public Map<String, AMCSConfigKeyDetails> updateKeyDetails;
    @Nullable
    public JSONObject updateKeys;
}
