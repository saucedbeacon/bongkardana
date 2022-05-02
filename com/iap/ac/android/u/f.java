package com.iap.ac.android.u;

import androidx.annotation.NonNull;
import com.alipay.iap.android.wallet.acl.oauth.OAuthPageConfirmResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.auth.AuthPageResult;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public OAuthService f9761a;

    public f() {
        if (a()) {
            this.f9761a = (OAuthService) a(OAuthService.class);
        }
    }

    public final void a(@NonNull AuthResult authResult, @NonNull OAuthResult oAuthResult) {
        List<String> list;
        authResult.authCode = oAuthResult.getAuthCode();
        authResult.authState = oAuthResult.getAuthState();
        if (oAuthResult.getAuthSuccessScopes() == null) {
            list = null;
        } else {
            list = Arrays.asList(oAuthResult.getAuthSuccessScopes());
        }
        authResult.authSuccessScopes = list;
        authResult.authErrorScopes = oAuthResult.getAuthErrorScopes();
        authResult.authRedirectUrl = oAuthResult.getAuthRedirectUrl();
        Map<String, String> extendedInfo = oAuthResult.getExtendedInfo();
        if (oAuthResult.isHasError() && extendedInfo != null && extendedInfo.size() > 0) {
            authResult.errorCode = extendedInfo.get("errorCode");
            authResult.errorMessage = extendedInfo.get("errorMessage");
        }
    }

    public final void a(@NonNull AuthPageResult authPageResult, @NonNull OAuthPageConfirmResult oAuthPageConfirmResult) {
        authPageResult.success = !oAuthPageConfirmResult.isHasError();
        authPageResult.referenceAgreementId = oAuthPageConfirmResult.getReferenceAgreementId();
        Map<String, String> extendedInfo = oAuthPageConfirmResult.getExtendedInfo();
        if (oAuthPageConfirmResult.isHasError() && extendedInfo != null && extendedInfo.size() > 0) {
            authPageResult.errorCode = extendedInfo.get("errorCode");
            authPageResult.errorMessage = extendedInfo.get("errorMessage");
        }
    }
}
