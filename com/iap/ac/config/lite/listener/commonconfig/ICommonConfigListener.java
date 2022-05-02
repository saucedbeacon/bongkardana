package com.iap.ac.config.lite.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.config.lite.listener.ConfigChangeType;

public interface ICommonConfigListener {
    @WorkerThread
    void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType);
}
