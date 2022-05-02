package com.alibaba.griver.bluetooth.altbeacon.beacon.client;

import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconDataNotifier;

public interface BeaconDataFactory {
    void requestBeaconData(Beacon beacon, BeaconDataNotifier beaconDataNotifier);
}
