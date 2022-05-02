package com.alibaba.griver.core.jsapi.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class ClientAppBridgeExtension extends SimpleBridgeExtension {
    @ActionFilter
    public void updateClientApp(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        if (page == null || page.getPageContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        Activity activity = page.getPageContext().getActivity();
        if (activity == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        try {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(activity.getPackageName());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            activity.startActivity(intent);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        } catch (Exception e) {
            GriverLogger.e("ClientAppBridgeExtension", "go to app store failed", e);
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }
}
