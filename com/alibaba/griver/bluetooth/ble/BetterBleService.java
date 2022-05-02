package com.alibaba.griver.bluetooth.ble;

import android.content.Context;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import com.alibaba.griver.bluetooth.ble.model.BleResult;
import java.util.List;

public interface BetterBleService {
    void closeBluetoothAdapter();

    BleResult connectBluetoothDevice(String str, int i);

    boolean disableBluetooth();

    BleResult disconnectBluetoothDevice(String str);

    boolean enableBluetooth();

    BleResult getBluetoothCharacteristics(String str, String str2);

    List<BleDevice> getBluetoothDevices();

    BleResult getBluetoothServices(String str);

    int getBluetoothState();

    List<BleDevice> getConnectedBluetoothDevices();

    boolean isDiscovering();

    boolean isOpened();

    boolean isSupportBLE();

    BleResult notifyCharacteristicValueChange(String str, String str2, String str3, String str4, boolean z);

    void onCreate(Context context);

    void onDestroy();

    void openBluetoothAdapter();

    BleResult readData(String str, String str2, String str3);

    void registerBLEState();

    BleResult sendData(String str, String str2, String str3, String str4);

    void setBetterBleListener(BetterBleListener betterBleListener);

    BleResult startBluetoothDevicesDiscovery(String[] strArr, boolean z, int i);

    void stopBluetoothDevicesDiscovery();
}
