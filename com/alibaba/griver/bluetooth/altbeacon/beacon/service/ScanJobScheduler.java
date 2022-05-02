package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconLocalBroadcastProcessor;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class ScanJobScheduler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10267a = ScanJobScheduler.class.getSimpleName();
    private static final Object b = new Object();
    @Nullable
    private static volatile ScanJobScheduler c = null;
    @NonNull
    private Long d = 0L;
    @NonNull
    private List<ScanResult> e = new ArrayList();
    @Nullable
    private BeaconLocalBroadcastProcessor f;

    private ScanJobScheduler() {
    }

    @NonNull
    public static ScanJobScheduler getInstance() {
        ScanJobScheduler scanJobScheduler;
        ScanJobScheduler scanJobScheduler2 = c;
        if (scanJobScheduler2 != null) {
            return scanJobScheduler2;
        }
        synchronized (b) {
            scanJobScheduler = c;
            if (scanJobScheduler == null) {
                scanJobScheduler = new ScanJobScheduler();
                c = scanJobScheduler;
            }
        }
        return scanJobScheduler;
    }

    private void a(Context context) {
        if (this.f == null) {
            BeaconLocalBroadcastProcessor beaconLocalBroadcastProcessor = new BeaconLocalBroadcastProcessor(context);
            this.f = beaconLocalBroadcastProcessor;
            beaconLocalBroadcastProcessor.register();
        }
    }

    /* access modifiers changed from: package-private */
    public List<ScanResult> dumpBackgroundScanResultQueue() {
        List<ScanResult> list = this.e;
        this.e = new ArrayList();
        return list;
    }

    private void a(Context context, BeaconManager beaconManager, ScanState scanState) {
        scanState.applyChanges(beaconManager);
        String str = f10267a;
        StringBuilder sb = new StringBuilder("Applying scan job settings with background mode ");
        sb.append(scanState.getBackgroundMode());
        LogManager.d(str, sb.toString(), new Object[0]);
        a(context, scanState, false);
    }

    public void applySettingsToScheduledJob(Context context, BeaconManager beaconManager) {
        LogManager.d(f10267a, "Applying settings to ScanJob", new Object[0]);
        context.getSystemService("jobscheduler");
        a(context, beaconManager, ScanState.restore(context));
    }

    public void scheduleAfterBackgroundWakeup(Context context, List<ScanResult> list) {
        if (list != null) {
            this.e.addAll(list);
        }
        synchronized (this) {
            if (System.currentTimeMillis() - this.d.longValue() > 10000) {
                String str = f10267a;
                StringBuilder sb = new StringBuilder("scheduling an immediate scan job because last did ");
                sb.append(System.currentTimeMillis() - this.d.longValue());
                sb.append("seconds ago.");
                LogManager.d(str, sb.toString(), new Object[0]);
                this.d = Long.valueOf(System.currentTimeMillis());
                a(context, ScanState.restore(context), true);
                return;
            }
            LogManager.d(f10267a, "Not scheduling an immediate scan job because we just did recently.", new Object[0]);
        }
    }

    private void a(Context context, ScanState scanState, boolean z) {
        a(context);
        long scanJobIntervalMillis = (long) (scanState.getScanJobIntervalMillis() - scanState.getScanJobRuntimeMillis());
        long j = 50;
        if (z) {
            LogManager.d(f10267a, "We just woke up in the background based on a new scan result.  Start scan job immediately.", new Object[0]);
            j = 0;
        } else {
            long elapsedRealtime = scanJobIntervalMillis > 0 ? SystemClock.elapsedRealtime() % ((long) scanState.getScanJobIntervalMillis()) : 0;
            if (elapsedRealtime >= 50) {
                j = elapsedRealtime;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!z && scanState.getBackgroundMode().booleanValue()) {
            LogManager.d(f10267a, "Not scheduling an immediate scan because we are in background mode.   Cancelling existing immediate scan.", new Object[0]);
            jobScheduler.cancel(2);
        } else if (j < ((long) (scanState.getScanJobIntervalMillis() - 50))) {
            String str = f10267a;
            StringBuilder sb = new StringBuilder("Scheduling immediate ScanJob to run in ");
            sb.append(j);
            sb.append(" millis");
            LogManager.d(str, sb.toString(), new Object[0]);
            int schedule = jobScheduler.schedule(new JobInfo.Builder(2, new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle()).setMinimumLatency(j).setOverrideDeadline(j).build());
            if (schedule < 0) {
                LogManager.e(f10267a, "Failed to schedule scan job.  Beacons will not be detected. Error: ".concat(String.valueOf(schedule)), new Object[0]);
            }
        }
        JobInfo.Builder extras = new JobInfo.Builder(1, new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle());
        if (Build.VERSION.SDK_INT >= 24) {
            extras.setPeriodic((long) scanState.getScanJobIntervalMillis(), 0).build();
        } else {
            extras.setPeriodic((long) scanState.getScanJobIntervalMillis()).build();
        }
        String str2 = f10267a;
        StringBuilder sb2 = new StringBuilder("Scheduling ScanJob to run every ");
        sb2.append(scanState.getScanJobIntervalMillis());
        sb2.append(" millis");
        LogManager.d(str2, sb2.toString(), new Object[0]);
        int schedule2 = jobScheduler.schedule(extras.build());
        if (schedule2 < 0) {
            LogManager.e(f10267a, "Failed to schedule scan job.  Beacons will not be detected. Error: ".concat(String.valueOf(schedule2)), new Object[0]);
        }
    }
}
