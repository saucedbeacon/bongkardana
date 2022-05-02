package com.alipay.iap.android.common.securityprofiles.profile;

import java.io.Serializable;
import java.util.Map;

public class SyncProfile implements Serializable {
    public String appId;
    public String appKey;
    public String authCode;
    public String environment;
    public Map<String, String> extras;
    public String productId;
    public String productVersion;
    public String syncServerAddress;
    public String syncServerPort;
    public String workspaceId;
}
