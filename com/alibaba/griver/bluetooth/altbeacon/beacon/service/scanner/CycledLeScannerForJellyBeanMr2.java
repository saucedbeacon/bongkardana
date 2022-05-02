package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(18)
public class CycledLeScannerForJellyBeanMr2 extends CycledLeScanner {

    /* renamed from: a  reason: collision with root package name */
    private BluetoothAdapter.LeScanCallback f10271a;

    public CycledLeScannerForJellyBeanMr2(Context context, long j, long j2, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j, j2, z, cycledLeScanCallback, bluetoothCrashResolver);
    }

    /* access modifiers changed from: protected */
    public void stopScan() {
        b();
    }

    /* access modifiers changed from: protected */
    public boolean deferScanIfNeeded() {
        long elapsedRealtime = this.mNextScanCycleStartTime - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            return false;
        }
        LogManager.d("CycledLeScannerForJellyBeanMr2", "Waiting to start next Bluetooth scan for another %s milliseconds", Long.valueOf(elapsedRealtime));
        if (this.mBackgroundFlag) {
            setWakeUpAlarm();
        }
        Handler handler = this.mHandler;
        AnonymousClass1 r4 = new Runnable() {
            @MainThread
            public void run() {
                CycledLeScannerForJellyBeanMr2.this.scanLeDevice(Boolean.TRUE);
            }
        };
        if (elapsedRealtime > 1000) {
            elapsedRealtime = 1000;
        }
        handler.postDelayed(r4, elapsedRealtime);
        return true;
    }

    /* access modifiers changed from: protected */
    public void startScan() {
        a();
    }

    /* access modifiers changed from: protected */
    public void finishScan() {
        b();
        this.mScanningPaused = true;
    }

    private void a() {
        final BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            final BluetoothAdapter.LeScanCallback c = c();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            this.mScanHandler.post(new Runnable() {
                @WorkerThread
                public void run() {
                    try {
                        bluetoothAdapter.startLeScan(c);
                    } catch (Exception e) {
                        LogManager.e(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in startLeScan()", new Object[0]);
                    }
                }
            });
        }
    }

    private void b() {
        final BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            final BluetoothAdapter.LeScanCallback c = c();
            this.mScanHandler.removeCallbacksAndMessages((Object) null);
            this.mScanHandler.post(new Runnable() {
                @WorkerThread
                public void run() {
                    try {
                        bluetoothAdapter.stopLeScan(c);
                    } catch (Exception e) {
                        LogManager.e(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in stopLeScan()", new Object[0]);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public BluetoothAdapter.LeScanCallback c() {
        if (this.f10271a == null) {
            this.f10271a = new BluetoothAdapter.LeScanCallback() {
                public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                    LogManager.d("CycledLeScannerForJellyBeanMr2", "got record", new Object[0]);
                    CycledLeScannerForJellyBeanMr2.this.mCycledLeScanCallback.onLeScan(bluetoothDevice, i, bArr);
                    if (CycledLeScannerForJellyBeanMr2.this.mBluetoothCrashResolver != null) {
                        CycledLeScannerForJellyBeanMr2.this.mBluetoothCrashResolver.notifyScannedDevice(bluetoothDevice, CycledLeScannerForJellyBeanMr2.this.c());
                    }
                }
            };
        }
        return this.f10271a;
    }
}
