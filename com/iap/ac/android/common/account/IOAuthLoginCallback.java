package com.iap.ac.android.common.account;

public interface IOAuthLoginCallback {
    void onOAuthLoginFail(String str, String str2);

    void onOAuthLoginSuccess();
}
