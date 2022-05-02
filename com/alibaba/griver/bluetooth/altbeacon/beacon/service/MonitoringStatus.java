package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.content.Context;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitoringStatus {
    public static final String STATUS_PRESERVATION_FILE_NAME = "org.com.alibaba.griver.bluetooth.altbeacon.beacon.service.monitoring_status_state";

    /* renamed from: a  reason: collision with root package name */
    private static final String f10260a = MonitoringStatus.class.getSimpleName();
    private static final Object b = new Object();
    private static volatile MonitoringStatus c;
    private Map<Region, RegionMonitoringState> d;
    private Context e;
    private boolean f = true;

    public MonitoringStatus(Context context) {
        this.e = context;
    }

    public static MonitoringStatus getInstanceForApplication(Context context) {
        MonitoringStatus monitoringStatus;
        MonitoringStatus monitoringStatus2 = c;
        if (monitoringStatus2 != null) {
            return monitoringStatus2;
        }
        synchronized (b) {
            monitoringStatus = c;
            if (monitoringStatus == null) {
                monitoringStatus = new MonitoringStatus(context.getApplicationContext());
                c = monitoringStatus;
            }
        }
        return monitoringStatus;
    }

    public synchronized void addRegion(Region region, Callback callback) {
        a(region, callback);
        saveMonitoringStatusIfOn();
    }

    public synchronized void removeRegion(Region region) {
        removeLocalRegion(region);
        saveMonitoringStatusIfOn();
    }

    public synchronized Set<Region> regions() {
        return a().keySet();
    }

    public synchronized int regionsCount() {
        return regions().size();
    }

    public synchronized RegionMonitoringState stateOf(Region region) {
        return a().get(region);
    }

    public synchronized void updateNewlyOutside() {
        boolean z = false;
        for (Region next : regions()) {
            RegionMonitoringState stateOf = stateOf(next);
            if (stateOf.markOutsideIfExpired()) {
                LogManager.d(f10260a, "found a monitor that expired: %s", next);
                stateOf.getCallback().call(this.e, "monitoringData", new MonitoringData(stateOf.getInside(), next).toBundle());
                z = true;
            }
        }
        if (z) {
            saveMonitoringStatusIfOn();
        } else {
            updateMonitoringStatusTime(System.currentTimeMillis());
        }
    }

    public synchronized void updateNewlyInsideInRegionsContaining(Beacon beacon) {
        boolean z = false;
        for (Region next : a(beacon)) {
            RegionMonitoringState regionMonitoringState = a().get(next);
            if (regionMonitoringState != null && regionMonitoringState.markInside()) {
                z = true;
                regionMonitoringState.getCallback().call(this.e, "monitoringData", new MonitoringData(regionMonitoringState.getInside(), next).toBundle());
            }
        }
        if (z) {
            saveMonitoringStatusIfOn();
        } else {
            updateMonitoringStatusTime(System.currentTimeMillis());
        }
    }

    private Map<Region, RegionMonitoringState> a() {
        if (this.d == null) {
            b();
        }
        return this.d;
    }

    private void b() {
        long currentTimeMillis = System.currentTimeMillis() - getLastMonitoringStatusUpdateTime();
        this.d = new HashMap();
        if (!this.f) {
            LogManager.d(f10260a, "Not restoring monitoring state because persistence is disabled", new Object[0]);
        } else if (currentTimeMillis > 900000) {
            LogManager.d(f10260a, "Not restoring monitoring state because it was recorded too many milliseconds ago: ".concat(String.valueOf(currentTimeMillis)), new Object[0]);
        } else {
            restoreMonitoringStatus();
            LogManager.d(f10260a, "Done restoring monitoring status", new Object[0]);
        }
    }

    private List<Region> a(Beacon beacon) {
        ArrayList arrayList = new ArrayList();
        for (Region next : regions()) {
            if (next.matchesBeacon(beacon)) {
                arrayList.add(next);
            } else {
                LogManager.d(f10260a, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[SYNTHETIC, Splitter:B:37:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090 A[SYNTHETIC, Splitter:B:42:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[SYNTHETIC, Splitter:B:49:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac A[SYNTHETIC, Splitter:B:54:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveMonitoringStatusIfOn() {
        /*
            r10 = this;
            java.lang.String r0 = "close objectOutputStream exception"
            java.lang.String r1 = "close outputStream exception"
            boolean r2 = r10.f
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r2 = f10260a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "saveMonitoringStatusIfOn()"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r2, r5, r4)
            java.util.Map r2 = r10.a()
            int r2 = r2.size()
            r4 = 50
            java.lang.String r5 = "org.com.alibaba.griver.bluetooth.altbeacon.beacon.service.monitoring_status_state"
            if (r2 <= r4) goto L_0x0030
            java.lang.String r0 = f10260a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Too many regions being monitored.  Will not persist region state"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r0, r2, r1)
            android.content.Context r0 = r10.e
            r0.deleteFile(r5)
            return
        L_0x0030:
            r2 = 0
            android.content.Context r4 = r10.e     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.FileOutputStream r4 = r4.openFileOutput(r5, r3)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            java.util.Map r2 = r10.a()     // Catch:{ IOException -> 0x005c }
            r5.writeObject(r2)     // Catch:{ IOException -> 0x005c }
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            java.lang.String r2 = f10260a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r4)
        L_0x0050:
            r5.close()     // Catch:{ IOException -> 0x0054 }
            return
        L_0x0054:
            java.lang.String r1 = f10260a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r2)
            return
        L_0x005c:
            r2 = move-exception
            goto L_0x0071
        L_0x005e:
            r5 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x009d
        L_0x0063:
            r5 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x0071
        L_0x0068:
            r4 = move-exception
            r5 = r2
            r2 = r4
            r4 = r5
            goto L_0x009d
        L_0x006d:
            r4 = move-exception
            r5 = r2
            r2 = r4
            r4 = r5
        L_0x0071:
            java.lang.String r6 = f10260a     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "Error while saving monitored region states to file. %s "
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x009c }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x009c }
            r8[r3] = r2     // Catch:{ all -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r6, r7, r8)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008e
        L_0x0087:
            java.lang.String r2 = f10260a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r4)
        L_0x008e:
            if (r5 == 0) goto L_0x009b
            r5.close()     // Catch:{ IOException -> 0x0094 }
            return
        L_0x0094:
            java.lang.String r1 = f10260a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r2)
        L_0x009b:
            return
        L_0x009c:
            r2 = move-exception
        L_0x009d:
            if (r4 == 0) goto L_0x00aa
            r4.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00aa
        L_0x00a3:
            java.lang.String r4 = f10260a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r4, r1, r6)
        L_0x00aa:
            if (r5 == 0) goto L_0x00b7
            r5.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b7
        L_0x00b0:
            java.lang.String r1 = f10260a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r3)
        L_0x00b7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus.saveMonitoringStatusIfOn():void");
    }

    /* access modifiers changed from: protected */
    public void updateMonitoringStatusTime(long j) {
        this.e.getFileStreamPath(STATUS_PRESERVATION_FILE_NAME).setLastModified(j);
    }

    /* access modifiers changed from: protected */
    public long getLastMonitoringStatusUpdateTime() {
        return this.e.getFileStreamPath(STATUS_PRESERVATION_FILE_NAME).lastModified();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da A[Catch:{ all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4 A[Catch:{ all -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6 A[SYNTHETIC, Splitter:B:43:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103 A[SYNTHETIC, Splitter:B:48:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112 A[SYNTHETIC, Splitter:B:55:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f A[SYNTHETIC, Splitter:B:60:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void restoreMonitoringStatus() {
        /*
            r12 = this;
            java.lang.String r0 = "close objectInputStream exception"
            java.lang.String r1 = "close inputStream exception"
            r2 = 0
            r3 = 0
            android.content.Context r4 = r12.e     // Catch:{ IOException -> 0x00d2, ClassNotFoundException -> 0x00d0, ClassCastException -> 0x00ce, all -> 0x00c9 }
            java.lang.String r5 = "org.com.alibaba.griver.bluetooth.altbeacon.beacon.service.monitoring_status_state"
            java.io.FileInputStream r4 = r4.openFileInput(r5)     // Catch:{ IOException -> 0x00d2, ClassNotFoundException -> 0x00d0, ClassCastException -> 0x00ce, all -> 0x00c9 }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00c4, ClassNotFoundException -> 0x00c2, ClassCastException -> 0x00c0, all -> 0x00bb }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00c4, ClassNotFoundException -> 0x00c2, ClassCastException -> 0x00c0, all -> 0x00bb }
            java.lang.Object r2 = r5.readObject()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r6 = f10260a     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r8 = "Restored region monitoring state for "
            r7.<init>(r8)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            int r8 = r2.size()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            r7.append(r8)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r8 = " regions."
            r7.append(r8)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r6, r7, r8)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.util.Set r6 = r2.keySet()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
        L_0x003f:
            boolean r7 = r6.hasNext()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            if (r7 == 0) goto L_0x0079
            java.lang.Object r7 = r6.next()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.Region r7 = (com.alibaba.griver.bluetooth.altbeacon.beacon.Region) r7     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r8 = f10260a     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r10 = "Region  "
            r9.<init>(r10)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            r9.append(r7)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r10 = " uniqueId: "
            r9.append(r10)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r10 = r7.getUniqueId()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            r9.append(r10)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r10 = " state: "
            r9.append(r10)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            r9.append(r7)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.String r7 = r9.toString()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r8, r7, r9)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            goto L_0x003f
        L_0x0079:
            java.util.Collection r6 = r2.values()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
        L_0x0081:
            boolean r7 = r6.hasNext()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.RegionMonitoringState r7 = (com.alibaba.griver.bluetooth.altbeacon.beacon.service.RegionMonitoringState) r7     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            boolean r8 = r7.getInside()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            if (r8 == 0) goto L_0x0081
            r7.markInside()     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            goto L_0x0081
        L_0x0097:
            java.util.Map<com.alibaba.griver.bluetooth.altbeacon.beacon.Region, com.alibaba.griver.bluetooth.altbeacon.beacon.service.RegionMonitoringState> r6 = r12.d     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            r6.putAll(r2)     // Catch:{ IOException -> 0x00b9, ClassNotFoundException -> 0x00b7, ClassCastException -> 0x00b5 }
            if (r4 == 0) goto L_0x00a9
            r4.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a9
        L_0x00a2:
            java.lang.String r2 = f10260a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r4)
        L_0x00a9:
            r5.close()     // Catch:{ IOException -> 0x00ad }
            return
        L_0x00ad:
            java.lang.String r1 = f10260a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r2)
            return
        L_0x00b5:
            r2 = move-exception
            goto L_0x00d6
        L_0x00b7:
            r2 = move-exception
            goto L_0x00d6
        L_0x00b9:
            r2 = move-exception
            goto L_0x00d6
        L_0x00bb:
            r5 = move-exception
            r11 = r5
            r5 = r2
            r2 = r11
            goto L_0x0110
        L_0x00c0:
            r5 = move-exception
            goto L_0x00c5
        L_0x00c2:
            r5 = move-exception
            goto L_0x00c5
        L_0x00c4:
            r5 = move-exception
        L_0x00c5:
            r11 = r5
            r5 = r2
            r2 = r11
            goto L_0x00d6
        L_0x00c9:
            r4 = move-exception
            r5 = r2
            r2 = r4
            r4 = r5
            goto L_0x0110
        L_0x00ce:
            r4 = move-exception
            goto L_0x00d3
        L_0x00d0:
            r4 = move-exception
            goto L_0x00d3
        L_0x00d2:
            r4 = move-exception
        L_0x00d3:
            r5 = r2
            r2 = r4
            r4 = r5
        L_0x00d6:
            boolean r6 = r2 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x010f }
            if (r6 == 0) goto L_0x00e4
            java.lang.String r2 = f10260a     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "Serialized Monitoring State has wrong class. Just ignoring saved state..."
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x010f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r2, r6, r7)     // Catch:{ all -> 0x010f }
            goto L_0x00f4
        L_0x00e4:
            java.lang.String r6 = f10260a     // Catch:{ all -> 0x010f }
            java.lang.String r7 = "Deserialization exception, message: %s"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x010f }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x010f }
            r8[r3] = r2     // Catch:{ all -> 0x010f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r6, r7, r8)     // Catch:{ all -> 0x010f }
        L_0x00f4:
            if (r4 == 0) goto L_0x0101
            r4.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x0101
        L_0x00fa:
            java.lang.String r2 = f10260a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r2, r1, r4)
        L_0x0101:
            if (r5 == 0) goto L_0x010e
            r5.close()     // Catch:{ IOException -> 0x0107 }
            return
        L_0x0107:
            java.lang.String r1 = f10260a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r2)
        L_0x010e:
            return
        L_0x010f:
            r2 = move-exception
        L_0x0110:
            if (r4 == 0) goto L_0x011d
            r4.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x011d
        L_0x0116:
            java.lang.String r4 = f10260a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r4, r1, r6)
        L_0x011d:
            if (r5 == 0) goto L_0x012a
            r5.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x012a
        L_0x0123:
            java.lang.String r1 = f10260a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r0, r3)
        L_0x012a:
            goto L_0x012c
        L_0x012b:
            throw r2
        L_0x012c:
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus.restoreMonitoringStatus():void");
    }

    public synchronized void stopStatusPreservation() {
        this.e.deleteFile(STATUS_PRESERVATION_FILE_NAME);
        this.f = false;
    }

    public synchronized void startStatusPreservation() {
        if (!this.f) {
            this.f = true;
            saveMonitoringStatusIfOn();
        }
    }

    public boolean isStatePreservationOn() {
        return this.f;
    }

    public synchronized void clear() {
        this.e.deleteFile(STATUS_PRESERVATION_FILE_NAME);
        a().clear();
    }

    public void updateLocalState(Region region, Integer num) {
        RegionMonitoringState regionMonitoringState = a().get(region);
        if (regionMonitoringState == null) {
            regionMonitoringState = addLocalRegion(region);
        }
        if (num != null) {
            if (num.intValue() == 0) {
                regionMonitoringState.markOutside();
            }
            if (num.intValue() == 1) {
                regionMonitoringState.markInside();
            }
        }
    }

    public void removeLocalRegion(Region region) {
        a().remove(region);
    }

    public RegionMonitoringState addLocalRegion(Region region) {
        return a(region, new Callback((String) null));
    }

    private RegionMonitoringState a(Region region, Callback callback) {
        if (a().containsKey(region)) {
            Iterator<Region> it = a().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Region next = it.next();
                if (next.equals(region)) {
                    if (next.hasSameIdentifiers(region)) {
                        return a().get(next);
                    }
                    String str = f10260a;
                    StringBuilder sb = new StringBuilder("Replacing region with unique identifier ");
                    sb.append(region.getUniqueId());
                    LogManager.d(str, sb.toString(), new Object[0]);
                    LogManager.d(f10260a, "Old definition: ".concat(String.valueOf(next)), new Object[0]);
                    LogManager.d(f10260a, "New definition: ".concat(String.valueOf(region)), new Object[0]);
                    LogManager.d(f10260a, "clearing state", new Object[0]);
                    a().remove(region);
                }
            }
        }
        RegionMonitoringState regionMonitoringState = new RegionMonitoringState(callback);
        a().put(region, regionMonitoringState);
        return regionMonitoringState;
    }
}
