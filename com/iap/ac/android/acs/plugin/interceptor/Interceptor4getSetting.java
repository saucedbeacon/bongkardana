package com.iap.ac.android.acs.plugin.interceptor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.auth.IContainerAuth;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getSetting extends BaseInterceptor {
    private static final String TAG = "IAPConnectPlugin";

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        HashMap hashMap = new HashMap();
        String str = iAPConnectPluginContext.miniProgramAppID;
        String openId = SPIManager.getInstance().getOpenId();
        Context context = iAPConnectPluginContext.getContext();
        IContainerAuth containerAuth = WebContainer.getInstance("ac_biz").getContainerAuth();
        if (containerAuth != null) {
            Map<String, Boolean> deviceAuthSetting = containerAuth.getDeviceAuthSetting(str, openId);
            ACLog.d("IAPConnectPlugin", "Interceptor4getSetting#handle, deviceAuthSetting: ".concat(String.valueOf(deviceAuthSetting)));
            if (deviceAuthSetting != null && !deviceAuthSetting.isEmpty()) {
                hashMap.putAll(deviceAuthSetting);
            }
        }
        boolean authenticationResult = AuthCodeUtil.getAuthenticationResult(context, str, "userInfo");
        boolean authenticationResult2 = AuthCodeUtil.getAuthenticationResult(context, str, "phoneNumber");
        StringBuilder sb = new StringBuilder("Interceptor4getSetting#handle, userInfoAuthResult: ");
        sb.append(authenticationResult);
        sb.append(", phoneNumberAuthResult: ");
        sb.append(authenticationResult2);
        ACLog.d("IAPConnectPlugin", sb.toString());
        hashMap.put("userInfo", Boolean.valueOf(authenticationResult || authenticationResult2));
        convertResult(hashMap, iAPConnectPluginCallback);
    }

    private void convertResult(@NonNull Map<String, Boolean> map, IAPConnectPluginCallback iAPConnectPluginCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authSetting", convertAuthSetting(map));
            iAPConnectPluginCallback.onResult(jSONObject);
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getSetting#convertResult, convert result to JSON error");
            MonitorUtil.monitorJSONError(Constants.JS_API_GET_SETTING, e);
        }
    }

    private JSONObject convertAuthSetting(@NonNull Map<String, Boolean> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        return jSONObject;
    }
}
