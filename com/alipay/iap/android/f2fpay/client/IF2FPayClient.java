package com.alipay.iap.android.f2fpay.client;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent;

public interface IF2FPayClient {
    IF2FPayCallbackHolder addPayOpenCallback(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback);

    IF2FPayCallbackHolder addPaymentCodeCallback(@NonNull IF2FPaymentCodeCallback iF2FPaymentCodeCallback);

    void closeF2FPay();

    void deleteOtpSeed();

    F2FPayClientContext getClientContext();

    <T extends IF2FPayBaseComponent> T getComponent(Class<T> cls);

    Context getContext();

    String getSeedExtra();

    boolean getStartRefreshFlag();

    void initialize(@NonNull Application application, @NonNull F2FPayClientContext f2FPayClientContext);

    boolean isInitialized();

    void onDestroy();

    void refreshPaymentCode(int i);

    void setPayResultCallback(@Nullable IF2FPayResultCallback iF2FPayResultCallback);

    void setSeedExtra(String str);

    void setStartRefreshFlag(boolean z);

    void startF2FPay();

    void startRefreshTask();

    void stopRefreshTask();
}
