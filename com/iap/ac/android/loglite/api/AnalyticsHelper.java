package com.iap.ac.android.loglite.api;

import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.core.AnalyticsService;
import com.iap.ac.android.loglite.log.PageMonitor;
import java.util.Map;

public class AnalyticsHelper {
    public static void flushLogs() {
        AnalyticsContext.getInstance().flushLogs();
    }

    public static void onPageDestroy(Object obj) {
        PageMonitor.a().a(obj);
    }

    public static void onPageEnd(Object obj, String str, Map<String, String> map) {
        PageMonitor.a().a(obj, str, (String) null, (String) null, map);
    }

    public static void onPageStart(Object obj, String str) {
        PageMonitor.a().a(obj, str);
    }

    public static void refreshLogSessionId() {
        AnalyticsContext.getInstance().refreshSessionId();
    }

    public static void sendAntEvent(String str, Map<String, String> map) {
        AnalyticsService.a(str, (String) null, (String) null, map);
    }

    public static void sendBehaviorLog(String str, Map<String, String> map) {
        AnalyticsService.b(str, (String) null, (String) null, map);
    }

    public static void sendKeyBizExceptionLog(String str, Map<String, String> map) {
        AnalyticsService.c(str, (String) null, (String) null, map);
    }

    public static void sendPerformanceLog(String str, Map<String, String> map) {
        AnalyticsService.d(str, (String) null, (String) null, map);
    }
}
