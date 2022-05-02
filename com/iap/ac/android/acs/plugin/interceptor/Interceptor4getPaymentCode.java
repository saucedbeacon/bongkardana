package com.iap.ac.android.acs.plugin.interceptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.cpm.online.manager.OnlinePaymentCodeManager;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getPaymentCode extends BaseInterceptor {
    private static final String ERROR_CODE_UNSUPPORTED = "40004";
    private static final String ERROR_MESSAGE_UNSUPPORTED = "Offline code not supported";
    private static final String PARAM_REGION = "region";
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#handle, jsParameters is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("getPaymentCode", "parameter is null"));
            return;
        }
        String optString = jSONObject.optString("region");
        if (TextUtils.isEmpty(optString)) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#handle, region is empty");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("getPaymentCode", "region is empty"));
            return;
        }
        ACManager.getInstance().fetchConfigAsync((IConfigCallback) null);
        String codeType = ACManager.getInstance().getCodeType(optString);
        CPMConfig cpmConfig = ACManager.getInstance().getCpmConfig(codeType);
        if (cpmConfig == null) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#handle, CPM config is null");
            iAPConnectPluginCallback.onResult(CallbackUtil.getInvalidParamError("getPaymentCode", "CPM config is null"));
            return;
        }
        StringBuilder sb = new StringBuilder("Interceptor4getPaymentCode#handle, start to get payment code, codeType: ");
        sb.append(codeType);
        sb.append(", region: ");
        sb.append(optString);
        ACLog.d("IAPConnectPlugin", sb.toString());
        getPaymentCode(codeType, cpmConfig, iAPConnectPluginCallback);
    }

    private void getPaymentCode(String str, CPMConfig cPMConfig, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        if (cPMConfig.onlineCode) {
            ACLog.d("IAPConnectPlugin", "Interceptor4getPaymentCode#getPaymentCode, online code");
            new OnlinePaymentCodeManager().getPaymentCode(str, cPMConfig, new IPaymentCodeListener() {
                public void onPaymentCodeUpdated(@NonNull String str) {
                    ACLog.d("IAPConnectPlugin", "Interceptor4getPaymentCode#onPaymentCodeUpdated, paymentCode: ".concat(String.valueOf(str)));
                    Interceptor4getPaymentCode.this.convertResult(str, iAPConnectPluginCallback);
                }

                public void onPaymentCodeUpdateFailed(@NonNull String str, @NonNull String str2) {
                    StringBuilder sb = new StringBuilder("Interceptor4getPaymentCode#onPaymentCodeUpdateFailed, errorCode: ");
                    sb.append(str);
                    sb.append(", errorMessage: ");
                    sb.append(str2);
                    ACLog.d("IAPConnectPlugin", sb.toString());
                    Interceptor4getPaymentCode.this.convertError(str, str2, iAPConnectPluginCallback);
                }
            });
            return;
        }
        ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#getPaymentCode, try to get offline code");
        iAPConnectPluginCallback.onResult(CallbackUtil.getError("getPaymentCode", ERROR_CODE_UNSUPPORTED, ERROR_MESSAGE_UNSUPPORTED));
    }

    /* access modifiers changed from: private */
    public void convertResult(String str, IAPConnectPluginCallback iAPConnectPluginCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentCode", str);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#convertResult, convert result to JSON error");
            MonitorUtil.monitorJSONError("getPaymentCode", e);
        }
    }

    /* access modifiers changed from: private */
    public void convertError(String str, String str2, IAPConnectPluginCallback iAPConnectPluginCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", str);
            jSONObject.put("errorMessage", str2);
            MonitorUtil.monitorError("getPaymentCode", str, str2);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getPaymentCode#convertError, convert error to JSON error");
            MonitorUtil.monitorJSONError("getPaymentCode", e);
        }
    }
}
