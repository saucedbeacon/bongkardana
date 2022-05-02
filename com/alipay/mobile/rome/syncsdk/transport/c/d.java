package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.transport.b.a;

final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    a f9439a;
    final /* synthetic */ b b;
    private a c;

    public d(b bVar, a aVar, a aVar2) {
        this.b = bVar;
        this.c = aVar2;
        this.f9439a = aVar;
    }

    public final void run() {
        this.f9439a.a(this.c);
    }
}
