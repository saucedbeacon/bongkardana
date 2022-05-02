package com.google.firebase.perf.session.gauges;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.GridLayout;
import o.SpecialEffectsController$Operation$State;

public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = -1;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = -1;
    private static final long MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1);
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = -1;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    @Nullable
    private static CpuGaugeCollector instance = null;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;
    @Nullable
    private ScheduledFuture cpuMetricCollectorJob;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings;
    private final String procFileName;

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    private CpuGaugeCollector() {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = Executors.newSingleThreadScheduledExecutor();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Integer.toString(myPid));
        sb.append("/stat");
        this.procFileName = sb.toString();
        this.clockTicksPerSecond = getClockTicksPerSecond();
    }

    @VisibleForTesting
    CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String str, long j) {
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1;
        this.cpuMetricReadings = new ConcurrentLinkedQueue<>();
        this.cpuMetricCollectorExecutor = scheduledExecutorService;
        this.procFileName = str;
        this.clockTicksPerSecond = j;
    }

    public static CpuGaugeCollector getInstance() {
        if (instance == null) {
            instance = new CpuGaugeCollector();
        }
        return instance;
    }

    public void startCollecting(long j, Timer timer) {
        long j2 = this.clockTicksPerSecond;
        if (j2 != -1 && j2 != 0 && !isInvalidCollectionFrequency(j)) {
            if (this.cpuMetricCollectorJob == null) {
                scheduleCpuMetricCollectionWithRate(j, timer);
            } else if (this.cpuMetricCollectionRateMs != j) {
                stopCollecting();
                scheduleCpuMetricCollectionWithRate(j, timer);
            }
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.cpuMetricCollectorJob = null;
            this.cpuMetricCollectionRateMs = -1;
        }
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j, Timer timer) {
        this.cpuMetricCollectionRateMs = j;
        try {
            this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new SpecialEffectsController$Operation$State(this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Unable to start collecting Cpu Metrics: ");
            sb.append(e.getMessage());
            androidLogger.warn(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionWithRate$0(Timer timer) {
        CpuMetricReading syncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (syncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(syncCollectCpuMetric);
        }
    }

    private synchronized void scheduleCpuMetricCollectionOnce(Timer timer) {
        try {
            this.cpuMetricCollectorExecutor.schedule(new GridLayout(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Unable to collect Cpu Metric: ");
            sb.append(e.getMessage());
            androidLogger.warn(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCpuMetricCollectionOnce$1(Timer timer) {
        CpuMetricReading syncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (syncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(syncCollectCpuMetric);
        }
    }

    @Nullable
    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            long currentTimestampMicros = timer.getCurrentTimestampMicros();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            CpuMetricReading cpuMetricReading = (CpuMetricReading) CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(split[14]) + Long.parseLong(split[16]))).setUserTimeUs(convertClockTicksToMicroseconds(parseLong + parseLong2)).build();
            bufferedReader.close();
            return cpuMetricReading;
        } catch (IOException e) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Unable to read 'proc/[pid]/stat' file: ");
            sb.append(e.getMessage());
            androidLogger.warn(sb.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("Unexpected '/proc/[pid]/stat' file format encountered: ");
            sb2.append(e2.getMessage());
            androidLogger2.warn(sb2.toString());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private long getClockTicksPerSecond() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        return -1;
    }

    private long convertClockTicksToMicroseconds(long j) {
        double d = (double) j;
        double d2 = (double) this.clockTicksPerSecond;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) MICROSECONDS_PER_SECOND;
        Double.isNaN(d4);
        return Math.round(d3 * d4);
    }
}
