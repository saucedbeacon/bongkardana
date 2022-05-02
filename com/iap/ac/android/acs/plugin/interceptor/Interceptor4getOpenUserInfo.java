package com.iap.ac.android.acs.plugin.interceptor;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
import com.iap.ac.android.acs.plugin.utils.CallbackUtil;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.model.OAuthUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfoCallback;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.desc;
import org.json.JSONException;
import org.json.JSONObject;

public class Interceptor4getOpenUserInfo extends BaseInterceptor {
    private static final String TAG = "IAPConnectPlugin";
    /* access modifiers changed from: private */
    public Map<String, String> params = new HashMap();

    public void handle(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) {
        String str = iAPConnectPluginContext.miniProgramAppID;
        try {
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
        if (!AuthCodeUtil.getAuthenticationResult(iAPConnectPluginContext.getContext(), str, "userInfo")) {
            ACLog.e("IAPConnectPlugin", "Interceptor4getOpenUserInfo#handle, not authenticated before");
            iAPConnectPluginCallback.onResult(CallbackUtil.getAuthorizedError(Constants.JS_API_GET_OPEN_USER_INFO));
            return;
        }
        getOpenUserInfo(str, AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext), iAPConnectPluginCallback);
    }

    private void getOpenUserInfo(String str, AclAPIContext aclAPIContext, final IAPConnectPluginCallback iAPConnectPluginCallback) {
        ACLog.d("IAPConnectPlugin", "Interceptor4getOpenUserInfo#getOpenUserInfo, appId: ".concat(String.valueOf(str)));
        OAuthUserInfo oAuthUserInfo = new OAuthUserInfo();
        oAuthUserInfo.appId = str;
        oAuthUserInfo.scopes = new ArrayList(1);
        oAuthUserInfo.scopes.add("userInfo");
        SPIManager.getInstance().getOpenUserInfo(oAuthUserInfo, aclAPIContext, new OpenUserInfoCallback() {
            public void onGetOpenUserInfo(OpenUserInfo openUserInfo) {
                if (openUserInfo == null) {
                    Map hashMap = new HashMap();
                    if (Interceptor4getOpenUserInfo.this.params != null) {
                        hashMap = Interceptor4getOpenUserInfo.this.params;
                    }
                    hashMap.put("status", "error");
                    hashMap.put("errorCode", MonitorUtil.ERROR_CODE_EMPTY);
                    hashMap.put("errorMessage", "Interceptor4getOpenUserInfo#OpenUserInfoCallback, openUserInfo is null");
                    MonitorUtil.logEvent("mini_get_open_user_info", hashMap);
                    ACLog.e("IAPConnectPlugin", "Interceptor4getOpenUserInfo#OpenUserInfoCallback, openUserInfo is null");
                    iAPConnectPluginCallback.onResult(new JSONObject());
                    return;
                }
                Map hashMap2 = new HashMap();
                if (Interceptor4getOpenUserInfo.this.params != null) {
                    hashMap2 = Interceptor4getOpenUserInfo.this.params;
                }
                hashMap2.put("status", "success");
                MonitorUtil.logEvent("mini_get_open_user_info", hashMap2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("avatar", openUserInfo.avatar);
                    jSONObject.put("nickName", openUserInfo.nickName);
                    jSONObject.put("gender", openUserInfo.gender);
                    jSONObject.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, openUserInfo.countryCode);
                    jSONObject.put("province", openUserInfo.province);
                    jSONObject.put(desc.USER_CITY, openUserInfo.city);
                    iAPConnectPluginCallback.onResult(jSONObject);
                } catch (JSONException e) {
                    ACLog.e("IAPConnectPlugin", "Interceptor4getOpenUserInfo#OpenUserInfoCallback, convert result to JSON error");
                    MonitorUtil.monitorJSONError(Constants.JS_API_GET_OPEN_USER_INFO, e);
                }
            }
        });
    }
}
