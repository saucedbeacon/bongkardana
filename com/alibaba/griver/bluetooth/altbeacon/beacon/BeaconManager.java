package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.Loggers;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.BeaconService;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.Callback;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangeState;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangedBeacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.RegionMonitoringState;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.RunningAverageRssiFilter;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanJobScheduler;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.SettingsData;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.StartRMData;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import com.alibaba.griver.bluetooth.altbeacon.beacon.simulator.BeaconSimulator;
import com.alibaba.griver.bluetooth.altbeacon.beacon.utils.ProcessUtils;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class BeaconManager {
    public static final long DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD = 300000;
    public static final long DEFAULT_BACKGROUND_SCAN_PERIOD = 10000;
    public static final long DEFAULT_EXIT_PERIOD = 10000;
    public static final long DEFAULT_FOREGROUND_BETWEEN_SCAN_PERIOD = 0;
    public static final long DEFAULT_FOREGROUND_SCAN_PERIOD = 1100;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f10245a = new Object();
    private static boolean b = false;
    @Nullable
    protected static BeaconSimulator beaconSimulator;
    private static boolean c = false;
    private static long d = 10000;
    protected static String distanceModelUpdateUrl = "";
    protected static Class rssiFilterImplClass = RunningAverageRssiFilter.class;
    @Nullable
    protected static volatile BeaconManager sInstance = null;
    @Nullable
    protected RangeNotifier dataRequestNotifier = null;
    /* access modifiers changed from: private */
    @NonNull
    public final ConcurrentMap<BeaconConsumer, ConsumerInfo> e = new ConcurrentHashMap();
    @NonNull
    private final ArrayList<Region> f = new ArrayList<>();
    @NonNull
    private final List<BeaconParser> g = new CopyOnWriteArrayList();
    private Context h;
    /* access modifiers changed from: private */
    @Nullable
    public Messenger i = null;
    @Nullable
    private NonBeaconLeScanCallback j;
    private boolean k = true;
    private boolean l = false;
    private boolean m = true;
    @NonNull
    protected final Set<MonitorNotifier> monitorNotifiers = new CopyOnWriteArraySet();
    private boolean n = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public Boolean f10246o = null;
    private boolean p = false;
    private BeaconService q;
    private long r = DEFAULT_FOREGROUND_SCAN_PERIOD;
    @NonNull
    protected final Set<RangeNotifier> rangeNotifiers = new CopyOnWriteArraySet();
    private long s = 0;
    private long t = 10000;
    private long u = 300000;

    private void f() {
    }

    protected BeaconManager(@NonNull Context context) {
        this.h = context.getApplicationContext();
        checkIfMainProcess();
        if (!c) {
            f();
        }
        this.g.add(new AltBeaconParser());
    }

    @Deprecated
    public static void setDebug(boolean z) {
        if (z) {
            LogManager.setLogger(Loggers.verboseLogger());
            LogManager.setVerboseLoggingEnabled(true);
            return;
        }
        LogManager.setLogger(Loggers.empty());
        LogManager.setVerboseLoggingEnabled(false);
    }

    public static long getRegionExitPeriod() {
        return d;
    }

    public static void setRegionExitPeriod(long j2) {
        d = j2;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    @NonNull
    public static BeaconManager getInstanceForApplication(@NonNull Context context) {
        BeaconManager beaconManager;
        BeaconManager beaconManager2 = sInstance;
        if (beaconManager2 != null) {
            return beaconManager2;
        }
        synchronized (f10245a) {
            beaconManager = sInstance;
            if (beaconManager == null) {
                beaconManager = new BeaconManager(context);
                sInstance = beaconManager;
            }
        }
        return beaconManager;
    }

    @Deprecated
    public static void logDebug(String str, String str2) {
        LogManager.d(str, str2, new Object[0]);
    }

    @Deprecated
    public static void logDebug(String str, String str2, Throwable th) {
        LogManager.d(th, str, str2, new Object[0]);
    }

    public static String getDistanceModelUpdateUrl() {
        return distanceModelUpdateUrl;
    }

    public static void setDistanceModelUpdateUrl(@NonNull String str) {
        a();
        distanceModelUpdateUrl = str;
    }

    public static Class getRssiFilterImplClass() {
        return rssiFilterImplClass;
    }

    public static void setRssiFilterImplClass(@NonNull Class cls) {
        a();
        rssiFilterImplClass = cls;
    }

    public static void setUseTrackingCache(boolean z) {
        RangeState.setUseTrackingCache(z);
        if (sInstance != null) {
            sInstance.applySettings();
        }
    }

    @Nullable
    public static BeaconSimulator getBeaconSimulator() {
        return beaconSimulator;
    }

    public static void setBeaconSimulator(BeaconSimulator beaconSimulator2) {
        a();
        beaconSimulator = beaconSimulator2;
    }

    public static boolean isAndroidLScanningDisabled() {
        return b;
    }

    public static void setAndroidLScanningDisabled(boolean z) {
        b = z;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    @Deprecated
    public static void setsManifestCheckingDisabled(boolean z) {
        c = z;
    }

    public static boolean getManifestCheckingDisabled() {
        return c;
    }

    public static void setManifestCheckingDisabled(boolean z) {
        c = z;
    }

    private static void a() {
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null && beaconManager.isScannerInDifferentProcess()) {
            LogManager.w("BeaconManager", "Unsupported configuration change made for BeaconScanner in separate process", new Object[0]);
        }
    }

    public boolean isMainProcess() {
        return this.n;
    }

    public boolean isScannerInDifferentProcess() {
        Boolean bool = this.f10246o;
        return bool != null && !bool.booleanValue();
    }

    public void setScannerInSameProcess(boolean z) {
        this.f10246o = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public void checkIfMainProcess() {
        ProcessUtils processUtils = new ProcessUtils(this.h);
        String processName = processUtils.getProcessName();
        String packageName = processUtils.getPackageName();
        int pid = processUtils.getPid();
        this.n = processUtils.isMainProcess();
        StringBuilder sb = new StringBuilder("BeaconManager started up on pid ");
        sb.append(pid);
        sb.append(" named '");
        sb.append(processName);
        sb.append("' for application package '");
        sb.append(packageName);
        sb.append("'.  isMainProcess=");
        sb.append(this.n);
        LogManager.i("BeaconManager", sb.toString(), new Object[0]);
    }

    @NonNull
    public List<BeaconParser> getBeaconParsers() {
        return this.g;
    }

    @TargetApi(18)
    public boolean checkAvailability() {
        if (c()) {
            return ((BluetoothManager) this.h.getSystemService(TinyAppActionState.ACTION_BLUE_TOOTH)).getAdapter().isEnabled();
        }
        throw new BleNotAvailableException("Bluetooth LE not supported by this device");
    }

    public void bind(@NonNull BeaconConsumer beaconConsumer) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!this.h.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            LogManager.w("BeaconManager", "This device does not support bluetooth LE.  Will not start beacon scanning.", new Object[0]);
        } else {
            synchronized (this.e) {
                ConsumerInfo consumerInfo = new ConsumerInfo();
                if (this.e.putIfAbsent(beaconConsumer, consumerInfo) != null) {
                    LogManager.d("BeaconManager", "This consumer is already bound", new Object[0]);
                } else {
                    LogManager.d("BeaconManager", "This consumer is not bound.  Binding now: %s", beaconConsumer);
                    if (this.p) {
                        LogManager.d("BeaconManager", "Not starting beacon scanning service. Using scheduled jobs", new Object[0]);
                        beaconConsumer.onBeaconServiceConnect();
                    } else {
                        LogManager.d("BeaconManager", "Binding to service", new Object[0]);
                        this.q = new BeaconService(this.h);
                        consumerInfo.beaconServiceConnection.onServiceConnected(this.q);
                    }
                    LogManager.d("BeaconManager", "consumer count is now: %s", Integer.valueOf(this.e.size()));
                }
            }
        }
    }

    public void unbind(@NonNull BeaconConsumer beaconConsumer) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.e) {
            if (this.e.containsKey(beaconConsumer)) {
                LogManager.d("BeaconManager", "Unbinding", new Object[0]);
                if (this.p) {
                    LogManager.d("BeaconManager", "Not unbinding from scanning service as we are using scan jobs.", new Object[0]);
                } else {
                    this.q.destroy();
                    this.q = null;
                    ((ConsumerInfo) this.e.get(beaconConsumer)).beaconServiceConnection.onServiceDisconnected();
                }
                this.e.remove(beaconConsumer);
                if (this.e.size() == 0) {
                    this.i = null;
                    this.l = false;
                    boolean z = this.p;
                }
            } else {
                LogManager.d("BeaconManager", "This consumer is not bound to: %s", beaconConsumer);
                LogManager.d("BeaconManager", "Bound consumers: ", new Object[0]);
                for (Map.Entry value : this.e.entrySet()) {
                    LogManager.d("BeaconManager", String.valueOf(value.getValue()), new Object[0]);
                }
            }
        }
    }

    public boolean isBound(@NonNull BeaconConsumer beaconConsumer) {
        boolean z;
        synchronized (this.e) {
            if (beaconConsumer != null) {
                try {
                    if (!(this.e.get(beaconConsumer) == null || this.i == null)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    public boolean isAnyConsumerBound() {
        boolean z;
        synchronized (this.e) {
            z = this.e.isEmpty() && this.i != null;
        }
        return z;
    }

    public void setEnableScheduledScanJobs(boolean z) {
        if (isAnyConsumerBound()) {
            LogManager.e("BeaconManager", "ScanJob may not be configured because a consumer is already bound.", new Object[0]);
            throw new IllegalStateException("Method must be called before calling bind()");
        } else if (!z || Build.VERSION.SDK_INT >= 21) {
            this.p = z;
        } else {
            LogManager.e("BeaconManager", "ScanJob may not be configured because JobScheduler is not availble prior to Android 5.0", new Object[0]);
        }
    }

    public boolean getScheduledScanJobsEnabled() {
        return this.p;
    }

    public boolean getBackgroundMode() {
        return this.l;
    }

    public void setBackgroundMode(boolean z) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
            return;
        }
        this.m = false;
        if (z != this.l) {
            this.l = z;
            try {
                updateScanPeriods();
            } catch (RemoteException unused) {
                LogManager.e("BeaconManager", "Cannot contact service to set scan periods", new Object[0]);
            }
        }
    }

    public long getBackgroundScanPeriod() {
        return this.t;
    }

    public void setBackgroundScanPeriod(long j2) {
        this.t = j2;
    }

    public long getBackgroundBetweenScanPeriod() {
        return this.u;
    }

    public void setBackgroundBetweenScanPeriod(long j2) {
        this.u = j2;
    }

    public long getForegroundScanPeriod() {
        return this.r;
    }

    public void setForegroundScanPeriod(long j2) {
        this.r = j2;
    }

    public long getForegroundBetweenScanPeriod() {
        return this.s;
    }

    public void setForegroundBetweenScanPeriod(long j2) {
        this.s = j2;
    }

    public boolean isBackgroundModeUninitialized() {
        return this.m;
    }

    @Deprecated
    public void setRangeNotifier(@Nullable RangeNotifier rangeNotifier) {
        this.rangeNotifiers.clear();
        if (rangeNotifier != null) {
            addRangeNotifier(rangeNotifier);
        }
    }

    public void addRangeNotifier(@NonNull RangeNotifier rangeNotifier) {
        if (rangeNotifier != null) {
            this.rangeNotifiers.add(rangeNotifier);
        }
    }

    public boolean removeRangeNotifier(@NonNull RangeNotifier rangeNotifier) {
        return this.rangeNotifiers.remove(rangeNotifier);
    }

    public void removeAllRangeNotifiers() {
        this.rangeNotifiers.clear();
    }

    @Deprecated
    public void setMonitorNotifier(@Nullable MonitorNotifier monitorNotifier) {
        if (!g()) {
            this.monitorNotifiers.clear();
            if (monitorNotifier != null) {
                addMonitorNotifier(monitorNotifier);
            }
        }
    }

    public void addMonitorNotifier(@NonNull MonitorNotifier monitorNotifier) {
        if (!g() && monitorNotifier != null) {
            this.monitorNotifiers.add(monitorNotifier);
        }
    }

    @Deprecated
    public boolean removeMonitoreNotifier(@NonNull MonitorNotifier monitorNotifier) {
        return removeMonitorNotifier(monitorNotifier);
    }

    public boolean removeMonitorNotifier(@NonNull MonitorNotifier monitorNotifier) {
        if (g()) {
            return false;
        }
        return this.monitorNotifiers.remove(monitorNotifier);
    }

    public void removeAllMonitorNotifiers() {
        if (!g()) {
            this.monitorNotifiers.clear();
        }
    }

    @Deprecated
    public void setRegionStatePeristenceEnabled(boolean z) {
        setRegionStatePersistenceEnabled(z);
    }

    public boolean isRegionStatePersistenceEnabled() {
        return this.k;
    }

    public void setRegionStatePersistenceEnabled(boolean z) {
        this.k = z;
        if (!isScannerInDifferentProcess()) {
            if (z) {
                MonitoringStatus.getInstanceForApplication(this.h).startStatusPreservation();
            } else {
                MonitoringStatus.getInstanceForApplication(this.h).stopStatusPreservation();
            }
        }
        applySettings();
    }

    public void requestStateForRegion(@NonNull Region region) {
        if (!g()) {
            RegionMonitoringState stateOf = MonitoringStatus.getInstanceForApplication(this.h).stateOf(region);
            int i2 = 0;
            if (stateOf != null && stateOf.getInside()) {
                i2 = 1;
            }
            for (MonitorNotifier didDetermineStateForRegion : this.monitorNotifiers) {
                didDetermineStateForRegion.didDetermineStateForRegion(i2, region);
            }
        }
    }

    @TargetApi(18)
    public void startRangingBeaconsInRegion(@NonNull Region region) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!g()) {
            synchronized (this.f) {
                this.f.add(region);
            }
            a(2, region);
        }
    }

    @TargetApi(18)
    public void stopRangingBeaconsInRegion(@NonNull Region region) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!g()) {
            synchronized (this.f) {
                Region region2 = null;
                Iterator<Region> it = this.f.iterator();
                while (it.hasNext()) {
                    Region next = it.next();
                    if (region.getUniqueId().equals(next.getUniqueId())) {
                        region2 = next;
                    }
                }
                this.f.remove(region2);
            }
            a(3, region);
        }
    }

    public void applySettings() {
        if (!g()) {
            if (!isAnyConsumerBound()) {
                LogManager.d("BeaconManager", "Not synchronizing settings to service, as it has not started up yet", new Object[0]);
            } else if (isScannerInDifferentProcess()) {
                LogManager.d("BeaconManager", "Synchronizing settings to service", new Object[0]);
                syncSettingsToService();
            } else {
                LogManager.d("BeaconManager", "Not synchronizing settings to service, as it is in the same process", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void syncSettingsToService() {
        if (this.p) {
            ScanJobScheduler.getInstance().applySettingsToScheduledJob(this.h, this);
            return;
        }
        try {
            a(7, (Region) null);
        } catch (RemoteException e2) {
            LogManager.e("BeaconManager", "Failed to sync settings to service", e2);
        }
    }

    @TargetApi(18)
    public void startMonitoringBeaconsInRegion(@NonNull Region region) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!g()) {
            if (this.p) {
                MonitoringStatus.getInstanceForApplication(this.h).addRegion(region, new Callback(b()));
            }
            a(4, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.h).addLocalRegion(region);
            }
            requestStateForRegion(region);
        }
    }

    @TargetApi(18)
    public void stopMonitoringBeaconsInRegion(@NonNull Region region) {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!g()) {
            if (this.p) {
                MonitoringStatus.getInstanceForApplication(this.h).removeRegion(region);
            }
            a(5, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.h).removeLocalRegion(region);
            }
        }
    }

    @TargetApi(18)
    public void updateScanPeriods() {
        if (!c()) {
            LogManager.w("BeaconManager", "Method invocation will be ignored.", new Object[0]);
        } else if (!g()) {
            LogManager.d("BeaconManager", "updating background flag to %s", Boolean.valueOf(this.l));
            LogManager.d("BeaconManager", "updating scan period to %s, %s", Long.valueOf(d()), Long.valueOf(e()));
            a(6, (Region) null);
        }
    }

    @TargetApi(18)
    private void a(int i2, Region region) {
        if (this.p) {
            ScanJobScheduler.getInstance().applySettingsToScheduledJob(this.h, this);
        } else if (this.i != null) {
            Message obtain = Message.obtain((Handler) null, i2, 0, 0);
            if (i2 == 6) {
                obtain.setData(new StartRMData(d(), e(), this.l).toBundle());
            } else if (i2 == 7) {
                obtain.setData(new SettingsData().collect(this.h).toBundle());
            } else {
                obtain.setData(new StartRMData(region, b(), d(), e(), this.l).toBundle());
            }
            this.i.send(obtain);
        } else {
            throw new RemoteException("The BeaconManager is not bound to the service.  Call beaconManager.bind(BeaconConsumer consumer) and wait for a callback to onBeaconServiceConnect()");
        }
    }

    private String b() {
        String packageName = this.h.getPackageName();
        LogManager.d("BeaconManager", "callback packageName: %s", packageName);
        return packageName;
    }

    @Deprecated
    @Nullable
    public MonitorNotifier getMonitoringNotifier() {
        Iterator<MonitorNotifier> it = this.monitorNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NonNull
    public Set<MonitorNotifier> getMonitoringNotifiers() {
        return Collections.unmodifiableSet(this.monitorNotifiers);
    }

    @Deprecated
    @Nullable
    public RangeNotifier getRangingNotifier() {
        Iterator<RangeNotifier> it = this.rangeNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NonNull
    public Set<RangeNotifier> getRangingNotifiers() {
        return Collections.unmodifiableSet(this.rangeNotifiers);
    }

    @NonNull
    public Collection<Region> getMonitoredRegions() {
        return MonitoringStatus.getInstanceForApplication(this.h).regions();
    }

    @NonNull
    public Collection<Region> getRangedRegions() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }

    public void setMaxTrackingAge(int i2) {
        RangedBeacon.setMaxTrackinAge(i2);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public RangeNotifier getDataRequestNotifier() {
        return this.dataRequestNotifier;
    }

    /* access modifiers changed from: protected */
    public void setDataRequestNotifier(@Nullable RangeNotifier rangeNotifier) {
        this.dataRequestNotifier = rangeNotifier;
    }

    @Nullable
    public NonBeaconLeScanCallback getNonBeaconLeScanCallback() {
        return this.j;
    }

    public void setNonBeaconLeScanCallback(@Nullable NonBeaconLeScanCallback nonBeaconLeScanCallback) {
        this.j = nonBeaconLeScanCallback;
    }

    private boolean c() {
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.w("BeaconManager", "Bluetooth LE not supported prior to API 18.", new Object[0]);
            return false;
        } else if (this.h.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        } else {
            LogManager.w("BeaconManager", "This device does not support bluetooth LE.", new Object[0]);
            return false;
        }
    }

    private long d() {
        if (this.l) {
            return this.t;
        }
        return this.r;
    }

    private long e() {
        if (this.l) {
            return this.u;
        }
        return this.s;
    }

    private boolean g() {
        if (isScannerInDifferentProcess() && !isMainProcess()) {
            LogManager.w("BeaconManager", "Ranging/Monitoring may not be controlled from a separate BeaconScanner process.  To remove this warning, please wrap this call in: if (beaconManager.isMainProcess())", new Object[0]);
        }
        return false;
    }

    public void destroy() {
        this.h = null;
    }

    class ConsumerInfo {
        @NonNull
        public BeaconServiceConnection beaconServiceConnection;
        public boolean isConnected;

        public ConsumerInfo() {
            this.isConnected = false;
            this.isConnected = false;
            this.beaconServiceConnection = new BeaconServiceConnection();
        }
    }

    class BeaconServiceConnection {
        private BeaconServiceConnection() {
        }

        public void onServiceConnected(BeaconService beaconService) {
            LogManager.d("BeaconManager", "we have a connection to the service now", new Object[0]);
            if (BeaconManager.this.f10246o == null) {
                Boolean unused = BeaconManager.this.f10246o = Boolean.FALSE;
            }
            Messenger unused2 = BeaconManager.this.i = beaconService.getmMessenger();
            BeaconManager.this.applySettings();
            synchronized (BeaconManager.this.e) {
                for (Map.Entry entry : BeaconManager.this.e.entrySet()) {
                    if (!((ConsumerInfo) entry.getValue()).isConnected) {
                        ((BeaconConsumer) entry.getKey()).onBeaconServiceConnect();
                        ((ConsumerInfo) entry.getValue()).isConnected = true;
                    }
                }
            }
        }

        public void onServiceDisconnected() {
            LogManager.e("BeaconManager", "onServiceDisconnected", new Object[0]);
            Messenger unused = BeaconManager.this.i = null;
        }
    }

    public class ServiceNotDeclaredException extends RuntimeException {
        public ServiceNotDeclaredException() {
            super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
        }
    }
}
