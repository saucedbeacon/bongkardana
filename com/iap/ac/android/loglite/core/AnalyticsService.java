package com.iap.ac.android.loglite.core;

import android.text.TextUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alipay.iap.android.aplog.log.behavior.BehaviorID;
import com.iap.ac.android.loglite.log.AntEvent;
import com.iap.ac.android.loglite.log.KeyBizExceptionLog;
import com.iap.ac.android.loglite.log.LogEvent;
import com.iap.ac.android.loglite.log.PerformanceLog;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsService {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9734a = Arrays.asList(new String[]{"pageview", BehaviorID.EXPOSURE, "click"});

    public static Map<String, String> a(Map<String, String> map) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!TextUtils.isEmpty(str)) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    concurrentHashMap.put(str, str2);
                }
            }
        }
        return concurrentHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            java.util.Map r7 = a(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "TinyAppBiz-"
            if (r0 != 0) goto L_0x0044
            boolean r0 = r5.startsWith(r1)
            if (r0 == 0) goto L_0x0044
            r0 = r7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.String r2 = "spmId"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<java.lang.String> r2 = f9734a
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x002c
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r4, r0)
            goto L_0x0033
        L_0x002c:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r0 = "event"
            r2.<init>(r0, r4)
        L_0x0033:
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r4 = r2
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0073
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x0073
            r1 = r7
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.String r2 = "isEventLink"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r3 = "true"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = "eventId"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0073
            r1 = 1
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x007c
            com.iap.ac.android.loglite.log.AntEvent r0 = new com.iap.ac.android.loglite.log.AntEvent
            r0.<init>(r4, r7)
            goto L_0x0084
        L_0x007c:
            com.iap.ac.android.loglite.log.BehaviorLog r1 = new com.iap.ac.android.loglite.log.BehaviorLog
            r1.<init>(r4, r7)
            r1.g = r0
            r0 = r1
        L_0x0084:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x008c
            r0.c = r5
        L_0x008c:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto L_0x0094
            r0.e = r6
        L_0x0094:
            com.iap.ac.android.loglite.core.AnalyticsContext r4 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            com.iap.ac.android.loglite.storage.AnalyticsStorageManager r4 = r4.getStorageManager()
            r4.a((com.iap.ac.android.loglite.log.LogEvent) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.core.AnalyticsService.b(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static void c(String str, String str2, String str3, Map<String, String> map) {
        LogEvent logEvent;
        Map<String, String> a2 = a(map);
        if (TextUtils.equals(str2, GriverMonitorConstants.APPX_PERFORMANCE_ERROR_BIZ_TYPE)) {
            logEvent = new AntEvent(str, a2);
        } else {
            logEvent = new KeyBizExceptionLog(str, a2);
        }
        if (!TextUtils.isEmpty(str2)) {
            logEvent.c = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            logEvent.e = str3;
        }
        AnalyticsContext.getInstance().getStorageManager().a(logEvent);
    }

    public static void d(String str, String str2, String str3, Map<String, String> map) {
        LogEvent logEvent;
        Map<String, String> a2 = a(map);
        if (TextUtils.equals(str2, GriverMonitorConstants.APPX_PERFORMANCE_ERROR_BIZ_TYPE)) {
            logEvent = new AntEvent(str, a2);
        } else {
            logEvent = new PerformanceLog(str, a2);
        }
        if (!TextUtils.isEmpty(str2)) {
            logEvent.c = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            logEvent.e = str3;
        }
        AnalyticsContext.getInstance().getStorageManager().a(logEvent);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        AntEvent antEvent = new AntEvent(str, a(map));
        if (!TextUtils.isEmpty(str2)) {
            antEvent.c = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            antEvent.e = str3;
        }
        AnalyticsContext.getInstance().getStorageManager().a((LogEvent) antEvent);
    }
}
