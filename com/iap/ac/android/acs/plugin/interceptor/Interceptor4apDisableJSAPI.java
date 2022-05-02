package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.utils.DisableJSAPIManager;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashSet;
import org.json.JSONArray;

public class Interceptor4apDisableJSAPI extends BaseInterceptor {
    private static final String PARAMS_API_ARRAY = "apiArray";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (iAPConnectPluginContext.jsParameters == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4apDisableJSAPI#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_AP_DISABLE_JSAPI, "parameter is null"));
            return;
        }
        JSONArray optJSONArray = iAPConnectPluginContext.jsParameters.optJSONArray(PARAMS_API_ARRAY);
        if (optJSONArray == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4apDisableJSAPI#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_AP_DISABLE_JSAPI, "parameter is null"));
            return;
        }
        String str = iAPConnectPluginContext.miniProgramAppID;
        if (TextUtils.isEmpty(str)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4apDisableJSAPI#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_AP_DISABLE_JSAPI, "appId is null"));
            return;
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < optJSONArray.length()) {
            try {
                Object obj = optJSONArray.get(i);
                if (obj instanceof String) {
                    hashSet.add((String) obj);
                }
                i++;
            } catch (Throwable th) {
                ACLog.e("IAPConnectPlugin", "Interceptor4apDisableJSAPI#handle, jsParameters is error".concat(String.valueOf(th)));
                iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_AP_DISABLE_JSAPI, "parameter is error"));
                return;
            }
        }
        if (hashSet.contains(Constants.JS_API_AP_DISABLE_JSAPI)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4apDisableJSAPI#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_AP_DISABLE_JSAPI, "parameter is error"));
            return;
        }
        DisableJSAPIManager.getInstance().putDisableJSAPI(str, hashSet);
        MonitorUtil.monitorDisabledJSAPI(str, hashSet);
        iAPConnectPluginCallback.onResult(CallbackUtil.getSuccess(Constants.JS_API_AP_DISABLE_JSAPI));
    }
}
