package com.iap.ac.android.common.task.async;

import androidx.annotation.Nullable;

public interface IAPAsyncCallback<T> {
    void onFailure(Exception exc);

    void onSuccess(@Nullable T t);
}
