package com.alipay.iap.android.aplog.core.appender;

import android.os.Bundle;

public class LogEvent {
    private Bundle bundle;
    private String logCategory;
    private String logEventType;

    public LogEvent(String str) {
        this.logEventType = str;
    }

    public LogEvent(String str, String str2) {
        this.logEventType = str;
        this.logCategory = str2;
    }

    public LogEvent(String str, String str2, Bundle bundle2) {
        this.logEventType = str;
        this.bundle = bundle2;
    }

    public String getLogEventType() {
        return this.logEventType;
    }

    public void setLogEventType(String str) {
        this.logEventType = str;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public void setLogCategory(String str) {
        this.logCategory = str;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public void setBundle(Bundle bundle2) {
        this.bundle = bundle2;
    }
}
