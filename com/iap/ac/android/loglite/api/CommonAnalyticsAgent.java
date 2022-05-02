package com.iap.ac.android.loglite.api;

import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.core.AnalyticsService;
import com.iap.ac.android.loglite.log.PageMonitor;
import java.util.Map;

public class CommonAnalyticsAgent {
    private String bizId;

    public CommonAnalyticsAgent(String str) {
        this.bizId = str;
    }

    public void flushLogs() {
        AnalyticsContext.getInstance().flushLogs();
    }

    public void onPageDestroy(Object obj) {
        PageMonitor.a().a(obj);
    }

    public void onPageEnd(Object obj, String str, String str2, Map<String, String> map) {
        PageMonitor.a().a(obj, str, str2, this.bizId, map);
    }

    public void onPageStart(Object obj, String str) {
        PageMonitor.a().a(obj, str);
    }

    public void refreshLogSessionId() {
        AnalyticsContext.getInstance().refreshSessionId();
    }

    public void sendAntEvent(String str, String str2, Map<String, String> map) {
        AnalyticsService.a(str, str2, this.bizId, map);
    }

    public void sendBehaviorLog(String str, String str2, Map<String, String> map) {
        AnalyticsService.b(str, str2, this.bizId, map);
    }

    public void sendKeyBizExceptionLog(String str, String str2, Map<String, String> map) {
        AnalyticsService.c(str, str2, this.bizId, map);
    }

    public void sendPerformanceLog(String str, String str2, Map<String, String> map) {
        AnalyticsService.d(str, str2, this.bizId, map);
    }
}
