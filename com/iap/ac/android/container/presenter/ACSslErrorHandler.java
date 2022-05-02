package com.iap.ac.android.container.presenter;

import android.webkit.SslErrorHandler;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.provider.interf.ISslErrorHandler;

public class ACSslErrorHandler implements ISslErrorHandler {
    private SslErrorHandler handler;

    public ACSslErrorHandler(@NonNull SslErrorHandler sslErrorHandler) {
        this.handler = sslErrorHandler;
    }

    public void proceed() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public void cancel() {
        SslErrorHandler sslErrorHandler = this.handler;
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }
}
