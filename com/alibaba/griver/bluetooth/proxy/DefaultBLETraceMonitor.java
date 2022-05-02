package com.alibaba.griver.bluetooth.proxy;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import java.util.List;

public class DefaultBLETraceMonitor implements IBLETraceMonitor {

    /* renamed from: a  reason: collision with root package name */
    private static String f10282a = DefaultBLETraceMonitor.class.getSimpleName();

    public void onStateChanged(boolean z, boolean z2) {
        String str = f10282a;
        StringBuilder sb = new StringBuilder("onStateChanged:available-");
        sb.append(z);
        sb.append(",discovering-");
        sb.append(z2);
        RVLogger.e(str, sb.toString());
    }

    public void onDeviceFound(List<BleDevice> list) {
        RVLogger.e(f10282a, "onDeviceFound");
    }

    public void onFirstScanTime(long j) {
        RVLogger.e(f10282a, "onFirstScanTime:".concat(String.valueOf(j)));
    }

    public void onError(String str) {
        RVLogger.e(f10282a, "onError:".concat(String.valueOf(str)));
    }

    public void onConnectedSuccessful(String str, long j, int i) {
        String str2 = f10282a;
        StringBuilder sb = new StringBuilder("onConnectedSuccessful:");
        sb.append(str);
        sb.append(",connectTime-");
        sb.append(j);
        sb.append(",status");
        sb.append(i);
        RVLogger.e(str2, sb.toString());
    }

    public void onConnect(String str, int i) {
        String str2 = f10282a;
        StringBuilder sb = new StringBuilder("onConnect: address-");
        sb.append(str);
        sb.append(",transport-");
        sb.append(i);
        RVLogger.e(str2, sb.toString());
    }

    public void onDisconnectBLE(String str, long j, int i) {
        String str2 = f10282a;
        StringBuilder sb = new StringBuilder("onDisconnectBLE: address-");
        sb.append(str);
        sb.append(",keepConnectedTime-");
        sb.append(j);
        sb.append(",status:");
        sb.append(i);
        RVLogger.e(str2, sb.toString());
    }

    public void onServicesDiscovered(long j, int i) {
        String str = f10282a;
        StringBuilder sb = new StringBuilder("onDisconnectBLE: discoverCostTime-");
        sb.append(j);
        sb.append(",status:");
        sb.append(i);
        RVLogger.e(str, sb.toString());
    }

    public void onCharacteristicRead(String str, int i) {
        String str2 = f10282a;
        StringBuilder sb = new StringBuilder("onDisconnectBLE: receivedData-");
        sb.append(str);
        sb.append(",status:");
        sb.append(i);
        RVLogger.e(str2, sb.toString());
    }

    public void onCharacteristicWrite(int i) {
        RVLogger.e(f10282a, "onCharacteristicWrite: :status:".concat(String.valueOf(i)));
    }

    public void onCharacteristicWriteCompleted(long j) {
        RVLogger.e(f10282a, "onCharacteristicWriteCompleted: :completedTime:".concat(String.valueOf(j)));
    }

    public void onCloseBluetoothAdapter(long j) {
        RVLogger.e(f10282a, "onCloseBluetoothAdapter: :sessionTime:".concat(String.valueOf(j)));
    }

    public void onStartBleScan(String[] strArr, boolean z, int i) {
        String str = f10282a;
        StringBuilder sb = new StringBuilder("onCloseBluetoothAdapter: :serviceUUIDs-:");
        sb.append(strArr);
        sb.append(",allowDuplicatesKey-");
        sb.append(z);
        sb.append(",interval-");
        sb.append(i);
        RVLogger.e(str, sb.toString());
    }

    public void onStopBleScan() {
        RVLogger.e(f10282a, "onStopBleScan");
    }

    public void onGetBluetoothDevices(String str) {
        RVLogger.e(f10282a, "onGetBluetoothDevices".concat(String.valueOf(str)));
    }

    public void onDisconnect(String str) {
        RVLogger.e(f10282a, "onDisconnect".concat(String.valueOf(str)));
    }

    public void onDisconnectAllDevices() {
        RVLogger.e(f10282a, "onDisconnectAllDevices");
    }

    public void onGetBluetoothServices(String str) {
        RVLogger.e(f10282a, "onGetBluetoothServices".concat(String.valueOf(str)));
    }

    public void onGetBluetoothCharacteristics(String str, String str2) {
        String str3 = f10282a;
        StringBuilder sb = new StringBuilder("onGetBluetoothCharacteristics: address-");
        sb.append(str);
        sb.append("serviceId-");
        sb.append(str2);
        RVLogger.e(str3, sb.toString());
    }

    public void onReadData(String str, String str2, String str3) {
        String str4 = f10282a;
        StringBuilder sb = new StringBuilder("onGetBluetoothCharacteristics: address-");
        sb.append(str);
        sb.append("serviceId-");
        sb.append(str2);
        sb.append(",characteristicId:");
        sb.append(str3);
        RVLogger.e(str4, sb.toString());
    }

    public void onSendData(String str, String str2, String str3, String str4) {
        String str5 = f10282a;
        StringBuilder sb = new StringBuilder("onSendData: address-");
        sb.append(str);
        sb.append("serviceId-");
        sb.append(str2);
        sb.append(",characteristicId:");
        sb.append(str3);
        sb.append(",data:");
        sb.append(str4);
        RVLogger.e(str5, sb.toString());
    }

    public void onWriteValue(long j) {
        RVLogger.e(f10282a, "onWriteValue".concat(String.valueOf(j)));
    }

    public void onNotifyCharacteristicValue(String str, String str2, String str3, String str4, boolean z) {
        String str5 = f10282a;
        StringBuilder sb = new StringBuilder("onNotifyCharacteristicValue:");
        sb.append(str);
        sb.append(",serviceId:");
        sb.append(str2);
        sb.append(",characteristicId:");
        sb.append(str3);
        sb.append(",descriptorUUID:");
        sb.append(str4);
        sb.append(",enable:");
        sb.append(z);
        RVLogger.e(str5, sb.toString());
    }

    public void onOpenBluetoothAdapter() {
        RVLogger.e(f10282a, "onOpenBluetoothAdapter");
    }

    public void onTimeout(String str) {
        RVLogger.e(f10282a, str);
    }
}
