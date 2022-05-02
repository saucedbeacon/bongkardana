package com.alipay.plus.android.config.sdk.facade.request;

import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.util.List;

public class AmcsConfigByKeysLiteRpcRequest extends AmcsConfigRpcLiteRequest {
    public List<String> keys;

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
