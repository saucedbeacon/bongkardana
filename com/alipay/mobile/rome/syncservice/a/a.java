package com.alipay.mobile.rome.syncservice.a;

import android.content.Context;
import com.alipay.mobile.rome.syncsdk.b;

public final class a {
    private static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    public volatile b f9465a = b.a(this.b);
    private volatile Context b = com.alipay.mobile.rome.syncservice.d.a.f9473a;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public final synchronized void a(com.alipay.mobile.rome.syncsdk.a aVar) {
        this.f9465a.a(aVar);
    }

    public final synchronized void a(String str, String str2) {
        this.f9465a.a(str, str2);
    }

    public final synchronized void b() {
        this.f9465a.a();
    }

    public final synchronized boolean c() {
        return this.f9465a.b();
    }

    public final synchronized void d() {
        this.f9465a.c();
    }

    public final synchronized void e() {
        this.f9465a.d();
    }

    public final synchronized void a(byte[] bArr) {
        this.f9465a.a(bArr);
    }
}
