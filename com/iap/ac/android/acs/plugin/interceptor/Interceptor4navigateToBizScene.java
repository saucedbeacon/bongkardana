package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONArray;
import org.json.JSONObject;

public class Interceptor4navigateToBizScene extends BaseInterceptor {
    private static final String CONFIG_KEY_AC_SCENE_CODE_ALLOWED_LIST = "ac_scene_code_allowed_list";
    private static final String ERROR_CODE_NOT_ALLOWED = "4";
    private static final String ERROR_MESSAGE_NOT_ALLOWED = "Not allowed to navigate to %s";
    private static final String LOGGER_KEY_DENIED = "denied";
    private static final String LOGGER_KEY_EMPTY_CONFIG = "emptyConfig";
    private static final String LOGGER_KEY_FROM_APPID = "fromAppId";
    private static final String LOGGER_KEY_FROM_DEFAULT = "fromDefault";
    private static final String PARAM_SCENE_CODE = "sceneCode";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (!ApiDowngradeUtils.isApiDowngradeEnabled()) {
            ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, ".concat("cancel apidowngrade, for it is not enabled"));
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_NAVIGATE_TO_BIZ_SCENE, "cancel apidowngrade, for it is not enabled"));
            return;
        }
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, ".concat("jsParameters is null"));
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_NAVIGATE_TO_BIZ_SCENE, "jsParameters is null"));
            return;
        }
        ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, start, jsParam: ".concat(String.valueOf(jSONObject)));
        String optString = jSONObject.optString("sceneCode");
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, sceneCode is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_NAVIGATE_TO_BIZ_SCENE, "sceneCode is empty"));
        } else if (!isAllowedNavigateToScene(iAPConnectPluginContext.miniProgramAppID, optString)) {
            String format = String.format(ERROR_MESSAGE_NOT_ALLOWED, new Object[]{optString});
            ACLog.e("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, ".concat(String.valueOf(format)));
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_NAVIGATE_TO_BIZ_SCENE, "4", format));
        } else if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
            ACLog.e("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, ".concat("activity is null or disabled"));
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_NAVIGATE_TO_BIZ_SCENE, "activity is null or disabled"));
        } else {
            ACLog.d("IAPConnectPlugin", String.format("before BizSceneNavigateManager#navigate, sceneCode: %s, jsParameters: %s", new Object[]{optString, jSONObject}));
            BizSceneNavigateManager.getInstance().navigate(iAPConnectPluginContext, optString, new IActionHandlerCallback() {
                public void onHandleSuccess(@NonNull JSONObject jSONObject) {
                    ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, onHandleSuccess, result: ".concat(String.valueOf(jSONObject)));
                    iAPConnectPluginCallback.onResult(jSONObject);
                }

                public void onHandleFailure(@NonNull JSONObject jSONObject) {
                    ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#handle, onHandleFailure, result: ".concat(String.valueOf(jSONObject)));
                    iAPConnectPluginCallback.onResult(jSONObject);
                }
            });
        }
    }

    private boolean isAllowedNavigateToScene(@NonNull String str, @NonNull String str2) {
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY_AC_SCENE_CODE_ALLOWED_LIST, new JSONObject());
        if (jSONObject == null || jSONObject.length() == 0) {
            ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#allowNavigateToScene, ".concat("the allowed list config is not configured or is empty."));
            logAllowedType(str, str2, LOGGER_KEY_EMPTY_CONFIG, "the allowed list config is not configured or is empty.");
            return false;
        }
        StringBuilder sb = new StringBuilder("Interceptor4navigateToBizScene#allowNavigateToScene start,appId: ");
        sb.append(str);
        sb.append(",sceneCode: ");
        sb.append(str2);
        sb.append(",config: ");
        sb.append(jSONObject);
        ACLog.d("IAPConnectPlugin", sb.toString());
        if (isSceneCodeInConfig(str2, jSONObject.optJSONArray(str))) {
            ACLog.d("IAPConnectPlugin", "Interceptor4navigateToBizScene#allowNavigateToScene, permission is allowed for matched in appId: ".concat(String.valueOf(str)));
            logAllowedType(str, str2, LOGGER_KEY_FROM_APPID, jSONObject.toString());
            return true;
        }
        boolean isSceneCodeInConfig = isSceneCodeInConfig(str2, jSONObject.optJSONArray("default"));
        logAllowedType(str, str2, isSceneCodeInConfig ? LOGGER_KEY_FROM_DEFAULT : "denied", jSONObject.toString());
        return isSceneCodeInConfig;
    }

    private boolean isSceneCodeInConfig(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(jSONArray.optString(i), str)) {
                return true;
            }
        }
        return false;
    }

    private void logAllowedType(String str, String str2, String str3, String str4) {
        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_CODE_ALLOWED_LIST_CHECK, str, str2).addParams(ApiDowngradeLogger.EXT_KEY_ALLOWED_TYPE, str3).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, str4).event();
    }
}
