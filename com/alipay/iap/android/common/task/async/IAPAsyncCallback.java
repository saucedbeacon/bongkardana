package com.alipay.iap.android.common.task.async;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;

public interface IAPAsyncCallback<T> {
    void onFailure(IAPError iAPError);

    void onSuccess(@Nullable T t);
}
