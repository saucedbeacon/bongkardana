package com.alibaba.ariver.remotedebug.jsapi;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.core.RVRemoteDebugProxy;
import com.alibaba.ariver.remotedebug.core.a;
import com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSONObject;

public class RemoteDebugBridgeExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public void tyroRequest(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback final BridgeCallback bridgeCallback) {
        if (page == null) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "page is null");
            return;
        }
        String string = JSONUtils.getString(jSONObject, "url");
        if (TextUtils.isEmpty(string)) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "tyroRequest url is empty.");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else if (page.getApp() == null) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "tyroRequest app is null.");
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (!((RVRemoteDebugProxy) RVProxy.get(RVRemoteDebugProxy.class)).tyroRequestHasPermission(page.getApp().getAppId(), string)) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "tyroRequest url is forbidden url: ".concat(String.valueOf(string)));
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            NativeCallContext.Builder params = new NativeCallContext.Builder().node(page).name("httpRequest").params(jSONObject);
            StringBuilder sb = new StringBuilder("tyroRequest_");
            sb.append(NativeCallContext.generateUniqueId());
            NativeCallContext build = params.id(sb.toString()).render(page.getRender()).build();
            AnonymousClass1 r1 = new SendToNativeCallback() {
                public void onCallback(JSONObject jSONObject, boolean z) {
                    BridgeCallback bridgeCallback = bridgeCallback;
                    if (bridgeCallback != null) {
                        bridgeCallback.sendJSONResponse(jSONObject, z);
                    }
                }
            };
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "tyroReqeust transport to httpRequest params:".concat(String.valueOf(jSONObject)));
            apiContext.callBridgeApi(build, r1, false);
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public BridgeResponse tinyAppStandardLog(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject) {
        String checkMsgIsValid = TinyAppLogUtil.checkMsgIsValid(jSONObject);
        if (!TextUtils.isEmpty(checkMsgIsValid)) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "tinyAppStandardLog errMsg is empty.");
            return BridgeResponse.newError(103, checkMsgIsValid);
        }
        AppContext appContext = app.getAppContext();
        if (appContext == null) {
            RVLogger.d("AriverAPI:RemoteDebugBridgeExtension", "appContext is null.");
            return BridgeResponse.UNKNOWN_ERROR;
        }
        RemoteDebugUtils.sendMessageToRemoteDebugOrVConsole(page, a.STANDARD_LOG, TinyAppLogUtil.buildStandardLogInfo((Activity) appContext.getContext(), page, jSONObject));
        return BridgeResponse.SUCCESS;
    }
}
