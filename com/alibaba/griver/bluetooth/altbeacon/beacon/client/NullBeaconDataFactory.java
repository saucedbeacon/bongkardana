package com.alibaba.griver.bluetooth.altbeacon.beacon.client;

import android.os.Handler;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconData;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconDataNotifier;

public class NullBeaconDataFactory implements BeaconDataFactory {
    public void requestBeaconData(Beacon beacon, final BeaconDataNotifier beaconDataNotifier) {
        new Handler().post(new Runnable() {
            public void run() {
                beaconDataNotifier.beaconDataUpdate((Beacon) null, (BeaconData) null, new DataProviderException("You need to configure a beacon data service to use this feature."));
            }
        });
    }
}
