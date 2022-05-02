package com.alipay.mobile.rome.syncsdk.service.a;

import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9419a = b.class.getSimpleName();
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9419a, "CloseConnTask: run: ");
        if (!this.b.p()) {
            c.c(f9419a, "sendClosePacket: [ isConnected=false ]");
            return;
        }
        c.b(f9419a, "sendClosePacket: ");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        a2.a(1);
        a2.b(0);
        a2.a("");
        try {
            this.b.k().a(a2);
        } catch (Exception e) {
            String str = f9419a;
            StringBuilder sb = new StringBuilder("sendClosePacket: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
        }
    }
}
