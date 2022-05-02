package com.alipay.iap.android.aplog.log;

import android.os.Bundle;

public class FlushLog extends BaseLogInfo {
    private Bundle bundle;
    private String logCategory;
    private String logEventType;

    public FlushLog(String str) {
        this.logEventType = str;
        this.logCategory = "flush";
    }

    public FlushLog(String str, String str2) {
        this.logEventType = str;
        this.logCategory = str2;
    }

    public FlushLog(String str, String str2, Bundle bundle2) {
        this.logEventType = str;
        this.logCategory = str2;
        this.bundle = bundle2;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public String getLogEventType() {
        return this.logEventType;
    }

    public Bundle getBundle() {
        return this.bundle;
    }
}
