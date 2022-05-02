package com.iap.ac.android.rpccommon.model.domain.rpc;

import java.io.Serializable;
import java.util.Map;

public class MobileRpcContext implements Serializable {
    public String acceptLanguage;
    public String apdidToken;
    public String clientIp;
    public Map<String, String> cookies;
    public String currentUserId;
    public Map<String, String> headers;
    public String locale;
    public String operationType;
    public String productId;
    public String productVersion;
    public String sessionId;
    public Map<String, String> simpleSessionMap;
    public String userAgent;
}
