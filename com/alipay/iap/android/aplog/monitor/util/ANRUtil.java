package com.alipay.iap.android.aplog.monitor.util;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.AnrTraceProcessor;

public class ANRUtil {
    public static boolean a(int i, String str) {
        String a2;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (i != 0) {
                if (1 == i && (a2 = AnrTraceProcessor.a(str)) != null) {
                    if (!TextUtils.isEmpty(a2)) {
                        if (!a(a2)) {
                            return false;
                        }
                    }
                }
                return true;
            } else if (!a(str)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ANRUtil", th);
        }
    }

    private static boolean a(String str) {
        return !str.contains("android.os.MessageQueue.nativePollOnce") && !str.contains("android.hardware.Camera.open") && !str.contains("android.location.LocationManager.requestLocationUpdates");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "getThreadsStackTrace"
            java.lang.String r1 = "\n"
            java.lang.String r2 = "ANRUtil"
            com.alipay.iap.android.aplog.core.logger.TraceLogger r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "ANR thread dump start"
            r3.warn((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r3.<init>()     // Catch:{ all -> 0x0099 }
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()     // Catch:{ all -> 0x006c }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x006c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x006c }
        L_0x0020:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x006c }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x006c }
            java.lang.Object r6 = r5.getKey()     // Catch:{ all -> 0x0063 }
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch:{ all -> 0x0063 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0063 }
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0063 }
            r7 = 10
            r3.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = "ThreadName="
            r3.append(r7)     // Catch:{ all -> 0x0063 }
            r3.append(r6)     // Catch:{ all -> 0x0063 }
            r3.append(r1)     // Catch:{ all -> 0x0063 }
            int r6 = r5.length     // Catch:{ all -> 0x0063 }
            r7 = 0
        L_0x004e:
            if (r7 >= r6) goto L_0x005f
            r8 = r5[r7]     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0063 }
            r3.append(r8)     // Catch:{ all -> 0x0063 }
            r3.append(r1)     // Catch:{ all -> 0x0063 }
            int r7 = r7 + 1
            goto L_0x004e
        L_0x005f:
            r3.append(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0020
        L_0x0063:
            r5 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x006c }
            r6.warn(r2, r0, r5)     // Catch:{ all -> 0x006c }
            goto L_0x0020
        L_0x006c:
            r1 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r4 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0099 }
            r4.warn(r2, r0, r1)     // Catch:{ all -> 0x0099 }
        L_0x0074:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "ANR thread dump end"
            r0.warn((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0099 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x00a4
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "All Threads Traces: ###"
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x009b }
            r1.warn((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x009b }
            goto L_0x00a4
        L_0x0099:
            java.lang.String r0 = ""
        L_0x009b:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r3 = "ANR thread dump failed"
            r1.warn((java.lang.String) r2, (java.lang.String) r3)
        L_0x00a4:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00ac
            java.lang.String r0 = "no threads trace"
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.monitor.util.ANRUtil.a():java.lang.String");
    }
}
