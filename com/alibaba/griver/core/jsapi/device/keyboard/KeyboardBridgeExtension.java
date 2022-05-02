package com.alibaba.griver.core.jsapi.device.keyboard;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;

@Keep
public class KeyboardBridgeExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void hideKeyboard(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        if (app.getAppContext().getContext() instanceof Activity) {
            Activity activity = (Activity) app.getAppContext().getContext();
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (activity.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            return;
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "App Context not Activity"));
    }
}
