package com.iap.ac.android.acs.plugin.interceptor;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.risk.RiskControlManager;
import com.iap.ac.android.common.log.ACLog;

public class Interceptor4uploadApdidToken extends BaseInterceptor {
    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        ACLog.d(Constants.TAG, "Interceptor4uploadApdidToken#handle");
        RiskControlManager.getInstance().reportApdidToken();
        iAPConnectPluginCallback.onResult(CallbackUtil.getSuccess(Constants.JS_API_UPLOAD_APDID_TOKEN));
    }
}
