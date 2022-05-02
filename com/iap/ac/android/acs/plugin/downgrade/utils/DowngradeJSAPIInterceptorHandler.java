package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.biz.acs.AcBizMiniProgramHelper;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class DowngradeJSAPIInterceptorHandler {
    private static final String TAG = ApiDowngradeUtils.logTag("DowngradeJSAPIInterceptorHandler");

    public static boolean handleJSAPI(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @Nullable String str, @Nullable JSONObject jSONObject, @NonNull String str2, @NonNull String str3, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject readJSONFromAssets;
        JSONObject optJSONObject;
        ACLog.d(TAG, String.format("handleJSAPI start, downgradeType = %s, jsapi = %s, appId = %s, params = %s", new Object[]{str, str2, iAPConnectPluginContext.miniProgramAppID, iAPConnectPluginContext.jsParameters}));
        ACLog.d(TAG, "get config from server: ".concat(String.valueOf(jSONObject)));
        if (!ApiDowngradeUtils.isApiDowngradeEnabled()) {
            ACLog.d(TAG, "handle() handle cancelled, for apidowngrade is not enabled");
            return false;
        } else if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
            ACLog.e(TAG, "handle error, activity is null or disabled");
            return false;
        } else {
            String str4 = iAPConnectPluginContext.miniProgramAppID;
            if (TextUtils.isEmpty(str4)) {
                ACLog.e(TAG, "handle error, appId is empty ,it may be a H5 page.");
                return false;
            } else if (!AcBizMiniProgramHelper.isAcBizMiniProgram(str4, iAPConnectPluginContext.sourceSite)) {
                ACLog.e(TAG, "handle cancelled for the appId isn't represents a acMiniProgram");
                return false;
            } else if (TextUtils.isEmpty(str2)) {
                ACLog.e(TAG, "handle error, jsapiName is empty");
                ApiDowngradeLogger.newExceptionLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_INVALID, str4).addParams("errorMessage", "handle error, jsapiName is empty").addParams("apiName", str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).event();
                return false;
            } else {
                JSONObject jSONObject2 = null;
                if (jSONObject != null) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
                    if (optJSONObject2 != null) {
                        jSONObject2 = optJSONObject2.optJSONObject(str2);
                    }
                    if (jSONObject2 == null && (optJSONObject = jSONObject.optJSONObject("default")) != null) {
                        jSONObject2 = optJSONObject.optJSONObject(str2);
                    }
                }
                if (jSONObject2 == null && (readJSONFromAssets = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), str3)) != null) {
                    jSONObject2 = readJSONFromAssets.optJSONObject(str2);
                }
                if (jSONObject2 == null) {
                    return false;
                }
                String optString = jSONObject2.optString("actionType");
                ApiDowngradeLogger.newBehaviorLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED, str4).addParams("actionType", optString).addParams("apiName", str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).event();
                if (!ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject2, new IActionHandlerCallback() {
                    public final void onHandleSuccess(@NonNull JSONObject jSONObject) {
                        iAPConnectPluginCallback.onResult(jSONObject);
                    }

                    public final void onHandleFailure(@NonNull JSONObject jSONObject) {
                        iAPConnectPluginCallback.onResult(jSONObject);
                    }
                })) {
                    ApiDowngradeLogger.newBehaviorLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED_FAIL, str4).addParams("actionType", optString).addParams("apiName", str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).addParams("errorMessage", "ActionExecutor#handleAction returns false.").event();
                }
                return true;
            }
        }
    }
}
