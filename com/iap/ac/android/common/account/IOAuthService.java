package com.iap.ac.android.common.account;

public interface IOAuthService {
    boolean isAuthorized();

    void notifyOAuthLogin(String str, IOAuthLoginCallback iOAuthLoginCallback);

    void notifyOAuthLogout();

    void registerOAuthEventObserver(OAuthObserver oAuthObserver);

    void unregisterAllOAuthEventObservers();

    void unregisterOAuthEventObserver(OAuthObserver oAuthObserver);
}
