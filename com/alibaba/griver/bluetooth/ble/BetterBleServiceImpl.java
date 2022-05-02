package com.alibaba.griver.bluetooth.ble;

import android.content.Context;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import com.alibaba.griver.bluetooth.ble.model.BleResult;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper;
import java.util.List;

public class BetterBleServiceImpl implements BetterBleService {

    /* renamed from: a  reason: collision with root package name */
    private BLEManager f9060a;
    private Context b;

    public void onDestroy() {
    }

    public void onCreate(Context context) {
        this.b = context;
        this.f9060a = new BLEManager(context);
    }

    public boolean isSupportBLE() {
        return BluetoothHelper.isSupportBLE(this.b);
    }

    public void registerBLEState() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            bLEManager.registerBLEState();
            return;
        }
        BLEManager bLEManager2 = new BLEManager(this.b);
        this.f9060a = bLEManager2;
        bLEManager2.registerBLEState();
    }

    public boolean enableBluetooth() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.enableBluetooth();
        }
        BLEManager bLEManager2 = new BLEManager(this.b);
        this.f9060a = bLEManager2;
        return bLEManager2.enableBluetooth();
    }

    public boolean disableBluetooth() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.disableBluetooth();
        }
        BLEManager bLEManager2 = new BLEManager(this.b);
        this.f9060a = bLEManager2;
        return bLEManager2.disableBluetooth();
    }

    public int getBluetoothState() {
        return BluetoothHelper.getBluetoothState().ordinal();
    }

    public void openBluetoothAdapter() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            bLEManager.openBluetoothAdapter();
            return;
        }
        BLEManager bLEManager2 = new BLEManager(this.b);
        this.f9060a = bLEManager2;
        bLEManager2.openBluetoothAdapter();
    }

    public void closeBluetoothAdapter() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            bLEManager.closeBluetoothAdapter();
        }
    }

    public boolean isDiscovering() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.isDiscovering();
        }
        return false;
    }

    public boolean isOpened() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.isOpened();
        }
        return false;
    }

    public BleResult startBluetoothDevicesDiscovery(String[] strArr, boolean z, int i) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.startBleScan(strArr, z, i);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public void stopBluetoothDevicesDiscovery() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            bLEManager.stopBleScan(true);
        }
    }

    public List<BleDevice> getBluetoothDevices() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.getBluetoothDevices();
        }
        return null;
    }

    public List<BleDevice> getConnectedBluetoothDevices() {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.getConnectedBluetoothDevices();
        }
        return null;
    }

    public BleResult connectBluetoothDevice(String str, int i) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.connect(str, i);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public BleResult disconnectBluetoothDevice(String str) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.disconnectAndClose(str);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public void setBetterBleListener(BetterBleListener betterBleListener) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            bLEManager.setBetterBleListener(betterBleListener);
        }
    }

    public BleResult getBluetoothServices(String str) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.getBluetoothServices(str);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public BleResult getBluetoothCharacteristics(String str, String str2) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.getBluetoothCharacteristics(str, str2);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public BleResult sendData(String str, String str2, String str3, String str4) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.sendData(str, str2, str3, str4);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public BleResult readData(String str, String str2, String str3) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.readData(str, str2, str3);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }

    public BleResult notifyCharacteristicValueChange(String str, String str2, String str3, String str4, boolean z) {
        BLEManager bLEManager = this.f9060a;
        if (bLEManager != null) {
            return bLEManager.notifyCharacteristicValue(str, str2, str3, str4, z);
        }
        return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
    }
}
