package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.MainThread;

@MainThread
public interface CycledLeScanCallback {
    void onCycleEnd();

    void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr);
}
