package com.alipay.iap.android.f2fpay.extension;

import android.content.Context;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;

public interface IF2FPaySecureStorage {
    boolean checkOtpInfoExist(String str);

    void clear();

    @Nullable
    F2FPayOtpInfo getOtpInfoByIdentity(String str);

    void initialize(Context context);

    void saveOtpInfo(F2FPayOtpInfo f2FPayOtpInfo, String str);
}
