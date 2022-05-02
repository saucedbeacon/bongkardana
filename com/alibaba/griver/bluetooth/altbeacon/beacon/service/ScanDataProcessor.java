package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.pm.ApplicationInfo;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ScanDataProcessor {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10263a = ScanDataProcessor.class.getSimpleName();
    private Service b;
    private Map<Region, RangeState> c = new HashMap();
    private MonitoringStatus d;
    private Set<BeaconParser> e = new HashSet();
    private ExtraDataBeaconTracker f;
    private NonBeaconLeScanCallback g;
    private DetectionTracker h = DetectionTracker.getInstance();
    int trackedBeaconsPacketCount;

    public ScanDataProcessor(Service service, ScanState scanState) {
        this.b = service;
        this.d = scanState.getMonitoringStatus();
        this.c = scanState.getRangedRegionState();
        this.d = scanState.getMonitoringStatus();
        this.f = scanState.getExtraBeaconDataTracker();
        this.e = scanState.getBeaconParsers();
    }

    @TargetApi(21)
    public void process(ScanResult scanResult) {
        process(new ScanData(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x001d, LOOP_START, PHI: r1 
      PHI: (r1v1 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon) = (r1v0 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon), (r1v6 com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon) binds: [B:0:0x0000, B:4:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void process(com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanDataProcessor.ScanData r6) {
        /*
            r5 = this;
            java.util.Set<com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser> r0 = r5.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser r1 = (com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser) r1
            byte[] r2 = r6.scanRecord
            int r3 = r6.rssi
            android.bluetooth.BluetoothDevice r4 = r6.device
            com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon r1 = r1.fromScanData(r2, r3, r4)
            if (r1 == 0) goto L_0x0007
        L_0x001f:
            if (r1 == 0) goto L_0x0030
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.DetectionTracker r6 = r5.h
            r6.recordDetection()
            int r6 = r5.trackedBeaconsPacketCount
            int r6 = r6 + 1
            r5.trackedBeaconsPacketCount = r6
            r5.a(r1)
            return
        L_0x0030:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback r0 = r5.g
            if (r0 == 0) goto L_0x003d
            android.bluetooth.BluetoothDevice r1 = r6.device
            int r2 = r6.rssi
            byte[] r6 = r6.scanRecord
            r0.onNonBeaconLeScan(r1, r2, r6)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanDataProcessor.process(com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanDataProcessor$ScanData):void");
    }

    private void a(Beacon beacon) {
        if (Stats.getInstance().isEnabled()) {
            Stats.getInstance().log(beacon);
        }
        if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(f10263a, "beacon detected : %s", beacon.toString());
        }
        Beacon track = this.f.track(beacon);
        if (track != null) {
            this.d.updateNewlyInsideInRegionsContaining(track);
            String str = f10263a;
            StringBuilder sb = new StringBuilder("looking for ranging region matches for this beacon out of ");
            sb.append(this.c.keySet().size());
            sb.append(" regions.");
            LogManager.d(str, sb.toString(), new Object[0]);
            synchronized (this.c) {
                for (Region next : a(track, this.c.keySet())) {
                    LogManager.d(f10263a, "matches ranging region: %s", next);
                    RangeState rangeState = this.c.get(next);
                    if (rangeState != null) {
                        rangeState.addBeacon(track);
                    }
                }
            }
        } else if (LogManager.isVerboseLoggingEnabled()) {
            LogManager.d(f10263a, "not processing detections for GATT extra data beacon", new Object[0]);
        }
    }

    private List<Region> a(Beacon beacon, Collection<Region> collection) {
        ArrayList arrayList = new ArrayList();
        for (Region next : collection) {
            if (next.matchesBeacon(beacon)) {
                arrayList.add(next);
            } else {
                LogManager.d(f10263a, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    public void onCycleEnd() {
        this.d.updateNewlyOutside();
        a();
        if (BeaconManager.getBeaconSimulator() == null) {
            return;
        }
        if (BeaconManager.getBeaconSimulator().getBeacons() != null) {
            ApplicationInfo applicationInfo = this.b.getApplicationContext().getApplicationInfo();
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                for (Beacon a2 : BeaconManager.getBeaconSimulator().getBeacons()) {
                    a(a2);
                }
                return;
            }
            LogManager.w(f10263a, "Beacon simulations provided, but ignored because we are not running in debug mode.  Please remove beacon simulations for production.", new Object[0]);
            return;
        }
        LogManager.w(f10263a, "getBeacons is returning null. No simulated beacons to report.", new Object[0]);
    }

    private void a() {
        synchronized (this.c) {
            for (Region next : this.c.keySet()) {
                LogManager.d(f10263a, "Calling ranging callback", new Object[0]);
                new Callback(this.b.getPackageName()).call(this.b, "rangingData", new RangingData(this.c.get(next).finalizeBeacons(), next).toBundle());
            }
        }
    }

    class ScanData {
        BluetoothDevice device;
        int rssi;
        byte[] scanRecord;

        public ScanData(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            this.device = bluetoothDevice;
            this.rssi = i;
            this.scanRecord = bArr;
        }
    }
}
