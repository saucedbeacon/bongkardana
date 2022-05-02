package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.onboarding.OnboardingService;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.auth.TrustLoginInfo;

public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public OnboardingService f9763a;

    public h() {
        if (a()) {
            this.f9763a = (OnboardingService) a(OnboardingService.class);
        }
    }

    public final TrustLoginInfo a(String str) {
        TrustLoginInfo trustLoginInfo = new TrustLoginInfo();
        trustLoginInfo.success = false;
        trustLoginInfo.errorCode = ResultCode.UNKNOWN_EXCEPTION;
        trustLoginInfo.errorMessage = str;
        return trustLoginInfo;
    }
}
