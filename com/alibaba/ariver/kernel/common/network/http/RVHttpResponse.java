package com.alibaba.ariver.kernel.common.network.http;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class RVHttpResponse {

    /* renamed from: a  reason: collision with root package name */
    private int f10108a;
    private Map<String, List<String>> b;
    private InputStream c;

    public int getStatusCode() {
        return this.f10108a;
    }

    public void setStatusCode(int i) {
        this.f10108a = i;
    }

    public Map<String, List<String>> getHeaders() {
        return this.b;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.b = map;
    }

    public InputStream getResStream() {
        return this.c;
    }

    public void setResStream(InputStream inputStream) {
        this.c = inputStream;
    }
}
