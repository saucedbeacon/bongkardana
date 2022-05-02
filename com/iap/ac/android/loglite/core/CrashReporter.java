package com.iap.ac.android.loglite.core;

import java.lang.Thread;

public class CrashReporter implements Thread.UncaughtExceptionHandler {
    public static CrashReporter c;

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f9735a;
    public boolean b = false;

    public static synchronized void a() {
        synchronized (CrashReporter.class) {
            if (c == null) {
                c = new CrashReporter();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            com.iap.ac.android.loglite.core.AnalyticsContext r0 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            java.util.Set<java.lang.String> r0 = r0.i
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.util.Log.getStackTraceString(r8)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0010
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "\n"
            java.lang.String r1 = "###"
            java.lang.String r0 = r2.replaceAll(r0, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "stackTrace"
            r1.put(r2, r0)
            java.lang.String r0 = r7.getName()
            java.lang.String r2 = "threadName"
            r1.put(r2, r0)
            com.iap.ac.android.loglite.log.CrashLog r0 = new com.iap.ac.android.loglite.log.CrashLog
            java.lang.String r2 = "crash"
            r0.<init>(r2, r1)
            com.iap.ac.android.loglite.core.AnalyticsContext r1 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            com.iap.ac.android.loglite.storage.AnalyticsStorageManager r1 = r1.getStorageManager()
            r1.a((com.iap.ac.android.loglite.log.LogEvent) r0)
        L_0x005b:
            com.iap.ac.android.loglite.core.AnalyticsContext r0 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            com.iap.ac.android.loglite.storage.AnalyticsStorageManager r0 = r0.getStorageManager()
            r1 = 0
            r2 = 0
        L_0x0065:
            java.util.Map<java.lang.String, com.iap.ac.android.loglite.storage.AnalyticsStorage> r3 = r0.f9738a
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x006f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008f
            java.lang.Object r4 = r3.next()
            com.iap.ac.android.loglite.storage.AnalyticsStorage r4 = (com.iap.ac.android.loglite.storage.AnalyticsStorage) r4
            boolean r5 = r4 instanceof com.iap.ac.android.loglite.storage.AsyncFileStorage
            if (r5 == 0) goto L_0x006f
            com.iap.ac.android.loglite.storage.AsyncFileStorage r4 = (com.iap.ac.android.loglite.storage.AsyncFileStorage) r4
            java.util.concurrent.ThreadPoolExecutor r4 = r4.h
            java.util.concurrent.BlockingQueue r4 = r4.getQueue()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x006f
            r3 = 0
            goto L_0x0090
        L_0x008f:
            r3 = 1
        L_0x0090:
            if (r3 != 0) goto L_0x00a3
            r3 = 10
            if (r2 >= r3) goto L_0x00a3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00a0, all -> 0x009e }
            r4 = 100
            r3.sleep(r4)     // Catch:{ InterruptedException -> 0x00a0, all -> 0x009e }
            goto L_0x00a0
        L_0x009e:
            r7 = move-exception
            throw r7
        L_0x00a0:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x00a3:
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.f9735a
            if (r0 == 0) goto L_0x00aa
            r0.uncaughtException(r7, r8)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.core.CrashReporter.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
