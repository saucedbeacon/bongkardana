package com.alipay.mobile.rome.syncsdk.service.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.ConnStateFsm;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.squareup.wire.Message;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9423a = f.class.getSimpleName();
    private final a b;

    public f(a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9423a, "RegisterTask: run ");
        if (ConnStateFsm.State.CONNECTED != this.b.b()) {
            c.c(f9423a, "RegisterTask: run: [ not connected state ]");
            return;
        }
        c.b(f9423a, "sendRegisterPacket");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        boolean z = false;
        a2.a(0);
        a2.b(0);
        try {
            String h = com.alipay.mobile.rome.syncsdk.a.c.h();
            if (TextUtils.isEmpty(h)) {
                h = "reconn";
            }
            a2.a(com.alipay.mobile.rome.syncsdk.util.f.a((Message) com.alipay.mobile.rome.syncsdk.util.a.a(this.b.f9416a, h)));
            if (ConnStateFsm.State.CONNECTED != this.b.b()) {
                c.c(f9423a, "RegisterTask: run: [ not connected state ]");
                return;
            }
            if (!TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().f9405a) && !TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().f())) {
                z = true;
            }
            if (z) {
                this.b.v();
            } else {
                this.b.w();
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.b.k().a(a2);
            com.alipay.mobile.rome.syncsdk.service.f.a().b(currentTimeMillis, b.a());
        } catch (Throwable th) {
            String str = f9423a;
            StringBuilder sb = new StringBuilder("sendRegisterPacket: [ Exception=");
            sb.append(th);
            sb.append(" ]");
            sb.append(th.getMessage());
            c.d(str, sb.toString());
            com.alipay.mobile.rome.syncsdk.service.f.a().a(b.b());
        }
    }
}
