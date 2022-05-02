package com.iap.ac.android.rpccommon.model.domain.result;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseRpcResult implements Serializable {
    public Map<String, String> errorActions = new HashMap();
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo = new HashMap();
    public String interaction;
    public boolean success = false;
    public String thirdPartyError;
    public String traceId;
}
