package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.content.Context;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ScanState implements Serializable {
    public static int MIN_SCAN_JOB_INTERVAL_MILLIS = 300000;
    private static final String STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state";
    private static final String TAG = ScanState.class.getSimpleName();
    private static final String TEMP_STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state-temp";
    private long mBackgroundBetweenScanPeriod;
    private boolean mBackgroundMode;
    private long mBackgroundScanPeriod;
    private Set<BeaconParser> mBeaconParsers = new HashSet();
    private transient Context mContext;
    private ExtraDataBeaconTracker mExtraBeaconDataTracker = new ExtraDataBeaconTracker();
    private long mForegroundBetweenScanPeriod;
    private long mForegroundScanPeriod;
    private long mLastScanStartTimeMillis = 0;
    private transient MonitoringStatus mMonitoringStatus;
    private Map<Region, RangeState> mRangedRegionState = new HashMap();

    public ScanState(Context context) {
        this.mContext = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:5|6|7|8|9|10|(4:12|13|14|15)|16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:43|44|45|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:48|49|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:64|65|66|67) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:78|79|81|82) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:84|85|86|87) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0121 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a A[Catch:{ all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[Catch:{ all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f A[SYNTHETIC, Splitter:B:43:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e A[SYNTHETIC, Splitter:B:48:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad A[SYNTHETIC, Splitter:B:59:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc A[SYNTHETIC, Splitter:B:64:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011b A[SYNTHETIC, Splitter:B:78:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012c A[SYNTHETIC, Splitter:B:84:0x012c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:66:0x00c0=Splitter:B:66:0x00c0, B:86:0x0130=Splitter:B:86:0x0130, B:61:0x00b1=Splitter:B:61:0x00b1, B:81:0x0121=Splitter:B:81:0x0121, B:50:0x0092=Splitter:B:50:0x0092, B:45:0x0083=Splitter:B:45:0x0083, B:18:0x002c=Splitter:B:18:0x002c, B:14:0x001e=Splitter:B:14:0x001e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState restore(android.content.Context r9) {
        /*
            java.lang.Class<com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState> r0 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android-beacon-library-scan-state"
            java.io.FileInputStream r3 = r9.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0061, ClassNotFoundException -> 0x005f, ClassCastException -> 0x005d, all -> 0x0059 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0050, ClassNotFoundException -> 0x004e, ClassCastException -> 0x004c, all -> 0x0048 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0050, ClassNotFoundException -> 0x004e, ClassCastException -> 0x004c, all -> 0x0048 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0046, IOException -> 0x0041, ClassNotFoundException -> 0x003f, ClassCastException -> 0x003d }
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState r5 = (com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState) r5     // Catch:{ FileNotFoundException -> 0x0046, IOException -> 0x0041, ClassNotFoundException -> 0x003f, ClassCastException -> 0x003d }
            r5.mContext = r9     // Catch:{ FileNotFoundException -> 0x0057, IOException -> 0x003b, ClassNotFoundException -> 0x0039, ClassCastException -> 0x0037 }
            if (r3 == 0) goto L_0x0027
            r3.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x0027
        L_0x001e:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close inputStream exception"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r6)     // Catch:{ all -> 0x011f }
        L_0x0027:
            r4.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x00c9
        L_0x002c:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close objectInputStream exception"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r4)     // Catch:{ all -> 0x011f }
            goto L_0x00c9
        L_0x0037:
            r1 = move-exception
            goto L_0x0066
        L_0x0039:
            r1 = move-exception
            goto L_0x0066
        L_0x003b:
            r1 = move-exception
            goto L_0x0066
        L_0x003d:
            r5 = move-exception
            goto L_0x0042
        L_0x003f:
            r5 = move-exception
            goto L_0x0042
        L_0x0041:
            r5 = move-exception
        L_0x0042:
            r8 = r5
            r5 = r1
            r1 = r8
            goto L_0x0066
        L_0x0046:
            r5 = r1
            goto L_0x0057
        L_0x0048:
            r9 = move-exception
            r4 = r1
            goto L_0x009d
        L_0x004c:
            r4 = move-exception
            goto L_0x0051
        L_0x004e:
            r4 = move-exception
            goto L_0x0051
        L_0x0050:
            r4 = move-exception
        L_0x0051:
            r5 = r1
            r1 = r4
            r4 = r5
            goto L_0x0066
        L_0x0055:
            r4 = r1
            r5 = r4
        L_0x0057:
            r1 = r3
            goto L_0x00a2
        L_0x0059:
            r9 = move-exception
            r4 = r1
            goto L_0x0119
        L_0x005d:
            r3 = move-exception
            goto L_0x0062
        L_0x005f:
            r3 = move-exception
            goto L_0x0062
        L_0x0061:
            r3 = move-exception
        L_0x0062:
            r4 = r1
            r5 = r4
            r1 = r3
            r3 = r5
        L_0x0066:
            boolean r1 = r1 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = TAG     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "Serialized ScanState has wrong class. Just ignoring saved state..."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r1, r6, r7)     // Catch:{ all -> 0x009c }
            goto L_0x007d
        L_0x0074:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "Deserialization exception"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r6, r7)     // Catch:{ all -> 0x009c }
        L_0x007d:
            if (r3 == 0) goto L_0x008c
            r3.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x008c
        L_0x0083:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close inputStream exception"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r6)     // Catch:{ all -> 0x011f }
        L_0x008c:
            if (r4 == 0) goto L_0x00c9
            r4.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x00c9
        L_0x0092:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close objectInputStream exception"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r4)     // Catch:{ all -> 0x011f }
            goto L_0x00c9
        L_0x009c:
            r9 = move-exception
        L_0x009d:
            r1 = r3
            goto L_0x0119
        L_0x00a0:
            r4 = r1
            r5 = r4
        L_0x00a2:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = "Serialized ScanState does not exist.  This may be normal on first run."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0118 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r3, r6, r7)     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00ba
        L_0x00b1:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close inputStream exception"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r6)     // Catch:{ all -> 0x011f }
        L_0x00ba:
            if (r4 == 0) goto L_0x00c9
            r4.close()     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00c9
        L_0x00c0:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close objectInputStream exception"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r4)     // Catch:{ all -> 0x011f }
        L_0x00c9:
            if (r5 != 0) goto L_0x00d0
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState r5 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState     // Catch:{ all -> 0x011f }
            r5.<init>(r9)     // Catch:{ all -> 0x011f }
        L_0x00d0:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.ExtraDataBeaconTracker r1 = r5.mExtraBeaconDataTracker     // Catch:{ all -> 0x011f }
            if (r1 != 0) goto L_0x00db
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.ExtraDataBeaconTracker r1 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.ExtraDataBeaconTracker     // Catch:{ all -> 0x011f }
            r1.<init>()     // Catch:{ all -> 0x011f }
            r5.mExtraBeaconDataTracker = r1     // Catch:{ all -> 0x011f }
        L_0x00db:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus r9 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus.getInstanceForApplication(r9)     // Catch:{ all -> 0x011f }
            r5.mMonitoringStatus = r9     // Catch:{ all -> 0x011f }
            java.lang.String r9 = TAG     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "Scan state restore regions: monitored="
            r1.<init>(r3)     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus r3 = r5.getMonitoringStatus()     // Catch:{ all -> 0x011f }
            java.util.Set r3 = r3.regions()     // Catch:{ all -> 0x011f }
            int r3 = r3.size()     // Catch:{ all -> 0x011f }
            r1.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = " ranged="
            r1.append(r3)     // Catch:{ all -> 0x011f }
            java.util.Map r3 = r5.getRangedRegionState()     // Catch:{ all -> 0x011f }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x011f }
            int r3 = r3.size()     // Catch:{ all -> 0x011f }
            r1.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x011f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r9, r1, r2)     // Catch:{ all -> 0x011f }
            monitor-exit(r0)     // Catch:{ all -> 0x011f }
            return r5
        L_0x0118:
            r9 = move-exception
        L_0x0119:
            if (r1 == 0) goto L_0x012a
            r1.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x012a
        L_0x011f:
            r9 = move-exception
            goto L_0x013a
        L_0x0121:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close inputStream exception"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r5)     // Catch:{ all -> 0x011f }
        L_0x012a:
            if (r4 == 0) goto L_0x0139
            r4.close()     // Catch:{ IOException -> 0x0130 }
            goto L_0x0139
        L_0x0130:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "close objectInputStream exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x011f }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r2)     // Catch:{ all -> 0x011f }
        L_0x0139:
            throw r9     // Catch:{ all -> 0x011f }
        L_0x013a:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState.restore(android.content.Context):com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState");
    }

    public Boolean getBackgroundMode() {
        return Boolean.valueOf(this.mBackgroundMode);
    }

    public void setBackgroundMode(Boolean bool) {
        this.mBackgroundMode = bool.booleanValue();
    }

    public Long getBackgroundBetweenScanPeriod() {
        return Long.valueOf(this.mBackgroundBetweenScanPeriod);
    }

    public void setBackgroundBetweenScanPeriod(Long l) {
        this.mBackgroundBetweenScanPeriod = l.longValue();
    }

    public Long getBackgroundScanPeriod() {
        return Long.valueOf(this.mBackgroundScanPeriod);
    }

    public void setBackgroundScanPeriod(Long l) {
        this.mBackgroundScanPeriod = l.longValue();
    }

    public Long getForegroundBetweenScanPeriod() {
        return Long.valueOf(this.mForegroundBetweenScanPeriod);
    }

    public void setForegroundBetweenScanPeriod(Long l) {
        this.mForegroundBetweenScanPeriod = l.longValue();
    }

    public Long getForegroundScanPeriod() {
        return Long.valueOf(this.mForegroundScanPeriod);
    }

    public void setForegroundScanPeriod(Long l) {
        this.mForegroundScanPeriod = l.longValue();
    }

    public MonitoringStatus getMonitoringStatus() {
        return this.mMonitoringStatus;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.mMonitoringStatus = monitoringStatus;
    }

    public Map<Region, RangeState> getRangedRegionState() {
        return this.mRangedRegionState;
    }

    public void setRangedRegionState(Map<Region, RangeState> map) {
        this.mRangedRegionState = map;
    }

    public ExtraDataBeaconTracker getExtraBeaconDataTracker() {
        return this.mExtraBeaconDataTracker;
    }

    public void setExtraBeaconDataTracker(ExtraDataBeaconTracker extraDataBeaconTracker) {
        this.mExtraBeaconDataTracker = extraDataBeaconTracker;
    }

    public Set<BeaconParser> getBeaconParsers() {
        return this.mBeaconParsers;
    }

    public void setBeaconParsers(Set<BeaconParser> set) {
        this.mBeaconParsers = set;
    }

    public long getLastScanStartTimeMillis() {
        return this.mLastScanStartTimeMillis;
    }

    public void setLastScanStartTimeMillis(long j) {
        this.mLastScanStartTimeMillis = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|8|(1:10)|11|(1:13)|(4:15|16|17|18)|19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:35|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:40|41|42|43) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:49|50|52|53) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:55|56|57|58) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[SYNTHETIC, Splitter:B:35:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2 A[SYNTHETIC, Splitter:B:40:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9 A[SYNTHETIC, Splitter:B:49:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fa A[SYNTHETIC, Splitter:B:55:0x00fa] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0092=Splitter:B:21:0x0092, B:17:0x0085=Splitter:B:17:0x0085, B:42:0x00d6=Splitter:B:42:0x00d6, B:37:0x00c7=Splitter:B:37:0x00c7, B:57:0x00fe=Splitter:B:57:0x00fe, B:52:0x00ef=Splitter:B:52:0x00ef} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void save() {
        /*
            r10 = this;
            java.lang.Class<com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState> r0 = com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            android.content.Context r3 = r10.mContext     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.lang.String r4 = "android-beacon-library-scan-state-temp"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r2)     // Catch:{ IOException -> 0x00ad, all -> 0x00a8 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x00a3, all -> 0x009e }
            r4.<init>(r3)     // Catch:{ IOException -> 0x00a3, all -> 0x009e }
            r4.writeObject(r10)     // Catch:{ IOException -> 0x009c }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x009c }
            android.content.Context r5 = r10.mContext     // Catch:{ IOException -> 0x009c }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x009c }
            java.lang.String r6 = "android-beacon-library-scan-state"
            r1.<init>(r5, r6)     // Catch:{ IOException -> 0x009c }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x009c }
            android.content.Context r6 = r10.mContext     // Catch:{ IOException -> 0x009c }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = "android-beacon-library-scan-state-temp"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x009c }
            java.lang.String r6 = TAG     // Catch:{ IOException -> 0x009c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
            java.lang.String r8 = "Temp file is "
            r7.<init>(r8)     // Catch:{ IOException -> 0x009c }
            java.lang.String r8 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x009c }
            r7.append(r8)     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x009c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r6, r7, r8)     // Catch:{ IOException -> 0x009c }
            java.lang.String r6 = TAG     // Catch:{ IOException -> 0x009c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
            java.lang.String r8 = "Perm file is "
            r7.<init>(r8)     // Catch:{ IOException -> 0x009c }
            java.lang.String r8 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x009c }
            r7.append(r8)     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x009c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r6, r7, r8)     // Catch:{ IOException -> 0x009c }
            boolean r6 = r1.delete()     // Catch:{ IOException -> 0x009c }
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = TAG     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = "Error while saving scan status to file: Cannot delete existing file."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r6, r7, r8)     // Catch:{ IOException -> 0x009c }
        L_0x0070:
            boolean r1 = r5.renameTo(r1)     // Catch:{ IOException -> 0x009c }
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = TAG     // Catch:{ IOException -> 0x009c }
            java.lang.String r5 = "Error while saving scan status to file: Cannot rename temp file."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x009c }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r5, r6)     // Catch:{ IOException -> 0x009c }
        L_0x007f:
            if (r3 == 0) goto L_0x008e
            r3.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x008e
        L_0x0085:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "close outputStream exception"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r5)     // Catch:{ all -> 0x00ed }
        L_0x008e:
            r4.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x00df
        L_0x0092:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "close objectOutputStream exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r2)     // Catch:{ all -> 0x00ed }
            goto L_0x00df
        L_0x009c:
            r1 = move-exception
            goto L_0x00b1
        L_0x009e:
            r4 = move-exception
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x00e7
        L_0x00a3:
            r4 = move-exception
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x00b1
        L_0x00a8:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
            goto L_0x00e7
        L_0x00ad:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
        L_0x00b1:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "Error while saving scan status to file: "
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00e6 }
            r7[r2] = r1     // Catch:{ all -> 0x00e6 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r5, r6, r7)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x00d0
            r3.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00d0
        L_0x00c7:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "close outputStream exception"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r5)     // Catch:{ all -> 0x00ed }
        L_0x00d0:
            if (r4 == 0) goto L_0x00df
            r4.close()     // Catch:{ IOException -> 0x00d6 }
            goto L_0x00df
        L_0x00d6:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "close objectOutputStream exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r3, r2)     // Catch:{ all -> 0x00ed }
        L_0x00df:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus r1 = r10.mMonitoringStatus     // Catch:{ all -> 0x00ed }
            r1.saveMonitoringStatusIfOn()     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            return
        L_0x00e6:
            r1 = move-exception
        L_0x00e7:
            if (r3 == 0) goto L_0x00f8
            r3.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00f8
        L_0x00ed:
            r1 = move-exception
            goto L_0x0108
        L_0x00ef:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "close outputStream exception"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r5, r6)     // Catch:{ all -> 0x00ed }
        L_0x00f8:
            if (r4 == 0) goto L_0x0107
            r4.close()     // Catch:{ IOException -> 0x00fe }
            goto L_0x0107
        L_0x00fe:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "close objectOutputStream exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ed }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r4, r2)     // Catch:{ all -> 0x00ed }
        L_0x0107:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x0108:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanState.save():void");
    }

    public int getScanJobIntervalMillis() {
        long j;
        long j2;
        if (getBackgroundMode().booleanValue()) {
            j2 = getBackgroundScanPeriod().longValue();
            j = getBackgroundBetweenScanPeriod().longValue();
        } else {
            j2 = getForegroundScanPeriod().longValue();
            j = getForegroundBetweenScanPeriod().longValue();
        }
        long j3 = j2 + j;
        int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
        return j3 > ((long) i) ? (int) j3 : i;
    }

    public int getScanJobRuntimeMillis() {
        long j;
        String str = TAG;
        StringBuilder sb = new StringBuilder("ScanState says background mode for ScanJob is ");
        sb.append(getBackgroundMode());
        LogManager.d(str, sb.toString(), new Object[0]);
        if (getBackgroundMode().booleanValue()) {
            j = getBackgroundScanPeriod().longValue();
        } else {
            j = getForegroundScanPeriod().longValue();
        }
        if (!getBackgroundMode().booleanValue()) {
            int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
            if (j < ((long) i)) {
                return i;
            }
        }
        return (int) j;
    }

    public void applyChanges(BeaconManager beaconManager) {
        this.mBeaconParsers = new HashSet(beaconManager.getBeaconParsers());
        this.mForegroundScanPeriod = beaconManager.getForegroundScanPeriod();
        this.mForegroundBetweenScanPeriod = beaconManager.getForegroundBetweenScanPeriod();
        this.mBackgroundScanPeriod = beaconManager.getBackgroundScanPeriod();
        this.mBackgroundBetweenScanPeriod = beaconManager.getBackgroundBetweenScanPeriod();
        this.mBackgroundMode = beaconManager.getBackgroundMode();
        ArrayList arrayList = new ArrayList(this.mMonitoringStatus.regions());
        ArrayList arrayList2 = new ArrayList(this.mRangedRegionState.keySet());
        ArrayList arrayList3 = new ArrayList(beaconManager.getMonitoredRegions());
        ArrayList arrayList4 = new ArrayList(beaconManager.getRangedRegions());
        String str = TAG;
        StringBuilder sb = new StringBuilder("ranged regions: old=");
        sb.append(arrayList2.size());
        sb.append(" new=");
        sb.append(arrayList4.size());
        LogManager.d(str, sb.toString(), new Object[0]);
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder("monitored regions: old=");
        sb2.append(arrayList.size());
        sb2.append(" new=");
        sb2.append(arrayList3.size());
        LogManager.d(str2, sb2.toString(), new Object[0]);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (!arrayList2.contains(region)) {
                LogManager.d(TAG, "Starting ranging region: ".concat(String.valueOf(region)), new Object[0]);
                this.mRangedRegionState.put(region, new RangeState(new Callback(this.mContext.getPackageName())));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region2 = (Region) it2.next();
            if (!arrayList4.contains(region2)) {
                LogManager.d(TAG, "Stopping ranging region: ".concat(String.valueOf(region2)), new Object[0]);
                this.mRangedRegionState.remove(region2);
            }
        }
        String str3 = TAG;
        StringBuilder sb3 = new StringBuilder("Updated state with ");
        sb3.append(arrayList4.size());
        sb3.append(" ranging regions and ");
        sb3.append(arrayList3.size());
        sb3.append(" monitoring regions.");
        LogManager.d(str3, sb3.toString(), new Object[0]);
        save();
    }
}
