package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public abstract class FloatConfigListener extends NumberConfigListener {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onFloatConfigChanged(@NonNull String str, float f);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNumberConfigChanged(@NonNull String str, @NonNull Number number) {
        onFloatConfigChanged(str, number.floatValue());
    }
}
