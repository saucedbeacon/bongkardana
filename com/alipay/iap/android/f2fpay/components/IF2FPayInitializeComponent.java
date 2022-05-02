package com.alipay.iap.android.f2fpay.components;

import androidx.annotation.Nullable;
import com.alipay.iap.android.common.extensions.interceptor.IOverrideInterceptor;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback;
import com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult;

public interface IF2FPayInitializeComponent extends IF2FPayBaseComponent {

    public interface Interceptor extends IOverrideInterceptor<F2fPayInitRequest, F2fPayInitResult> {
    }

    void addInitializeCallback(IF2FPayInitializeCallback iF2FPayInitializeCallback);

    void asyncInitializeOtpInfo();

    void clearOtpInfo();

    int getRefreshInterval();

    void initializeOtpInfoInWorker(String str, String str2);

    void setInitializeInterceptor(@Nullable Interceptor interceptor);
}
