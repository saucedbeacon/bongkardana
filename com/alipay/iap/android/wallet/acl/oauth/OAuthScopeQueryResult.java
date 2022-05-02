package com.alipay.iap.android.wallet.acl.oauth;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class OAuthScopeQueryResult extends BaseResult {
    String[] authorizedScopes;

    public OAuthScopeQueryResult(String... strArr) {
        this.authorizedScopes = strArr;
    }

    public String[] getAuthorizedScopes() {
        return this.authorizedScopes;
    }

    public void setAuthorizedScopes(String[] strArr) {
        this.authorizedScopes = strArr;
    }
}
