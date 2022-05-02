package com.iap.ac.config.lite.facade.request;

import com.iap.ac.config.lite.utils.ConfigUtils;
import java.util.List;

public class AmcsConfigByKeysRpcV1Request extends AmcsConfigRpcV1Request {
    public List<String> keys;

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
