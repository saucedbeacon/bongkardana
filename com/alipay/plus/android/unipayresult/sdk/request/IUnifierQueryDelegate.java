package com.alipay.plus.android.unipayresult.sdk.request;

import androidx.annotation.NonNull;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierPayResultInfo;

public interface IUnifierQueryDelegate {
    @NonNull
    IUnifierRequest generateRequest();

    void parseBizResultInfo(@NonNull String str, @NonNull UnifierPayResultInfo unifierPayResultInfo);
}
