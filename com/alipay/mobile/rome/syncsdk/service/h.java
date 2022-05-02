package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.syncsdk.b.a;
import com.alipay.mobile.rome.syncsdk.util.c;

final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f9430a;

    private h(f fVar) {
        this.f9430a = fVar;
    }

    /* synthetic */ h(f fVar, byte b) {
        this(fVar);
    }

    public final void run() {
        c.b(f.f9428a, "FlowControlTask: [ flow control is over ]");
        com.alipay.mobile.rome.syncsdk.a.c.a(false);
        a.a().b(LongLinkService.a().f(), "flow_control");
        a b = LongLinkService.b();
        if (b == null) {
            c.d(f.f9428a, "FlowControlTask: [ connManager=null ]");
        } else {
            b.c();
        }
    }
}
