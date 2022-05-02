package com.alipay.iap.android.wallet.acl.oauth;

import java.util.Set;

class OAuthCodePreparationInfo {
    public String authRedirectUrl;
    public String authState;
    public String clientId;
    public Set<String> scopes;

    public OAuthCodePreparationInfo(String str, Set<String> set, String str2, String str3) {
        this.clientId = str;
        this.scopes = set;
        this.authRedirectUrl = str2;
        this.authState = str3;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public Set<String> getScopes() {
        return this.scopes;
    }

    public void setScopes(Set<String> set) {
        this.scopes = set;
    }

    public String getAuthRedirectUrl() {
        return this.authRedirectUrl;
    }

    public void setAuthRedirectUrl(String str) {
        this.authRedirectUrl = str;
    }

    public String getAuthState() {
        return this.authState;
    }

    public void setAuthState(String str) {
        this.authState = str;
    }
}
