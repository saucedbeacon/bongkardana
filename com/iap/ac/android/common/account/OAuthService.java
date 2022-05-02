package com.iap.ac.android.common.account;

import com.iap.ac.android.common.log.ACLog;

public enum OAuthService {
    INSTANCE;
    
    private static final String TAG = "OAuthService";
    private IOAuthService IOAuthService;

    public final void authLogin(String str, IOAuthLoginCallback iOAuthLoginCallback) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.notifyOAuthLogin(str, iOAuthLoginCallback);
        } else {
            noImplementationError();
        }
    }

    public final void authLogout() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.notifyOAuthLogout();
        } else {
            noImplementationError();
        }
    }

    public final boolean isAuthorized() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            return iOAuthService.isAuthorized();
        }
        noImplementationError();
        return false;
    }

    public final void registerOAuthEventObserver(OAuthObserver oAuthObserver) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.registerOAuthEventObserver(oAuthObserver);
        } else {
            noImplementationError();
        }
    }

    public final void unregisterOAuthEventObserver(OAuthObserver oAuthObserver) {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.unregisterOAuthEventObserver(oAuthObserver);
        } else {
            noImplementationError();
        }
    }

    public final void unregisterAllOAuthEventObservers() {
        IOAuthService iOAuthService = this.IOAuthService;
        if (iOAuthService != null) {
            iOAuthService.unregisterAllOAuthEventObservers();
        } else {
            noImplementationError();
        }
    }

    public final void setOAuthService(IOAuthService iOAuthService) {
        this.IOAuthService = iOAuthService;
    }

    private void noImplementationError() {
        ACLog.e(TAG, "No implementation found! Please setAccountService first.");
    }
}
