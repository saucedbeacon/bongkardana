package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import java.io.Serializable;
import java.util.HashMap;

public class ExtraDataBeaconTracker implements Serializable {
    private static final String TAG = "BeaconTracker";
    private HashMap<String, HashMap<Integer, Beacon>> mBeaconsByKey = new HashMap<>();
    private boolean matchBeaconsByServiceUUID = true;

    public ExtraDataBeaconTracker() {
    }

    public ExtraDataBeaconTracker(boolean z) {
        this.matchBeaconsByServiceUUID = z;
    }

    public synchronized Beacon track(Beacon beacon) {
        if (beacon.isMultiFrameBeacon() || beacon.getServiceUuid() != -1) {
            beacon = trackGattBeacon(beacon);
        }
        return beacon;
    }

    private Beacon trackGattBeacon(Beacon beacon) {
        HashMap hashMap = this.mBeaconsByKey.get(getBeaconKey(beacon));
        Beacon beacon2 = null;
        if (hashMap != null) {
            for (Beacon beacon3 : hashMap.values()) {
                if (beacon.isExtraBeaconData()) {
                    beacon3.setRssi(beacon.getRssi());
                    beacon3.setExtraDataFields(beacon.getDataFields());
                } else {
                    beacon.setExtraDataFields(beacon3.getExtraDataFields());
                    beacon2 = beacon;
                }
            }
        }
        if (!beacon.isExtraBeaconData()) {
            updateTrackingHashes(beacon, hashMap);
        }
        return (beacon2 != null || beacon.isExtraBeaconData()) ? beacon2 : beacon;
    }

    private void updateTrackingHashes(Beacon beacon, HashMap<Integer, Beacon> hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(Integer.valueOf(beacon.hashCode()), beacon);
        this.mBeaconsByKey.put(getBeaconKey(beacon), hashMap);
    }

    private String getBeaconKey(Beacon beacon) {
        if (!this.matchBeaconsByServiceUUID) {
            return beacon.getBluetoothAddress();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(beacon.getBluetoothAddress());
        sb.append(beacon.getServiceUuid());
        return sb.toString();
    }
}
