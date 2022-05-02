package com.iap.ac.android.acs.plugin.downgrade.jsapi.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.iap.ac.android.acs.plugin.core.ConfigInterceptor;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.amcs.ImplementedJSAPIConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.DisableJSAPIManager;
import com.iap.ac.android.acs.plugin.downgrade.utils.DowngradeJSAPIInterceptorHandler;
import com.iap.ac.android.acs.plugin.interceptor.BaseInterceptor;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.acs.AcBizMiniProgramHelper;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.container.interceptor.BridgeCallback;
import com.iap.ac.android.common.container.interceptor.BridgeInterceptor;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IAPImplementedJSAPIInterceptor implements BridgeInterceptor {
    private static final String DOWNGRADE_TYPE_IMPLEMENTED_JSAPI = "implementedJSAPI";
    private static final String FILENAME_IMPLEMENTED_JSAPI_DOWNGRADE_MAP;
    private static final String JS_API_PARAM_KEY_METHOD = "method";
    private static final String JS_API_PARAM_KEY_NAME = "name";
    private static final String JS_API_PARAM_KEY_REQUEST_DATA = "requestData";
    private static final String JS_API_PARAM_VALUE_DEDUCT = "deduct";
    /* access modifiers changed from: private */
    public static final String TAG = ApiDowngradeUtils.logTag("ConfigInterceptor");
    /* access modifiers changed from: private */
    public long startTime;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiDowngradeUtils.dirInAssets());
        sb.append("acs_implemented_jsapi_intercept_config.json");
        FILENAME_IMPLEMENTED_JSAPI_DOWNGRADE_MAP = sb.toString();
    }

    public boolean willHandleJSAPI(String str, BridgeInterceptor.InterceptContext interceptContext, BridgeCallback bridgeCallback) {
        if (!checkParam(str, interceptContext)) {
            ACLog.e(TAG, "IAPConnectInterceptor#willHandleJSAPI, check param, false");
            return false;
        }
        ConfigCenter.INSTANCE.refreshConfigs();
        IAPConnectPluginContext convertContext = convertContext(interceptContext);
        String convertJSAPI = convertJSAPI(str, convertContext);
        if (TextUtils.isEmpty(convertJSAPI)) {
            ACLog.d(TAG, "IAPConnectInterceptor#willHandleJSAPI, js api is empty after converting");
            return false;
        } else if (!AcBizMiniProgramHelper.isAcBizMiniProgram(convertContext.miniProgramAppID, convertContext.sourceSite) && !isRegionApp(convertContext)) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("IAPConnectInterceptor#willHandleJSAPI, current mini program is neither AC business nor Region business, appId: ");
            sb.append(convertContext.miniProgramAppID);
            sb.append(", sourceSite: ");
            sb.append(convertContext.sourceSite);
            ACLog.d(str2, sb.toString());
            return false;
        } else if (DisableJSAPIManager.getInstance().isDisabled(convertContext.miniProgramAppID, convertJSAPI)) {
            String str3 = TAG;
            StringBuilder sb2 = new StringBuilder("IAPConnectInterceptor#willHandleJSAPI, current mini program jsapi is disabled,appId: ");
            sb2.append(convertContext.miniProgramAppID);
            sb2.append(",jsapi:");
            sb2.append(convertJSAPI);
            ACLog.d(str3, sb2.toString());
            return false;
        } else {
            IAPConnectPluginCallback convertCallback = convertCallback(convertJSAPI, bridgeCallback);
            Boolean handle = ConfigInterceptor.handle(convertJSAPI, convertContext, convertCallback);
            if (handle != null) {
                ACLog.d(TAG, "IAPConnectInterceptor#willHandleJSAPI, intercepted by config:".concat(String.valueOf(handle)));
                return handle.booleanValue();
            }
            JSONObject implementedJSAPIConfig = ImplementedJSAPIConfigManager.getInstance().getImplementedJSAPIConfig();
            ACLog.d(TAG, "IAPConnectInterceptor#willHandleJSAPI, the jsapi interceptor config:".concat(String.valueOf(implementedJSAPIConfig)));
            if (!DowngradeJSAPIInterceptorHandler.handleJSAPI(convertContext, DOWNGRADE_TYPE_IMPLEMENTED_JSAPI, implementedJSAPIConfig, convertJSAPI, FILENAME_IMPLEMENTED_JSAPI_DOWNGRADE_MAP, convertCallback)) {
                return innerIntercept(convertJSAPI, convertContext, convertCallback);
            }
            String str4 = TAG;
            StringBuilder sb3 = new StringBuilder("IAPConnectInterceptor#willHandleJSAPI, ");
            sb3.append(convertJSAPI);
            sb3.append(" is intercepted");
            ACLog.d(str4, sb3.toString());
            return true;
        }
    }

    private IAPConnectPluginCallback convertCallback(final String str, final BridgeCallback bridgeCallback) {
        return new IAPConnectPluginCallback() {
            public void onResult(JSONObject jSONObject) {
                ACLog.d(IAPImplementedJSAPIInterceptor.TAG, "IAPConnectInterceptor#callback: ".concat(String.valueOf(jSONObject)));
                MonitorUtil.monitorFinish(str, SystemClock.elapsedRealtime() - IAPImplementedJSAPIInterceptor.this.startTime);
                BridgeCallback bridgeCallback = bridgeCallback;
                if (bridgeCallback != null) {
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            }
        };
    }

    private IAPConnectPluginContext convertContext(BridgeInterceptor.InterceptContext interceptContext) {
        IAPConnectPluginContext iAPConnectPluginContext = new IAPConnectPluginContext(interceptContext.context);
        iAPConnectPluginContext.setActivity(interceptContext.activity);
        iAPConnectPluginContext.miniProgramPageURL = interceptContext.miniProgramPageURL;
        iAPConnectPluginContext.miniProgramAppID = interceptContext.miniProgramAppID;
        iAPConnectPluginContext.miniProgramName = interceptContext.miniProgramName;
        iAPConnectPluginContext.sourceSite = interceptContext.sourceSite;
        iAPConnectPluginContext.jsParameters = interceptContext.jsParameters;
        iAPConnectPluginContext.isMiniProgram = interceptContext.isMiniProgram;
        iAPConnectPluginContext.acParams = interceptContext.acParams;
        return iAPConnectPluginContext;
    }

    private boolean checkParam(String str, BridgeInterceptor.InterceptContext interceptContext) {
        if (TextUtils.isEmpty(str)) {
            ACLog.d(TAG, "IAPConnectInterceptor#checkParam, jsapi is empty");
            return false;
        } else if (interceptContext != null && interceptContext.context != null) {
            return true;
        } else {
            ACLog.d(TAG, "IAPConnectInterceptor#checkParam, context is empty");
            return false;
        }
    }

    private String convertJSAPI(String str, IAPConnectPluginContext iAPConnectPluginContext) {
        ACLog.d(TAG, "IAPConnectInterceptor#convertJSAPI, jsapi: ".concat(String.valueOf(str)));
        if (Constants.JS_API_START_BIZ_SERVICE.equals(str)) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertJSAPI, jsapi is startBizService");
            return convertStartBizService(iAPConnectPluginContext);
        } else if (!Constants.JS_API_APPX_RPC.equals(str)) {
            return str;
        } else {
            ACLog.d(TAG, "IAPConnectInterceptor#convertJSAPI, jsapi is appxrpc");
            return convertAppxrpc(iAPConnectPluginContext);
        }
    }

    private String convertStartBizService(IAPConnectPluginContext iAPConnectPluginContext) {
        if (iAPConnectPluginContext.jsParameters == null) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertStartBizService, jsParameters is null");
            return "";
        } else if (JS_API_PARAM_VALUE_DEDUCT.equals(iAPConnectPluginContext.jsParameters.optString("name"))) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertStartBizService, name is deduct so convert");
            return Constants.JS_API_PAY_SIGN_CENTER;
        } else {
            ACLog.d(TAG, "IAPConnectInterceptor#convertStartBizService, name is not deduct");
            return "";
        }
    }

    private String convertAppxrpc(IAPConnectPluginContext iAPConnectPluginContext) {
        if (iAPConnectPluginContext.jsParameters == null) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertAppxrpc, jsParameters is null");
            return "";
        }
        JSONArray optJSONArray = iAPConnectPluginContext.jsParameters.optJSONArray("requestData");
        if (optJSONArray == null || optJSONArray.length() == 0 || optJSONArray.optJSONObject(0) == null) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertAppxrpc, requestData is empty");
            return "";
        }
        String optString = optJSONArray.optJSONObject(0).optString("method");
        if (TextUtils.isEmpty(optString)) {
            ACLog.d(TAG, "IAPConnectInterceptor#convertAppxrpc, requestData does not contain method");
            return "";
        }
        ACLog.d(TAG, "IAPConnectInterceptor#convertAppxrpc, method: ".concat(String.valueOf(optString)));
        return optString;
    }

    private boolean innerIntercept(String str, IAPConnectPluginContext iAPConnectPluginContext, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (TextUtils.equals(str, "rpc") && isRegionApp(iAPConnectPluginContext)) {
            str = Constants.JS_API_REGION_RPC;
        }
        Class cls = Constants.JS_INTERCEPTOR_MAP.get(str);
        if (cls == null) {
            ACLog.d(TAG, "IAPConnectInterceptor#innerIntercept, interceptor class is null, jsapi: ".concat(String.valueOf(str)));
            return false;
        }
        try {
            BaseInterceptor baseInterceptor = (BaseInterceptor) cls.newInstance();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("IAPConnectInterceptor#innerIntercept, start to intercept by ");
            sb.append(baseInterceptor.getClass().getSimpleName());
            ACLog.d(str2, sb.toString());
            MonitorUtil.monitorEnter(str);
            this.startTime = SystemClock.elapsedRealtime();
            baseInterceptor.handle(iAPConnectPluginContext, iAPConnectPluginCallback);
            return true;
        } catch (Exception e) {
            String str3 = TAG;
            StringBuilder sb2 = new StringBuilder("IAPConnectInterceptor#innerIntercept, inner intercept fail, interceptorClass: ");
            sb2.append(cls);
            sb2.append(", ");
            sb2.append(e);
            ACLog.e(str3, sb2.toString());
            return false;
        }
    }

    private boolean isRegionApp(IAPConnectPluginContext iAPConnectPluginContext) {
        if (iAPConnectPluginContext.acParams != null && !TextUtils.isEmpty(iAPConnectPluginContext.acParams.optString("acParams"))) {
            try {
                return TextUtils.equals(new JSONObject(iAPConnectPluginContext.acParams.optString("acParams")).optString(Constants.KEY_FLAG_REGION_TINYAPP), "YES");
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
