package com.alibaba.ariver.console.jsapi;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.console.DebugConsolePoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONObject;

@Keep
public class DebugPanelBridgeExtension implements BridgeExtension {
    private DebugConsolePoint mConsolePoint;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse shouldShowConsoleBtn(@BindingNode(App.class) App app, @BindingParam({"showBtn"}) boolean z) {
        if (!app.isTinyApp()) {
            return BridgeResponse.newError(1, "only tiny app can show console view");
        }
        DebugConsolePoint point = getPoint(app);
        if (point == null) {
            return BridgeResponse.NATIVE_NODE_NULL;
        }
        point.showToggleButton(z);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse toggleDebugPanel(@BindingNode(App.class) App app) {
        long j = BundleUtils.getLong(app.getStartParams(), RDConstant.KEY_CONSOLE_HOST_APP_START_TOKEN, 0);
        if (j < 0) {
            return BridgeResponse.INVALID_PARAM;
        }
        App findAppByToken = ((AppManager) RVProxy.get(AppManager.class)).findAppByToken(j);
        if (findAppByToken == null) {
            return BridgeResponse.INVALID_PARAM;
        }
        DebugConsolePoint point = getPoint(findAppByToken);
        if (point == null) {
            return BridgeResponse.NATIVE_NODE_NULL;
        }
        point.toggleConsoleView();
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse showToggleButton(@BindingNode(App.class) App app) {
        if (!app.isTinyApp()) {
            return BridgeResponse.newError(1, "only tiny app can show console view");
        }
        DebugConsolePoint point = getPoint(app);
        if (point == null) {
            return BridgeResponse.NATIVE_NODE_NULL;
        }
        point.showToggleButton(true);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse tinyDebugConsole(@BindingNode(App.class) App app, @BindingRequest JSONObject jSONObject) {
        if (!app.isTinyApp()) {
            return BridgeResponse.newError(1, "only tiny app can show console view");
        }
        DebugConsolePoint point = getPoint(app);
        if (point == null) {
            return BridgeResponse.NATIVE_NODE_NULL;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        point.sendMsgToConsoleView(jSONObject2);
        return BridgeResponse.SUCCESS;
    }

    @Nullable
    private DebugConsolePoint getPoint(App app) {
        if (app == null) {
            return null;
        }
        if (this.mConsolePoint == null) {
            this.mConsolePoint = ExtensionPoint.as(DebugConsolePoint.class).node(app).create();
        }
        return this.mConsolePoint;
    }
}
