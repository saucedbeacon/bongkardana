package com.alipay.iap.android.common.extensions.interceptor;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;

public interface IFilterInterceptor<Request, Response> {
    IAPError afterExecute(@Nullable Response response);

    IAPError beforeExecute(@Nullable Request request);
}
