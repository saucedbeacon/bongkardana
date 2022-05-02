package com.alibaba.griver.api.common.network;

import java.io.InputStream;
import java.io.Serializable;

public class UploadRequest implements Serializable {
    private byte[] ends;
    private byte[] headers;
    private InputStream inputStream;

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream2) {
        this.inputStream = inputStream2;
    }

    public byte[] getHeaders() {
        return this.headers;
    }

    public void setHeaders(byte[] bArr) {
        this.headers = bArr;
    }

    public byte[] getEnds() {
        return this.ends;
    }

    public void setEnds(byte[] bArr) {
        this.ends = bArr;
    }
}
