package com.iap.ac.android.acs.plugin.interceptor;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4isInstalledApp extends BaseInterceptor {
    private static final String PARAM_PACKAGE_NAME = "packagename";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4isInstalledApp#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_IS_INSTALLED_APP, "parameter is null"));
            return;
        }
        String optString = jSONObject.optString(PARAM_PACKAGE_NAME);
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4isInstalledApp#handle, packagename is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_IS_INSTALLED_APP, "packagename is empty"));
            return;
        }
        checkAppInstalled(optString, iAPConnectPluginContext.getContext(), iAPConnectPluginCallback);
    }

    private void checkAppInstalled(String str, Context context, IAPConnectPluginCallback iAPConnectPluginCallback) {
        ACLog.d("IAPConnectPlugin", "Interceptor4isInstalledApp#checkAppInstalled, start to check whether app is installed, packageName: ".concat(String.valueOf(str)));
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        boolean z = false;
        for (int i = 0; i < installedPackages.size(); i++) {
            if (str.equals(installedPackages.get(i).packageName)) {
                z = true;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("installed", z);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4isInstalledApp#checkAppInstalled, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_IS_INSTALLED_APP, e);
        }
    }
}
