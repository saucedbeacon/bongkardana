package com.alibaba.griver.core.jsapi.app;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
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
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.update.GriverAsyncUpdateManagerImpl;

@Keep
public class MiniProgramBridgeExtension implements BridgeExtension {
    private static final int CODE_EXT_CONFIG_DISABLED = 21;
    private static final int CODE_EXT_CONFIG_NULL = 20;
    private static final String TAG = "MiniProgramBridgeExtension";

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
    public BridgeResponse navigateToMiniProgram(@BindingRequest JSONObject jSONObject, @BindingParam({"appId"}) String str, @BindingParam({"path"}) String str2, @BindingNode(App.class) App app, @BindingApiContext ApiContext apiContext) {
        if (TextUtils.isEmpty(str) || app == null || apiContext == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        Bundle bundle = new Bundle();
        if (!(jSONObject == null || jSONObject.get("param") == null)) {
            bundle.putAll(JSONUtils.toBundle(jSONObject.getJSONObject("param")));
        }
        bundle.putString("page", str2);
        bundle.putString("referAppId", apiContext.getAppId());
        bundle.putLong("referToken", app.getStartToken());
        Griver.openApp(apiContext.getActivity(), str, bundle);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void navigateBackMiniProgram(@BindingRequest JSONObject jSONObject, @BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        Bundle bundle;
        if (app == null || apiContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (jSONObject == null || jSONObject.isEmpty() || jSONObject.get("param") == null) {
            bundle = new Bundle();
        } else {
            bundle = JSONUtils.toBundle(jSONObject.getJSONObject("param"));
        }
        App appByAppId = ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).getAppByAppId(app.getStartParams().getString("referAppId"));
        if (appByAppId != null) {
            appByAppId.restart(bundle, new Bundle());
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            app.exit();
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse getRunScene(@BindingNode(App.class) App app) {
        if (app == null || app.getAppContext() == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        Bundle startParams = app.getStartParams();
        AppInfoScene extractScene = AppInfoScene.extractScene(startParams);
        String str = (AppInfoScene.isDevSource(startParams) || extractScene.ordinal() == AppInfoScene.DEBUG.ordinal() || extractScene.ordinal() == AppInfoScene.REVIEW.ordinal() || extractScene.ordinal() == AppInfoScene.TRIAL.ordinal() || extractScene.ordinal() == AppInfoScene.INSPECT.ordinal() || extractScene.ordinal() == AppInfoScene.YUNTEST.ordinal()) ? "develop" : "release";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("envVersion", (Object) str);
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public BridgeResponse getExtConfig(@BindingNode(App.class) App app) {
        AppModel appModel = (AppModel) app.getData(AppModel.class);
        if (appModel == null || appModel.getAppInfoModel() == null) {
            return new BridgeResponse.Error(20, "appModel is null");
        }
        TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
        if (templateConfig == null || !templateConfig.isTemplateValid()) {
            return new BridgeResponse.Error(20, "templateConfigModel is null");
        }
        if (!templateConfig.getExtModel().isExtEnable()) {
            RVLogger.d(TAG, "getExtConfig...extEnable false");
            return new BridgeResponse.Error(21, "templateConfig disabled");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) templateConfig.getExtModel().getExtObj());
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse registerUpdateManager(@BindingNode(App.class) App app) {
        GriverLogger.d(TAG, "updateManager registerUpdateManager");
        GriverAsyncUpdateManagerImpl.register(app.getAppId());
        GriverAsyncUpdateManagerImpl.sendCacheMessageToRender(app);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse applyUpdate(@BindingNode(App.class) App app) {
        GriverLogger.d(TAG, "updateManager applyUpdate");
        if (!(app.getActivePage() == null || app.getActivePage().getPageContext() == null || app.getActivePage().getPageContext().getActivity() == null)) {
            GriverLogger.d(TAG, "exit app by applyUpdate");
            app.getActivePage().getPageContext().getActivity().finish();
        }
        if (ProcessUtils.isMainProcess()) {
            Griver.openApp(GriverEnv.getApplicationContext(), app.getAppId(), app.getStartParams());
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("appId", app.getAppId());
            bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, app.getNodeId());
            bundle.putBundle("startParams", app.getStartParams());
            IpcClientUtils.sendMsgToServerByApp(app, 9001, bundle);
        }
        return BridgeResponse.SUCCESS;
    }
}
