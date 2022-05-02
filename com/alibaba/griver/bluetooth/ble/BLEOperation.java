package com.alibaba.griver.bluetooth.ble;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;

public class BLEOperation {
    public String action;
    public BridgeCallback bridgeCallback;
    public JSONObject param;

    public BLEOperation(String str, JSONObject jSONObject, BridgeCallback bridgeCallback2) {
        this.action = str;
        this.param = jSONObject;
        this.bridgeCallback = bridgeCallback2;
    }
}
