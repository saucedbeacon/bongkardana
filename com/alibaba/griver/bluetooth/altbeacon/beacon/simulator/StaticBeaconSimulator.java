package com.alibaba.griver.bluetooth.altbeacon.beacon.simulator;

import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import java.util.List;

public class StaticBeaconSimulator implements BeaconSimulator {
    public List<Beacon> beacons = null;

    public List<Beacon> getBeacons() {
        return this.beacons;
    }

    public void setBeacons(List<Beacon> list) {
        this.beacons = list;
    }
}
