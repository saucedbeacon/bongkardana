package com.alipay.iap.android.wallet.acl.onboarding;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class TrustLoginInfoFetchResult extends BaseResult {
    private String signedCredential;

    public TrustLoginInfoFetchResult(String str) {
        this.signedCredential = str;
    }

    public String getSignedCredential() {
        return this.signedCredential;
    }

    public void setSignedCredential(String str) {
        this.signedCredential = str;
    }
}
