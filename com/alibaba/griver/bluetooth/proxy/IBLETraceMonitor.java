package com.alibaba.griver.bluetooth.proxy;

import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import java.util.List;

public interface IBLETraceMonitor {
    void onCharacteristicRead(String str, int i);

    void onCharacteristicWrite(int i);

    void onCharacteristicWriteCompleted(long j);

    void onCloseBluetoothAdapter(long j);

    void onConnect(String str, int i);

    void onConnectedSuccessful(String str, long j, int i);

    void onDeviceFound(List<BleDevice> list);

    void onDisconnect(String str);

    void onDisconnectAllDevices();

    void onDisconnectBLE(String str, long j, int i);

    void onError(String str);

    void onFirstScanTime(long j);

    void onGetBluetoothCharacteristics(String str, String str2);

    void onGetBluetoothDevices(String str);

    void onGetBluetoothServices(String str);

    void onNotifyCharacteristicValue(String str, String str2, String str3, String str4, boolean z);

    void onOpenBluetoothAdapter();

    void onReadData(String str, String str2, String str3);

    void onSendData(String str, String str2, String str3, String str4);

    void onServicesDiscovered(long j, int i);

    void onStartBleScan(String[] strArr, boolean z, int i);

    void onStateChanged(boolean z, boolean z2);

    void onStopBleScan();

    void onTimeout(String str);

    void onWriteValue(long j);
}
