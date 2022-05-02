package com.alipay.iap.android.aplog.rpc;

import java.util.HashMap;
import java.util.Map;

public class MobileEnvInfo extends ToString {
    public String appVersion;
    public String browserType;
    public String browserVersion;
    public String cashierSdkVersion;
    public String clientIp;
    public String clientKey;
    public Map<String, String> extendInfo = new HashMap();
    public String latitude;
    public String locale;
    public MobileEnvLocationInfo locationInfo;
    public String longitude;
    public String merchantAppVersion;
    public String orderTerminalType;
    public String osType;
    public String osVersion;
    public String sourcePlatForm;
    public String terminalType;
    public String tokenId;
    public String webSiteLanguage;
}
