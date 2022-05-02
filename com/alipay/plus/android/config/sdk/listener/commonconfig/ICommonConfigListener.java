package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;

public interface ICommonConfigListener {
    @WorkerThread
    void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType);
}
