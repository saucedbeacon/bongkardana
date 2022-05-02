package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.acs.plugin.utils.Utils;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getAuthCode extends BaseInterceptor {
    private static final String ERROR_CODE_EMPTY = "10";
    private static final String ERROR_MESSAGE_EMPTY = "Empty authCode";
    private static final String PARAM_SCOPE_NICKS = "scopeNicks";
    private static final String TAG = "IAPConnectPlugin";
    private Map<String, String> params = new HashMap();

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getAuthCode#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_GET_AUTH_CODE, "parameter is null"));
            return;
        }
        try {
            String str = iAPConnectPluginContext.miniProgramAppID;
            String str2 = iAPConnectPluginContext.miniProgramPageURL;
            String string = iAPConnectPluginContext.acParams.getString("developerVersion");
            String string2 = iAPConnectPluginContext.acParams.getString("deployVersion");
            this.params.put("version", string);
            this.params.put("deployVersion", string2);
            this.params.put("env", "prod");
            this.params.put("url", str2);
            this.params.put("appId", str);
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(PARAM_SCOPE_NICKS);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getAuthCode#handle, scopes is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_GET_AUTH_CODE, "scopes is empty"));
            return;
        }
        getAuthCode(optJSONArray, iAPConnectPluginContext, iAPConnectPluginCallback);
    }

    private void getAuthCode(JSONArray jSONArray, IAPConnectPluginContext iAPConnectPluginContext, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        List<String> convertScopes = AuthCodeUtil.convertScopes(Utils.jsonArray2StringList(jSONArray));
        String clientId = AuthCodeUtil.getClientId();
        String authClientId = AuthCodeUtil.getAuthClientId(iAPConnectPluginContext);
        StringBuilder sb = new StringBuilder("Interceptor4getAuthCode#getAuthCode, clientId: ");
        sb.append(clientId);
        sb.append(", authClientId: ");
        sb.append(authClientId);
        sb.append(", scopeList: ");
        sb.append(convertScopes);
        ACLog.d("IAPConnectPlugin", sb.toString());
        SPIManager.getInstance().getAuthCode(clientId, authClientId, convertScopes, AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext), new IAuthCallback() {
            public void onResult(@NonNull AuthResult authResult) {
                Interceptor4getAuthCode.this.convertResult(authResult, iAPConnectPluginCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    public void convertResult(AuthResult authResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (authResult == null) {
            ACLog.d("IAPConnectPlugin", "Interceptor4getAuthCode#convertResult, authResult is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_GET_AUTH_CODE, "10", ERROR_MESSAGE_EMPTY));
            Map hashMap = new HashMap();
            Map map = this.params;
            if (map != null) {
                hashMap = map;
            }
            hashMap.put("errorCode", "error");
            hashMap.put("errorCode", "10");
            hashMap.put("errorMessage", ERROR_MESSAGE_EMPTY);
            MonitorUtil.logEvent("mini_get_auth_code", hashMap);
        } else if (TextUtils.isEmpty(authResult.authCode)) {
            ACLog.d("IAPConnectPlugin", "Interceptor4getAuthCode#convertResult, authCode is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_GET_AUTH_CODE, authResult.errorCode, authResult.errorMessage));
            Map hashMap2 = new HashMap();
            Map map2 = this.params;
            if (map2 != null) {
                hashMap2 = map2;
            }
            hashMap2.put("status", "error");
            hashMap2.put("errorCode", authResult.errorCode);
            hashMap2.put("errorMessage", authResult.errorMessage);
            MonitorUtil.logEvent("mini_get_auth_code", hashMap2);
        } else {
            convertAuthResult(authResult, iAPConnectPluginCallback);
        }
    }

    private void convertAuthResult(AuthResult authResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        StringBuilder sb = new StringBuilder("Interceptor4getAuthCode#convertAuthResult, authCode: ");
        sb.append(authResult.authCode);
        sb.append(", authSuccessScopes: ");
        sb.append(authResult.authSuccessScopes);
        sb.append(", authErrorScopes: ");
        sb.append(authResult.authErrorScopes);
        ACLog.d("IAPConnectPlugin", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authCode", authResult.authCode);
            jSONObject.put("authSuccessScopes", convertSuccessScopes(authResult.authSuccessScopes));
            jSONObject.put("authErrorScopes", convertErrorScopes(authResult.authErrorScopes));
            Map hashMap = new HashMap();
            if (this.params != null) {
                hashMap = this.params;
            }
            hashMap.put("status", "success");
            MonitorUtil.logEvent("mini_get_auth_code", hashMap);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getAuthCode#convertAuthResult, convert auth result to JSON error");
            Map hashMap2 = new HashMap();
            Map map = this.params;
            if (map != null) {
                hashMap2 = map;
            }
            hashMap2.put("status", "error");
            hashMap2.put("errorCode", e.getMessage());
            hashMap2.put("errorMessage", e.getMessage());
            MonitorUtil.logEvent("mini_get_auth_code", hashMap2);
            MonitorUtil.monitorJSONError(Constants.JS_API_GET_AUTH_CODE, e);
        }
    }

    private JSONArray convertSuccessScopes(List<String> list) {
        return Utils.stringList2JsonArray(AuthCodeUtil.convertScopes(list));
    }

    private JSONObject convertErrorScopes(Map<String, String> map) throws JSONException {
        Map<String, String> convertGNErrorScopes2Alipay = AuthCodeUtil.convertGNErrorScopes2Alipay(map);
        if (!convertGNErrorScopes2Alipay.isEmpty()) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getAuthCode#convertErrorScopes, resultMap: ".concat(String.valueOf(convertGNErrorScopes2Alipay)));
            MonitorUtil.monitorError(Constants.JS_API_GET_AUTH_CODE, "", convertGNErrorScopes2Alipay.toString());
        }
        return Utils.stringMap2Json(convertGNErrorScopes2Alipay);
    }
}
