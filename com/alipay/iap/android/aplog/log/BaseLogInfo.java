package com.alipay.iap.android.aplog.log;

import com.alipay.iap.android.aplog.util.TraceIdUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class BaseLogInfo {
    private String DeviceID;
    private String UUID;
    private String appVersion;
    private HashMap<String, String> extParam;
    private HashMap<String, String> hardwareInfo;
    private Locale locale;
    private String network;
    private String recordTime;
    private String sequenceID;
    private String tenantID;
    private String userID;

    public abstract String getLogCategory();

    public void generateSequenceID() {
        this.sequenceID = TraceIdUtil.getNewTraceId();
    }

    public String getSequenceID() {
        return this.sequenceID;
    }

    public HashMap<String, String> getExtParam() {
        return this.extParam;
    }

    public void putExtParam(String str, String str2) {
        if (this.extParam == null) {
            this.extParam = new HashMap<>();
        }
        this.extParam.put(str, str2);
    }

    public String getDeviceID() {
        return this.DeviceID;
    }

    public void setDeviceID(String str) {
        this.DeviceID = str;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String str) {
        this.userID = str;
    }

    public String getTenantID() {
        return this.tenantID;
    }

    public void setTenantID(String str) {
        this.tenantID = str;
    }

    public String getRecordTime() {
        return this.recordTime;
    }

    public void setRecordTime(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1856505328, oncanceled);
            onCancelLoad.getMin(1856505328, oncanceled);
        }
        this.recordTime = str;
    }

    public String getUUID() {
        return this.UUID;
    }

    public void setUUID(String str) {
        this.UUID = str;
    }

    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public HashMap<String, String> getHardwareInfo() {
        return this.hardwareInfo;
    }

    public void setHardwareInfo(HashMap<String, String> hashMap) {
        this.hardwareInfo = hashMap;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public void setLocale(Locale locale2) {
        this.locale = locale2;
    }

    public void putAllExtParam(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                putExtParam((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public void putExtMapParam(String str, Map<String, String> map) {
        if (map != null && map.size() > 0 && str != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 != null) {
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str3);
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            putExtParam(str, sb.toString());
        }
    }

    public void putExtListParam(String str, List<String> list) {
        if (list != null && list.size() > 0 && str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append("\n");
            for (String append : list) {
                sb.append(append);
                sb.append("\n");
            }
            sb.append(")");
            putExtParam(str, sb.toString());
        }
    }
}
