package com.iap.ac.config.lite.facade.result;

import com.iap.ac.config.lite.utils.ConfigUtils;
import java.io.Serializable;

public class AmcsConfigKeyDetails implements Serializable {
    public String version;

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
