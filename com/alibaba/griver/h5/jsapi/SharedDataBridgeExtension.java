package com.alibaba.griver.h5.jsapi;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.h5.api.GriverDataCacheExtension;

@Keep
public class SharedDataBridgeExtension extends SimpleBridgeExtension {
    private static final String TAG = "SharedDataBridgeExtension";

    @ActionFilter
    public void getSharedData(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam(name = {"keys"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        GriverDataCacheExtension sharedDataProxy = getSharedDataProxy(bridgeCallback);
        if (sharedDataProxy != null) {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        String str = (String) obj;
                        jSONObject.put(str, (Object) sharedDataProxy.get(str));
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }

    @ActionFilter
    public void setSharedData(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam(name = {"data"}) JSONObject jSONObject, @BindingParam(name = {"writeToFile"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        GriverDataCacheExtension sharedDataProxy = getSharedDataProxy(bridgeCallback);
        if (sharedDataProxy != null) {
            if (jSONObject == null || jSONObject.size() == 0) {
                GriverLogger.e(TAG, "data is empty, invalid param");
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return;
            }
            for (String next : jSONObject.keySet()) {
                String string = jSONObject.getString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    sharedDataProxy.set(next, string, z);
                }
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ActionFilter
    public void removeSharedData(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam(name = {"keys"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        GriverDataCacheExtension sharedDataProxy = getSharedDataProxy(bridgeCallback);
        if (sharedDataProxy != null) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        sharedDataProxy.remove((String) obj);
                    }
                }
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    private GriverDataCacheExtension getSharedDataProxy(BridgeCallback bridgeCallback) {
        GriverDataCacheExtension griverDataCacheExtension = (GriverDataCacheExtension) RVProxy.get(GriverDataCacheExtension.class);
        if (griverDataCacheExtension != null) {
            return griverDataCacheExtension;
        }
        GriverLogger.e(TAG, " not set GriverDataCacheExtension can not use shareDate");
        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        return null;
    }
}
