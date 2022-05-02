package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

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
    public void onConfigChangedInternal(@NonNull String str, @Nullable Number number) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-370360630, oncanceled);
            onCancelLoad.getMin(-370360630, oncanceled);
        }
        if (number == null) {
            number = getDefaultNumber();
        }
        onNumberConfigChanged(str, number);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onNumberConfigChanged(@NonNull String str, @NonNull Number number);
}
