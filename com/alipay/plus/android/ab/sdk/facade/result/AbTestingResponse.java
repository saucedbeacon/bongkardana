package com.alipay.plus.android.ab.sdk.facade.result;

import java.io.Serializable;
import java.util.Map;

public class AbTestingResponse implements Serializable {
    public String errorCode;
    public String errorMessage;
    public Map<String, String> extendInfo;
    public Map<String, String> params;
    public boolean success;
}
