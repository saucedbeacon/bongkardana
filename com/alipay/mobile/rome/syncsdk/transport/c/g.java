package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9442a = g.class.getSimpleName();
    private final a b;

    public g(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 8;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        c.a(f9442a, "ImplLinkSync processPacket");
        byte[] e = aVar.e();
        if (e == null || e.length <= 0) {
            c.d(f9442a, "processPacket: [ packet dataStr=null ]");
        } else {
            this.b.l().a(e);
        }
    }
}
