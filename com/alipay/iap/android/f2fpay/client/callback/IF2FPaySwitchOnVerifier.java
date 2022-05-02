package com.alipay.iap.android.f2fpay.client.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fpaySwitchOnRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fpayCheckOpenResult;

public interface IF2FPaySwitchOnVerifier {

    public interface Callback {
        void onVerifyCallback(F2fpaySwitchOnRequest f2fpaySwitchOnRequest);

        void onVerifyCanceled();
    }

    void verifySwitchOnF2FPay(@Nullable F2fpayCheckOpenResult f2fpayCheckOpenResult, @NonNull Callback callback);
}
