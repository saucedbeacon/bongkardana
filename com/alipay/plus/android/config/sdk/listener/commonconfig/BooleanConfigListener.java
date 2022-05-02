package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public abstract class BooleanConfigListener extends AbstractTypedConfigListener<Boolean> {
    public BooleanConfigListener() {
        super(Boolean.class);
    }

    /* access modifiers changed from: protected */
    public boolean getDefaultBoolean() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onBooleanConfigChanged(@NonNull String str, boolean z);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onConfigChangedInternal(@NonNull String str, @Nullable Boolean bool) {
        onBooleanConfigChanged(str, bool != null ? bool.booleanValue() : getDefaultBoolean());
    }
}
