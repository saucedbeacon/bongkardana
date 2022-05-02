package com.iap.ac.android.gol.google.model;

import androidx.annotation.Keep;
import com.iap.ac.android.d.e;

@Keep
public class AuthenticationResult {
    public String extendInfo;
    public MerchantAuthenticationResult merchantAuthenticationResponse;
    public String state;

    public String getAuthUrl() {
        AuthenticationExtendInfo authenticationExtendInfo;
        String str = this.extendInfo;
        if (str == null || (authenticationExtendInfo = (AuthenticationExtendInfo) e.a(str, AuthenticationExtendInfo.class)) == null) {
            return null;
        }
        return authenticationExtendInfo.authUrl;
    }
}
