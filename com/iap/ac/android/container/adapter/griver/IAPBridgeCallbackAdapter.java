package com.iap.ac.android.container.adapter.griver;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.interceptor.BridgeCallback;
import com.iap.ac.android.common.container.interceptor.BridgeResponse;
import org.json.JSONObject;

public class IAPBridgeCallbackAdapter implements BridgeCallback {
    @NonNull
    private com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback proxyCallback;

    @NonNull
    public static IAPBridgeCallbackAdapter from(@NonNull com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback bridgeCallback) {
        return new IAPBridgeCallbackAdapter(bridgeCallback);
    }

    private IAPBridgeCallbackAdapter(@NonNull com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback bridgeCallback) {
        this.proxyCallback = bridgeCallback;
    }

    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        this.proxyCallback.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject), z);
    }

    public void sendJSONResponse(JSONObject jSONObject) {
        this.proxyCallback.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject));
    }

    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        this.proxyCallback.sendBridgeResponse(new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse(Utils.jsonObjectToFastJson(bridgeResponse.get())));
    }
}
