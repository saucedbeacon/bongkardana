package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanCallback;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.DistinctPacketDetector;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.ScanFilterUtils;
import com.alibaba.griver.bluetooth.altbeacon.beacon.startup.StartupBroadcastReceiver;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@TargetApi(21)
class ScanHelper {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10264a = ScanHelper.class.getSimpleName();
    private final Map<Region, RangeState> b = new HashMap();
    private BeaconManager c;
    /* access modifiers changed from: private */
    public CycledLeScanner d;
    /* access modifiers changed from: private */
    public MonitoringStatus e;
    /* access modifiers changed from: private */
    public DistinctPacketDetector f = new DistinctPacketDetector();
    private ExtraDataBeaconTracker g;
    /* access modifiers changed from: private */
    public Set<BeaconParser> h = new HashSet();
    /* access modifiers changed from: private */
    public List<Beacon> i = null;
    /* access modifiers changed from: private */
    public Context j;
    private final CycledLeScanCallback k = new CycledLeScanCallback() {
        @TargetApi(11)
        @MainThread
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            ScanHelper.this.processScanResult(bluetoothDevice, i, bArr);
        }

        @SuppressLint({"WrongThread"})
        @MainThread
        public void onCycleEnd() {
            ScanHelper.this.f.clearDetections();
            ScanHelper.this.e.updateNewlyOutside();
            ScanHelper.this.a();
            if (ScanHelper.this.i != null) {
                LogManager.w(ScanHelper.f10264a, "Simulated scan data is deprecated and will be removed in a future release. Please use the new BeaconSimulator interface instead.", new Object[0]);
                ApplicationInfo applicationInfo = ScanHelper.this.j.getApplicationInfo();
                int i = applicationInfo.flags & 2;
                applicationInfo.flags = i;
                if (i != 0) {
                    for (Beacon access$600 : ScanHelper.this.i) {
                        ScanHelper.this.a(access$600);
                    }
                } else {
                    LogManager.w(ScanHelper.f10264a, "Simulated scan data provided, but ignored because we are not running in debug mode.  Please remove simulated scan data for production.", new Object[0]);
                }
            }
            if (BeaconManager.getBeaconSimulator() == null) {
                return;
            }
            if (BeaconManager.getBeaconSimulator().getBeacons() != null) {
                ApplicationInfo applicationInfo2 = ScanHelper.this.j.getApplicationInfo();
                int i2 = applicationInfo2.flags & 2;
                applicationInfo2.flags = i2;
                if (i2 != 0) {
                    for (Beacon access$6002 : BeaconManager.getBeaconSimulator().getBeacons()) {
                        ScanHelper.this.a(access$6002);
                    }
                    return;
                }
                LogManager.w(ScanHelper.f10264a, "Beacon simulations provided, but ignored because we are not running in debug mode.  Please remove beacon simulations for production.", new Object[0]);
                return;
            }
            LogManager.w(ScanHelper.f10264a, "getBeacons is returning null. No simulated beacons to report.", new Object[0]);
        }
    };

    ScanHelper(Context context) {
        this.j = context;
        this.c = BeaconManager.getInstanceForApplication(context);
    }

    /* access modifiers changed from: package-private */
    public CycledLeScanner getCycledScanner() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public MonitoringStatus getMonitoringStatus() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.e = monitoringStatus;
    }

    /* access modifiers changed from: package-private */
    public Map<Region, RangeState> getRangedRegionState() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void setRangedRegionState(Map<Region, RangeState> map) {
        synchronized (this.b) {
            this.b.clear();
            this.b.putAll(map);
        }
    }

    /* access modifiers changed from: package-private */
    public void setExtraDataBeaconTracker(ExtraDataBeaconTracker extraDataBeaconTracker) {
        this.g = extraDataBeaconTracker;
    }

    /* access modifiers changed from: package-private */
    public void setBeaconParsers(Set<BeaconParser> set) {
        this.h = set;
    }

    /* access modifiers changed from: package-private */
    public void setSimulatedScanData(List<Beacon> list) {
        this.i = list;
    }

    /* access modifiers changed from: package-private */
    public void createCycledLeScanner(boolean z, BluetoothCrashResolver bluetoothCrashResolver) {
        this.d = CycledLeScanner.createScanner(this.j, BeaconManager.DEFAULT_FOREGROUND_SCAN_PERIOD, 0, z, this.k, bluetoothCrashResolver);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(11)
    public void processScanResult(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
        NonBeaconLeScanCallback nonBeaconLeScanCallback = this.c.getNonBeaconLeScanCallback();
        RVExecutorService rVExecutorService = (RVExecutorService) RVProxy.get(RVExecutorService.class);
        if (rVExecutorService != null) {
            ScheduledThreadPoolExecutor scheduledExecutor = rVExecutorService.getScheduledExecutor();
            try {
                new ScanProcessor(nonBeaconLeScanCallback).executeOnExecutor(scheduledExecutor, new ScanData[]{new ScanData(bluetoothDevice, i2, bArr)});
            } catch (RejectedExecutionException unused) {
                LogManager.w(f10264a, "Ignoring scan result because we cannot keep up.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void reloadParsers() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.getBeaconParsers());
        boolean z = true;
        for (BeaconParser next : this.c.getBeaconParsers()) {
            if (next.getExtraDataParsers().size() > 0) {
                z = false;
                hashSet.addAll(next.getExtraDataParsers());
            }
        }
        this.h = hashSet;
        this.g = new ExtraDataBeaconTracker(z);
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 26)
    public void startAndroidOBackgroundScan(Set<BeaconParser> set) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
        List<ScanFilter> createScanFiltersForBeaconParsers = new ScanFilterUtils().createScanFiltersForBeaconParsers(new ArrayList(set));
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.j.getApplicationContext().getSystemService(TinyAppActionState.ACTION_BLUE_TOOTH)).getAdapter();
            if (adapter == null) {
                LogManager.w(f10264a, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (!adapter.isEnabled()) {
                LogManager.w(f10264a, "Failed to start background scan on Android O: BluetoothAdapter is not enabled", new Object[0]);
            } else {
                int startScan = adapter.getBluetoothLeScanner().startScan(createScanFiltersForBeaconParsers, build, getScanCallbackIntent());
                if (startScan != 0) {
                    LogManager.e(f10264a, "Failed to start background scan on Android O.  Code: ".concat(String.valueOf(startScan)), new Object[0]);
                } else {
                    LogManager.d(f10264a, "Started passive beacon scan", new Object[0]);
                }
            }
        } catch (SecurityException unused) {
            LogManager.e(f10264a, "SecurityException making Android O background scanner", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(api = 26)
    public void stopAndroidOBackgroundScan() {
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.j.getApplicationContext().getSystemService(TinyAppActionState.ACTION_BLUE_TOOTH)).getAdapter();
            if (adapter == null) {
                LogManager.w(f10264a, "Failed to construct a BluetoothAdapter", new Object[0]);
            } else if (!adapter.isEnabled()) {
                LogManager.w(f10264a, "BluetoothAdapter is not enabled", new Object[0]);
            } else {
                adapter.getBluetoothLeScanner().stopScan(getScanCallbackIntent());
            }
        } catch (SecurityException unused) {
            LogManager.e(f10264a, "SecurityException stopping Android O background scanner", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public PendingIntent getScanCallbackIntent() {
        Intent intent = new Intent(this.j, StartupBroadcastReceiver.class);
        intent.putExtra("o-scan", true);
        return PendingIntent.getBroadcast(this.j, 0, intent, 134217728);
    }

    /* access modifiers changed from: private */
    public void a() {
        synchronized (this.b) {
            for (Region next : this.b.keySet()) {
                RangeState rangeState = this.b.get(next);
                LogManager.d(f10264a, "Calling ranging callback", new Object[0]);
                rangeState.getCallback().call(this.j, "rangingData", new RangingData(rangeState.finalizeBeacons(), next).toBundle());
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void a(@NonNull Beacon beacon) {
        if (Stats.getInstance().isEnabled()) {
            Stats.getInstance().log(beacon);
        }
        if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(f10264a, "beacon detected : %s", beacon.toString());
        }
        Beacon track = this.g.track(beacon);
        if (track != null) {
            this.e.updateNewlyInsideInRegionsContaining(track);
            LogManager.d(f10264a, "looking for ranging region matches for this beacon", new Object[0]);
            synchronized (this.b) {
                for (Region next : a(track, this.b.keySet())) {
                    LogManager.d(f10264a, "matches ranging region: %s", next);
                    RangeState rangeState = this.b.get(next);
                    if (rangeState != null) {
                        rangeState.addBeacon(track);
                    }
                }
            }
        } else if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(f10264a, "not processing detections for GATT extra data beacon", new Object[0]);
        }
    }

    private List<Region> a(Beacon beacon, Collection<Region> collection) {
        ArrayList arrayList = new ArrayList();
        for (Region next : collection) {
            if (next.matchesBeacon(beacon)) {
                arrayList.add(next);
            } else {
                LogManager.d(f10264a, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    class ScanData {
        @NonNull
        BluetoothDevice device;
        final int rssi;
        @NonNull
        byte[] scanRecord;

        ScanData(BluetoothDevice bluetoothDevice, @NonNull int i, byte[] bArr) {
            this.device = bluetoothDevice;
            this.rssi = i;
            this.scanRecord = bArr;
        }
    }

    class ScanProcessor extends AsyncTask<ScanData, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final NonBeaconLeScanCallback f10265a;
        final DetectionTracker mDetectionTracker = DetectionTracker.getInstance();

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Void... voidArr) {
        }

        ScanProcessor(NonBeaconLeScanCallback nonBeaconLeScanCallback) {
            this.f10265a = nonBeaconLeScanCallback;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x0025, LOOP_START, PHI: r3 
          PHI: (r3v1 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon) = (r3v0 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon), (r3v6 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon) binds: [B:0:0x0000, B:4:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        @androidx.annotation.WorkerThread
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.ScanData... r8) {
            /*
                r7 = this;
                r0 = 0
                r8 = r8[r0]
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                java.util.Set r1 = r1.h
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
                r3 = r2
            L_0x000f:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0027
                java.lang.Object r3 = r1.next()
                com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser r3 = (com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser) r3
                byte[] r4 = r8.scanRecord
                int r5 = r8.rssi
                android.bluetooth.BluetoothDevice r6 = r8.device
                com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon r3 = r3.fromScanData(r4, r5, r6)
                if (r3 == 0) goto L_0x000f
            L_0x0027:
                if (r3 == 0) goto L_0x009a
                boolean r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
                if (r1 == 0) goto L_0x0052
                java.lang.String r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.f10264a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Beacon packet detected for: "
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r5 = " with rssi "
                r4.append(r5)
                int r5 = r3.getRssi()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r5 = new java.lang.Object[r0]
                com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r1, r4, r5)
            L_0x0052:
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.DetectionTracker r1 = r7.mDetectionTracker
                r1.recordDetection()
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner r1 = r1.d
                if (r1 == 0) goto L_0x0094
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner r1 = r1.d
                boolean r1 = r1.getDistinctPacketsDetectedPerScan()
                if (r1 != 0) goto L_0x0094
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r1 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.DistinctPacketDetector r1 = r1.f
                android.bluetooth.BluetoothDevice r4 = r8.device
                java.lang.String r4 = r4.getAddress()
                byte[] r8 = r8.scanRecord
                boolean r8 = r1.isPacketDistinct(r4, r8)
                if (r8 != 0) goto L_0x0094
                java.lang.String r8 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.f10264a
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Non-distinct packets detected in a single scan.  Restarting scans unecessary."
                com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.i(r8, r1, r0)
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r8 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.CycledLeScanner r8 = r8.d
                r0 = 1
                r8.setDistinctPacketsDetectedPerScan(r0)
            L_0x0094:
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper r8 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.this
                r8.a(r3)
                goto L_0x00a7
            L_0x009a:
                com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback r0 = r7.f10265a
                if (r0 == 0) goto L_0x00a7
                android.bluetooth.BluetoothDevice r1 = r8.device
                int r3 = r8.rssi
                byte[] r8 = r8.scanRecord
                r0.onNonBeaconLeScan(r1, r3, r8)
            L_0x00a7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper.ScanProcessor.doInBackground(com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanHelper$ScanData[]):java.lang.Void");
        }
    }
}
