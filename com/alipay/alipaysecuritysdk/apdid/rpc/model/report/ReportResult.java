package com.alipay.alipaysecuritysdk.apdid.rpc.model.report;

import java.io.Serializable;
import java.util.Map;

public class ReportResult implements Serializable {
    public String apdid;
    public String appListVer;
    public String bugTrackSwitch;
    public String currentTime;
    public String dynamicKey;
    public String resultCode;
    public Map<String, String> resultData;
    public boolean success;
    public String token;
    public String version;
    public String vkeySwitch;
}
