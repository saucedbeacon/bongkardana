package com.alipay.iap.android.f2fpay.paymentcode;

import android.text.TextUtils;

public class F2FPaymentCodeInfo {
    public String paymentCode;
    public String totp;

    public F2FPaymentCodeInfo() {
    }

    public F2FPaymentCodeInfo(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
        this.paymentCode = f2FPaymentCodeInfo.paymentCode;
        this.totp = f2FPaymentCodeInfo.totp;
    }

    public F2FPaymentCodeInfo(String str, String str2) {
        this.paymentCode = str;
        this.totp = str2;
    }

    public boolean isCodeEmpty() {
        return TextUtils.isEmpty(this.paymentCode) && TextUtils.isEmpty(this.totp);
    }
}
