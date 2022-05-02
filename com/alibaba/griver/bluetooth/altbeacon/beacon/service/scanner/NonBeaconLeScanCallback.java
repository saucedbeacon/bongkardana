package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.WorkerThread;

@WorkerThread
public interface NonBeaconLeScanCallback {
    void onNonBeaconLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr);
}
