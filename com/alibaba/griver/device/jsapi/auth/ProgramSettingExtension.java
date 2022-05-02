package com.alibaba.griver.device.jsapi.auth;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.auth.GriverOpenAuthExtension;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.utils.APIContextUtils;
import com.alibaba.griver.device.proxy.GriverOpenSettingExtension;
import java.util.HashMap;
import java.util.Map;

public class ProgramSettingExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "miniservice".equals(BundleUtils.getString(bundle, "tinySource"));
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getSetting(@BindingParam({"platform"}) String str, @BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        String str2;
        final String userId = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId();
        RVLogger.d("ProgramSettingExtension", "[getSetting] enter.");
        if (TextUtils.isEmpty(userId)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            RVLogger.d("ProgramSettingExtension", "[getSetting] userId is null");
            return;
        }
        if (a(app.getStartParams())) {
            str2 = BundleUtils.getString(app.getStartParams(), RVConstants.EXTRA_PARENT_APP_ID);
        } else {
            str2 = BundleUtils.getString(app.getStartParams(), "appId");
        }
        final String str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            RVLogger.d("ProgramSettingExtension", "[getSetting] appId is null");
            return;
        }
        StringBuilder sb = new StringBuilder("[getSetting] userId = ");
        sb.append(userId);
        sb.append(", appId = ");
        sb.append(str3);
        RVLogger.d("ProgramSettingExtension", sb.toString());
        final App app2 = app;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        ExecutorUtils.runNotOnMain(ExecutorType.IO, new Runnable() {
            public void run() {
                HashMap hashMap = new HashMap();
                Map access$000 = ProgramSettingExtension.this.a(userId, str3, app2.getActivePage());
                if (access$000 != null && access$000.size() > 0) {
                    hashMap.putAll(access$000);
                }
                Map<String, Boolean> openAuthStatus = ((GriverOpenAuthExtension) RVProxy.get(GriverOpenAuthExtension.class)).getOpenAuthStatus(str3, APIContextUtils.createApiContext(app2.getActivePage()));
                if (openAuthStatus != null && openAuthStatus.size() > 0) {
                    hashMap.putAll(openAuthStatus);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("authSetting", (Object) JSONObject.parseObject(JSON.toJSONString(hashMap)));
                StringBuilder sb = new StringBuilder("[getSetting] result= ");
                sb.append(jSONObject.toString());
                RVLogger.d("ProgramSettingExtension", sb.toString());
                bridgeCallback2.sendJSONResponse(jSONObject);
            }
        });
    }

    /* access modifiers changed from: private */
    public Map<String, Boolean> a(String str, String str2, Page page) {
        HashMap hashMap = new HashMap();
        AuthenticationProxy authenticationProxy = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
        if (authenticationProxy != null) {
            return authenticationProxy.getAllPermissions(str, str2, (AppModel) null, page);
        }
        RVLogger.d("ProgramSettingExtension", "getSetting, service is null");
        return hashMap;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void openSetting(@BindingParam({"platform"}) final String str, @BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        if (app != null) {
            ((GriverOpenSettingExtension) RVProxy.get(GriverOpenSettingExtension.class)).showOpenSettingView(app.getActivePage().getPageContext().getActivity(), a(GriverAccount.getUserId(), app.getAppId(), app.getActivePage()), (AppModel) app.getData(AppModel.class), new GriverOpenSettingExtension.SettingChangeCallback() {
                public void onSettingChange(Map<String, Boolean> map) {
                    ProgramSettingExtension.this.getSetting(str, app, bridgeCallback);
                }
            });
        } else if (bridgeCallback != null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }
}
