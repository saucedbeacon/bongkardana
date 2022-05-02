package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.distance.ModelSpecificDistanceCalculator;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.utils.ProcessUtils;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@TargetApi(21)
public class ScanJob extends JobService {
    public static final int IMMMEDIATE_SCAN_JOB_ID = 2;
    public static final int PERIODIC_SCAN_JOB_ID = 1;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10266a = ScanJob.class.getSimpleName();
    /* access modifiers changed from: private */
    public ScanState b;
    private Handler c = new Handler();
    private ScanHelper d;
    private boolean e = false;

    public boolean onStartJob(final JobParameters jobParameters) {
        boolean z;
        this.d = new ScanHelper(this);
        if (jobParameters.getJobId() == 2) {
            LogManager.i(f10266a, "Running immdiate scan job: instance is ".concat(String.valueOf(this)), new Object[0]);
        } else {
            LogManager.i(f10266a, "Running periodic scan job: instance is ".concat(String.valueOf(this)), new Object[0]);
        }
        List<ScanResult> dumpBackgroundScanResultQueue = ScanJobScheduler.getInstance().dumpBackgroundScanResultQueue();
        LogManager.d(f10266a, "Processing %d queued scan resuilts", Integer.valueOf(dumpBackgroundScanResultQueue.size()));
        for (ScanResult next : dumpBackgroundScanResultQueue) {
            ScanRecord scanRecord = next.getScanRecord();
            if (scanRecord != null) {
                this.d.processScanResult(next.getDevice(), next.getRssi(), scanRecord.getBytes());
            }
        }
        LogManager.d(f10266a, "Done processing queued scan resuilts", new Object[0]);
        if (this.e) {
            LogManager.d(f10266a, "Scanning already started.  Resetting for current parameters", new Object[0]);
            z = c();
        } else {
            z = d();
        }
        this.c.removeCallbacksAndMessages((Object) null);
        if (z) {
            String str = f10266a;
            StringBuilder sb = new StringBuilder("Scan job running for ");
            sb.append(this.b.getScanJobRuntimeMillis());
            sb.append(" millis");
            LogManager.i(str, sb.toString(), new Object[0]);
            this.c.postDelayed(new Runnable() {
                public void run() {
                    LogManager.i(ScanJob.f10266a, "Scan job runtime expired", new Object[0]);
                    ScanJob.this.b();
                    ScanJob.this.b.save();
                    ScanJob.this.a();
                    ScanJob.this.jobFinished(jobParameters, false);
                }
            }, (long) this.b.getScanJobRuntimeMillis());
        } else {
            LogManager.i(f10266a, "Scanning not started so Scan job is complete.", new Object[0]);
            jobFinished(jobParameters, false);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a() {
        LogManager.d(f10266a, "Checking to see if we need to start a passive scan", new Object[0]);
        boolean z = false;
        for (Region stateOf : this.b.getMonitoringStatus().regions()) {
            RegionMonitoringState stateOf2 = this.b.getMonitoringStatus().stateOf(stateOf);
            if (stateOf2 != null && stateOf2.getInside()) {
                z = true;
            }
        }
        if (z) {
            LogManager.i(f10266a, "We are inside a beacon region.  We will not scan between cycles.", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.d.startAndroidOBackgroundScan(this.b.getBeaconParsers());
        } else {
            LogManager.d(f10266a, "This is not Android O.  No scanning between cycles when using ScanJob", new Object[0]);
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (jobParameters.getJobId() == 1) {
            LogManager.i(f10266a, "onStopJob called for periodic scan", new Object[0]);
        } else {
            LogManager.i(f10266a, "onStopJob called for immediate scan", new Object[0]);
        }
        this.c.removeCallbacksAndMessages((Object) null);
        b();
        a();
        return false;
    }

    /* access modifiers changed from: private */
    public void b() {
        this.e = false;
        this.d.getCycledScanner().stop();
        this.d.getCycledScanner().destroy();
        LogManager.d(f10266a, "Scanning stopped", new Object[0]);
    }

    private boolean c() {
        Long l;
        Long l2;
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1106325494 == (max = dispatchOnCancelled.getMax(applicationContext, 1106325494)))) {
            onCanceled oncanceled = new onCanceled(1106325494, max, 512);
            onCancelLoad.setMax(1106325494, oncanceled);
            onCancelLoad.getMin(1106325494, oncanceled);
        }
        ScanState restore = ScanState.restore(this);
        this.b = restore;
        restore.setLastScanStartTimeMillis(System.currentTimeMillis());
        this.d.setMonitoringStatus(this.b.getMonitoringStatus());
        this.d.setRangedRegionState(this.b.getRangedRegionState());
        this.d.setBeaconParsers(this.b.getBeaconParsers());
        this.d.setExtraDataBeaconTracker(this.b.getExtraBeaconDataTracker());
        if (this.d.getCycledScanner() == null) {
            this.d.createCycledLeScanner(this.b.getBackgroundMode().booleanValue(), (BluetoothCrashResolver) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.stopAndroidOBackgroundScan();
        }
        if (this.b.getBackgroundMode().booleanValue()) {
            l = this.b.getBackgroundScanPeriod();
        } else {
            l = this.b.getForegroundScanPeriod();
        }
        long longValue = l.longValue();
        if (this.b.getBackgroundMode().booleanValue()) {
            l2 = this.b.getBackgroundBetweenScanPeriod();
        } else {
            l2 = this.b.getForegroundBetweenScanPeriod();
        }
        this.d.getCycledScanner().setScanPeriods(longValue, l2.longValue(), this.b.getBackgroundMode().booleanValue());
        this.e = true;
        if (longValue <= 0) {
            LogManager.w(f10266a, "Starting scan with scan period of zero.  Exiting ScanJob.", new Object[0]);
            this.d.getCycledScanner().stop();
            return false;
        } else if (this.d.getRangedRegionState().size() > 0 || this.d.getMonitoringStatus().regions().size() > 0) {
            this.d.getCycledScanner().start();
            return true;
        } else {
            this.d.getCycledScanner().stop();
            return false;
        }
    }

    private boolean d() {
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(getApplicationContext());
        instanceForApplication.setScannerInSameProcess(false);
        if (instanceForApplication.isMainProcess()) {
            LogManager.i(f10266a, "scanJob version %s is starting up on the main process", "1.0");
        } else {
            LogManager.i(f10266a, "beaconScanJob library version %s is starting up on a separate process", "1.0");
            ProcessUtils processUtils = new ProcessUtils(this);
            String str = f10266a;
            StringBuilder sb = new StringBuilder("beaconScanJob PID is ");
            sb.append(processUtils.getPid());
            sb.append(" with process name ");
            sb.append(processUtils.getProcessName());
            LogManager.i(str, sb.toString(), new Object[0]);
        }
        Beacon.setDistanceCalculator(new ModelSpecificDistanceCalculator(this, BeaconManager.getDistanceModelUpdateUrl()));
        return c();
    }
}
