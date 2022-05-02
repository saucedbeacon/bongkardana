package com.alipay.iap.android.wallet.acl.onboarding;

import java.util.Map;

class LoginInfo {
    private Map<String, String> extendedInfo;
    private LoginType loginType;

    LoginInfo(LoginType loginType2, Map<String, String> map) {
        this.loginType = loginType2;
        this.extendedInfo = map;
    }

    public LoginType getLoginType() {
        return this.loginType;
    }

    public void setLoginType(LoginType loginType2) {
        this.loginType = loginType2;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
