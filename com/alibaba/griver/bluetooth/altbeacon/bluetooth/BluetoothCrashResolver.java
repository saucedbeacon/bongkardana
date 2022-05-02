package com.alibaba.griver.bluetooth.altbeacon.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.HashSet;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class BluetoothCrashResolver {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f10276a = new HashSet();
    /* access modifiers changed from: private */
    public boolean b = false;
    /* access modifiers changed from: private */
    public boolean c = false;
    /* access modifiers changed from: private */
    public long d = 0;
    /* access modifiers changed from: private */
    public long e = 0;
    private long f = 0;
    private int g = 0;
    private int h = 0;
    private boolean i = false;
    private long j = 0;
    private Context k = null;
    private UpdateNotifier l;
    private final BroadcastReceiver m = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            int max;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, max, 2);
                onCancelLoad.setMax(268778376, oncanceled);
                onCancelLoad.getMin(268778376, oncanceled);
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                if (BluetoothCrashResolver.this.b) {
                    LogManager.d("BluetoothCrashResolver", "Bluetooth discovery finished", new Object[0]);
                    BluetoothCrashResolver.this.d();
                } else {
                    LogManager.d("BluetoothCrashResolver", "Bluetooth discovery finished (external)", new Object[0]);
                }
            }
            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
                if (BluetoothCrashResolver.this.b) {
                    boolean unused = BluetoothCrashResolver.this.c = true;
                    LogManager.d("BluetoothCrashResolver", "Bluetooth discovery started", new Object[0]);
                } else {
                    LogManager.d("BluetoothCrashResolver", "Bluetooth discovery started (external)", new Object[0]);
                }
            }
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra != Integer.MIN_VALUE) {
                    switch (intExtra) {
                        case 10:
                            LogManager.d("BluetoothCrashResolver", "Bluetooth state is OFF", new Object[0]);
                            long unused2 = BluetoothCrashResolver.this.d = SystemClock.elapsedRealtime();
                            return;
                        case 11:
                            long unused3 = BluetoothCrashResolver.this.e = SystemClock.elapsedRealtime();
                            LogManager.d("BluetoothCrashResolver", "Bluetooth state is TURNING_ON", new Object[0]);
                            return;
                        case 12:
                            LogManager.d("BluetoothCrashResolver", "Bluetooth state is ON", new Object[0]);
                            LogManager.d("BluetoothCrashResolver", "Bluetooth was turned off for %s milliseconds", Long.valueOf(BluetoothCrashResolver.this.e - BluetoothCrashResolver.this.d));
                            if (BluetoothCrashResolver.this.e - BluetoothCrashResolver.this.d < 600) {
                                BluetoothCrashResolver.this.crashDetected();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    LogManager.d("BluetoothCrashResolver", "Bluetooth state is ERROR", new Object[0]);
                }
            }
        }
    };

    public interface UpdateNotifier {
        void dataUpdated();
    }

    private int a() {
        return 1590;
    }

    @Deprecated
    public void disableDebug() {
    }

    @Deprecated
    public void enableDebug() {
    }

    public BluetoothCrashResolver(Context context) {
        this.k = context.getApplicationContext();
        LogManager.d("BluetoothCrashResolver", "constructed", new Object[0]);
        f();
    }

    public void start() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        this.k.registerReceiver(this.m, intentFilter);
        LogManager.d("BluetoothCrashResolver", "started listening for BluetoothAdapter events", new Object[0]);
    }

    public void stop() {
        this.k.unregisterReceiver(this.m);
        LogManager.d("BluetoothCrashResolver", "stopped listening for BluetoothAdapter events", new Object[0]);
        e();
    }

    @TargetApi(18)
    public void notifyScannedDevice(BluetoothDevice bluetoothDevice, BluetoothAdapter.LeScanCallback leScanCallback) {
        int size = this.f10276a.size();
        synchronized (this.f10276a) {
            this.f10276a.add(bluetoothDevice.getAddress());
        }
        int size2 = this.f10276a.size();
        if (size != size2 && size2 % 100 == 0) {
            LogManager.d("BluetoothCrashResolver", "Distinct Bluetooth devices seen: %s", Integer.valueOf(this.f10276a.size()));
        }
        if (this.f10276a.size() > a() && !this.b) {
            LogManager.w("BluetoothCrashResolver", "Large number of Bluetooth devices detected: %s Proactively attempting to clear out address list to prevent a crash", Integer.valueOf(this.f10276a.size()));
            LogManager.w("BluetoothCrashResolver", "Stopping LE Scan", new Object[0]);
            BluetoothAdapter.getDefaultAdapter().stopLeScan(leScanCallback);
            c();
            b();
        }
    }

    public void crashDetected() {
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.d("BluetoothCrashResolver", "Ignoring crashes before API 18, because BLE is unsupported.", new Object[0]);
            return;
        }
        LogManager.w("BluetoothCrashResolver", "BluetoothService crash detected", new Object[0]);
        if (this.f10276a.size() > 0) {
            LogManager.d("BluetoothCrashResolver", "Distinct Bluetooth devices seen at crash: %s", Integer.valueOf(this.f10276a.size()));
        }
        this.f = SystemClock.elapsedRealtime();
        this.g++;
        if (this.b) {
            LogManager.d("BluetoothCrashResolver", "Ignoring Bluetooth crash because recovery is already in progress.", new Object[0]);
        } else {
            c();
        }
        b();
    }

    public long getLastBluetoothCrashDetectionTime() {
        return this.f;
    }

    public int getDetectedCrashCount() {
        return this.g;
    }

    public int getRecoveryAttemptCount() {
        return this.h;
    }

    public boolean isLastRecoverySucceeded() {
        return this.i;
    }

    public boolean isRecoveryInProgress() {
        return this.b;
    }

    public void setUpdateNotifier(UpdateNotifier updateNotifier) {
        this.l = updateNotifier;
    }

    public void forceFlush() {
        c();
        b();
    }

    private void b() {
        UpdateNotifier updateNotifier = this.l;
        if (updateNotifier != null) {
            updateNotifier.dataUpdated();
        }
        if (SystemClock.elapsedRealtime() - this.j > DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) {
            e();
        }
    }

    @TargetApi(17)
    private void c() {
        this.h++;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        LogManager.d("BluetoothCrashResolver", "about to check if discovery is active", new Object[0]);
        if (!defaultAdapter.isDiscovering()) {
            LogManager.w("BluetoothCrashResolver", "Recovery attempt started", new Object[0]);
            this.b = true;
            this.c = false;
            LogManager.d("BluetoothCrashResolver", "about to command discovery", new Object[0]);
            if (!defaultAdapter.startDiscovery()) {
                LogManager.w("BluetoothCrashResolver", "Can't start discovery.  Is Bluetooth turned on?", new Object[0]);
            }
            LogManager.d("BluetoothCrashResolver", "startDiscovery commanded.  isDiscovering()=%s", Boolean.valueOf(defaultAdapter.isDiscovering()));
            LogManager.d("BluetoothCrashResolver", "We will be cancelling this discovery in %s milliseconds.", 5000);
            g();
            return;
        }
        LogManager.w("BluetoothCrashResolver", "Already discovering.  Recovery attempt abandoned.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void d() {
        LogManager.w("BluetoothCrashResolver", "Recovery attempt finished", new Object[0]);
        synchronized (this.f10276a) {
            this.f10276a.clear();
        }
        this.b = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa A[SYNTHETIC, Splitter:B:34:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf A[SYNTHETIC, Splitter:B:41:0x00cf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.j = r0
            r0 = 1
            r1 = 0
            r2 = 0
            android.content.Context r3 = r7.k     // Catch:{ IOException -> 0x009b }
            java.lang.String r4 = "BluetoothCrashResolverState.txt"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r1)     // Catch:{ IOException -> 0x009b }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x009b }
            r4.<init>(r3)     // Catch:{ IOException -> 0x009b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.<init>()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            long r5 = r7.f     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.append(r5)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r4.write(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.<init>()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            int r3 = r7.g     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.append(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r4.write(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.<init>()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            int r3 = r7.h     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r2.append(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            r4.write(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            boolean r2 = r7.i     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "1\n"
            goto L_0x0061
        L_0x005f:
            java.lang.String r2 = "0\n"
        L_0x0061:
            r4.write(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.util.Set<java.lang.String> r2 = r7.f10276a     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            java.util.Set<java.lang.String> r3 = r7.f10276a     // Catch:{ all -> 0x0091 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0091 }
        L_0x006d:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0091 }
            r4.write(r5)     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = "\n"
            r4.write(r5)     // Catch:{ all -> 0x0091 }
            goto L_0x006d
        L_0x0082:
            monitor-exit(r2)     // Catch:{ all -> 0x0091 }
            r4.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x00b7
        L_0x0087:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "BluetoothCrashResolver"
            java.lang.String r4 = "close writer exception"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r4, r2)
            goto L_0x00b7
        L_0x0091:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
            throw r3     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            r2 = r4
            goto L_0x00cd
        L_0x0097:
            r2 = r4
            goto L_0x009b
        L_0x0099:
            r0 = move-exception
            goto L_0x00cd
        L_0x009b:
            java.lang.String r3 = "BluetoothCrashResolver"
            java.lang.String r4 = "Can't write macs to %s"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = "BluetoothCrashResolverState.txt"
            r5[r1] = r6     // Catch:{ all -> 0x0099 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r3, r4, r5)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x00b7
            r2.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b7
        L_0x00ae:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "BluetoothCrashResolver"
            java.lang.String r4 = "close writer exception"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r4, r2)
        L_0x00b7:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Set<java.lang.String> r2 = r7.f10276a
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "BluetoothCrashResolver"
            java.lang.String r2 = "Wrote %s Bluetooth addresses"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r1, r2, r0)
            return
        L_0x00cd:
            if (r2 == 0) goto L_0x00dc
            r2.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00dc
        L_0x00d3:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "BluetoothCrashResolver"
            java.lang.String r3 = "close writer exception"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r3, r1)
        L_0x00dc:
            goto L_0x00de
        L_0x00dd:
            throw r0
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver.e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079 A[SYNTHETIC, Splitter:B:37:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[SYNTHETIC, Splitter:B:46:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad A[SYNTHETIC, Splitter:B:53:0x00ad] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r9 = this;
            java.lang.String r0 = "BluetoothCrashResolverState.txt"
            java.lang.String r1 = "close reader exception"
            java.lang.String r2 = "BluetoothCrashResolver"
            r3 = 1
            r4 = 0
            r5 = 0
            android.content.Context r6 = r9.k     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            java.io.FileInputStream r6 = r6.openFileInput(r0)     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            r8.<init>(r6)     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0083, NumberFormatException -> 0x006e }
            java.lang.String r5 = r7.readLine()     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x0025
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            r9.f = r5     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
        L_0x0025:
            java.lang.String r5 = r7.readLine()     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x0031
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            r9.g = r5     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
        L_0x0031:
            java.lang.String r5 = r7.readLine()     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x003d
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            r9.h = r5     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
        L_0x003d:
            java.lang.String r5 = r7.readLine()     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x004f
            r9.i = r4     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            java.lang.String r6 = "1"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x004f
            r9.i = r3     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
        L_0x004f:
            java.lang.String r5 = r7.readLine()     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            if (r5 == 0) goto L_0x005b
            java.util.Set<java.lang.String> r6 = r9.f10276a     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            r6.add(r5)     // Catch:{ IOException -> 0x006a, NumberFormatException -> 0x0068, all -> 0x0065 }
            goto L_0x004f
        L_0x005b:
            r7.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0097
        L_0x005f:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r0)
            goto L_0x0097
        L_0x0065:
            r0 = move-exception
            r5 = r7
            goto L_0x00ab
        L_0x0068:
            r5 = r7
            goto L_0x006e
        L_0x006a:
            r5 = r7
            goto L_0x0083
        L_0x006c:
            r0 = move-exception
            goto L_0x00ab
        L_0x006e:
            java.lang.String r6 = "Can't parse file %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x006c }
            r7[r4] = r0     // Catch:{ all -> 0x006c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r2, r6, r7)     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0097
            r5.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0097
        L_0x007d:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r0)
            goto L_0x0097
        L_0x0083:
            java.lang.String r6 = "Can't read macs from %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x006c }
            r7[r4] = r0     // Catch:{ all -> 0x006c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r2, r6, r7)     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0097
            r5.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0097
        L_0x0092:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r0)
        L_0x0097:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.util.Set<java.lang.String> r1 = r9.f10276a
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "Read %s Bluetooth addresses"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r2, r1, r0)
            return
        L_0x00ab:
            if (r5 == 0) goto L_0x00b6
            r5.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b6
        L_0x00b1:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r3)
        L_0x00b6:
            goto L_0x00b8
        L_0x00b7:
            throw r0
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver.f():void");
    }

    private void g() {
        try {
            Thread.sleep(5000);
            if (!this.c) {
                LogManager.w("BluetoothCrashResolver", "BluetoothAdapter.ACTION_DISCOVERY_STARTED never received.  Recovery may fail.", new Object[0]);
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isDiscovering()) {
                LogManager.d("BluetoothCrashResolver", "Cancelling discovery", new Object[0]);
                defaultAdapter.cancelDiscovery();
                return;
            }
            LogManager.d("BluetoothCrashResolver", "Discovery not running.  Won't cancel it", new Object[0]);
        } catch (InterruptedException unused) {
            LogManager.d("BluetoothCrashResolver", "DiscoveryCanceller sleep interrupted.", new Object[0]);
        }
    }
}
