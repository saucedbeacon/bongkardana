package com.alibaba.griver.core.jsapi.ui;

import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.ArrayList;
import java.util.List;
import o.restorePresenterStates;

public class AppearanceBridgeExtension extends SimpleBridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9072a;

    static {
        ArrayList arrayList = new ArrayList();
        f9072a = arrayList;
        arrayList.add(ThemeUtils.COLOR_SCHEME_LIGHT);
        f9072a.add("dark");
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void setBackgroundColor(@BindingNode(Page.class) Page page, @BindingParam(name = {"backgroundColor"}) String str, @BindingCallback final BridgeCallback bridgeCallback) {
        final PageContainer pageContainer = page.getPageContext().getPageContainer();
        if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        try {
            final int parseColor = Color.parseColor(str);
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    ViewGroup view = pageContainer.getView();
                    if (view == null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                        return;
                    }
                    view.setBackgroundColor(parseColor);
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                }
            });
        } catch (Exception e) {
            GriverLogger.e("AppearanceBridgeExtension", "parse color error", e);
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse setBackgroundTextStyle(@BindingNode(Page.class) Page page, @BindingParam(name = {"textStyle"}) String str) {
        if (!f9072a.contains(str)) {
            return BridgeResponse.INVALID_PARAM;
        }
        return BridgeResponse.UNKNOWN_ERROR;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideShareMenu() {
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse hideOptionMenuItem(@BindingApiContext ApiContext apiContext, @BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject) {
        if (jSONObject == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (TextUtils.equals(jSONObject.getString("name"), "backToHome")) {
            Intent intent = new Intent("hide_title_bar_back_to_home");
            intent.putExtra("appId", apiContext.getAppId());
            restorePresenterStates.length(GriverEnv.getApplicationContext()).setMin(intent);
        }
        return BridgeResponse.SUCCESS;
    }
}
