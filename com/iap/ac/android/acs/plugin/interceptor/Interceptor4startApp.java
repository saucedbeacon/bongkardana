package com.iap.ac.android.acs.plugin.interceptor;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.amcs.StartAppConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class Interceptor4startApp extends BaseInterceptor {
    private static final String ERROR_CODE = "11";
    private static final String ERROR_MESSAGE = "Start app fail";
    private static final String PARAM_APPID = "appId";
    private static final String PARAM_SCHEME = "scheme";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4startApp#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("startApp", "jsParameters is null"));
            return;
        }
        String optString = jSONObject.optString("scheme");
        if (!TextUtils.isEmpty(optString)) {
            ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, start app, scheme: ".concat(String.valueOf(optString)));
            boolean openScheme = SPIManager.getInstance().openScheme(Uri.parse(optString), AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext));
            ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, start app result: ".concat(String.valueOf(openScheme)));
            if (openScheme) {
                iAPConnectPluginCallback.onResult(CallbackUtil.getSuccess("startApp"));
            } else {
                iAPConnectPluginCallback.onResult(CallbackUtil.getError("startApp", "11", ERROR_MESSAGE));
            }
        } else if (!ApiDowngradeUtils.isApiDowngradeEnabled()) {
            ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, ".concat("cancel apidowngrade, for it is not enabled"));
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("startApp", "cancel apidowngrade, for it is not enabled"));
        } else if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
            ACLog.e("IAPConnectPlugin", "Interceptor4startApp#handle, activity is null or disabled");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("startApp", "activity is null or disabled"));
        } else {
            String optString2 = jSONObject.optString("appId");
            if (TextUtils.isEmpty(optString2)) {
                StringBuilder sb = new StringBuilder("Interceptor4navigateToBizScene#handle, the dist appId is null.  miniProgramName: ");
                sb.append(iAPConnectPluginContext.miniProgramName);
                sb.append("pageUrl: ");
                sb.append(iAPConnectPluginContext.miniProgramPageURL);
                String obj = sb.toString();
                ACLog.e("IAPConnectPlugin", obj);
                ApiDowngradeLogger.logException(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_APPID_IS_NULL, obj);
                iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("startApp", obj));
                return;
            }
            JSONObject startAppMap = StartAppConfigManager.getInstance().getStartAppMap();
            ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, before action executor, jsonStartAppMap: ".concat(String.valueOf(startAppMap)));
            if (startAppMap == null) {
                ACLog.e("IAPConnectPlugin", "Interceptor4startApp#handle, before action executor, ".concat("jsonStartAppMap in amcs is null"));
                iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("startApp", "jsonStartAppMap in amcs is null"));
                return;
            }
            ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, startAppMap.optJSONObject(optString2), new IActionHandlerCallback() {
                public void onHandleSuccess(@NonNull JSONObject jSONObject) {
                    ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, onHandleSuccess, result: ".concat(String.valueOf(jSONObject)));
                    iAPConnectPluginCallback.onResult(jSONObject);
                }

                public void onHandleFailure(@NonNull JSONObject jSONObject) {
                    ACLog.d("IAPConnectPlugin", "Interceptor4startApp#handle, onHandleFailure, result: ".concat(String.valueOf(jSONObject)));
                    iAPConnectPluginCallback.onResult(jSONObject);
                }
            });
        }
    }
}
