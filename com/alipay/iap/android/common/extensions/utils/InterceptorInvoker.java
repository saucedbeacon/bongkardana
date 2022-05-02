package com.alipay.iap.android.common.extensions.utils;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.extensions.interceptor.IFilterInterceptor;
import java.util.List;

public class InterceptorInvoker {
    @Nullable
    public static <Request, Response> IAPError beforeExecute(List<IFilterInterceptor<Request, Response>> list, Request request) {
        if (list != null && !list.isEmpty()) {
            for (IFilterInterceptor<Request, Response> beforeExecute : list) {
                IAPError beforeExecute2 = beforeExecute.beforeExecute(request);
                if (beforeExecute2 != null) {
                    return beforeExecute2;
                }
            }
        }
        return null;
    }

    @Nullable
    public static <Request, Response> IAPError afterExecute(List<IFilterInterceptor<Request, Response>> list, Response response) {
        if (list != null && !list.isEmpty()) {
            for (IFilterInterceptor<Request, Response> afterExecute : list) {
                IAPError afterExecute2 = afterExecute.afterExecute(response);
                if (afterExecute2 != null) {
                    return afterExecute2;
                }
            }
        }
        return null;
    }
}
