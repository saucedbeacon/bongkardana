package com.ap.zoloz.hummer.api;

import java.util.HashMap;
import java.util.Map;

public class EkycRequest {
    public Map<String, Object> bizConfig = new HashMap();
    public String clientCfg = "";
    public Map<String, String> eKYCConfig = new HashMap();
    public String eKYCId;

    public String toString() {
        StringBuilder sb = new StringBuilder("EkycRequest{eKYCId=");
        sb.append(this.eKYCId);
        sb.append(", eKYCConfig=");
        sb.append(this.eKYCConfig.toString());
        sb.append(", clientCfg=");
        sb.append(this.clientCfg);
        sb.append(", bizConfig=");
        sb.append(this.bizConfig.toString());
        sb.append('}');
        return sb.toString();
    }
}
