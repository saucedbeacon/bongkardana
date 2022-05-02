package com.alibaba.ariver.kernel.common.io;

import com.alibaba.ariver.kernel.common.utils.IOUtils;
import java.io.ByteArrayOutputStream;

public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayPool f10095a;

    public PoolingByteArrayOutputStream() {
        this(IOUtils.getByteArrayPool(), 1024);
    }

    public PoolingByteArrayOutputStream(int i) {
        this(IOUtils.getByteArrayPool(), i);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 1024);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.f10095a = byteArrayPool;
        this.buf = byteArrayPool.getBuf(Math.max(i, 1024));
    }

    public void close() {
        this.f10095a.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f10095a.returnBuf(this.buf);
    }

    private void a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] buf = this.f10095a.getBuf((this.count + i) * 2);
            System.arraycopy(this.buf, 0, buf, 0, this.count);
            this.f10095a.returnBuf(this.buf);
            this.buf = buf;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
