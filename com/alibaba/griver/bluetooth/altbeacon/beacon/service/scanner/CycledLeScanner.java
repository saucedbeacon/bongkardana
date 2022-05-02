package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.startup.StartupBroadcastReceiver;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import id.dana.utils.permission.ManifestPermission;
import java.util.Date;

@TargetApi(18)
public abstract class CycledLeScanner {
    public static final long ANDROID_N_MAX_SCAN_DURATION_MILLIS = 1800000;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f10269a;
    private BluetoothAdapter b;
    private long c = 0;
    private long d = 0;
    private long e = 0;
    private long f = 0;
    private boolean g = false;
    private boolean h;
    private boolean i = false;
    private boolean j = false;
    private long k;
    private boolean l = false;
    private volatile boolean m = false;
    protected boolean mBackgroundFlag = false;
    protected long mBetweenScanPeriod;
    protected final BluetoothCrashResolver mBluetoothCrashResolver;
    protected final Context mContext;
    protected final CycledLeScanCallback mCycledLeScanCallback;
    @NonNull
    protected final Handler mHandler = new Handler(Looper.getMainLooper());
    protected long mNextScanCycleStartTime = 0;
    protected boolean mRestartNeeded = false;
    @NonNull
    protected final Handler mScanHandler;
    protected boolean mScanningPaused;
    private PendingIntent n = null;

    /* access modifiers changed from: protected */
    public abstract boolean deferScanIfNeeded();

    /* access modifiers changed from: protected */
    public abstract void finishScan();

    /* access modifiers changed from: protected */
    public abstract void startScan();

    /* access modifiers changed from: protected */
    public abstract void stopScan();

