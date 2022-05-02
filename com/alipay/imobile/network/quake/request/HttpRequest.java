package com.alipay.imobile.network.quake.request;

import com.alipay.imobile.network.quake.Request;
import java.lang.reflect.Type;

public class HttpRequest extends Request {

    /* renamed from: a  reason: collision with root package name */
    private final int f9367a;

    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    public HttpRequest(int i, String str, Type type, Request.Listener listener, Request.ErrorListener errorListener) {
        super(str, type, listener, errorListener);
        this.f9367a = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9367a);
        sb.append(":");
        sb.append(str);
        setCacheKey(sb.toString());
    }

    public int getMethod() {
        return this.f9367a;
    }
}
