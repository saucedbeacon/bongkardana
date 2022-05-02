package com.iap.ac.android.rpccommon.model.facade.request;

import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;
import java.io.Serializable;
import java.util.Map;

public class BaseServiceRequest implements Serializable {
    public MobileEnvInfo envInfo;
    public Map<String, String> extParams;
    public String userId;
}
