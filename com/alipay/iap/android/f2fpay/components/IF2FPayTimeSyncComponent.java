package com.alipay.iap.android.f2fpay.components;

import com.alipay.iap.android.common.extensions.interceptor.IOverrideInterceptor;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayTickSyncResult;

public interface IF2FPayTimeSyncComponent extends IF2FPayBaseComponent {

    public interface Interceptor extends IOverrideInterceptor<String, F2fPayTickSyncResult> {
    }

    long getServerTime();

    void setServerTime(String str, int i);

    void synchronizeTime();

    void synchronizeTimeInWorker();
}
