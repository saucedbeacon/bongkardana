package com.alipay.imobile.network.quake.transport.storage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a extends BufferedInputStream {

    /* renamed from: a  reason: collision with root package name */
    protected int f9389a = 0;

    public a(InputStream inputStream) {
        super(inputStream, 8192);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f9389a += read;
        }
        return read;
    }
}
