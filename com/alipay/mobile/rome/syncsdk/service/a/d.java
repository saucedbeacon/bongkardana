package com.alipay.mobile.rome.syncsdk.service.a;

import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9421a = d.class.getSimpleName();
    private final a b;

    public d(a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9421a, "DisconnectTask: run: ");
        c.b(f9421a, "disconnect: [ DisconnectTask ]");
        this.b.a();
        com.alipay.mobile.rome.syncsdk.transport.connection.a k = this.b.k();
        this.b.a((com.alipay.mobile.rome.syncsdk.transport.connection.a) null);
        if (k != null) {
            k.d();
        }
    }
}
