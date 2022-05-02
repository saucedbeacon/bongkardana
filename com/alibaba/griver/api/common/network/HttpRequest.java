package com.alibaba.griver.api.common.network;

import java.io.Serializable;
import java.util.Map;

public class HttpRequest implements Serializable {
    private Map<String, String> headers;
    private String method;
    private byte[] requestData;
    private int timeout;
    private UploadRequest uploadRequest;
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public byte[] getRequestData() {
        return this.requestData;
    }

    public void setRequestData(byte[] bArr) {
        this.requestData = bArr;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public UploadRequest getUploadRequest() {
        return this.uploadRequest;
    }

    public void setUploadRequest(UploadRequest uploadRequest2) {
        this.uploadRequest = uploadRequest2;
    }
}
