package com.alibaba.griver.bluetooth.proxy;

public class DefaultBlueToothProxy implements RVBluetoothProxy {
    public int getBLEConnectMaxTimeout() {
        return 20000;
    }

    public IBLETraceMonitor getBLETraceMonitor() {
        return null;
    }
}
