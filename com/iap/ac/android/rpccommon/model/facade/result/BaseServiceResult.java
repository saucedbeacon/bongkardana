package com.iap.ac.android.rpccommon.model.facade.result;

import java.io.Serializable;
import java.util.Map;

public class BaseServiceResult implements Serializable {
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo;
    public boolean success;
}
