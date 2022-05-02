package com.iap.ac.config.lite.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class DoubleConfigListener extends NumberConfigListener {
    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onDoubleConfigChanged(@NonNull String str, double d);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNumberConfigChanged(@NonNull String str, @NonNull Number number) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(137496406, oncanceled);
            onCancelLoad.getMin(137496406, oncanceled);
        }
        onDoubleConfigChanged(str, number.doubleValue());
    }
}
