package com.alipay.iap.android.wallet.acl.onboarding;

import java.util.Map;

class AutoLoginInfo extends LoginInfo {
    private String clientKey;
    private String userId;

    AutoLoginInfo(String str, String str2) {
        super(LoginType.AUTO_LOGIN, (Map<String, String>) null);
        this.userId = str;
        this.clientKey = str2;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }
}
