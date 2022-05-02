package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    static final String APP_EXCEPTION_EVENT_NAME = "_ae";
    private final CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private boolean callbackReceived = false;
    private CountDownLatch eventLatch;
    private final Object latchLock = new Object();
    private final TimeUnit timeUnit;
    private final int timeout;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit2) {
        this.baseAnalyticsEventLogger = crashlyticsOriginAnalyticsEventLogger;
        this.timeout = i;
        this.timeUnit = timeUnit2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logEvent(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.latchLock
            monitor-enter(r0)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Logging event "
            r2.<init>(r3)     // Catch:{ all -> 0x006a }
            r2.append(r6)     // Catch:{ all -> 0x006a }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006a }
            r2.append(r7)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006a }
            r1.v(r2)     // Catch:{ all -> 0x006a }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006a }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
            r5.eventLatch = r1     // Catch:{ all -> 0x006a }
            r1 = 0
            r5.callbackReceived = r1     // Catch:{ all -> 0x006a }
            com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger r1 = r5.baseAnalyticsEventLogger     // Catch:{ all -> 0x006a }
            r1.logEvent(r6, r7)     // Catch:{ all -> 0x006a }
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.v(r7)     // Catch:{ all -> 0x006a }
            java.util.concurrent.CountDownLatch r6 = r5.eventLatch     // Catch:{ InterruptedException -> 0x005c }
            int r7 = r5.timeout     // Catch:{ InterruptedException -> 0x005c }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005c }
            java.util.concurrent.TimeUnit r7 = r5.timeUnit     // Catch:{ InterruptedException -> 0x005c }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005c }
            if (r6 == 0) goto L_0x0052
            r5.callbackReceived = r2     // Catch:{ InterruptedException -> 0x005c }
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ InterruptedException -> 0x005c }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.v(r7)     // Catch:{ InterruptedException -> 0x005c }
            goto L_0x0065
        L_0x0052:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ InterruptedException -> 0x005c }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.w(r7)     // Catch:{ InterruptedException -> 0x005c }
            goto L_0x0065
        L_0x005c:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.e(r7)     // Catch:{ all -> 0x006a }
        L_0x0065:
            r6 = 0
            r5.eventLatch = r6     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger.logEvent(java.lang.String, android.os.Bundle):void");
    }

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.eventLatch;
        if (countDownLatch != null && APP_EXCEPTION_EVENT_NAME.equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isCallbackReceived() {
        return this.callbackReceived;
    }
}
