package com.alipay.iap.android.f2fpay.extension.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.cipher.AesCipher;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult;

public class AesCipherOtpInitializeInterceptor implements IF2FPayInitializeComponent.Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final AesCipher f9321a;

    public AesCipherOtpInitializeInterceptor(@NonNull String str, @NonNull String str2) {
        this(str, str2.getBytes());
    }

    public AesCipherOtpInitializeInterceptor(@NonNull String str, @NonNull byte[] bArr) {
        this.f9321a = AesCipher.createRandom(str, bArr);
    }

    @Nullable
    public F2fPayInitResult afterExecute(@Nullable F2fPayInitResult f2fPayInitResult) {
        if (f2fPayInitResult != null) {
            f2fPayInitResult.otpSeed = this.f9321a.decrypt(f2fPayInitResult.otpSeed);
            f2fPayInitResult.serverTime = this.f9321a.decrypt(f2fPayInitResult.serverTime);
        }
        return f2fPayInitResult;
    }

    @Nullable
    public F2fPayInitRequest beforeExecute(@Nullable F2fPayInitRequest f2fPayInitRequest) {
        if (f2fPayInitRequest != null) {
            f2fPayInitRequest.random = this.f9321a.encrypted();
        }
        return f2fPayInitRequest;
    }
}
