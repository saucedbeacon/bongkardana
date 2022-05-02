package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9441a = f.class.getSimpleName();
    private final a b;

    public f(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 3;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        c.a(f9441a, "processPacket: heartbeat ");
        this.b.a(System.currentTimeMillis());
        if (aVar.b() == 0) {
            try {
                com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
                a2.a(3);
                a2.b(1);
                a2.a("");
                this.b.k().a(a2);
            } catch (Exception e) {
                String str = f9441a;
                StringBuilder sb = new StringBuilder("processPacket: [ Exception=");
                sb.append(e);
                sb.append(" ]");
                c.d(str, sb.toString());
            }
        }
        com.alipay.mobile.rome.syncsdk.service.f.a().b(b.c());
    }
}
