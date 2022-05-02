package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public abstract class LongConfigListener extends NumberConfigListener {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onLongConfigChanged(@NonNull String str, long j);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNumberConfigChanged(@NonNull String str, @NonNull Number number) {
        onLongConfigChanged(str, number.longValue());
    }
}
