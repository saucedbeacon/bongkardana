package com.alipay.iap.android.wallet.acl.oauth;

import com.alipay.iap.android.wallet.acl.base.BaseResult;
import java.util.Map;

public class OAuthResult extends BaseResult {
    public String authCode;
    public Map<String, String> authErrorScopes;
    public String authRedirectUrl;
    public String authState;
    public String[] authSuccessScopes;

    public OAuthResult() {
    }

    public OAuthResult(String str, String str2, Map<String, String> map, String[] strArr, String str3) {
        this.authCode = str;
        this.authState = str2;
        this.authErrorScopes = map;
        this.authSuccessScopes = strArr;
        this.authRedirectUrl = str3;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String str) {
        this.authCode = str;
    }

    public String getAuthState() {
        return this.authState;
    }

    public void setAuthState(String str) {
        this.authState = str;
    }

    public Map<String, String> getAuthErrorScopes() {
        return this.authErrorScopes;
    }

    public void setAuthErrorScopes(Map<String, String> map) {
        this.authErrorScopes = map;
    }

    public String[] getAuthSuccessScopes() {
        return this.authSuccessScopes;
    }

    public void setAuthSuccessScopes(String[] strArr) {
        this.authSuccessScopes = strArr;
    }

    public String getAuthRedirectUrl() {
        return this.authRedirectUrl;
    }

    public void setAuthRedirectUrl(String str) {
        this.authRedirectUrl = str;
    }
}
