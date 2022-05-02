package com.alibaba.griver.bluetooth.ble;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import com.alibaba.griver.bluetooth.proxy.DefaultBLETraceMonitor;
import com.alibaba.griver.bluetooth.proxy.IBLETraceMonitor;
import com.alibaba.griver.bluetooth.proxy.RVBluetoothProxy;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class BLETraceMonitor implements IBLETraceMonitor {

    /* renamed from: a  reason: collision with root package name */
    private static BLETraceMonitor f10280a;
    private IBLETraceMonitor b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;

    @Deprecated
    private BLETraceMonitor() {
        IBLETraceMonitor bLETraceMonitor = ((RVBluetoothProxy) RVProxy.get(RVBluetoothProxy.class)).getBLETraceMonitor();
        this.b = bLETraceMonitor;
        if (bLETraceMonitor == null) {
            this.b = new DefaultBLETraceMonitor();
        }
    }

    public static BLETraceMonitor getInstance() {
        if (f10280a == null) {
            synchronized (BLETraceMonitor.class) {
                f10280a = new BLETraceMonitor();
            }
        }
        return f10280a;
    }

    public void onStateChanged(boolean z, boolean z2) {
        this.b.onStateChanged(z, z2);
    }

    public void onDeviceFound(List<BleDevice> list) {
        this.b.onDeviceFound(list);
    }

    public void onFirstScanTime(long j) {
        this.b.onFirstScanTime(System.currentTimeMillis() - this.c);
    }

    public void onError(String str) {
        this.b.onError(str);
    }

    public void onConnectedSuccessful(String str, long j, int i) {
        this.e = System.currentTimeMillis();
        this.b.onConnectedSuccessful(str, System.currentTimeMillis() - this.d, i);
    }

    public void onConnect(String str, int i) {
        this.d = System.currentTimeMillis();
        this.b.onConnect(str, i);
        this.f = System.currentTimeMillis();
    }

    public void onDisconnectBLE(String str, long j, int i) {
        this.b.onDisconnectBLE(str, System.currentTimeMillis() - this.e, i);
        this.e = 0;
    }

    public void onServicesDiscovered(long j, int i) {
        this.b.onServicesDiscovered(System.currentTimeMillis() - this.f, i);
        this.f = 0;
    }

    public void onCharacteristicRead(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1995970985, oncanceled);
            onCancelLoad.getMin(1995970985, oncanceled);
        }
        this.b.onCharacteristicRead(str, i);
    }

    public void onCharacteristicWrite(int i) {
        this.b.onCharacteristicWrite(i);
    }

    public void onCharacteristicWriteCompleted(long j) {
        this.b.onCharacteristicWriteCompleted(j);
    }

    public void onStartBleScan(String[] strArr, boolean z, int i) {
        this.c = System.currentTimeMillis();
        this.b.onStartBleScan(strArr, z, i);
    }

    public void onStopBleScan() {
        this.b.onStopBleScan();
    }

    public void onGetBluetoothDevices(String str) {
        this.b.onGetBluetoothDevices(str);
    }

    public void onDisconnect(String str) {
        this.b.onDisconnect(str);
    }

    public void onDisconnectAllDevices() {
        this.b.onDisconnectAllDevices();
    }

    public void onGetBluetoothServices(String str) {
        this.b.onGetBluetoothServices(str);
    }

    public void onGetBluetoothCharacteristics(String str, String str2) {
        this.b.onGetBluetoothCharacteristics(str, str2);
    }

    public void onReadData(String str, String str2, String str3) {
        this.b.onReadData(str, str2, str3);
    }

    public void onSendData(String str, String str2, String str3, String str4) {
        this.h = System.currentTimeMillis();
        this.b.onSendData(str, str2, str3, str4);
    }

    public void onWriteValue(long j) {
        this.b.onWriteValue(System.currentTimeMillis() - this.h);
    }

    public void onNotifyCharacteristicValue(String str, String str2, String str3, String str4, boolean z) {
        this.b.onNotifyCharacteristicValue(str, str2, str3, str4, z);
    }

    public void onOpenBluetoothAdapter() {
        this.g = System.currentTimeMillis();
        this.b.onOpenBluetoothAdapter();
    }

    public void onTimeout(String str) {
        this.b.onTimeout(str);
    }

    public void onCloseBluetoothAdapter(long j) {
        this.b.onCloseBluetoothAdapter(System.currentTimeMillis() - this.g);
    }
}
