package com.ap.zoloz.hummer.api;

import java.util.HashMap;
import java.util.Map;

public class ZLZRequest {
    public Map<String, Object> bizConfig = new HashMap();
    public String zlzConfig;

    public String toString() {
        StringBuilder sb = new StringBuilder("ZLZRequest{zlzConfig=");
        sb.append(this.zlzConfig);
        sb.append(", bizConfig=");
        sb.append(this.bizConfig.toString());
        sb.append('}');
        return sb.toString();
    }
}
