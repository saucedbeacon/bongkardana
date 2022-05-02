package com.alibaba.griver.bluetooth.ibeacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconConsumer;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconParser;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Identifier;
import com.alibaba.griver.bluetooth.altbeacon.beacon.RangeNotifier;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import com.alibaba.griver.bluetooth.ble.ErrorConstants;
import com.alibaba.griver.bluetooth.ble.model.BluetoothState;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper;
import id.dana.utils.permission.ManifestPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MyBeaconServiceImpl implements MyBeaconService {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public BeaconManager f9061a;
    /* access modifiers changed from: private */
    public boolean b;
    /* access modifiers changed from: private */
    public List<UUID> c;
    /* access modifiers changed from: private */
    public List<MyBeacon> d;
    /* access modifiers changed from: private */
    public Set<MyBeacon> e;
    /* access modifiers changed from: private */
    public MyBeaconListener f;
    private BroadcastReceiver g;
    private BeaconConsumer h = new BeaconConsumer() {
        public void onBeaconServiceConnect() {
            MyBeaconServiceImpl.this.f9061a.addRangeNotifier(new RangeNotifier() {
                public void didRangeBeaconsInRegion(Collection<Beacon> collection, Region region) {
                    if (collection != null) {
                        MyBeaconServiceImpl.this.d.clear();
                        for (Beacon next : collection) {
                            if (MyBeaconServiceImpl.this.c != null && MyBeaconServiceImpl.this.c.contains(next.getIdentifier(0).toUuid())) {
                                MyBeacon myBeacon = new MyBeacon(next.getIdentifier(0).toString(), next.getIdentifier(1).toInt(), next.getIdentifier(2).toInt(), next.getDistance(), next.getRssi(), next.getTxPower());
                                MyBeaconServiceImpl.this.d.add(myBeacon);
                                if (!MyBeaconServiceImpl.this.e.contains(myBeacon)) {
                                    MyBeaconServiceImpl.this.e.add(myBeacon);
                                } else {
                                    MyBeaconServiceImpl.this.e.remove(myBeacon);
                                    MyBeaconServiceImpl.this.e.add(myBeacon);
                                }
                            }
                        }
                        if (MyBeaconServiceImpl.this.f != null && !MyBeaconServiceImpl.this.d.isEmpty()) {
                            MyBeaconServiceImpl.this.f.onBeaconUpdate(MyBeaconServiceImpl.this.d);
                        }
                    }
                }
            });
            try {
                MyBeaconServiceImpl.this.f9061a.startRangingBeaconsInRegion(new Region(getApplicationContext().getPackageName(), (Identifier) null, (Identifier) null, (Identifier) null));
            } catch (RemoteException unused) {
            }
        }

        public Context getApplicationContext() {
            return MyBeaconServiceImpl.this.d();
        }

        public void unbindService(ServiceConnection serviceConnection) {
            getApplicationContext().unbindService(serviceConnection);
        }

        public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
            boolean bindService = getApplicationContext().bindService(intent, serviceConnection, i);
            if (!bindService) {
                boolean unused = MyBeaconServiceImpl.this.b = false;
            }
            return bindService;
        }
    };

    public void onCreate() {
        a();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.c = new ArrayList();
    }

    public void onDestroy() {
        this.f9061a = null;
    }

    private void a() {
        this.f9061a = BeaconManager.getInstanceForApplication(d());
    }

    public void setMyBeaconListener(MyBeaconListener myBeaconListener) {
        this.f = myBeaconListener;
    }

    public BeaconResult startBeaconDiscovery(String[] strArr) {
        if (this.b) {
            return new BeaconResult(false, ErrorConstants.ERROR_BEACON_ALREADY_DISCOVERING);
        }
        if (!BluetoothHelper.isSupportBLE(d().getApplicationContext())) {
            return new BeaconResult(false, ErrorConstants.ERROR_BEACON_UNSUPPORT);
        }
        if (BluetoothHelper.getBluetoothState() != BluetoothState.ON) {
            return new BeaconResult(false, ErrorConstants.ERROR_BEACON_BLUETOOTH_UNAVAILABLE);
        }
        if (!BluetoothHelper.checkPermission(d().getApplicationContext(), ManifestPermission.ACCESS_COARSE_LOCATION) && !BluetoothHelper.checkPermission(d().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            return new BeaconResult(false, ErrorConstants.ERROR_BEACON_LOCATION_FORBIDDEN);
        }
        if (this.f9061a == null) {
            a();
        }
        this.c.clear();
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    return new BeaconResult(false, ErrorConstants.ERROR_BEACON_UUID_EMPTY);
                }
                UUID uUIDFromString = BluetoothHelper.getUUIDFromString(str);
                if (uUIDFromString == null) {
                    return new BeaconResult(false, ErrorConstants.ERROR_BEACON_INVALID_UUID);
                }
                this.c.add(uUIDFromString);
            }
        }
        this.b = true;
        this.f9061a.isMainProcess();
        this.f9061a.removeAllMonitorNotifiers();
        this.f9061a.removeAllRangeNotifiers();
        this.f9061a.getBeaconParsers().clear();
        this.f9061a.getBeaconParsers().add(new BeaconParser().setBeaconLayout("m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25"));
        this.f9061a.bind(this.h);
        b();
        return new BeaconResult(true);
    }

    public BeaconResult stopBeaconDiscovery() {
        this.b = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f9061a.removeAllMonitorNotifiers();
        this.f9061a.removeAllRangeNotifiers();
        this.f9061a.unbind(this.h);
        c();
        return new BeaconResult(true);
    }

    public BeaconResult getBeacons() {
        BeaconResult beaconResult = new BeaconResult(true);
        beaconResult.obj = this.e;
        return beaconResult;
    }

    private void b() {
        if (this.g == null) {
            this.g = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra != 10) {
                        if (intExtra == 12 && MyBeaconServiceImpl.this.f != null) {
                            MyBeaconServiceImpl.this.f.onBeaconServiceChange(true, MyBeaconServiceImpl.this.b);
                        }
                    } else if (MyBeaconServiceImpl.this.f != null) {
                        MyBeaconServiceImpl.this.f.onBeaconServiceChange(false, MyBeaconServiceImpl.this.b);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            d().getApplicationContext().registerReceiver(this.g, intentFilter);
        }
    }

    private void c() {
        if (this.g != null) {
            d().getApplicationContext().unregisterReceiver(this.g);
        }
        this.g = null;
    }

    /* access modifiers changed from: private */
    public Context d() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService == null) {
            return null;
        }
        return rVEnvironmentService.getApplicationContext();
    }
}
