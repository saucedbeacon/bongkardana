package com.alibaba.griver.core.webview;

import android.webkit.SslErrorHandler;
import com.alibaba.griver.base.api.APSslErrorHandler;

class d implements APSslErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    private SslErrorHandler f10384a;

    d(SslErrorHandler sslErrorHandler) {
        this.f10384a = sslErrorHandler;
    }

    public void cancel() {
        this.f10384a.cancel();
    }

    public void proceed() {
        this.f10384a.proceed();
    }
}
