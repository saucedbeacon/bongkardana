package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;

public class AltBeaconParser extends BeaconParser {
    public static final String TAG = "AltBeaconParser";

    public AltBeaconParser() {
        this.mHardwareAssistManufacturers = new int[]{280};
        setBeaconLayout(BeaconParser.ALTBEACON_LAYOUT);
        this.mIdentifier = "com/alibaba/griver/bluetooth/altbeacon";
    }

    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice) {
        return fromScanData(bArr, i, bluetoothDevice, new AltBeacon());
    }
}
