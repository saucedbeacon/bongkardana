package com.iap.ac.android.acs.plugin.interceptor;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.timesync.TimeSyncManager;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getServerTime extends BaseInterceptor {
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        ACLog.d("IAPConnectPlugin", "Interceptor4getServerTime#handle, start to get server time");
        long serverTime = TimeSyncManager.getInstance(iAPConnectPluginContext.getContext(), "ac_biz").getServerTime();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, serverTime);
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getServerTime#handle, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_GET_SERVER_TIME, e);
        }
    }
}
