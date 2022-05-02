package com.iap.ac.android.container.adapter.appcontainer.provider;

import androidx.annotation.NonNull;
import com.alipay.mobile.nebula.webview.APSslErrorHandler;
import com.iap.ac.android.common.container.provider.interf.ISslErrorHandler;

public class AppSslErrorHandler implements ISslErrorHandler {
    private APSslErrorHandler errorHandler;

    public AppSslErrorHandler(@NonNull APSslErrorHandler aPSslErrorHandler) {
        this.errorHandler = aPSslErrorHandler;
    }

    public void proceed() {
        APSslErrorHandler aPSslErrorHandler = this.errorHandler;
        if (aPSslErrorHandler != null) {
            aPSslErrorHandler.proceed();
        }
    }

    public void cancel() {
        APSslErrorHandler aPSslErrorHandler = this.errorHandler;
        if (aPSslErrorHandler != null) {
            aPSslErrorHandler.cancel();
        }
    }
}
