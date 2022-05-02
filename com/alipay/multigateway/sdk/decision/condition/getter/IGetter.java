package com.alipay.multigateway.sdk.decision.condition.getter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IGetter<T> {
    @Nullable
    T getValue(@NonNull Object obj);
}
