package com.iap.ac.android.acs.plugin.core;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigInterceptor {
    private static final String CONFIG_INTERCEPT = "INTERCEPT";
    private static final String CONFIG_INTERCEPT_APP_ID = "appId";
    private static final String CONFIG_INTERCEPT_RESULT = "result";
    private static final String CONFIG_INTERCEPT_STRATEGY = "strategy";
    private static final String CONFIG_INTERCEPT_URL = "url";
    private static final String CONFIG_KEY = "acs_jsapi_intercept_strategy";
    private static final String CONFIG_NOT_INTERCEPT = "NOT_INTERCEPT";
    private static final String TAG = "IAPConnectPlugin";

    public static Boolean handle(@NonNull String str, @NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY, new JSONObject());
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            ACLog.d("IAPConnectPlugin", "ConfigInterceptor#handle, config interceptor strategy json is null for: ".concat(String.valueOf(str)));
            MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_NONE);
            return null;
        }
        try {
            String optString = optJSONObject.optString(CONFIG_INTERCEPT_STRATEGY);
            if (CONFIG_NOT_INTERCEPT.equals(optString)) {
                ACLog.d("IAPConnectPlugin", "ConfigInterceptor#handle, NOT_INTERCEPT ".concat(String.valueOf(str)));
                MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_NOT_INTERCEPT);
                return Boolean.FALSE;
            }
            if (CONFIG_INTERCEPT.equals(optString)) {
                handleIntercept(optJSONObject, str, iAPConnectPluginContext, iAPConnectPluginCallback);
                return Boolean.TRUE;
            }
            MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_NONE);
            return null;
        } catch (JSONException unused) {
            ACLog.e("IAPConnectPlugin", "ConfigInterceptor#handle error, config interceptor json: ".concat(String.valueOf(jSONObject)));
        }
    }

    private static void handleIntercept(JSONObject jSONObject, String str, IAPConnectPluginContext iAPConnectPluginContext, IAPConnectPluginCallback iAPConnectPluginCallback) throws JSONException {
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("result");
        StringBuilder sb = new StringBuilder("ConfigInterceptor#handleIntercept, INTERCEPT ");
        sb.append(str);
        sb.append(", appId: ");
        sb.append(optString);
        sb.append(", url: ");
        sb.append(optString2);
        sb.append(", result: ");
        sb.append(optString3);
        ACLog.d("IAPConnectPlugin", sb.toString());
        if (!TextUtils.isEmpty(optString)) {
            iAPConnectPluginCallback.onResult(new JSONObject());
            ContainerParams createForMniProgram = ContainerParams.createForMniProgram(optString);
            createForMniProgram.containerBundle = new Bundle();
            createForMniProgram.containerBundle.putString("result", optString3);
            WebContainer.getInstance("ac_biz").startContainer(iAPConnectPluginContext.getContext(), createForMniProgram);
            MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_INTERCEPT_BY_APP_ID);
        } else if (!TextUtils.isEmpty(optString2)) {
            iAPConnectPluginCallback.onResult(new JSONObject());
            WebContainer.getInstance("ac_biz").startContainer(iAPConnectPluginContext.getContext(), optString2);
            MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_INTERCEPT_BY_URL);
        } else if (!TextUtils.isEmpty(optString3)) {
            iAPConnectPluginCallback.onResult(new JSONObject(optString3));
            MonitorUtil.monitorInterceptConfig(str, MonitorUtil.CONFIG_INTERCEPT_BY_RESULT);
        } else {
            iAPConnectPluginCallback.onResult(new JSONObject());
        }
    }
}
