package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.biz.auth.AuthResultObserver;
import com.iap.ac.android.acs.plugin.biz.auth.AuthResultObserverManager;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4signContract extends BaseInterceptor {
    private static final String ERROR_CODE = "7002";
    private static final String ERROR_MESSAGE = "Empty authCode";
    private static final String PARAM_SIGN_STR = "signStr";
    private static final String TAG = "IAPConnectPlugin";
    /* access modifiers changed from: private */
    public AuthResultObserver authCodeObserver;

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4signContract#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_SIGN_CONTRACT, "parameter is null"));
            return;
        }
        final String optString = jSONObject.optString(PARAM_SIGN_STR);
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4signContract#handle, signStr is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_SIGN_CONTRACT, "signStr is empty"));
            return;
        }
        AnonymousClass1 r1 = new AuthResultObserver() {
            public void onGetAuthResult(@Nullable AuthResult authResult) {
                ACLog.d("IAPConnectPlugin", "Interceptor4signContract#observer, get auth result from ac sdk");
                Interceptor4signContract.this.convertResult(authResult, iAPConnectPluginCallback);
                AuthResultObserverManager.unregisterObserver(1, Interceptor4signContract.this.authCodeObserver);
            }
        };
        this.authCodeObserver = r1;
        AuthResultObserverManager.registerObserver(1, r1);
        ACLog.d("IAPConnectPlugin", "Interceptor4signContract#handle, start to sign contract");
        final AclAPIContext createAclAPIContext = AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext);
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                Interceptor4signContract.this.signContract(optString, createAclAPIContext, iAPConnectPluginCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    public void signContract(String str, AclAPIContext aclAPIContext, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        ACLog.d("IAPConnectPlugin", "Interceptor4signContract#signContract, signStr: ".concat(String.valueOf(str)));
        SPIManager.getInstance().getAuthCode(str, aclAPIContext, (IAuthCallback) new IAuthCallback() {
            public void onResult(@NonNull AuthResult authResult) {
                ACLog.d("IAPConnectPlugin", "Interceptor4signContract#signContract, get auth result from callback");
                Interceptor4signContract.this.convertResult(authResult, iAPConnectPluginCallback);
                AuthResultObserverManager.unregisterObserver(1, Interceptor4signContract.this.authCodeObserver);
            }
        });
    }

    /* access modifiers changed from: private */
    public void convertResult(AuthResult authResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (authResult == null) {
            ACLog.d("IAPConnectPlugin", "Interceptor4signContract#convertResult, authResult is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_SIGN_CONTRACT, ERROR_CODE, ERROR_MESSAGE));
        } else if (TextUtils.isEmpty(authResult.authCode)) {
            ACLog.d("IAPConnectPlugin", "Interceptor4signContract#convertResult, authCode is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getError(Constants.JS_API_SIGN_CONTRACT, authResult.errorCode, authResult.errorMessage));
        } else {
            convertAuthResult(authResult, iAPConnectPluginCallback);
        }
    }

    private void convertAuthResult(AuthResult authResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        StringBuilder sb = new StringBuilder("Interceptor4signContract#convertAuthResult, authCode: ");
        sb.append(authResult.authCode);
        sb.append(", authState: ");
        sb.append(authResult.authState);
        ACLog.d("IAPConnectPlugin", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authCode", authResult.authCode);
            jSONObject.put(Constants.KEY_AUTH_STATE, authResult.authState);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4signContract#convertAuthResult, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_SIGN_CONTRACT, e);
        }
    }
}
