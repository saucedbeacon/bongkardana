package com.alipay.mobile.security.bio.log;

import java.util.HashMap;
import java.util.Map;

public class VerifyBehavior {
    private String appID;
    private String bizType = "VerifyIdentity";
    private Map<String, String> extParams = new HashMap();
    private int loggerLevel = 2;
    private String param1;
    private String param2;
    private String param3;
    private String seedID;
    private String userCaseID;

    public String getUserCaseID() {
        return this.userCaseID;
    }

    public void setUserCaseID(String str) {
        this.userCaseID = str;
    }

    public String getAppID() {
        return this.appID;
    }

    @Deprecated
    public void setAppID(String str) {
        this.appID = str;
    }

    public String getSeedID() {
        return this.seedID;
    }

    public void setSeedID(String str) {
        this.seedID = str;
    }

    public String getParam1() {
        return this.param1;
    }

    public void setParam1(String str) {
        this.param1 = str;
    }

    public String getParam2() {
        return this.param2;
    }

    public void setParam2(String str) {
        this.param2 = str;
    }

    public String getParam3() {
        return this.param3;
    }

    public void setParam3(String str) {
        this.param3 = str;
    }

    public Map<String, String> getExtParams() {
        return this.extParams;
    }

    public void addExtParam(String str, String str2) {
        this.extParams.put(str, str2);
    }

    public void removeExtParam(String str) {
        this.extParams.remove(str);
    }

    public int getLoggerLevel() {
        return this.loggerLevel;
    }

    public void setLoggerLevel(int i) {
        this.loggerLevel = i;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }
}
