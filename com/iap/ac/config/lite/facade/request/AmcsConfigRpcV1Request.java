package com.iap.ac.config.lite.facade.request;

import com.iap.ac.config.lite.utils.ConfigUtils;
import java.io.Serializable;

public class AmcsConfigRpcV1Request implements Serializable {
    public String business;
    public String channelId;
    public String clientVersion;
    public String lastResponseTime;
    public String manufacturer;
    public String mobileBrand;
    public String mobileModel;
    public String osVersion;
    public String productId;
    public String reference;
    public String requestIP;
    public String systemType;
    public String utdid;

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
