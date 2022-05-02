package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.ParcelUuid;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.DetectionTracker;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@TargetApi(21)
public class CycledLeScannerForLollipop extends CycledLeScanner {

    /* renamed from: a  reason: collision with root package name */
    private final BeaconManager f10272a = BeaconManager.getInstanceForApplication(this.mContext);
    private BluetoothLeScanner b;
    private ScanCallback c;
    /* access modifiers changed from: private */
    public long d = 0;
    private long e = 0;
    private boolean f = false;

    public CycledLeScannerForLollipop(Context context, long j, long j2, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j, j2, z, cycledLeScanCallback, bluetoothCrashResolver);
    }

    /* access modifiers changed from: protected */
    public void stopScan() {
        a();
    }

    /* access modifiers changed from: protected */
    public boolean deferScanIfNeeded() {
        long elapsedRealtime = this.mNextScanCycleStartTime - SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime > 0;
        boolean z2 = this.f;
        this.f = !z;
        if (z) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - DetectionTracker.getInstance().getLastDetectionTime();
            if (z2) {
                if (elapsedRealtime2 > 10000) {
                    this.d = SystemClock.elapsedRealtime();
                    this.e = 0;
                    LogManager.d("CycledLeScannerForLollipop", "This is Android L. Preparing to do a filtered scan for the background.", new Object[0]);
                    if (this.mBetweenScanPeriod > 6000) {
                        startScan();
                    } else {
                        LogManager.d("CycledLeScannerForLollipop", "Suppressing scan between cycles because the between scan cycle is too short.", new Object[0]);
                    }
                } else {
                    LogManager.d("CycledLeScannerForLollipop", "This is Android L, but we last saw a beacon only %s ago, so we will not keep scanning in background.", Long.valueOf(elapsedRealtime2));
                }
            }
            if (this.d > 0 && DetectionTracker.getInstance().getLastDetectionTime() > this.d) {
                if (this.e == 0) {
                    this.e = DetectionTracker.getInstance().getLastDetectionTime();
                }
                if (SystemClock.elapsedRealtime() - this.e >= 10000) {
                    LogManager.d("CycledLeScannerForLollipop", "We've been detecting for a bit.  Stopping Android L background scanning", new Object[0]);
                    stopScan();
                    this.d = 0;
                } else {
                    LogManager.d("CycledLeScannerForLollipop", "Delivering Android L background scanning results", new Object[0]);
                    this.mCycledLeScanCallback.onCycleEnd();
                }
            }
            LogManager.d("CycledLeScannerForLollipop", "Waiting to start full Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
            if (z2 && this.mBackgroundFlag) {
                setWakeUpAlarm();
            }
            Handler handler = this.mHandler;
            AnonymousClass1 r4 = new Runnable() {
                @MainThread
                public void run() {
                    CycledLeScannerForLollipop.this.scanLeDevice(Boolean.TRUE);
                }
            };
            if (elapsedRealtime > 1000) {
                elapsedRealtime = 1000;
            }
            handler.postDelayed(r4, elapsedRealtime);
        } else if (this.d > 0) {
            stopScan();
            this.d = 0;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void startScan() {
        List<ScanFilter> list;
        ScanSettings scanSettings;
        if (!b()) {
            LogManager.d("CycledLeScannerForLollipop", "Not starting scan because bluetooth is off", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f) {
            LogManager.d("CycledLeScannerForLollipop", "starting filtered scan in SCAN_MODE_LOW_POWER", new Object[0]);
            scanSettings = new ScanSettings.Builder().setScanMode(0).build();
            list = new ScanFilterUtils().createScanFiltersForBeaconParsers(this.f10272a.getBeaconParsers());
        } else {
            LogManager.d("CycledLeScannerForLollipop", "starting non-filtered scan in SCAN_MODE_LOW_LATENCY", new Object[0]);
            list = arrayList;
            scanSettings = new ScanSettings.Builder().setScanMode(2).build();
        }
        if (scanSettings != null) {
            a(list, scanSettings);
        }
    }

    /* access modifiers changed from: protected */
    public void finishScan() {
        LogManager.d("CycledLeScannerForLollipop", "Stopping scan", new Object[0]);
        stopScan();
        this.mScanningPaused = true;
    }

    private void a(List<ScanFilter> list, ScanSettings scanSettings) {
        final BluetoothLeScanner c2 = c();
        if (c2 != null) {
            final ScanCallback d2 = d();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            final List<ScanFilter> list2 = list;
            final ScanSettings scanSettings2 = scanSettings;
            this.mScanHandler.post(new Runnable() {
                @WorkerThread
                public void run() {
                    try {
                        c2.startScan(list2, scanSettings2, d2);
                    } catch (IllegalStateException unused) {
                        LogManager.w("CycledLeScannerForLollipop", "Cannot start scan. Bluetooth may be turned off.", new Object[0]);
                    } catch (NullPointerException e) {
                        LogManager.e(e, "CycledLeScannerForLollipop", "Cannot start scan. Unexpected NPE.", new Object[0]);
                    } catch (SecurityException unused2) {
                        LogManager.e("CycledLeScannerForLollipop", "Cannot start scan.  Security Exception", new Object[0]);
                    }
                }
            });
        }
    }

    private void a() {
        if (!b()) {
            LogManager.d("CycledLeScannerForLollipop", "Not stopping scan because bluetooth is off", new Object[0]);
            return;
        }
        final BluetoothLeScanner c2 = c();
        if (c2 != null) {
            final ScanCallback d2 = d();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            this.mScanHandler.post(new Runnable() {
                @WorkerThread
                public void run() {
                    try {
                        LogManager.d("CycledLeScannerForLollipop", "Stopping LE scan on scan handler", new Object[0]);
                        c2.stopScan(d2);
                    } catch (IllegalStateException unused) {
                        LogManager.w("CycledLeScannerForLollipop", "Cannot stop scan. Bluetooth may be turned off.", new Object[0]);
                    } catch (NullPointerException e) {
                        LogManager.e(e, "CycledLeScannerForLollipop", "Cannot stop scan. Unexpected NPE.", new Object[0]);
                    } catch (SecurityException unused2) {
                        LogManager.e("CycledLeScannerForLollipop", "Cannot stop scan.  Security Exception", new Object[0]);
                    }
                }
            });
        }
    }

    private boolean b() {
        try {
            BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
            if (bluetoothAdapter == null) {
                LogManager.w("CycledLeScannerForLollipop", "Cannot get bluetooth adapter", new Object[0]);
                return false;
            } else if (bluetoothAdapter.getState() == 12) {
                return true;
            } else {
                return false;
            }
        } catch (SecurityException unused) {
            LogManager.w("CycledLeScannerForLollipop", "SecurityException checking if bluetooth is on", new Object[0]);
        }
    }

    private BluetoothLeScanner c() {
        try {
            if (this.b == null) {
                LogManager.d("CycledLeScannerForLollipop", "Making new Android L scanner", new Object[0]);
                if (getBluetoothAdapter() != null) {
                    this.b = getBluetoothAdapter().getBluetoothLeScanner();
                }
                if (this.b == null) {
                    LogManager.w("CycledLeScannerForLollipop", "Failed to make new Android L scanner", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            LogManager.w("CycledLeScannerForLollipop", "SecurityException making new Android L scanner", new Object[0]);
        }
        return this.b;
    }

    private ScanCallback d() {
        if (this.c == null) {
            this.c = new ScanCallback() {
                @MainThread
                public void onScanResult(int i, ScanResult scanResult) {
                    int max = dispatchOnCancelled.setMax(i);
                    if (i != max) {
                        onCanceled oncanceled = new onCanceled(i, max, 1);
                        onCancelLoad.setMax(-220547519, oncanceled);
                        onCancelLoad.getMin(-220547519, oncanceled);
                    }
                    if (LogManager.isVerboseLoggingEnabled()) {
                        LogManager.d("CycledLeScannerForLollipop", "got record", new Object[0]);
                        List<ParcelUuid> serviceUuids = scanResult.getScanRecord().getServiceUuids();
                        if (serviceUuids != null) {
                            for (ParcelUuid valueOf : serviceUuids) {
                                LogManager.d("CycledLeScannerForLollipop", "with service uuid: ".concat(String.valueOf(valueOf)), new Object[0]);
                            }
                        }
                    }
                    CycledLeScannerForLollipop.this.mCycledLeScanCallback.onLeScan(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
                    if (CycledLeScannerForLollipop.this.d > 0) {
                        LogManager.d("CycledLeScannerForLollipop", "got a filtered scan result in the background.", new Object[0]);
                    }
                }

                @MainThread
                public void onBatchScanResults(List<ScanResult> list) {
                    LogManager.d("CycledLeScannerForLollipop", "got batch records", new Object[0]);
                    for (ScanResult next : list) {
                        CycledLeScannerForLollipop.this.mCycledLeScanCallback.onLeScan(next.getDevice(), next.getRssi(), next.getScanRecord().getBytes());
                    }
                    if (CycledLeScannerForLollipop.this.d > 0) {
                        LogManager.d("CycledLeScannerForLollipop", "got a filtered batch scan result in the background.", new Object[0]);
                    }
                }

                @MainThread
                public void onScanFailed(int i) {
                    if (i == 1) {
                        LogManager.e("CycledLeScannerForLollipop", "Scan failed: a BLE scan with the same settings is already started by the app", new Object[0]);
                    } else if (i == 2) {
                        LogManager.e("CycledLeScannerForLollipop", "Scan failed: app cannot be registered", new Object[0]);
                    } else if (i == 3) {
                        LogManager.e("CycledLeScannerForLollipop", "Scan failed: internal error", new Object[0]);
                    } else if (i != 4) {
                        StringBuilder sb = new StringBuilder("Scan failed with unknown error (errorCode=");
                        sb.append(i);
                        sb.append(")");
                        LogManager.e("CycledLeScannerForLollipop", sb.toString(), new Object[0]);
                    } else {
                        LogManager.e("CycledLeScannerForLollipop", "Scan failed: power optimized scan feature is not supported", new Object[0]);
                    }
                }
            };
        }
        return this.c;
    }
}
