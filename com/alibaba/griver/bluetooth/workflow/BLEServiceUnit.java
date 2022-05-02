package com.alibaba.griver.bluetooth.workflow;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.bluetooth.ble.BetterBleService;

public class BLEServiceUnit implements WorkflowUnit<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private BetterBleService f9064a;

    public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
    }

    @Deprecated
    private BLEServiceUnit(BetterBleService betterBleService) {
        this.f9064a = betterBleService;
    }

    public static BLEServiceUnit create(BetterBleService betterBleService) {
        return new BLEServiceUnit(betterBleService);
    }

    public boolean onNext() {
        return this.f9064a != null;
    }

    public void onError(BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) 15);
        jSONObject.put("errorMessage", (Object) "unknown error");
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
