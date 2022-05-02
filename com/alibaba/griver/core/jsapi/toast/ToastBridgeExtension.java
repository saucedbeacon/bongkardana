package com.alibaba.griver.core.jsapi.toast;

import android.app.Activity;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.view.ToastPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.griver.base.common.logger.GriverLogger;

@Keep
public class ToastBridgeExtension implements BridgeExtension {
    private static final String TAG = "ToastBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void toast(@BindingParam({"content"}) String str, @BindingParam(intDefault = 2000, value = {"duration"}) int i, @BindingParam({"type"}) String str2, @BindingParam({"xOffset"}) int i2, @BindingParam({"yOffset"}) int i3, @BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        if (page == null || page.getPageContext() == null || page.getPageContext().getActivity() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        Activity activity = page.getPageContext().getActivity();
        final ToastPoint create = ExtensionPoint.as(ToastPoint.class).node(page).create();
        create.showToast(activity, str, i, str2, i2, i3);
        GriverLogger.d(TAG, "toast duration: ".concat(String.valueOf(i)));
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                create.hideToast();
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }, (long) i);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideToast(@BindingNode(Page.class) Page page) {
        ExtensionPoint.as(ToastPoint.class).node(page).create().hideToast();
        return BridgeResponse.SUCCESS;
    }
}
