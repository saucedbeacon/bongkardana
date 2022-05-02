package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static volatile AppStateMonitor instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final WeakHashMap<Activity, Boolean> activityToResumedMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, Trace> activityToScreenTraceMap = new WeakHashMap<>();
    private Set<AppColdStartCallback> appColdStartSubscribers = new HashSet();
    private final Set<WeakReference<AppStateCallback>> appStateSubscribers = new HashSet();
    private final Clock clock;
    private final ConfigResolver configResolver;
    private ApplicationProcessState currentAppState = ApplicationProcessState.BACKGROUND;
    private FrameMetricsAggregator frameMetricsAggregator;
    private boolean hasFrameMetricsAggregator = false;
    private boolean isColdStart = true;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private final Map<String, Long> metricToCountMap = new HashMap();
    private Timer resumeTime;
    private Timer stopTime;
    private final TransportManager transportManager;
    private final AtomicInteger tsnsCount = new AtomicInteger(0);

    public interface AppColdStartCallback {
        void onAppColdStart();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static AppStateMonitor getInstance() {
        if (instance == null) {
            synchronized (AppStateMonitor.class) {
                if (instance == null) {
                    instance = new AppStateMonitor(TransportManager.getInstance(), new Clock());
                }
            }
        }
        return instance;
    }

    AppStateMonitor(TransportManager transportManager2, Clock clock2) {
        this.transportManager = transportManager2;
        this.clock = clock2;
        this.configResolver = ConfigResolver.getInstance();
        boolean hasFrameMetricsAggregatorClass = hasFrameMetricsAggregatorClass();
        this.hasFrameMetricsAggregator = hasFrameMetricsAggregatorClass;
        if (hasFrameMetricsAggregatorClass) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerActivityLifecycleCallbacks(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r1.isRegisteredForLifecycleCallbacks = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.AppStateMonitor.registerActivityLifecycleCallbacks(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unregisterActivityLifecycleCallbacks(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 0
            r1.isRegisteredForLifecycleCallbacks = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.AppStateMonitor.unregisterActivityLifecycleCallbacks(android.content.Context):void");
    }

    public void incrementCount(@NonNull String str, long j) {
        synchronized (this.metricToCountMap) {
            Long l = this.metricToCountMap.get(str);
            if (l == null) {
                this.metricToCountMap.put(str, Long.valueOf(j));
            } else {
                this.metricToCountMap.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    public void incrementTsnsCount(int i) {
        this.tsnsCount.addAndGet(i);
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (isScreenTraceSupported(activity) && this.configResolver.isPerformanceMonitoringEnabled()) {
            this.frameMetricsAggregator.setMin.getMin(activity);
            Trace trace = new Trace(getScreenTraceName(activity), this.transportManager, this.clock, this);
            trace.start();
            this.activityToScreenTraceMap.put(activity, trace);
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (isScreenTraceSupported(activity)) {
            sendScreenTrace(activity);
        }
        if (this.activityToResumedMap.containsKey(activity)) {
            this.activityToResumedMap.remove(activity);
            if (this.activityToResumedMap.isEmpty()) {
                this.stopTime = this.clock.getTime();
                updateAppState(ApplicationProcessState.BACKGROUND);
                sendSessionLog(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.resumeTime, this.stopTime);
            }
        }
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.activityToResumedMap.isEmpty()) {
            this.resumeTime = this.clock.getTime();
            this.activityToResumedMap.put(activity, Boolean.TRUE);
            updateAppState(ApplicationProcessState.FOREGROUND);
            if (this.isColdStart) {
                sendAppColdStartUpdate();
                this.isColdStart = false;
                return;
            }
            sendSessionLog(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.stopTime, this.resumeTime);
            return;
        }
        this.activityToResumedMap.put(activity, Boolean.TRUE);
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public void registerForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.add(weakReference);
        }
    }

    public void unregisterForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.remove(weakReference);
        }
    }

    public void registerForAppColdStart(AppColdStartCallback appColdStartCallback) {
        synchronized (this.appStateSubscribers) {
            this.appColdStartSubscribers.add(appColdStartCallback);
        }
    }

    private void updateAppState(ApplicationProcessState applicationProcessState) {
        this.currentAppState = applicationProcessState;
        synchronized (this.appStateSubscribers) {
            Iterator<WeakReference<AppStateCallback>> it = this.appStateSubscribers.iterator();
            while (it.hasNext()) {
                AppStateCallback appStateCallback = (AppStateCallback) it.next().get();
                if (appStateCallback != null) {
                    appStateCallback.onUpdateAppState(this.currentAppState);
                } else {
                    it.remove();
                }
            }
        }
    }

    private void sendAppColdStartUpdate() {
        synchronized (this.appStateSubscribers) {
            for (AppColdStartCallback next : this.appColdStartSubscribers) {
                if (next != null) {
                    next.onAppColdStart();
                }
            }
        }
    }

    public boolean isForeground() {
        return this.currentAppState == ApplicationProcessState.FOREGROUND;
    }

    private void sendScreenTrace(Activity activity) {
        Trace trace;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (this.activityToScreenTraceMap.containsKey(activity) && (trace = this.activityToScreenTraceMap.get(activity)) != null) {
            this.activityToScreenTraceMap.remove(activity);
            SparseIntArray[] length = this.frameMetricsAggregator.setMin.length(activity);
            int i3 = 0;
            if (length == null || (sparseIntArray = length[0]) == null) {
                i2 = 0;
                i = 0;
            } else {
                int i4 = 0;
                i2 = 0;
                i = 0;
                while (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    i4 += valueAt;
                    if (keyAt > 700) {
                        i += valueAt;
                    }
                    if (keyAt > 16) {
                        i2 += valueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_TOTAL.toString(), (long) i3);
            }
            if (i2 > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_SLOW.toString(), (long) i2);
            }
            if (i > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_FROZEN.toString(), (long) i);
            }
            if (Utils.isDebugLoggingEnabled(activity.getApplicationContext())) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("sendScreenTrace name:");
                sb.append(getScreenTraceName(activity));
                sb.append(" _fr_tot:");
                sb.append(i3);
                sb.append(" _fr_slo:");
                sb.append(i2);
                sb.append(" _fr_fzn:");
                sb.append(i);
                androidLogger.debug(sb.toString());
            }
            trace.stop();
        }
    }

    private void sendSessionLog(String str, Timer timer, Timer timer2) {
        if (this.configResolver.isPerformanceMonitoringEnabled()) {
            TraceMetric.Builder addPerfSessions = TraceMetric.newBuilder().setName(str).setClientStartTimeUs(timer.getMicros()).setDurationUs(timer.getDurationMicros(timer2)).addPerfSessions(SessionManager.getInstance().perfSession().build());
            int andSet = this.tsnsCount.getAndSet(0);
            synchronized (this.metricToCountMap) {
                addPerfSessions.putAllCounters(this.metricToCountMap);
                if (andSet != 0) {
                    addPerfSessions.putCounters(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                }
                this.metricToCountMap.clear();
            }
            this.transportManager.log((TraceMetric) addPerfSessions.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    private boolean isScreenTraceSupported(Activity activity) {
        return (!this.hasFrameMetricsAggregator || activity.getWindow() == null || (activity.getWindow().getAttributes().flags & C.DEFAULT_MUXED_BUFFER_SIZE) == 0) ? false : true;
    }

    private boolean hasFrameMetricsAggregatorClass() {
        try {
            Class.forName(FRAME_METRICS_AGGREGATOR_CLASSNAME);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String getScreenTraceName(Activity activity) {
        StringBuilder sb = new StringBuilder(Constants.SCREEN_TRACE_PREFIX);
        sb.append(activity.getClass().getSimpleName());
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public WeakHashMap<Activity, Boolean> getResumed() {
        return this.activityToResumedMap;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public WeakHashMap<Activity, Trace> getActivity2ScreenTrace() {
        return this.activityToScreenTraceMap;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer getPauseTime() {
        return this.stopTime;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer getResumeTime() {
        return this.resumeTime;
    }

    @VisibleForTesting
    public void setIsColdStart(boolean z) {
        this.isColdStart = z;
    }
}
