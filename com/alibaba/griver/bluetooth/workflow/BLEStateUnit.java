package com.alibaba.griver.bluetooth.workflow;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.bluetooth.ble.BetterBleService;
import com.alibaba.griver.bluetooth.ble.model.BluetoothState;
import com.alipay.mobile.verifyidentity.uitools.POPUIType;

public class BLEStateUnit implements WorkflowUnit<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9065a = POPUIType.TOAST_ERROR;
    private final int b = 12;
    private final int c = 10000;
    private BetterBleService d;
    private int e;

    public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
    }

    private BLEStateUnit(BetterBleService betterBleService) {
        this.d = betterBleService;
    }

    public static BLEStateUnit create(BetterBleService betterBleService) {
        return new BLEStateUnit(betterBleService);
    }

    public boolean onNext() {
        if (!this.d.isSupportBLE()) {
            this.e = POPUIType.TOAST_ERROR;
            return false;
        } else if (this.d.getBluetoothState() == BluetoothState.OFF.ordinal()) {
            this.e = 12;
            return false;
        } else if (this.d.isOpened()) {
            return true;
        } else {
            this.e = 10000;
            return false;
        }
    }

    public void onError(BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) Integer.valueOf(this.e));
        int i = this.e;
        if (i == 12) {
            jSONObject.put("errorMessage", (Object) "Bluetooth is not enabled");
        } else if (i == 10000) {
            jSONObject.put("errorMessage", (Object) "Bluetooth is not initialized");
        } else if (i == 10001) {
            jSONObject.put("errorMessage", (Object) "current bluetooth adapter is not suppoted");
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
