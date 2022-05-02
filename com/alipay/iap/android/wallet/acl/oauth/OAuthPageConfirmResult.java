package com.alipay.iap.android.wallet.acl.oauth;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class OAuthPageConfirmResult extends BaseResult {
    private String referenceAgreementId;

    public OAuthPageConfirmResult(String str) {
        this.referenceAgreementId = str;
    }

    public String getReferenceAgreementId() {
        return this.referenceAgreementId;
    }

    public void setReferenceAgreementId(String str) {
        this.referenceAgreementId = str;
    }
}
