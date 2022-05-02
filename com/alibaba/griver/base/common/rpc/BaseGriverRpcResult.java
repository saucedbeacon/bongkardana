package com.alibaba.griver.base.common.rpc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseGriverRpcResult implements Serializable {
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo = new HashMap();
    public boolean success = false;
}
