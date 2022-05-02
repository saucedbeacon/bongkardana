package com.iap.ac.config.lite.dns.lookup;

import java.nio.ByteBuffer;
import kotlin.UShort;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f9804a;
    private int b = -1;
    private int c = -1;

    public a(byte[] bArr) {
        this.f9804a = ByteBuffer.wrap(bArr);
    }

    private void d(int i) throws DNSException {
        if (i > g()) {
            throw new DNSException("end of input");
        }
    }

    public void a() {
        ByteBuffer byteBuffer = this.f9804a;
        byteBuffer.limit(byteBuffer.capacity());
    }

    public int b() {
        return this.f9804a.position();
    }

    public void c(int i) {
        if (i <= this.f9804a.capacity() - this.f9804a.position()) {
            ByteBuffer byteBuffer = this.f9804a;
            byteBuffer.limit(byteBuffer.position() + i);
            return;
        }
        throw new IllegalArgumentException("cannot set active region past end of input");
    }

    public long e() throws DNSException {
        d(4);
        return ((long) this.f9804a.getInt()) & 4294967295L;
    }

    public int f() throws DNSException {
        d(1);
        return this.f9804a.get() & 255;
    }

    public int g() {
        return this.f9804a.remaining();
    }

    public void h() {
        int i = this.b;
        if (i >= 0) {
            this.f9804a.position(i);
            this.f9804a.limit(this.c);
            this.b = -1;
            this.c = -1;
            return;
        }
        throw new IllegalStateException("no previous state");
    }

    public void i() {
        this.b = this.f9804a.position();
        this.c = this.f9804a.limit();
    }

    public void a(int i) {
        if (i < this.f9804a.capacity()) {
            this.f9804a.position(i);
            ByteBuffer byteBuffer = this.f9804a;
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException("cannot jump past end of input");
    }

    public byte[] b(int i) throws DNSException {
        d(i);
        byte[] bArr = new byte[i];
        this.f9804a.get(bArr, 0, i);
        return bArr;
    }

    public int d() throws DNSException {
        d(2);
        return this.f9804a.getShort() & UShort.MAX_VALUE;
    }

    public byte[] c() throws DNSException {
        return b(f());
    }

    public void a(byte[] bArr, int i, int i2) throws DNSException {
        d(i2);
        this.f9804a.get(bArr, i, i2);
    }
}
