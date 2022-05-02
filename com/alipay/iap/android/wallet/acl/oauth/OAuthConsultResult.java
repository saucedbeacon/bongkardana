package com.alipay.iap.android.wallet.acl.oauth;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class OAuthConsultResult extends BaseResult {
    private OAuthAgreementPageInfo agreementPageInfo;
    private boolean displayAgreementPage;
    private OAuthCodePreparationInfo preparationInfo;

    public boolean isDisplayAgreementPage() {
        return this.displayAgreementPage;
    }

    public void setDisplayAgreementPage(boolean z) {
        this.displayAgreementPage = z;
    }

    public OAuthAgreementPageInfo getAgreementPageInfo() {
        return this.agreementPageInfo;
    }

    public void setAgreementPageInfo(OAuthAgreementPageInfo oAuthAgreementPageInfo) {
        this.agreementPageInfo = oAuthAgreementPageInfo;
    }

    public OAuthCodePreparationInfo preparationInfo() {
        return this.preparationInfo;
    }

    public void setPreparationInfo(OAuthCodePreparationInfo oAuthCodePreparationInfo) {
        this.preparationInfo = oAuthCodePreparationInfo;
    }

    public OAuthConsultResult(boolean z, OAuthAgreementPageInfo oAuthAgreementPageInfo, OAuthCodePreparationInfo oAuthCodePreparationInfo) {
        this.displayAgreementPage = z;
        this.agreementPageInfo = oAuthAgreementPageInfo;
        this.preparationInfo = oAuthCodePreparationInfo;
    }
}
