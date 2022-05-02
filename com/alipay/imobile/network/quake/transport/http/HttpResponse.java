package com.alipay.imobile.network.quake.transport.http;

import com.alipay.imobile.network.quake.transport.http.HttpHeaders;
import java.util.List;

public class HttpResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f9382a;
    private final int b;
    private final String c;
    private final HttpHeaders d;
    private final HttpResponseBody e;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f9383a;
        /* access modifiers changed from: private */
        public int b = -1;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public HttpHeaders.Builder d = new HttpHeaders.Builder();
        /* access modifiers changed from: private */
        public HttpResponseBody e;

        public Builder addHeader(String str, String str2) {
            this.d.add(str, str2);
            return this;
        }

        public Builder body(HttpResponseBody httpResponseBody) {
            this.e = httpResponseBody;
            return this;
        }

        public HttpResponse build() {
            if (this.b >= 0) {
                return new HttpResponse(this);
            }
            StringBuilder sb = new StringBuilder("code < 0: ");
            sb.append(this.b);
            throw new IllegalStateException(sb.toString());
        }

        public Builder code(int i) {
            this.b = i;
            return this;
        }

        public Builder header(String str, String str2) {
            this.d.set(str, str2);
            return this;
        }

        public Builder headers(HttpHeaders httpHeaders) {
            this.d = httpHeaders.b();
            return this;
        }

        public Builder message(String str) {
            this.c = str;
            return this;
        }

        public Builder protocol(String str) {
            this.f9383a = str;
            return this;
        }

        public Builder removeHeader(String str) {
            this.d.removeAll(str);
            return this;
        }
    }

    private HttpResponse(Builder builder) {
        this.f9382a = builder.f9383a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d.build();
        this.e = builder.e;
    }

    public int a() {
        return this.b;
    }

    public List<String> a(String str) {
        return this.d.a(str);
    }

    public HttpHeaders b() {
        return this.d;
    }

    public HttpResponseBody c() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response{code=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
