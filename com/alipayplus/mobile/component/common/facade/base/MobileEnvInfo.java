package com.alipayplus.mobile.component.common.facade.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MobileEnvInfo implements Serializable {
    public String LBSType;
    public String LBSUpdateTime;
    public String appVersion;
    public String cashierSdkVersion;
    public String channel;
    public String clientIp;
    public String clientKey;
    public String deliveryToken;
    public Map<String, String> extendInfo = new HashMap();
    public String imei;
    public String imsi;
    public String latitude;
    public String locale;
    public MobileEnvLocationInfo locationInfo;
    public String longitude;
    public String model;
    public String networkType;
    public String orderTerminalType;
    public String osType;
    public String osVersion;
    public String sdkVersion;
    public String sourcePlatForm;
    public String terminalType;
    public int thirdChannel;
    public String thirdChannelDeviceToken;
    public String tokenId;
}
