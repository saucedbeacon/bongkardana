package com.alipay.iap.android.aplog.log.behavior;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.log.BaseLogInfo;

public class AliveReportLog extends BaseLogInfo {
    private String behaviourID = "event";
    private String logCategory = LogCategory.LOG_ALIVEREPORT;
    private int loggerLevel = 2;
    private String seedID = "reportActive";

    public String getSeedID() {
        return this.seedID;
    }

    public AliveReportLog setSeedID(String str) {
        this.seedID = str;
        return this;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public AliveReportLog setLogCategory(String str) {
        this.logCategory = str;
        return this;
    }

    public String getBehaviourID() {
        return this.behaviourID;
    }

    public AliveReportLog setBehaviourID(String str) {
        this.behaviourID = str;
        return this;
    }

    public int getLoggerLevel() {
        return this.loggerLevel;
    }

    public AliveReportLog setLoggerLevel(int i) {
        this.loggerLevel = i;
        return this;
    }
}
