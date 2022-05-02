package com.alipay.mobile.rome.syncsdk.transport.connection;

import com.alipay.mobile.rome.syncsdk.transport.b.a;

final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f9448a;
    final /* synthetic */ a b;

    b(a aVar, a aVar2) {
        this.b = aVar;
        this.f9448a = aVar2;
    }

    public final void run() {
        this.b.f9447a.a(this.f9448a);
    }
}
