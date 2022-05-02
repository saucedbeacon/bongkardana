package com.alibaba.griver.api.common.network;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class HttpResponse implements Serializable {
    public static final int HTTP_OK = 200;
    private Map<String, List<String>> headers;
    private InputStream inputStream;
    private int statusCode;

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream2) {
        this.inputStream = inputStream2;
    }
}
