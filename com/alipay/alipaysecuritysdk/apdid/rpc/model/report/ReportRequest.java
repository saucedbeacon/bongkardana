package com.alipay.alipaysecuritysdk.apdid.rpc.model.report;

import java.io.Serializable;
import java.util.Map;

public class ReportRequest implements Serializable {
    public String apdid;
    public Map<String, String> bizData;
    public Map<String, String> dataMap;
    public String dynamicKey;
    public String lastTime;
    public String os;
    public String priApdid;
    public String pubApdid;
    public String token;
    public String umidToken;
    public String version;
}
