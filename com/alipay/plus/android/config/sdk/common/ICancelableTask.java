package com.alipay.plus.android.config.sdk.common;

public interface ICancelableTask {
    void cancel();

    boolean isCanceled();
}
