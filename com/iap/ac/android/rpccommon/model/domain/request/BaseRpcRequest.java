package com.iap.ac.android.rpccommon.model.domain.request;

import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseRpcRequest implements Serializable {
    public MobileEnvInfo envInfo;
    public Map<String, String> extParams = new HashMap();
}
