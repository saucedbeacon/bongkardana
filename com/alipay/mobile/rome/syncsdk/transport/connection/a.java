package com.alipay.mobile.rome.syncsdk.transport.connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public com.alipay.mobile.rome.syncsdk.transport.c.a f9447a;
    public com.alipay.mobile.rome.syncsdk.transport.c.a b;
    public DataInputStream c;
    public DataOutputStream d;
    public final c e;
    public int f;

    public abstract void a();

    public abstract void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar);

    public abstract void a(Throwable th);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public a(c cVar) {
        this.e = cVar;
    }
}
