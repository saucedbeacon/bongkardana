package com.alibaba.griver.bluetooth.ble.model;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;

public class TimeOutContext {
    public BridgeCallback bridgeCallback;
    public String deviceId;

    public TimeOutContext(BridgeCallback bridgeCallback2, String str) {
        this.bridgeCallback = bridgeCallback2;
        this.deviceId = str;
    }
}
