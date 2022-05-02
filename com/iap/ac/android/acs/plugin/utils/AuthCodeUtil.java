package com.iap.ac.android.acs.plugin.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class AuthCodeUtil {
    private static final String CONFIG_KEY_GN_SCOPES_MAP = "acs_alipay_gn_scopes_map";
    private static final Map<String, String> DEFAULT_SCOPE_CONVERSION_MAP;
    private static final String PARAM_AUTH_CLIENT_ID = "authClientId";
    public static final String SCOPE_PHONE_NUMBER = "phoneNumber";
    public static final String SCOPE_USER_INFO = "userInfo";
    private static final String SP_KEY_PREF = "authentication_";
    private static final String SP_NAME = "IAPConnectPlugin";
    private static final String TAG = "IAPConnectPlugin";
    private static Map<String, String> authCodeMap = new HashMap();

    static {
        HashMap hashMap = new HashMap(4);
        DEFAULT_SCOPE_CONVERSION_MAP = hashMap;
        hashMap.put(OAuthService.SCOPE_AUTH_BASE, OAuthService.SCOPE_BASE_USER_INFO);
        DEFAULT_SCOPE_CONVERSION_MAP.put("SCOPE_BASE", OAuthService.SCOPE_BASE_USER_INFO);
        DEFAULT_SCOPE_CONVERSION_MAP.put(OAuthService.SCOPE_AUTH_USER, OAuthService.SCOPE_USER_INFO);
        DEFAULT_SCOPE_CONVERSION_MAP.put(OAuthService.SCOPE_BASE_USER_INFO, OAuthService.SCOPE_AUTH_BASE);
        DEFAULT_SCOPE_CONVERSION_MAP.put(OAuthService.SCOPE_USER_INFO, OAuthService.SCOPE_AUTH_USER);
    }

    private AuthCodeUtil() {
    }

    public static String getClientId() {
        OAuthConfig oAuthConfig = ACManager.getInstance().getOAuthConfig();
        if (oAuthConfig == null) {
            return "";
        }
        return oAuthConfig.clientId;
    }

    public static String getAuthClientId(IAPConnectPluginContext iAPConnectPluginContext) {
        if (iAPConnectPluginContext.acParams == null) {
            ACLog.e(Constants.TAG, "AuthCodeUtil#getAuthClientId, acParams is null, return app id");
            return iAPConnectPluginContext.miniProgramAppID;
        }
        String optString = iAPConnectPluginContext.acParams.optString("authClientId");
        if (!TextUtils.isEmpty(optString)) {
            return optString;
        }
        ACLog.d(Constants.TAG, "AuthCodeUtil#getAuthClientId, auth client id in acParams is empty, return app id");
        return iAPConnectPluginContext.miniProgramAppID;
    }

    public static void saveAuthCode(String str, String str2, String str3) {
        String openId = SPIManager.getInstance().getOpenId();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(openId);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("AuthCodeUtil#saveAuthCode, key: ");
        sb2.append(obj);
        sb2.append(", authCode: ");
        sb2.append(str3);
        ACLog.d(Constants.TAG, sb2.toString());
        authCodeMap.put(obj, str3);
    }

    public static String removeAuthCode(String str, String str2) {
        String openId = SPIManager.getInstance().getOpenId();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(openId);
        String obj = sb.toString();
        String remove = authCodeMap.remove(obj);
        StringBuilder sb2 = new StringBuilder("AuthCodeUtil#removeAuthCode, key: ");
        sb2.append(obj);
        sb2.append(", authCode: ");
        sb2.append(remove);
        ACLog.d(Constants.TAG, sb2.toString());
        return remove;
    }

    public static void saveAuthenticationResult(Context context, String str, String str2, boolean z) {
        String sPKey = getSPKey(str, str2, SPIManager.getInstance().getOpenId());
        StringBuilder sb = new StringBuilder("AuthCodeUtil#saveAuthenticationResult, key: ");
        sb.append(sPKey);
        sb.append(", isAuthenticated: ");
        sb.append(z);
        ACLog.d(Constants.TAG, sb.toString());
        SharedPreferences.Editor edit = context.getSharedPreferences(Constants.TAG, 0).edit();
        edit.putBoolean(sPKey, z);
        edit.apply();
    }

    public static boolean getAuthenticationResult(Context context, String str, String str2) {
        String sPKey = getSPKey(str, str2, SPIManager.getInstance().getOpenId());
        boolean z = context.getSharedPreferences(Constants.TAG, 0).getBoolean(sPKey, false);
        StringBuilder sb = new StringBuilder("AuthCodeUtil#getAuthenticationResult, key: ");
        sb.append(sPKey);
        sb.append(", isAuthenticated: ");
        sb.append(z);
        ACLog.d(Constants.TAG, sb.toString());
        return z;
    }

    private static String getSPKey(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(SP_KEY_PREF);
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    public static List<String> convertScopes(List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e(Constants.TAG, "AuthCodeUtil#convertScopes, scopes is empty, return empty list");
            return new ArrayList();
        }
        Map<String, String> scopeConversionMap = getScopeConversionMap();
        ArrayList arrayList = new ArrayList(list.size());
        for (String next : list) {
            if (scopeConversionMap.containsKey(next)) {
                arrayList.add(scopeConversionMap.get(next));
            } else {
                arrayList.add(next);
            }
        }
        ACLog.d(Constants.TAG, "AuthCodeUtil#convertScopes: ".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    public static Map<String, String> convertGNErrorScopes2Alipay(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            ACLog.e(Constants.TAG, "AuthCodeUtil#convertGNErrorScopes2Alipay, error GN scope map is empty, return empty map");
            return new HashMap();
        }
        Map<String, String> scopeConversionMap = getScopeConversionMap();
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (scopeConversionMap.containsKey(str)) {
                hashMap.put(scopeConversionMap.get(str), next.getValue());
            } else {
                hashMap.put(str, next.getValue());
            }
        }
        ACLog.d(Constants.TAG, "AuthCodeUtil#convertGNErrorScopes2Alipay: ".concat(String.valueOf(hashMap)));
        return hashMap;
    }

    private static Map<String, String> getScopeConversionMap() {
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY_GN_SCOPES_MAP, new JSONObject());
        ACLog.d(Constants.TAG, "AuthCodeUtil#getScopeConversionMap, get remote config: ".concat(String.valueOf(jSONObject)));
        Map<String, String> json2StringMap = Utils.json2StringMap(jSONObject);
        if (json2StringMap.isEmpty()) {
            json2StringMap = DEFAULT_SCOPE_CONVERSION_MAP;
        }
        ACLog.d(Constants.TAG, "AuthCodeUtil#getScopeConversionMap: ".concat(String.valueOf(json2StringMap)));
        return json2StringMap;
    }
}
