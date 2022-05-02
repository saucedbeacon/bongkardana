package com.alipay.iap.android.f2fpay.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2fPayOrderInfo;

public interface IF2FPayResultHandleComponent extends IF2FPayBaseComponent {

    public interface IPayResultDecoder<T> {
        @NonNull
        F2fPayOrderInfo convertF2fPayOrderInfo(@NonNull T t);

        @NonNull
        Class<T> getPayOrderInfoClass();
    }

    void setPayResultCallback(@Nullable IF2FPayResultCallback iF2FPayResultCallback);

    <T> void setPayResultDecoder(@Nullable IPayResultDecoder<T> iPayResultDecoder);

    void setRefreshCodeWhenLastCodePayed(boolean z);

    void startHandleResult();

    void stopHandleResult();
}
