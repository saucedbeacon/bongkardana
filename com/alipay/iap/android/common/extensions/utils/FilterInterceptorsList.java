package com.alipay.iap.android.common.extensions.utils;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.extensions.interceptor.IFilterInterceptor;
import java.util.ArrayList;
import java.util.List;

public class FilterInterceptorsList<Request, Response> {
    private List<IFilterInterceptor<Request, Response>> mInterceptors = new ArrayList();

    public synchronized void addInterceptor(IFilterInterceptor<Request, Response> iFilterInterceptor) {
        if (iFilterInterceptor != null) {
            this.mInterceptors.add(iFilterInterceptor);
        }
    }

    public synchronized void removeInterceptor(IFilterInterceptor<Request, Response> iFilterInterceptor) {
        this.mInterceptors.remove(iFilterInterceptor);
    }

    public synchronized void clear() {
        this.mInterceptors.clear();
    }

    public List<IFilterInterceptor<Request, Response>> getInterceptors() {
        return this.mInterceptors;
    }

    @Nullable
    public synchronized IAPError executeBefore(Request request) {
        return InterceptorInvoker.beforeExecute(this.mInterceptors, request);
    }

    @Nullable
    public synchronized IAPError executeAfter(Response response) {
        return InterceptorInvoker.afterExecute(this.mInterceptors, response);
    }
}
