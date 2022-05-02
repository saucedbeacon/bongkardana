package com.alibaba.griver.core.webview;

import android.webkit.HttpAuthHandler;
import com.alibaba.griver.base.api.APHttpAuthHandler;

class b implements APHttpAuthHandler {

    /* renamed from: a  reason: collision with root package name */
    HttpAuthHandler f10381a;

    b(HttpAuthHandler httpAuthHandler) {
        this.f10381a = httpAuthHandler;
    }

    public void cancel() {
        HttpAuthHandler httpAuthHandler = this.f10381a;
        if (httpAuthHandler != null) {
            httpAuthHandler.cancel();
        }
    }

    public void proceed(String str, String str2) {
        HttpAuthHandler httpAuthHandler = this.f10381a;
        if (httpAuthHandler != null) {
            httpAuthHandler.proceed(str, str2);
        }
    }

    public boolean useHttpAuthUsernamePassword() {
        HttpAuthHandler httpAuthHandler = this.f10381a;
        return httpAuthHandler != null && httpAuthHandler.useHttpAuthUsernamePassword();
    }
}
