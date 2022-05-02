package com.alibaba.griver.h5.jsapi;

import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.h5.api.GriverSessionDataPoint;

@Keep
public class SessionBridgeExtension extends SimpleBridgeExtension {
    private static final String TAG = "SessionBridgeExtension";

    @ActionFilter
    public void exitSession(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        if (page == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        ((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableExit = true;
        final App app = page.getApp();
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (app != null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    app.exit();
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        });
    }

    @ActionFilter
    public void getSessionData(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingParam(name = {"keys"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        if (jSONArray == null || jSONArray.size() == 0) {
            GriverLogger.w(TAG, "keys should not be empty");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) ExtensionPoint.as(GriverSessionDataPoint.class).node(page).create().getData(jSONArray));
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ActionFilter
    public void setSessionData(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingParam(name = {"data"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        if (jSONObject == null || jSONObject.size() == 0) {
            GriverLogger.w(TAG, "data should not be empty");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        ExtensionPoint.as(GriverSessionDataPoint.class).node(page).create().setData(jSONObject);
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }
}
