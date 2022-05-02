package com.alibaba.griver.h5.jsapi;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.griver.api.ui.titlebar.GVTitleBar;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;

public class TitleBarBridgeExtension extends SimpleBridgeExtension {
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void setBackButton(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingParam(name = {"action"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        if (page == null || page.getPageContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(4, "cannot operate TitleBar in EmbedView!"));
        } else {
            TitleBar titleBar = page.getPageContext().getTitleBar();
            GVTitleBar gVTitleBar = null;
            if (titleBar instanceof GVTitleBar) {
                gVTitleBar = (GVTitleBar) titleBar;
            }
            if (gVTitleBar == null) {
                GriverLogger.w("TitleBarBridgeExtension", "GVTitleBar should be implemented");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            if (TextUtils.equals(str, "disable")) {
                gVTitleBar.enableBackButton(false);
            } else if (TextUtils.equals(str, "enable")) {
                gVTitleBar.enableBackButton(true);
            } else if (TextUtils.equals(str, "hide")) {
                gVTitleBar.showBackButton(false);
            } else if (TextUtils.equals(str, "show")) {
                gVTitleBar.showBackButton(true);
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void setCloseButton(@BindingApiContext(required = true) ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingParam(name = {"action"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        if (page == null || page.getPageContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(4, "cannot operate TitleBar in EmbedView!"));
        } else {
            TitleBar titleBar = page.getPageContext().getTitleBar();
            GVTitleBar gVTitleBar = null;
            if (titleBar instanceof GVTitleBar) {
                gVTitleBar = (GVTitleBar) titleBar;
            }
            if (gVTitleBar == null) {
                GriverLogger.w("TitleBarBridgeExtension", "GVTitleBar should be implemented");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            if (TextUtils.equals(str, "disable")) {
                gVTitleBar.enableCloseButton(false);
            } else if (TextUtils.equals(str, "enable")) {
                gVTitleBar.enableCloseButton(true);
            } else if (TextUtils.equals(str, "hide")) {
                gVTitleBar.showCloseButton(false);
            } else if (TextUtils.equals(str, "show")) {
                gVTitleBar.showCloseButton(true);
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void setToolbarMenu(@BindingParam(required = true, value = {"menus"}) JSONArray jSONArray, @BindingParam({"override"}) boolean z, @BindingParam({"reset"}) boolean z2, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        if (page != null && page.isUseForEmbed()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
        TitleBar a2 = a(page);
        GVTitleBar gVTitleBar = null;
        if (a2 instanceof GVTitleBar) {
            gVTitleBar = (GVTitleBar) a2;
        }
        if (gVTitleBar == null) {
            GriverLogger.w("TitleBarBridgeExtension", "GVTitleBar should be implemented");
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        gVTitleBar.setToolbarMenu(jSONArray, z, z2);
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    private TitleBar a(Page page) {
        if (page == null || page.getPageContext() == null) {
            return null;
        }
        return page.getPageContext().getTitleBar();
    }
}
