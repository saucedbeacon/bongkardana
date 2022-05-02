package com.alibaba.griver.core.jsapi.app;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.point.view.TitleBarTransparentPoint;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.app.api.ui.ViewUtils;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ParamRequired;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.titlebar.GVTitleBar;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public class TitleBarBridgeExtension implements BridgeExtension {
    private static final String TAG = "TitleBarBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getTitleAndStatusbarHeight(@BindingNode(Page.class) Page page) {
        if (page.getPageContext() == null || page.getPageContext().getTitleBar() == null || page.getPageContext().getTitleBar().getContent() == null) {
            return BridgeResponse.newError(5, "title bar status error!");
        }
        PageContext pageContext = page.getPageContext();
        TitleBar titleBar = pageContext.getTitleBar();
        JSONObject jSONObject = new JSONObject();
        float f = pageContext.getActivity().getResources().getDisplayMetrics().density;
        float height = ((float) titleBar.getContent().getHeight()) / f;
        float statusBarHeight = ((float) StatusBarUtils.getStatusBarHeight(page.getPageContext().getActivity())) / f;
        if (titleBarContainsStatusBarHeight()) {
            height -= statusBarHeight;
        }
        jSONObject.put("titleBarHeight", (Object) Float.valueOf(height));
        jSONObject.put("density", (Object) Float.valueOf(f));
        jSONObject.put("statusBarHeight", (Object) Float.valueOf(statusBarHeight));
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getTitleAndStatusBarHeight(@BindingNode(Page.class) Page page) {
        return getTitleAndStatusbarHeight(page);
    }

    /* access modifiers changed from: protected */
    public boolean titleBarContainsStatusBarHeight() {
        return StatusBarUtils.isSupport();
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setTitle(@BindingParam({"title"}) String str, @BindingParam({"subtitle"}) String str2, @BindingParam({"image"}) String str3, @BindingParam({"contentDesc"}) String str4, @BindingParam(booleanDefault = true, value = {"fromJS"}) boolean z, @BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.setTitle(str, str2, str3, str4, z);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setTitleColor(@BindingParam(intDefault = -16777216, value = {"color"}) int i, @BindingParam({"reset"}) boolean z, @BindingParam({"resetTransparent"}) boolean z2, @BindingNode(Page.class) Page page) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-983990386, oncanceled);
            onCancelLoad.getMin(-983990386, oncanceled);
        }
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.setTitleColor(i, z, z2);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setBarBottomLineColor(@BindingParam(intDefault = -16777216, value = {"color"}) int i, @BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (!(titleBar == null || titleBar.getDivider() == null)) {
            int i2 = i | -16777216;
            RVLogger.d(TAG, "setBarBottomLineColor color is ".concat(String.valueOf(i2)));
            titleBar.getDivider().setVisibility(0);
            titleBar.getDivider().setBackgroundColor(i2);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setTransparentTitle(@BindingParam({"transparentTitle"}) String str, @BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        if (page != null) {
            Bundle startParams = page.getStartParams();
            String string = BundleUtils.getString(startParams, "transparentTitle");
            StringBuilder sb = new StringBuilder("setTransparentTitle originType ");
            sb.append(string);
            sb.append(", type: ");
            sb.append(str);
            RVLogger.d(TAG, sb.toString());
            startParams.putString("transparentTitle", str);
            PageContext pageContext = page.getPageContext();
            if (pageContext != null) {
                pageContext.applyTransparentTitle(ViewUtils.isTransparentTitle(page.getStartParams(), str));
            }
            TitleBar titleBar = getTitleBar(page);
            if (titleBar != null) {
                titleBar.setTransparentTitle(str);
            }
            ExtensionPoint.as(TitleBarTransparentPoint.class).node(page).create().onTrasparentTitle(str);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getTitleColor(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            return new BridgeResponse.NamedValue("color", Long.valueOf(((long) titleBar.getTitleColor()) & 4294967295L));
        }
        return BridgeResponse.UNKNOWN_ERROR;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse showTitleLoading(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showTitleLoading(true);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideTitleLoading(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showTitleLoading(false);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse showOptionMenu(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showOptionMenu(true);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideOptionMenu(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showOptionMenu(false);
        }
        return BridgeResponse.SUCCESS;
    }

    @ActionFilter
    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ParamRequired
    public BridgeResponse setOptionMenu(@BindingParam({"title"}) String str, @BindingParam({"icon"}) String str2, @BindingParam({"redDot"}) String str3, @BindingParam({"reset"}) boolean z, @BindingParam({"color"}) String str4, @BindingParam({"override"}) boolean z2, @BindingParam({"menus"}) JSONArray jSONArray, @BindingParam({"preventDefault"}) boolean z3, @BindingParam({"icontype"}) String str5, @BindingParam({"contentDesc"}) String str6, @BindingParam({"bizType"}) String str7, @BindingNode(Page.class) Page page) {
        Page page2 = page;
        if (page2 != null && page.isUseForEmbed()) {
            return BridgeResponse.SUCCESS;
        }
        TitleBar titleBar = getTitleBar(page2);
        GVTitleBar gVTitleBar = null;
        if (titleBar instanceof GVTitleBar) {
            gVTitleBar = (GVTitleBar) titleBar;
        }
        GVTitleBar gVTitleBar2 = gVTitleBar;
        if (gVTitleBar2 == null) {
            GriverLogger.w(TAG, "GVTitleBar should be implemented");
            return BridgeResponse.UNKNOWN_ERROR;
        }
        gVTitleBar2.setOptionMenu(str, str2, str3, z, str4, z2, jSONArray, z3, str5, str6, str7);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse showBackButton(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showBackButton(true);
        }
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideBackButton(@BindingNode(Page.class) Page page) {
        if (page != null && (page.isUseForEmbed() || AppInfoUtils.isEmbeddedApp(page))) {
            return new BridgeResponse.Error(4, "cannot operate TitleBar in EmbedView!");
        }
        TitleBar titleBar = getTitleBar(page);
        if (titleBar != null) {
            titleBar.showBackButton(false);
        }
        return BridgeResponse.SUCCESS;
    }

    private TitleBar getTitleBar(Page page) {
        if (page == null || page.getPageContext() == null) {
            return null;
        }
        return page.getPageContext().getTitleBar();
    }
}
