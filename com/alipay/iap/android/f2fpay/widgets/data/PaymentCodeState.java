package com.alipay.iap.android.f2fpay.widgets.data;

public enum PaymentCodeState {
    Loading,
    Failure,
    Success;

    public final boolean isFailure() {
        return this == Failure;
    }

    public final boolean isLoading() {
        return this == Loading;
    }

    public final boolean isSuccess() {
        return this == Success;
    }
}
