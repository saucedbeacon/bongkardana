package com.iap.ac.android.z;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.auth.AuthPageRequest;
import com.iap.ac.android.biz.common.model.auth.AuthPageResult;
import com.iap.ac.android.biz.common.model.auth.AuthRequest;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.gol.model.SignContractBizContent;

public class e extends c {
    public SignContractBizContent i = new SignContractBizContent();

    public class a implements AcCallback<AuthPageResult> {
        public a() {
        }

        public void onResult(AcBaseResult acBaseResult) {
            e.this.a((AuthPageResult) acBaseResult);
        }
    }

    public class b implements IAuthCallback {
        public b() {
        }

        public void onResult(@NonNull AuthResult authResult) {
            e.this.a(authResult);
        }
    }

    public e(boolean z) {
        super(z);
    }

    public final void a(@NonNull SignContractBizContent signContractBizContent) {
        ACLog.i(Constants.TAG, "signContract BizContentAuthProcessor enter in thread");
        AuthPageRequest authPageRequest = new AuthPageRequest();
        authPageRequest.authClientLogo = signContractBizContent.authClientLogo;
        authPageRequest.authClientName = signContractBizContent.authClientName;
        authPageRequest.clientId = signContractBizContent.clientId;
        authPageRequest.passThroughInfo = signContractBizContent.passThroughInfo;
        SPIManager.getInstance().showAuthPage(authPageRequest, new a());
    }

    public final void a(AuthPageResult authPageResult) {
        if (authPageResult == null || !authPageResult.success) {
            String str = (authPageResult == null || TextUtils.isEmpty(authPageResult.errorCode)) ? ResultCode.UNKNOWN_EXCEPTION : authPageResult.errorCode;
            String str2 = (authPageResult == null || TextUtils.isEmpty(authPageResult.errorMessage)) ? "Oops! System busy. Try again later!" : authPageResult.errorMessage;
            a(false, str, str2, String.format("signContract error with showAuthPage: %s, %s ", new Object[]{str, str2}));
            return;
        }
        AuthRequest authRequest = new AuthRequest();
        SignContractBizContent signContractBizContent = this.i;
        authRequest.acquirerId = signContractBizContent.acquirerId;
        authRequest.authClientId = signContractBizContent.authClientId;
        authRequest.authRedirectUrl = signContractBizContent.authRedirectUrl;
        authRequest.clientId = signContractBizContent.clientId;
        authRequest.referenceAgreementId = signContractBizContent.referenceAgreementId;
        if (!TextUtils.isEmpty(authPageResult.referenceAgreementId)) {
            authRequest.referenceAgreementId = authPageResult.referenceAgreementId;
        }
        SignContractBizContent signContractBizContent2 = this.i;
        authRequest.scopes = signContractBizContent2.scopes;
        authRequest.passThroughInfo = signContractBizContent2.passThroughInfo;
        SPIManager.getInstance().getAuthCode(authRequest, (IAuthCallback) new b());
    }
}
