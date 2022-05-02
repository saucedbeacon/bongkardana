package com.alibaba.griver.h5.jsapi;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Keep
public class StartupParamsBridgeExtension extends SimpleBridgeExtension {
    private static final int UNKNOWN_ERROR_NUM = 12;

    @ActionFilter
    public void getStartupParams(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam(name = {"key"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        Bundle startParams = apiContext.getStartParams();
        JSONObject jSONObject = BundleUtils.toJSONObject(startParams);
        if (jSONObject == null || jSONObject.isEmpty()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "params is null"));
        } else if (jSONArray == null) {
            bridgeCallback.sendJSONResponse(jSONObject);
        } else if (!jSONArray.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (jSONObject.containsKey(string)) {
                    jSONObject2.put(string, BundleUtils.getValue(startParams, string, new Object()));
                }
            }
            bridgeCallback.sendJSONResponse(jSONObject2);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        }
    }
}
