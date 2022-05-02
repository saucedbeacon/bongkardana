package com.iap.ac.config.lite.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public abstract class NumberConfigListener extends AbstractTypedConfigListener<Number> {
    public NumberConfigListener() {
        super(Number.class);
    }

    /* access modifiers changed from: protected */
    public Number getDefaultNumber() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onNumberConfigChanged(@NonNull String str, @NonNull Number number);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onConfigChangedInternal(@NonNull String str, @Nullable Number number) {
        if (number == null) {
            number = getDefaultNumber();
        }
        onNumberConfigChanged(str, number);
    }
}
