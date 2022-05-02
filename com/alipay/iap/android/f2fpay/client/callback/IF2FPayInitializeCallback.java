package com.alipay.iap.android.f2fpay.client.callback;

import androidx.annotation.NonNull;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;

public interface IF2FPayInitializeCallback {
    void onInitializeFailed(String str);

    void onInitializeOtpSucceed();

    void onOtpInfoChanged(@NonNull OtpInitResult otpInitResult);
}
