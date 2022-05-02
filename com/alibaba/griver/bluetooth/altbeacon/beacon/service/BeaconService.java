package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.MainThread;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.altbeacon.beacon.distance.ModelSpecificDistanceCalculator;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.utils.ProcessUtils;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BeaconService {
    public static final int MSG_SET_SCAN_PERIODS = 6;
    public static final int MSG_START_MONITORING = 4;
    public static final int MSG_START_RANGING = 2;
    public static final int MSG_STOP_MONITORING = 5;
    public static final int MSG_STOP_RANGING = 3;
    public static final int MSG_SYNC_SETTINGS = 7;
    public static final String TAG = "BeaconService";

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10256a = new Handler();
    private BluetoothCrashResolver b;
    private ScanHelper c;
    Context context;
    final Messenger mMessenger = new Messenger(new IncomingHandler(this));

    public BeaconService(Context context2) {
        this.context = context2;
        onCreate(context2);
    }

    public Context getContext() {
        return this.context;
    }

    public Messenger getmMessenger() {
        return this.mMessenger;
    }

    @MainThread
    public void onCreate(Context context2) {
        BluetoothCrashResolver bluetoothCrashResolver = new BluetoothCrashResolver(context2);
        this.b = bluetoothCrashResolver;
        bluetoothCrashResolver.start();
        ScanHelper scanHelper = new ScanHelper(context2);
        this.c = scanHelper;
        if (scanHelper.getCycledScanner() == null) {
            this.c.createCycledLeScanner(false, this.b);
        }
        this.c.setMonitoringStatus(MonitoringStatus.getInstanceForApplication(context2));
        this.c.setRangedRegionState(new HashMap());
        this.c.setBeaconParsers(new HashSet());
        this.c.setExtraDataBeaconTracker(new ExtraDataBeaconTracker());
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context2);
        instanceForApplication.setScannerInSameProcess(false);
        if (instanceForApplication.isMainProcess()) {
            LogManager.i(TAG, "beaconService version %s is starting up on the main process", "1.0");
        } else {
            LogManager.i(TAG, "beaconService version %s is starting up on a separate process", "1.0");
            ProcessUtils processUtils = new ProcessUtils(context2);
            StringBuilder sb = new StringBuilder("beaconService PID is ");
            sb.append(processUtils.getPid());
            sb.append(" with process name ");
            sb.append(processUtils.getProcessName());
            LogManager.i(TAG, sb.toString(), new Object[0]);
        }
        this.c.reloadParsers();
        Beacon.setDistanceCalculator(new ModelSpecificDistanceCalculator(context2, BeaconManager.getDistanceModelUpdateUrl()));
        try {
            this.c.setSimulatedScanData((List) Class.forName("org.com.alibaba.griver.bluetooth.altbeacon.beacon.SimulatedScanData").getField("beacons").get((Object) null));
        } catch (ClassNotFoundException unused) {
            LogManager.d(TAG, "No org.com.alibaba.griver.bluetooth.altbeacon.beacon.SimulatedScanData class exists.", new Object[0]);
        } catch (Exception e) {
            LogManager.e(e, TAG, "Cannot get simulated Scan data.  Make sure your org.com.alibaba.griver.bluetooth.altbeacon.beacon.SimulatedScanData class defines a field with the signature 'public static List<Beacon> beacons'", new Object[0]);
        }
    }

    @MainThread
    public void destroy() {
        LogManager.e(TAG, "destroy()", new Object[0]);
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.w(TAG, "Not supported prior to API 18.", new Object[0]);
            return;
        }
        this.b.stop();
        LogManager.i(TAG, "destroy called.  stopping scanning", new Object[0]);
        this.f10256a.removeCallbacksAndMessages((Object) null);
        this.c.getCycledScanner().stop();
        this.c.getCycledScanner().destroy();
        this.c.getMonitoringStatus().stopStatusPreservation();
    }

    @MainThread
    public void startRangingBeaconsInRegion(Region region, Callback callback) {
        synchronized (this.c.getRangedRegionState()) {
            if (this.c.getRangedRegionState().containsKey(region)) {
                LogManager.i(TAG, "Already ranging that region -- will replace existing region.", new Object[0]);
                this.c.getRangedRegionState().remove(region);
            }
            this.c.getRangedRegionState().put(region, new RangeState(callback));
            LogManager.d(TAG, "Currently ranging %s regions.", Integer.valueOf(this.c.getRangedRegionState().size()));
        }
        this.c.getCycledScanner().start();
    }

    @MainThread
    public void stopRangingBeaconsInRegion(Region region) {
        int size;
        synchronized (this.c.getRangedRegionState()) {
            this.c.getRangedRegionState().remove(region);
            size = this.c.getRangedRegionState().size();
            LogManager.d(TAG, "Currently ranging %s regions.", Integer.valueOf(this.c.getRangedRegionState().size()));
        }
        if (size == 0 && this.c.getMonitoringStatus().regionsCount() == 0) {
            this.c.getCycledScanner().stop();
        }
    }

    @MainThread
    public void startMonitoringBeaconsInRegion(Region region, Callback callback) {
        LogManager.d(TAG, "startMonitoring called", new Object[0]);
        this.c.getMonitoringStatus().addRegion(region, callback);
        LogManager.d(TAG, "Currently monitoring %s regions.", Integer.valueOf(this.c.getMonitoringStatus().regionsCount()));
        this.c.getCycledScanner().start();
    }

    @MainThread
    public void stopMonitoringBeaconsInRegion(Region region) {
        LogManager.d(TAG, "stopMonitoring called", new Object[0]);
        this.c.getMonitoringStatus().removeRegion(region);
        LogManager.d(TAG, "Currently monitoring %s regions.", Integer.valueOf(this.c.getMonitoringStatus().regionsCount()));
        if (this.c.getMonitoringStatus().regionsCount() == 0 && this.c.getRangedRegionState().size() == 0) {
            this.c.getCycledScanner().stop();
        }
    }

    @MainThread
    public void setScanPeriods(long j, long j2, boolean z) {
        this.c.getCycledScanner().setScanPeriods(j, j2, z);
    }

    public void reloadParsers() {
        this.c.reloadParsers();
    }

    static class IncomingHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<BeaconService> f10257a;

        IncomingHandler(BeaconService beaconService) {
            super(Looper.getMainLooper());
            this.f10257a = new WeakReference<>(beaconService);
        }

        @MainThread
        public void handleMessage(Message message) {
            BeaconService beaconService = this.f10257a.get();
            if (beaconService != null) {
                StartRMData fromBundle = StartRMData.fromBundle(message.getData());
                if (fromBundle != null) {
                    int i = message.what;
                    if (i == 2) {
                        LogManager.i(BeaconService.TAG, "start ranging received", new Object[0]);
                        beaconService.startRangingBeaconsInRegion(fromBundle.getRegionData(), new Callback(fromBundle.getCallbackPackageName()));
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                    } else if (i == 3) {
                        LogManager.i(BeaconService.TAG, "stop ranging received", new Object[0]);
                        beaconService.stopRangingBeaconsInRegion(fromBundle.getRegionData());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                    } else if (i == 4) {
                        LogManager.i(BeaconService.TAG, "start monitoring received", new Object[0]);
                        beaconService.startMonitoringBeaconsInRegion(fromBundle.getRegionData(), new Callback(fromBundle.getCallbackPackageName()));
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                    } else if (i == 5) {
                        LogManager.i(BeaconService.TAG, "stop monitoring received", new Object[0]);
                        beaconService.stopMonitoringBeaconsInRegion(fromBundle.getRegionData());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                    } else if (i != 6) {
                        super.handleMessage(message);
                    } else {
                        LogManager.i(BeaconService.TAG, "set scan intervals received", new Object[0]);
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                    }
                } else if (message.what == 7) {
                    LogManager.i(BeaconService.TAG, "Received settings update from other process", new Object[0]);
                    SettingsData fromBundle2 = SettingsData.fromBundle(message.getData());
                    if (fromBundle2 != null) {
                        fromBundle2.apply(beaconService);
                    } else {
                        LogManager.w(BeaconService.TAG, "Settings data missing", new Object[0]);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Received unknown message from other process : ");
                    sb.append(message.what);
                    LogManager.i(BeaconService.TAG, sb.toString(), new Object[0]);
                }
            }
        }
    }

    public class BeaconBinder extends Binder {
        public BeaconBinder() {
        }

        public BeaconService getService() {
            LogManager.i(BeaconService.TAG, "getService of BeaconBinder called", new Object[0]);
            return BeaconService.this;
        }
    }
}
