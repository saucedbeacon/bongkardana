package com.alipay.mobile.rome.syncsdk.service.a;

import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.squareup.wire.Message;

public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9425a = h.class.getSimpleName();
    private final a b;

    public h(a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9425a, "UnBindUserTask: run ");
        if (!this.b.r()) {
            c.c(f9425a, "UnBindUserTask: run: [ user not binded ]");
            return;
        }
        c.b(f9425a, "sendUnbindUserPacket: ");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        a2.a(0);
        a2.b(0);
        try {
            a2.a(f.a((Message) com.alipay.mobile.rome.syncsdk.util.a.a(this.b.f9416a, "unbind")));
            this.b.y();
            long currentTimeMillis = System.currentTimeMillis();
            this.b.k().a(a2);
            com.alipay.mobile.rome.syncsdk.service.f.a().b(currentTimeMillis, b.a());
        } catch (Exception e) {
            String str = f9425a;
            StringBuilder sb = new StringBuilder("sendUnbindUserPacket: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
        }
    }
}
