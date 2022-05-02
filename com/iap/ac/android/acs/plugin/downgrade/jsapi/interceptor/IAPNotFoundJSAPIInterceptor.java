package com.iap.ac.android.acs.plugin.downgrade.jsapi.interceptor;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.amcs.NotFoundJSAPIConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.DowngradeJSAPIInterceptorHandler;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.container.interceptor.BridgeCallback;
import com.iap.ac.android.common.container.interceptor.NotFoundJSAPIInterceptor;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class IAPNotFoundJSAPIInterceptor implements NotFoundJSAPIInterceptor {
    private static final String DOWNGRADE_TYPE_NOT_FOUND_JSAPI = "notFoundJSAPI";
    private static final String FILENAME_NOT_FOUND_JSAPI_MAP;
    private static final String TAG = ApiDowngradeUtils.logTag("IAPNotFoundJSAPIInterceptor");

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiDowngradeUtils.dirInAssets());
        sb.append("acs_not_found_jsapi_downgrade_config.json");
        FILENAME_NOT_FOUND_JSAPI_MAP = sb.toString();
    }

    public boolean handleNotFoundJSAPI(@NonNull NotFoundJSAPIInterceptor.NotFoundJSAPIContext notFoundJSAPIContext, @NonNull BridgeCallback bridgeCallback) {
        ConfigCenter.INSTANCE.refreshConfigs();
        JSONObject notFoundJSAPIConfig = NotFoundJSAPIConfigManager.getInstance().getNotFoundJSAPIConfig();
        ACLog.d(TAG, "handleNotFoundJSAPI() get the config from server, json: ".concat(String.valueOf(notFoundJSAPIConfig)));
        return DowngradeJSAPIInterceptorHandler.handleJSAPI(convertContext(notFoundJSAPIContext), DOWNGRADE_TYPE_NOT_FOUND_JSAPI, notFoundJSAPIConfig, notFoundJSAPIContext.jsapiName, FILENAME_NOT_FOUND_JSAPI_MAP, convertCallback(bridgeCallback));
    }

    private IAPConnectPluginContext convertContext(NotFoundJSAPIInterceptor.NotFoundJSAPIContext notFoundJSAPIContext) {
        IAPConnectPluginContext iAPConnectPluginContext = new IAPConnectPluginContext(notFoundJSAPIContext.context);
        iAPConnectPluginContext.jsParameters = notFoundJSAPIContext.jsParameters;
        iAPConnectPluginContext.miniProgramAppID = notFoundJSAPIContext.miniProgramAppID;
        iAPConnectPluginContext.miniProgramName = notFoundJSAPIContext.miniProgramName;
        iAPConnectPluginContext.miniProgramPageURL = notFoundJSAPIContext.miniProgramPageURL;
        iAPConnectPluginContext.acParams = notFoundJSAPIContext.acParams;
        iAPConnectPluginContext.isMiniProgram = notFoundJSAPIContext.isMiniProgram;
        iAPConnectPluginContext.sourceSite = notFoundJSAPIContext.sourceSite;
        iAPConnectPluginContext.setActivity(notFoundJSAPIContext.activity);
        return iAPConnectPluginContext;
    }

    private IAPConnectPluginCallback convertCallback(final BridgeCallback bridgeCallback) {
        return new IAPConnectPluginCallback() {
            public void onResult(JSONObject jSONObject) {
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        };
    }
}
