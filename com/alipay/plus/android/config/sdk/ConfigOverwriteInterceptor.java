package com.alipay.plus.android.config.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ConfigOverwriteInterceptor {
    boolean shouldUpdateConfig(@Nullable String str, @NonNull String str2, @NonNull Object obj, @Nullable Object obj2);
}
