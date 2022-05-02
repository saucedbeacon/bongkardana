package com.alipay.iap.android.f2fpay.common;

import android.text.TextUtils;
import androidx.annotation.Nullable;

public class F2FPayException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f10668a;

    public F2FPayException(String str) {
        this(F2FPayErrorCode.OTHER_ERROR, str);
    }

    public F2FPayException(@Nullable String str, String str2) {
        super(str2);
        this.f10668a = TextUtils.isEmpty(str) ? F2FPayErrorCode.OTHER_ERROR : str;
    }

    public String getErrorCode() {
        return this.f10668a;
    }
}
