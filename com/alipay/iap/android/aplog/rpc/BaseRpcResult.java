package com.alipay.iap.android.aplog.rpc;

import java.util.HashMap;
import java.util.Map;

public class BaseRpcResult extends ToString {
    public Map<String, String> errorActions = new HashMap();
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo = new HashMap();
    public String interaction;
    public boolean success = false;
    public String traceId;
}
