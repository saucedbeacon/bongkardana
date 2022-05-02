package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public abstract class DoubleConfigListener extends NumberConfigListener {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onDoubleConfigChanged(@NonNull String str, double d);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNumberConfigChanged(@NonNull String str, @NonNull Number number) {
        onDoubleConfigChanged(str, number.doubleValue());
    }
}
