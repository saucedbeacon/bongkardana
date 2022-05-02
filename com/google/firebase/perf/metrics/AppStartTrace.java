package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    private static final long MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private boolean isRegisteredForLifecycleCallbacks = false;
    /* access modifiers changed from: private */
    public boolean isStartedFromBackground = false;
    private boolean isTooLateToInitUI = false;
    private WeakReference<Activity> launchActivity;
    /* access modifiers changed from: private */
    public Timer onCreateTime = null;
    private Timer onResumeTime = null;
    private Timer onStartTime = null;
    private final TransportManager transportManager;

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static AppStartTrace getInstance() {
        return instance != null ? instance : getInstance(TransportManager.getInstance(), new Clock());
    }

    static AppStartTrace getInstance(TransportManager transportManager2, Clock clock2) {
        if (instance == null) {
            synchronized (AppStartTrace.class) {
                if (instance == null) {
                    instance = new AppStartTrace(transportManager2, clock2);
                }
            }
        }
        return instance;
    }

    AppStartTrace(@NonNull TransportManager transportManager2, @NonNull Clock clock2) {
        this.transportManager = transportManager2;
        this.clock = clock2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerActivityLifecycleCallbacks(@androidx.annotation.NonNull android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001c }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            r0 = r2
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x001c }
            r0.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x001c }
            r0 = 1
            r1.isRegisteredForLifecycleCallbacks = r0     // Catch:{ all -> 0x001c }
            r1.appContext = r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.registerActivityLifecycleCallbacks(android.content.Context):void");
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.isStartedFromBackground     // Catch:{ all -> 0x0030 }
            if (r5 != 0) goto L_0x002e
            com.google.firebase.perf.util.Timer r5 = r3.onCreateTime     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x000a
            goto L_0x002e
        L_0x000a:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0030 }
            r5.<init>(r4)     // Catch:{ all -> 0x0030 }
            r3.launchActivity = r5     // Catch:{ all -> 0x0030 }
            com.google.firebase.perf.util.Clock r4 = r3.clock     // Catch:{ all -> 0x0030 }
            com.google.firebase.perf.util.Timer r4 = r4.getTime()     // Catch:{ all -> 0x0030 }
            r3.onCreateTime = r4     // Catch:{ all -> 0x0030 }
            com.google.firebase.perf.util.Timer r4 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x0030 }
            com.google.firebase.perf.util.Timer r5 = r3.onCreateTime     // Catch:{ all -> 0x0030 }
            long r4 = r4.getDurationMicros(r5)     // Catch:{ all -> 0x0030 }
            long r0 = MAX_LATENCY_BEFORE_UI_INIT     // Catch:{ all -> 0x0030 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x002c
            r4 = 1
            r3.isTooLateToInitUI = r4     // Catch:{ all -> 0x0030 }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.isStartedFromBackground     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.firebase.perf.util.Timer r1 = r0.onStartTime     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            boolean r1 = r0.isTooLateToInitUI     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            com.google.firebase.perf.util.Clock r1 = r0.clock     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r1 = r1.getTime()     // Catch:{ all -> 0x001a }
            r0.onStartTime = r1     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0123, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isStartedFromBackground     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0122
            com.google.firebase.perf.util.Timer r0 = r5.onResumeTime     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0122
            boolean r0 = r5.isTooLateToInitUI     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0122
        L_0x000f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0124 }
            r0.<init>(r6)     // Catch:{ all -> 0x0124 }
            r5.appStartActivity = r0     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Clock r0 = r5.clock     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r0 = r0.getTime()     // Catch:{ all -> 0x0124 }
            r5.onResumeTime = r0     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r0 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.logging.AndroidLogger r1 = com.google.firebase.perf.logging.AndroidLogger.getInstance()     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "onResume(): "
            r2.<init>(r3)     // Catch:{ all -> 0x0124 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0124 }
            r2.append(r6)     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r6 = r5.onResumeTime     // Catch:{ all -> 0x0124 }
            long r3 = r0.getDurationMicros(r6)     // Catch:{ all -> 0x0124 }
            r2.append(r3)     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x0124 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0124 }
            r1.debug(r6)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r6 = com.google.firebase.perf.v1.TraceMetric.newBuilder()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Constants$TraceNames r1 = com.google.firebase.perf.util.Constants.TraceNames.APP_START_TRACE_NAME     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r6 = r6.setName(r1)     // Catch:{ all -> 0x0124 }
            long r1 = r0.getMicros()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r6 = r6.setClientStartTimeUs(r1)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r1 = r5.onResumeTime     // Catch:{ all -> 0x0124 }
            long r1 = r0.getDurationMicros(r1)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r6 = r6.setDurationUs(r1)     // Catch:{ all -> 0x0124 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0124 }
            r2 = 3
            r1.<init>(r2)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = com.google.firebase.perf.v1.TraceMetric.newBuilder()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Constants$TraceNames r3 = com.google.firebase.perf.util.Constants.TraceNames.ON_CREATE_TRACE_NAME     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r2.setName(r3)     // Catch:{ all -> 0x0124 }
            long r3 = r0.getMicros()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r2.setClientStartTimeUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r3 = r5.onCreateTime     // Catch:{ all -> 0x0124 }
            long r3 = r0.getDurationMicros(r3)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r0 = r2.setDurationUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric r0 = (com.google.firebase.perf.v1.TraceMetric) r0     // Catch:{ all -> 0x0124 }
            r1.add(r0)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r0 = com.google.firebase.perf.v1.TraceMetric.newBuilder()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Constants$TraceNames r2 = com.google.firebase.perf.util.Constants.TraceNames.ON_START_TRACE_NAME     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r0.setName(r2)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r3 = r5.onCreateTime     // Catch:{ all -> 0x0124 }
            long r3 = r3.getMicros()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r2.setClientStartTimeUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r3 = r5.onCreateTime     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r4 = r5.onStartTime     // Catch:{ all -> 0x0124 }
            long r3 = r3.getDurationMicros(r4)     // Catch:{ all -> 0x0124 }
            r2.setDurationUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric r0 = (com.google.firebase.perf.v1.TraceMetric) r0     // Catch:{ all -> 0x0124 }
            r1.add(r0)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r0 = com.google.firebase.perf.v1.TraceMetric.newBuilder()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Constants$TraceNames r2 = com.google.firebase.perf.util.Constants.TraceNames.ON_RESUME_TRACE_NAME     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r0.setName(r2)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r3 = r5.onStartTime     // Catch:{ all -> 0x0124 }
            long r3 = r3.getMicros()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r2 = r2.setClientStartTimeUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r3 = r5.onStartTime     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.util.Timer r4 = r5.onResumeTime     // Catch:{ all -> 0x0124 }
            long r3 = r3.getDurationMicros(r4)     // Catch:{ all -> 0x0124 }
            r2.setDurationUs(r3)     // Catch:{ all -> 0x0124 }
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric r0 = (com.google.firebase.perf.v1.TraceMetric) r0     // Catch:{ all -> 0x0124 }
            r1.add(r0)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric$Builder r0 = r6.addAllSubtraces(r1)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.session.PerfSession r1 = r1.perfSession()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.PerfSession r1 = r1.build()     // Catch:{ all -> 0x0124 }
            r0.addPerfSessions((com.google.firebase.perf.v1.PerfSession) r1)     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.transport.TransportManager r0 = r5.transportManager     // Catch:{ all -> 0x0124 }
            com.google.protobuf.GeneratedMessageLite r6 = r6.build()     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.TraceMetric r6 = (com.google.firebase.perf.v1.TraceMetric) r6     // Catch:{ all -> 0x0124 }
            com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.v1.ApplicationProcessState.FOREGROUND_BACKGROUND     // Catch:{ all -> 0x0124 }
            r0.log((com.google.firebase.perf.v1.TraceMetric) r6, (com.google.firebase.perf.v1.ApplicationProcessState) r1)     // Catch:{ all -> 0x0124 }
            boolean r6 = r5.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x0124 }
            if (r6 == 0) goto L_0x0120
            r5.unregisterActivityLifecycleCallbacks()     // Catch:{ all -> 0x0124 }
        L_0x0120:
            monitor-exit(r5)
            return
        L_0x0122:
            monitor-exit(r5)
            return
        L_0x0124:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public synchronized void onActivityStopped(Activity activity) {
    }

    public static class StartFromBackgroundRunnable implements Runnable {
        private final AppStartTrace trace;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.trace = appStartTrace;
        }

        public void run() {
            if (this.trace.onCreateTime == null) {
                boolean unused = this.trace.isStartedFromBackground = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @VisibleForTesting
    public Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @VisibleForTesting
    public Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }
}
