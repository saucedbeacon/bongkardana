package com.iap.ac.android.gol.rpc.request;

import java.util.Map;

public class AuthPrepareRequestBody {
    public String authSiteId;
    public String extendInfo;
    public String merchantId;
    public Map<String, String> merchantOriginalRequest;
}
