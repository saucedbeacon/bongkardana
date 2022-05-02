package com.alipay.iap.android.common.extensions.interceptor;

import androidx.annotation.Nullable;

public interface IOverrideInterceptor<Request, Response> {
    @Nullable
    Response afterExecute(@Nullable Response response);

    @Nullable
    Request beforeExecute(@Nullable Request request);
}
