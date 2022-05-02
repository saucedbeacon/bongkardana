package com.alipay.iap.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ICommonConfigChangeListener {
    void onConfigChanged(@NonNull String str, @Nullable String str2);
}