    protected CycledLeScanner(Context context, long j2, long j3, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        this.k = j2;
        this.mBetweenScanPeriod = j3;
        this.mContext = context;
        this.mCycledLeScanCallback = cycledLeScanCallback;
        this.mBluetoothCrashResolver = bluetoothCrashResolver;
        this.mBackgroundFlag = z;
        HandlerThread handlerThread = new HandlerThread("CycledLeScannerThread");
        this.f10269a = handlerThread;
        handlerThread.start();
        this.mScanHandler = new Handler(this.f10269a.getLooper());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner createScanner(android.content.Context r14, long r15, long r17, boolean r19, com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanCallback r20, com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver r21) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "CycledLeScanner"
            r2 = 0
            r3 = 18
            if (r0 >= r3) goto L_0x0012
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Not supported prior to API 18."
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r1, r2, r0)
            r0 = 0
            return r0
        L_0x0012:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            r4 = 1
            if (r0 >= r3) goto L_0x0022
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is pre Android 5.0.  We are using old scanning APIs"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.i(r1, r3, r0)
        L_0x0020:
            r4 = 0
            goto L_0x0047
        L_0x0022:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 >= r3) goto L_0x003e
            boolean r0 = com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager.isAndroidLScanningDisabled()
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is Android 5.0, but L scanning is disabled. We are using old scanning APIs"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.i(r1, r3, r0)
            goto L_0x0020
        L_0x0036:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "This is Android 5.0.  We are using new scanning APIs"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.i(r1, r3, r0)
            goto L_0x0047
        L_0x003e:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "Using Android O scanner"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.i(r1, r3, r0)
            r2 = 1
            goto L_0x0020
        L_0x0047:
            if (r2 == 0) goto L_0x005a
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForAndroidO r0 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForAndroidO
            r5 = r0
            r6 = r14
            r7 = r15
            r9 = r17
            r11 = r19
            r12 = r20
            r13 = r21
            r5.<init>(r6, r7, r9, r11, r12, r13)
            return r0
        L_0x005a:
            if (r4 == 0) goto L_0x006d
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForLollipop r0 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForLollipop
            r1 = r0
            r2 = r14
            r3 = r15
            r5 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x006d:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForJellyBeanMr2 r0 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScannerForJellyBeanMr2
            r1 = r0
            r2 = r14
            r3 = r15
            r5 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner.createScanner(android.content.Context, long, long, boolean, com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanCallback, com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver):com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner");
    }

    public void setLongScanForcingEnabled(boolean z) {
        this.g = z;
    }

    @MainThread
    public void setScanPeriods(long j2, long j3, boolean z) {
        LogManager.d("CycledLeScanner", "Set scan periods called with %s, %s Background mode must have changed.", Long.valueOf(j2), Long.valueOf(j3));
        if (this.mBackgroundFlag != z) {
            this.mRestartNeeded = true;
        }
        this.mBackgroundFlag = z;
        this.k = j2;
        this.mBetweenScanPeriod = j3;
        if (z) {
            LogManager.d("CycledLeScanner", "We are in the background.  Setting wakeup alarm", new Object[0]);
            setWakeUpAlarm();
        } else {
            LogManager.d("CycledLeScanner", "We are not in the background.  Cancelling wakeup alarm", new Object[0]);
            cancelWakeUpAlarm();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.mNextScanCycleStartTime;
        if (j4 > elapsedRealtime) {
            long j5 = this.d + j3;
            if (j5 < j4) {
                this.mNextScanCycleStartTime = j5;
                LogManager.i("CycledLeScanner", "Adjusted nextScanStartTime to be %s", new Date((this.mNextScanCycleStartTime - SystemClock.elapsedRealtime()) + System.currentTimeMillis()));
            }
        }
        long j6 = this.e;
        if (j6 > elapsedRealtime) {
            long j7 = this.c + j2;
            if (j7 < j6) {
                this.e = j7;
                LogManager.i("CycledLeScanner", "Adjusted scanStopTime to be %s", Long.valueOf(j7));
            }
        }
    }

    @MainThread
    public void start() {
        LogManager.d("CycledLeScanner", "start called", new Object[0]);
        this.j = true;
        if (!this.i) {
            scanLeDevice(Boolean.TRUE);
        } else {
            LogManager.d("CycledLeScanner", "scanning already started", new Object[0]);
        }
    }

    @MainThread
    public void stop() {
        LogManager.d("CycledLeScanner", "stop called", new Object[0]);
        this.j = false;
        if (this.i) {
            scanLeDevice(Boolean.FALSE);
            if (this.l) {
                LogManager.d("CycledLeScanner", "Stopping scanning previously left on.", new Object[0]);
                this.l = false;
                try {
                    LogManager.d("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                    finishScan();
                } catch (Exception e2) {
                    LogManager.w(e2, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                }
            }
        } else {
            LogManager.d("CycledLeScanner", "scanning already stopped", new Object[0]);
        }
    }

    public boolean getDistinctPacketsDetectedPerScan() {
        return this.m;
    }

    public void setDistinctPacketsDetectedPerScan(boolean z) {
        this.m = z;
    }

    @MainThread
    public void destroy() {
        LogManager.d("CycledLeScanner", "Destroying", new Object[0]);
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mScanHandler.post(new Runnable() {
            @WorkerThread
            public void run() {
                LogManager.d("CycledLeScanner", "Quitting scan thread", new Object[0]);
                CycledLeScanner.this.f10269a.quit();
            }
        });
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void scanLeDevice(Boolean bool) {
        try {
            this.i = true;
            if (getBluetoothAdapter() == null) {
                LogManager.e("CycledLeScanner", "No Bluetooth adapter.  beaconService cannot scan.", new Object[0]);
            }
            if (!this.j || !bool.booleanValue()) {
                LogManager.d("CycledLeScanner", "disabling scan", new Object[0]);
                this.h = false;
                this.i = false;
                stopScan();
                this.f = 0;
                this.d = SystemClock.elapsedRealtime();
                this.mHandler.removeCallbacksAndMessages((Object) null);
                a();
            } else if (!deferScanIfNeeded()) {
                LogManager.d("CycledLeScanner", "starting a new scan cycle", new Object[0]);
                if (this.h && !this.mScanningPaused) {
                    if (!this.mRestartNeeded) {
                        StringBuilder sb = new StringBuilder("We are already scanning and have been for ");
                        sb.append(SystemClock.elapsedRealtime() - this.f);
                        sb.append(" millis");
                        LogManager.d("CycledLeScanner", sb.toString(), new Object[0]);
                        this.e = SystemClock.elapsedRealtime() + this.k;
                        scheduleScanCycleStop();
                        LogManager.d("CycledLeScanner", "Scan started", new Object[0]);
                    }
                }
                this.h = true;
                this.mScanningPaused = false;
                try {
                    if (getBluetoothAdapter() != null) {
                        if (getBluetoothAdapter().isEnabled()) {
                            if (this.mBluetoothCrashResolver != null && this.mBluetoothCrashResolver.isRecoveryInProgress()) {
                                LogManager.w("CycledLeScanner", "Skipping scan because crash recovery is in progress.", new Object[0]);
                            } else if (this.j) {
                                if (this.mRestartNeeded) {
                                    this.mRestartNeeded = false;
                                    LogManager.d("CycledLeScanner", "restarting a bluetooth le scan", new Object[0]);
                                } else {
                                    LogManager.d("CycledLeScanner", "starting a new bluetooth le scan", new Object[0]);
                                }
                                try {
                                    if (Build.VERSION.SDK_INT < 23 || c()) {
                                        this.f = SystemClock.elapsedRealtime();
                                        startScan();
                                    }
                                } catch (Exception e2) {
                                    LogManager.e(e2, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                                }
                            } else {
                                LogManager.d("CycledLeScanner", "Scanning unnecessary - no monitoring or ranging active.", new Object[0]);
                            }
                            this.c = SystemClock.elapsedRealtime();
                        } else {
                            LogManager.d("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        }
                    }
                } catch (Exception e3) {
                    LogManager.e(e3, "CycledLeScanner", "Exception starting Bluetooth scan.  Perhaps Bluetooth is disabled or unavailable?", new Object[0]);
                }
                this.e = SystemClock.elapsedRealtime() + this.k;
                scheduleScanCycleStop();
                LogManager.d("CycledLeScanner", "Scan started", new Object[0]);
            }
        } catch (SecurityException unused) {
            LogManager.w("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void scheduleScanCycleStop() {
        long elapsedRealtime = this.e - SystemClock.elapsedRealtime();
        if (!this.j || elapsedRealtime <= 0) {
            a();
            return;
        }
        LogManager.d("CycledLeScanner", "Waiting to stop scan cycle for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.mBackgroundFlag) {
            setWakeUpAlarm();
        }
        Handler handler = this.mHandler;
        AnonymousClass2 r3 = new Runnable() {
            @MainThread
            public void run() {
                CycledLeScanner.this.scheduleScanCycleStop();
            }
        };
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(r3, elapsedRealtime);
    }

    @MainThread
    private void a() {
        LogManager.d("CycledLeScanner", "Done with scan cycle", new Object[0]);
        try {
            this.mCycledLeScanCallback.onCycleEnd();
            if (this.h) {
                if (getBluetoothAdapter() != null) {
                    if (getBluetoothAdapter().isEnabled()) {
                        if (this.m && this.mBetweenScanPeriod == 0) {
                            if (!d()) {
                                LogManager.d("CycledLeScanner", "Not stopping scanning.  Device capable of multiple indistinct detections per scan.", new Object[0]);
                                this.l = true;
                                this.d = SystemClock.elapsedRealtime();
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Build.VERSION.SDK_INT < 24 || this.mBetweenScanPeriod + this.k >= 6000 || elapsedRealtime - this.c >= 6000) {
                            try {
                                LogManager.d("CycledLeScanner", "stopping bluetooth le scan", new Object[0]);
                                finishScan();
                                this.l = false;
                            } catch (Exception e2) {
                                LogManager.w(e2, "CycledLeScanner", "Internal Android exception scanning for beacons", new Object[0]);
                            }
                            this.d = SystemClock.elapsedRealtime();
                        } else {
                            StringBuilder sb = new StringBuilder("Not stopping scan because this is Android N and we keep scanning for a minimum of 6 seconds at a time. We will stop in ");
                            sb.append(6000 - (elapsedRealtime - this.c));
                            sb.append(" millisconds.");
                            LogManager.d("CycledLeScanner", sb.toString(), new Object[0]);
                            this.l = true;
                            this.d = SystemClock.elapsedRealtime();
                        }
                    } else {
                        LogManager.d("CycledLeScanner", "Bluetooth is disabled.  Cannot scan for beacons.", new Object[0]);
                        this.mRestartNeeded = true;
                    }
                }
                this.mNextScanCycleStartTime = b();
                if (this.j) {
                    scanLeDevice(Boolean.TRUE);
                }
            }
            if (!this.j) {
                LogManager.d("CycledLeScanner", "Scanning disabled. ", new Object[0]);
                this.i = false;
                cancelWakeUpAlarm();
            }
        } catch (SecurityException unused) {
            LogManager.w("CycledLeScanner", "SecurityException working accessing bluetooth.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public BluetoothAdapter getBluetoothAdapter() {
        try {
            if (this.b == null) {
                BluetoothAdapter adapter = ((BluetoothManager) this.mContext.getApplicationContext().getSystemService(TinyAppActionState.ACTION_BLUE_TOOTH)).getAdapter();
                this.b = adapter;
                if (adapter == null) {
                    LogManager.w("CycledLeScanner", "Failed to construct a BluetoothAdapter", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            LogManager.e("CycledLeScanner", "Cannot consruct bluetooth adapter.  Security Exception", new Object[0]);
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void setWakeUpAlarm() {
        long j2 = this.mBetweenScanPeriod;
        if (300000 >= j2) {
            j2 = 300000;
        }
        long j3 = this.k;
        if (j2 < j3) {
            j2 = j3;
        }
        ((AlarmManager) this.mContext.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + j2, getWakeUpOperation());
        LogManager.d("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(j2), getWakeUpOperation());
    }

    /* access modifiers changed from: protected */
    public PendingIntent getWakeUpOperation() {
        if (this.n == null) {
            Intent intent = new Intent(this.mContext, StartupBroadcastReceiver.class);
            intent.putExtra("wakeup", true);
            this.n = PendingIntent.getBroadcast(this.mContext, 0, intent, 134217728);
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void cancelWakeUpAlarm() {
        LogManager.d("CycledLeScanner", "cancel wakeup alarm: %s", this.n);
        ((AlarmManager) this.mContext.getSystemService("alarm")).set(2, Long.MAX_VALUE, getWakeUpOperation());
        LogManager.d("CycledLeScanner", "Set a wakeup alarm to go off in %s ms: %s", Long.valueOf(Long.MAX_VALUE - SystemClock.elapsedRealtime()), getWakeUpOperation());
    }

    private long b() {
        long j2 = this.mBetweenScanPeriod;
        if (j2 == 0) {
            return SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = j2 - (SystemClock.elapsedRealtime() % (this.k + j2));
        LogManager.d("CycledLeScanner", "Normalizing between scan period from %s to %s", Long.valueOf(this.mBetweenScanPeriod), Long.valueOf(elapsedRealtime));
        return SystemClock.elapsedRealtime() + elapsedRealtime;
    }

    private boolean c() {
        return a(ManifestPermission.ACCESS_COARSE_LOCATION) || a("android.permission.ACCESS_FINE_LOCATION");
    }

    private boolean a(String str) {
        return this.mContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d() {
        /*
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9.mBetweenScanPeriod
            long r0 = r0 + r2
            long r2 = r9.k
            long r0 = r0 + r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 0
            r5 = 24
            if (r2 < r5) goto L_0x0024
            long r5 = r9.f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            long r0 = r0 - r5
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "CycledLeScanner"
            java.lang.String r2 = "The next scan cycle would go over the Android N max duration."
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r1, r2, r0)
            boolean r0 = r9.g
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Stopping scan to prevent Android N scan timeout."
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r1, r2, r0)
            return r3
        L_0x003c:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "Allowing a long running scan to be stopped by the OS.  To prevent this, set longScanForcingEnabled in the AndroidBeaconLibrary."
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r1, r2, r0)
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner.d():boolean");
    }
}
