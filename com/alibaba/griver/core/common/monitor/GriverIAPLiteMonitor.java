package com.alibaba.griver.core.common.monitor;

import android.text.TextUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.iap.ac.android.loglite.api.InnerAnalyticsHelper;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.Map;

public class GriverIAPLiteMonitor implements GriverMonitorProxy {
    public void performance(String str, String str2, Map<String, String> map) {
        try {
            InnerAnalyticsHelper.sendAntEvent(str, str2, map);
        } catch (Exception e) {
            GriverLogger.e("GriverIAPLiteMonitor", "send monitor failed", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ Exception -> 0x00fe }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a A[Catch:{ Exception -> 0x00fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void event(java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            r18 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "H5_CONTAINER_OPEN_APP"
            java.lang.String r3 = "step"
            java.lang.String r4 = "2.25.2"
            java.lang.String r5 = "sv"
            java.lang.String r6 = "sn"
            java.lang.String r7 = "GriverIAPLiteMonitor"
            java.lang.String r8 = "H5Container"
            java.lang.String r9 = "GriverAppContainer"
            boolean r9 = android.text.TextUtils.equals(r0, r9)     // Catch:{ Exception -> 0x0050 }
            if (r9 == 0) goto L_0x001e
            com.iap.ac.android.loglite.api.InnerAnalyticsHelper.sendAntEvent(r19, r20, r21)     // Catch:{ Exception -> 0x0050 }
            goto L_0x004d
        L_0x001e:
            if (r0 == 0) goto L_0x004a
            java.lang.String r9 = "TinyAppBiz-"
            boolean r9 = r0.startsWith(r9)     // Catch:{ Exception -> 0x0050 }
            if (r9 == 0) goto L_0x004a
            java.lang.String r9 = "pageview"
            boolean r9 = android.text.TextUtils.equals(r1, r9)     // Catch:{ Exception -> 0x0050 }
            if (r9 == 0) goto L_0x0042
            if (r21 != 0) goto L_0x0038
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x0050 }
            r9.<init>()     // Catch:{ Exception -> 0x0050 }
            goto L_0x003a
        L_0x0038:
            r9 = r21
        L_0x003a:
            java.lang.String r10 = "isAutoLogEvent"
            java.lang.String r11 = "true"
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0044
        L_0x0042:
            r9 = r21
        L_0x0044:
            com.iap.ac.android.loglite.api.InnerAnalyticsHelper.sendBehaviorLog(r1, r0, r9)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            goto L_0x0053
        L_0x004a:
            com.iap.ac.android.loglite.api.InnerAnalyticsHelper.sendAntEvent(r19, r20, r21)     // Catch:{ Exception -> 0x0050 }
        L_0x004d:
            r9 = r21
            goto L_0x0058
        L_0x0050:
            r0 = move-exception
            r9 = r21
        L_0x0053:
            java.lang.String r10 = "send monitor failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r7, r10, r0)
        L_0x0058:
            java.lang.String r0 = "mini_start_app"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ Exception -> 0x00fe }
            if (r0 != 0) goto L_0x0061
            return
        L_0x0061:
            java.lang.String r0 = "com.alipay.iap.android.aplog.core.LoggerFactory"
            boolean r0 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r0)     // Catch:{ Exception -> 0x00fe }
            if (r0 != 0) goto L_0x006a
            return
        L_0x006a:
            com.alibaba.griver.core.common.monitor.GriverIAPLogMonitor r0 = new com.alibaba.griver.core.common.monitor.GriverIAPLogMonitor     // Catch:{ Exception -> 0x00fe }
            r0.<init>()     // Catch:{ Exception -> 0x00fe }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            r1.put(r6, r8)     // Catch:{ Exception -> 0x00fe }
            r1.put(r5, r4)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r10 = "start"
            r1.put(r3, r10)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r10 = "NO"
            java.lang.String r11 = "YES"
            java.lang.String r12 = "loadType"
            java.lang.String r13 = "local"
            java.lang.String r14 = "version"
            java.lang.String r15 = "pkv"
            r19 = r10
            java.lang.String r10 = "appId"
            r20 = r11
            java.lang.String r11 = "subappId"
            r16 = r7
            java.lang.String r7 = "url"
            r17 = r3
            if (r9 == 0) goto L_0x00be
            java.lang.Object r3 = r9.get(r10)     // Catch:{ Exception -> 0x00fc }
            r1.put(r11, r3)     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r3 = r9.get(r14)     // Catch:{ Exception -> 0x00fc }
            r1.put(r15, r3)     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r3 = r9.get(r7)     // Catch:{ Exception -> 0x00fc }
            r1.put(r7, r3)     // Catch:{ Exception -> 0x00fc }
            boolean r3 = r9.containsKey(r12)     // Catch:{ Exception -> 0x00fc }
            if (r3 == 0) goto L_0x00b9
            r3 = r19
            goto L_0x00bb
        L_0x00b9:
            r3 = r20
        L_0x00bb:
            r1.put(r13, r3)     // Catch:{ Exception -> 0x00fc }
        L_0x00be:
            r0.event(r2, r8, r1)     // Catch:{ Exception -> 0x00fc }
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00fc }
            r3.<init>()     // Catch:{ Exception -> 0x00fc }
            r3.put(r6, r8)     // Catch:{ Exception -> 0x00fc }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r4 = "success"
            r5 = r17
            r3.put(r5, r4)     // Catch:{ Exception -> 0x00fc }
            if (r9 == 0) goto L_0x00f8
            java.lang.Object r4 = r9.get(r10)     // Catch:{ Exception -> 0x00fc }
            r1.put(r11, r4)     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r4 = r9.get(r14)     // Catch:{ Exception -> 0x00fc }
            r1.put(r15, r4)     // Catch:{ Exception -> 0x00fc }
            java.lang.Object r4 = r9.get(r7)     // Catch:{ Exception -> 0x00fc }
            r1.put(r7, r4)     // Catch:{ Exception -> 0x00fc }
            boolean r4 = r9.containsKey(r12)     // Catch:{ Exception -> 0x00fc }
            if (r4 == 0) goto L_0x00f3
            r10 = r19
            goto L_0x00f5
        L_0x00f3:
            r10 = r20
        L_0x00f5:
            r1.put(r13, r10)     // Catch:{ Exception -> 0x00fc }
        L_0x00f8:
            r0.event(r2, r8, r3)     // Catch:{ Exception -> 0x00fc }
            return
        L_0x00fc:
            r0 = move-exception
            goto L_0x0101
        L_0x00fe:
            r0 = move-exception
            r16 = r7
        L_0x0101:
            java.lang.String r1 = "send iap monitor failed"
            r2 = r16
            com.alibaba.griver.base.common.logger.GriverLogger.e(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.common.monitor.GriverIAPLiteMonitor.event(java.lang.String, java.lang.String, java.util.Map):void");
    }

    public void error(String str, String str2, Map<String, String> map) {
        try {
            InnerAnalyticsHelper.sendAntEvent(str, str2, map);
        } catch (Exception e) {
            GriverLogger.e("GriverIAPLiteMonitor", "send monitor failed", e);
        }
    }

    public void pageStart(Object obj, String str) {
        try {
            InnerAnalyticsHelper.onPageStart(obj, str);
        } catch (Exception e) {
            GriverLogger.e("GriverIAPLiteMonitor", "send monitor failed", e);
        }
    }

    public void pageExit(Object obj, String str, String str2, Map<String, String> map) {
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Exception e) {
                GriverLogger.e("GriverIAPLiteMonitor", "send monitor failed", e);
                return;
            }
        }
        map.put(GriverMonitorConstants.KEY_AUTO_LOG, SummaryActivity.CHECKED);
        String environment = GriverEnv.getEnvironment();
        if (TextUtils.isEmpty(environment)) {
            environment = "prod";
        }
        map.put("env", environment);
        InnerAnalyticsHelper.onPageEnd(obj, str, str2, map);
    }

    public void pageDestroy(Object obj) {
        try {
            InnerAnalyticsHelper.onPageDestroy(obj);
        } catch (Exception e) {
            GriverLogger.e("GriverIAPLiteMonitor", "send monitor failed", e);
        }
    }

    public void upload() {
        try {
            InnerAnalyticsHelper.flushLogs();
        } catch (Throwable th) {
            GriverLogger.e("GriverIAPLiteMonitor", "upload monitor exception", th);
        }
    }
}
