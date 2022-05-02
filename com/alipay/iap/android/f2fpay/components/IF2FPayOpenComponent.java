package com.alipay.iap.android.f2fpay.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaySwitchOnVerifier;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;

public interface IF2FPayOpenComponent extends IF2FPayBaseComponent {
    IF2FPayCallbackHolder addOpenCallback(@NonNull IF2FPayOpenCallback iF2FPayOpenCallback);

    void checkOpen();

    boolean isOpen();

    void setLocalOpenFlag(boolean z);

    void setSwitchOnVerifier(@Nullable IF2FPaySwitchOnVerifier iF2FPaySwitchOnVerifier);

    void switchOff();

    void switchOn();
}
