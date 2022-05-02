package com.alibaba.ariver.engine.common.bridge.internal;

import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;

public class DefaultBridgeCallback implements BridgeCallback {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8980a;
    private BridgeResponseHelper b;

    public DefaultBridgeCallback(BridgeResponseHelper bridgeResponseHelper) {
        this(bridgeResponseHelper, false);
    }

    public DefaultBridgeCallback(BridgeResponseHelper bridgeResponseHelper, boolean z) {
        this.f8980a = z;
        this.b = bridgeResponseHelper;
    }

    public boolean isSticky() {
        return this.f8980a;
    }

    public BridgeResponseHelper getResponseHelper() {
        return this.b;
    }

    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        if (z) {
            this.b.sendBridgeResultWithCallbackKept(jSONObject);
        } else {
            this.b.sendBridgeResult(jSONObject);
        }
    }

    public void sendJSONResponse(JSONObject jSONObject) {
        if (this.f8980a) {
            this.b.sendBridgeResultWithCallbackKept(jSONObject);
        } else {
            this.b.sendBridgeResult(jSONObject);
        }
    }

    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        if (bridgeResponse == null) {
            bridgeResponse = BridgeResponse.SUCCESS;
        }
        if (bridgeResponse instanceof BridgeResponse.Error) {
            BridgeResponse.Error error = (BridgeResponse.Error) bridgeResponse;
            this.b.sendError(error.getErrorCode(), error.getErrorMessage());
            return;
        }
        JSONObject jSONObject = bridgeResponse.get();
        if (this.f8980a) {
            this.b.sendBridgeResultWithCallbackKept(jSONObject);
        } else {
            this.b.sendBridgeResult(jSONObject);
        }
    }
}
