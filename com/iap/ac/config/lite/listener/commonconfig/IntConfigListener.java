package com.iap.ac.config.lite.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public abstract class IntConfigListener extends NumberConfigListener {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onIntConfigChanged(@NonNull String str, int i);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNumberConfigChanged(@NonNull String str, @NonNull Number number) {
        onIntConfigChanged(str, number.intValue());
    }
}
