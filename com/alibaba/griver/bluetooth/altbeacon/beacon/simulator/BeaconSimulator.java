package com.alibaba.griver.bluetooth.altbeacon.beacon.simulator;

import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import java.util.List;

public interface BeaconSimulator {
    List<Beacon> getBeacons();
}
