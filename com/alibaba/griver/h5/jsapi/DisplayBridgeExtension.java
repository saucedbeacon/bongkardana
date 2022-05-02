package com.alibaba.griver.h5.jsapi;

import android.app.Activity;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;

@Keep
public class DisplayBridgeExtension extends SimpleBridgeExtension {
    @ActionFilter
    public void setLandscape(@BindingApiContext(required = true) ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        Activity activity = apiContext.getActivity();
        if (!(activity == null || activity.getRequestedOrientation() == 0)) {
            activity.setRequestedOrientation(0);
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    @ActionFilter
    public void setPortrait(@BindingApiContext(required = true) ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        Activity activity = apiContext.getActivity();
        if (!(activity == null || activity.getRequestedOrientation() == 1)) {
            activity.setRequestedOrientation(1);
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }
}
