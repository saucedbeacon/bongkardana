package com.alipay.imobile.network.quake.transport.storage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayPool f9388a;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 256);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.f9388a = byteArrayPool;
        this.buf = byteArrayPool.getBuf(Math.max(i, 256));
    }

    private void a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] buf = this.f9388a.getBuf((this.count + i) * 2);
            System.arraycopy(this.buf, 0, buf, 0, this.count);
            this.f9388a.returnBuf(this.buf);
            this.buf = buf;
        }
    }

    public void close() throws IOException {
        this.f9388a.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f9388a.returnBuf(this.buf);
    }

    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
