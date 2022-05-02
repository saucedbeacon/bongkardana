package com.iap.ac.android.acs.plugin.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.biz.auth.AuthResultObserver;
import com.iap.ac.android.acs.plugin.biz.auth.AuthResultObserverManager;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.PaySignCenterFacade;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.request.AuthApplyRequest;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.request.AuthPrepareRequest;
import com.iap.ac.android.acs.plugin.rpc.paysigncenter.result.AuthPrepareResult;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4paySignCenter extends BaseInterceptor {
    private static final String PARAM_PARAM = "param";
    private static final String PARAM_SIGN_PARAMS = "sign_params";
    private static final String RESULT_STATUS_FAIL = "7002";
    private static final String RESULT_STATUS_SUCCESS = "7000";
    private static final String TAG = "IAPConnectPlugin";
    /* access modifiers changed from: private */
    public AuthResultObserver authCodeObserver;

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        final String signStr = getSignStr(iAPConnectPluginContext.jsParameters, iAPConnectPluginCallback);
        if (TextUtils.isEmpty(signStr)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#handle, signStr is empty");
            return;
        }
        AnonymousClass1 r0 = new AuthResultObserver() {
            public void onGetAuthResult(@Nullable AuthResult authResult) {
                ACLog.d("IAPConnectPlugin", "Interceptor4paySignCenter#observer, get auth result from ac sdk");
                Interceptor4paySignCenter.this.authApply(authResult, iAPConnectPluginCallback);
                AuthResultObserverManager.unregisterObserver(2, Interceptor4paySignCenter.this.authCodeObserver);
            }
        };
        this.authCodeObserver = r0;
        AuthResultObserverManager.registerObserver(2, r0);
        ACLog.d("IAPConnectPlugin", "Interceptor4paySignCenter#handle, start to pay sign center");
        final String str = iAPConnectPluginContext.miniProgramAppID;
        final AclAPIContext createAclAPIContext = AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext);
        final IAPConnectPluginCallback iAPConnectPluginCallback2 = iAPConnectPluginCallback;
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                Interceptor4paySignCenter.this.paySignCenter(str, signStr, createAclAPIContext, iAPConnectPluginCallback2);
            }
        });
    }

    private String getSignStr(JSONObject jSONObject, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#getSignStr, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_PAY_SIGN_CENTER, "parameter is null"));
            return "";
        }
        String optString = jSONObject.optString("param");
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#getSignStr, param in jsParameters is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_PAY_SIGN_CENTER, "param in parameter is empty"));
            return "";
        }
        try {
            String optString2 = new JSONObject(optString).optString(PARAM_SIGN_PARAMS);
            if (!TextUtils.isEmpty(optString2)) {
                return optString2;
            }
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#getSignStr, sign_params is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_PAY_SIGN_CENTER, "sign_params is empty"));
            return "";
        } catch (JSONException unused) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#getSignStr, param in jsParameters is not json");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError(Constants.JS_API_PAY_SIGN_CENTER, "param in parameter is not json"));
            return "";
        }
    }

    /* access modifiers changed from: private */
    public void paySignCenter(String str, String str2, AclAPIContext aclAPIContext, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        StringBuilder sb = new StringBuilder("Interceptor4paySignCenter#paySignCenter, appId: ");
        sb.append(str);
        sb.append(", signStr: ");
        sb.append(str2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        try {
            AuthPrepareResult sendAuthPrepareRPC = sendAuthPrepareRPC(str, str2);
            if (!isAuthPrepareResultInvalid(sendAuthPrepareRPC, iAPConnectPluginCallback)) {
                StringBuilder sb2 = new StringBuilder("Interceptor4paySignCenter#paySignCenter, authUrl: ");
                sb2.append(sendAuthPrepareRPC.authUrl);
                ACLog.d("IAPConnectPlugin", sb2.toString());
                SPIManager.getInstance().getAuthCode(sendAuthPrepareRPC.authUrl, aclAPIContext, (IAuthCallback) new IAuthCallback() {
                    public void onResult(@NonNull AuthResult authResult) {
                        ACLog.d("IAPConnectPlugin", "Interceptor4paySignCenter#paySignCenter, get auth result from callback");
                        Interceptor4paySignCenter.this.authApply(authResult, iAPConnectPluginCallback);
                        AuthResultObserverManager.unregisterObserver(2, Interceptor4paySignCenter.this.authCodeObserver);
                    }
                });
            }
        } catch (Throwable th) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#paySignCenter, rpc error: ".concat(String.valueOf(th)));
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
        }
    }

    private AuthPrepareResult sendAuthPrepareRPC(String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AuthPrepareRequest authPrepareRequest = new AuthPrepareRequest();
        authPrepareRequest.appId = str;
        authPrepareRequest.signStr = str2;
        AuthPrepareResult authPrepare = ((PaySignCenterFacade) RPCProxyHost.getInterfaceProxy(PaySignCenterFacade.class, "ac_biz")).authPrepare(authPrepareRequest);
        MonitorUtil.monitorRPC(PaySignCenterFacade.OPERATION_TYPE_AUTH_PREPARE, SystemClock.elapsedRealtime() - elapsedRealtime, authPrepare);
        return authPrepare;
    }

    private boolean isAuthPrepareResultInvalid(AuthPrepareResult authPrepareResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (authPrepareResult == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#isAuthPrepareResultInvalid, result is null");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
            return true;
        } else if (!authPrepareResult.success) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#isAuthPrepareResultInvalid, result is not success");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
            return true;
        } else if (!TextUtils.isEmpty(authPrepareResult.authUrl)) {
            return false;
        } else {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#isAuthPrepareResultInvalid, authUrl is empty");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void authApply(@Nullable AuthResult authResult, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (authResult == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#authApply, authResult is null");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
        } else if (TextUtils.isEmpty(authResult.authCode)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#authApply, authCode is empty");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
        } else {
            final String str = authResult.authCode;
            final String str2 = authResult.authState;
            StringBuilder sb = new StringBuilder("Interceptor4paySignCenter#authApply, authCode: ");
            sb.append(str);
            sb.append(", authState: ");
            sb.append(str2);
            ACLog.d("IAPConnectPlugin", sb.toString());
            IAPAsyncTask.asyncTask((Runnable) new Runnable() {
                public void run() {
                    try {
                        Interceptor4paySignCenter.this.convertAuthResult(Interceptor4paySignCenter.this.sendAuthApplyRpc(str, str2), iAPConnectPluginCallback);
                    } catch (Throwable th) {
                        ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#authApply, rpc error: ".concat(String.valueOf(th)));
                        iAPConnectPluginCallback.onResult(Interceptor4paySignCenter.this.convertResult((JSONObject) null, false));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public BaseRpcResult sendAuthApplyRpc(String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AuthApplyRequest authApplyRequest = new AuthApplyRequest();
        authApplyRequest.authCode = str;
        authApplyRequest.state = str2;
        BaseRpcResult authApply = ((PaySignCenterFacade) RPCProxyHost.getInterfaceProxy(PaySignCenterFacade.class, "ac_biz")).authApply(authApplyRequest);
        MonitorUtil.monitorRPC(PaySignCenterFacade.OPERATION_TYPE_AUTH_APPLY, SystemClock.elapsedRealtime() - elapsedRealtime, authApply);
        return authApply;
    }

    /* access modifiers changed from: private */
    public void convertAuthResult(BaseRpcResult baseRpcResult, IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (baseRpcResult == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#convertAuthResult, result is null");
            iAPConnectPluginCallback.onResult(convertResult((JSONObject) null, false));
            return;
        }
        StringBuilder sb = new StringBuilder("Interceptor4paySignCenter#convertAuthResult, success: ");
        sb.append(baseRpcResult.success);
        ACLog.d("IAPConnectPlugin", sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", baseRpcResult.success);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#convertAuthResult, JSONException");
            MonitorUtil.monitorJSONError(Constants.JS_API_PAY_SIGN_CENTER, e);
        }
        iAPConnectPluginCallback.onResult(convertResult(jSONObject, true));
    }

    /* access modifiers changed from: private */
    public JSONObject convertResult(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("resultStatus", z ? RESULT_STATUS_SUCCESS : RESULT_STATUS_FAIL);
            String str = "";
            if (jSONObject != null) {
                jSONObject2.put("result", jSONObject);
                str = jSONObject.toString();
            }
            if (!z) {
                MonitorUtil.monitorError(Constants.JS_API_PAY_SIGN_CENTER, RESULT_STATUS_FAIL, str);
            }
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4paySignCenter#getResult, JSONException");
            MonitorUtil.monitorJSONError(Constants.JS_API_PAY_SIGN_CENTER, e);
        }
        return jSONObject2;
    }
}
