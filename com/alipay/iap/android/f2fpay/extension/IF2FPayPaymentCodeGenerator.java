package com.alipay.iap.android.f2fpay.extension;

import android.content.Context;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;

public interface IF2FPayPaymentCodeGenerator {
    void clear();

    String generateCode(Context context, F2FPayOtpInfo f2FPayOtpInfo, long j, Object obj);
}
