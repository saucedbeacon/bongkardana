package com.alipay.plus.android.config.sdk.facade.result;

import androidx.annotation.Nullable;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
    public Map<String, Object> updateKeys;

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
