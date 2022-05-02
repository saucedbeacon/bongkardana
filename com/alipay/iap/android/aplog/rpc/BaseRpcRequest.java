package com.alipay.iap.android.aplog.rpc;

import java.util.HashMap;
import java.util.Map;

public class BaseRpcRequest extends ToString {
    public MobileEnvInfo envInfo;
    public Map<String, String> extParams = new HashMap();
}
