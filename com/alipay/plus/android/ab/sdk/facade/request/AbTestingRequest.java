package com.alipay.plus.android.ab.sdk.facade.request;

import java.io.Serializable;
import java.util.Map;

public class AbTestingRequest implements Serializable {
    public Map<String, String> condition;
    public String cookie;
    public String deviceId;
    public String entrance;
    public String userId;
}
