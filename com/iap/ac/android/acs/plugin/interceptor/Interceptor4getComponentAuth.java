package com.iap.ac.android.acs.plugin.interceptor;

import android.content.Context;
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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getComponentAuth extends BaseInterceptor {
    private static final String PARAM_SCOPE_NICKS = "scopeNicks";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull final IAPConnectPluginContext iAPConnectPluginContext, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        final List<String> scopes = getScopes(iAPConnectPluginContext.jsParameters, iAPConnectPluginCallback);
        if (scopes == null || scopes.isEmpty()) {
            ACLog.d("IAPConnectPlugin", "Interceptor4getComponentAuth#handle, scope list is empty");
            return;
        }
        String clientId = AuthCodeUtil.getClientId();
        String authClientId = AuthCodeUtil.getAuthClientId(iAPConnectPluginContext);
        StringBuilder sb = new StringBuilder("Interceptor4getComponentAuth#handle, start to get auth code, clientId: ");
        sb.append(clientId);
        sb.append(", authClientId: ");
        sb.append(authClientId);
        sb.append(", scopeList: ");
        sb.append(scopes);
        ACLog.d("IAPConnectPlugin", sb.toString());
        SPIManager.getInstance().getAuthCode(clientId, authClientId, scopes, AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext), new IAuthCallback() {
            public void onResult(@NonNull AuthResult authResult) {
                Interceptor4getComponentAuth.this.saveAuthenticationResult(iAPConnectPluginContext.getContext(), iAPConnectPluginContext.miniProgramAppID, scopes, authResult, iAPConnectPluginCallback);
            }
        });
    }

    private List<String> getScopes(JSONObject jSONObject, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getComponentAuth#getScopes, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_GET_COMPONENT_AUTH, "parameter is null"));
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(PARAM_SCOPE_NICKS);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getComponentAuth#getScopes, scopeNicks is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_GET_COMPONENT_AUTH, "scopeNicks is empty"));
            return null;
        }
        List<String> jsonArray2StringList = Utils.jsonArray2StringList(optJSONArray);
        ACLog.d("IAPConnectPlugin", "Interceptor4getComponentAuth#getScopes: ".concat(String.valueOf(jsonArray2StringList)));
        return jsonArray2StringList;
    }

    /* access modifiers changed from: private */
    public void saveAuthenticationResult(Context context, String str, List<String> list, AuthResult authResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        boolean z = true;
        if (authResult == null || TextUtils.isEmpty(authResult.authCode)) {
            ACLog.d("IAPConnectPlugin", "Interceptor4getComponentAuth#saveAuthenticationResult, auth code is empty");
            for (String saveAuthenticationResult : list) {
                AuthCodeUtil.saveAuthenticationResult(context, str, saveAuthenticationResult, false);
            }
            z = false;
        } else {
            StringBuilder sb = new StringBuilder("Interceptor4getComponentAuth#saveAuthenticationResult, appId: ");
            sb.append(str);
            sb.append(", scopeList: ");
            sb.append(list);
            sb.append(", authCode: ");
            sb.append(authResult.authCode);
            ACLog.d("IAPConnectPlugin", sb.toString());
            for (String next : list) {
                AuthCodeUtil.saveAuthCode(str, next, authResult.authCode);
                AuthCodeUtil.saveAuthenticationResult(context, str, next, true);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", z);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getComponentAuth#saveAuthenticationResult, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_GET_COMPONENT_AUTH, e);
        }
    }
}
