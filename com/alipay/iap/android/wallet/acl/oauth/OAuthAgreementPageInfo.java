package com.alipay.iap.android.wallet.acl.oauth;

import java.util.Map;

public class OAuthAgreementPageInfo {
    private String agreementFormUrl;
    private Map<String, String> authScopeDescriptions;
    private String merchantLogoUrl;
    private String summary;

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public void setMerchantLogoUrl(String str) {
        this.merchantLogoUrl = str;
    }

    public String getAgreementFormUrl() {
        return this.agreementFormUrl;
    }

    public void setAgreementFormUrl(String str) {
        this.agreementFormUrl = str;
    }

    public Map<String, String> getAuthScopeDescriptions() {
        return this.authScopeDescriptions;
    }

    public void setAuthScopeDescriptions(Map<String, String> map) {
        this.authScopeDescriptions = map;
    }

    public OAuthAgreementPageInfo(String str, String str2, String str3, Map<String, String> map) {
        this.summary = str;
        this.merchantLogoUrl = str2;
        this.agreementFormUrl = str3;
        this.authScopeDescriptions = map;
    }
}
