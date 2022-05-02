package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9440a = e.class.getSimpleName();
    private final a b;

    public e(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 1;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        c.a(f9440a, "processPacket: close ");
        this.b.e();
    }
}
