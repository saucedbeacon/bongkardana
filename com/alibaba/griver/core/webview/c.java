package com.alibaba.griver.core.webview;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import androidx.annotation.NonNull;

class c extends SslError {

    /* renamed from: a  reason: collision with root package name */
    private SslError f10382a;

    public String getUrl() {
        return null;
    }

    c(int i, SslCertificate sslCertificate, SslError sslError) {
        super(i, sslCertificate);
        if (sslError == null) {
            this.f10382a = new a(i, sslCertificate);
        } else {
            this.f10382a = sslError;
        }
    }

    public SslCertificate getCertificate() {
        return this.f10382a.getCertificate();
    }

    public boolean addError(int i) {
        SslError sslError = this.f10382a;
        return sslError != null && sslError.addError(i);
    }

    public boolean hasError(int i) {
        return this.f10382a.hasError(i);
    }

    public int getPrimaryError() {
        return this.f10382a.getPrimaryError();
    }

    class a extends SslError {
        public boolean addError(int i) {
            return false;
        }

        @NonNull
        public String getUrl() {
            return null;
        }

        public boolean hasError(int i) {
            return false;
        }

        public String toString() {
            return "Null SslError instance";
        }

        public a(int i, SslCertificate sslCertificate) {
            super(i, sslCertificate);
        }

        public int getPrimaryError() {
            return super.getPrimaryError();
        }
    }
}
