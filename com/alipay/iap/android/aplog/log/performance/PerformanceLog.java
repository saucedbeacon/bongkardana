package com.alipay.iap.android.aplog.log.performance;

import com.alipay.iap.android.aplog.log.BaseLogInfo;

public class PerformanceLog extends BaseLogInfo {
    private String bizType;
    private String logCategory = "performance";
    private int loggerLevel = 2;
    private String pageId;
    private String param1;
    private String param2;
    private String param3;
    private PerformanceID performanceID = PerformanceID.MONITORPOINT_PERFORMANCE;
    private String performanceIdDesc;

    public PerformanceLog() {
        generateSequenceID();
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public void setLogCategory(String str) {
        this.logCategory = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
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

    public PerformanceID getPerformanceID() {
        return this.performanceID;
    }

    public void setPerformanceID(PerformanceID performanceID2) {
        this.performanceID = performanceID2;
    }

    public String getPageId() {
        return this.pageId;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public int getLoggerLevel() {
        return this.loggerLevel;
    }

    public void setLoggerLevel(int i) {
        this.loggerLevel = i;
    }

    public String getPerformanceIdDesc() {
        return this.performanceIdDesc;
    }

    public void setPerformanceIdDesc(String str) {
        this.performanceIdDesc = str;
    }
}
