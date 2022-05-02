package com.alipay.mobile.rome.syncsdk.service.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.ConnStateFsm;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.squareup.wire.Message;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9418a = a.class.getSimpleName();
    private final com.alipay.mobile.rome.syncsdk.service.a b;

    public a(com.alipay.mobile.rome.syncsdk.service.a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9418a, "BindUserTask: run ");
        if (ConnStateFsm.State.DEVICE_BINDED != this.b.b()) {
            c.c(f9418a, "BindUserTask: run: [ not device binded state ]");
            return;
        }
        c.b(f9418a, "sendBindUserPacket: ");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        a2.a(0);
        a2.b(0);
        String str = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        String f = com.alipay.mobile.rome.syncsdk.a.a.a().f();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(f)) {
            c.c(f9418a, "sendBindUserPacket: [ userId or sessionId is null ]");
            return;
        }
        a2.a(f.a((Message) com.alipay.mobile.rome.syncsdk.util.a.a(this.b.f9416a, "bind")));
        try {
            if (ConnStateFsm.State.DEVICE_BINDED != this.b.b()) {
                c.c(f9418a, "BindUserTask: run: [ not device binded state ]");
                return;
            }
            this.b.x();
            long currentTimeMillis = System.currentTimeMillis();
            this.b.k().a(a2);
            com.alipay.mobile.rome.syncsdk.service.f.a().b(currentTimeMillis, b.a());
        } catch (Exception e) {
            String str2 = f9418a;
            StringBuilder sb = new StringBuilder("sendBindUserPacket: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str2, sb.toString());
        }
    }
}
