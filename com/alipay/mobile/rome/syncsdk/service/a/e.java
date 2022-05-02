package com.alipay.mobile.rome.syncsdk.service.a;

import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.service.f;
import com.alipay.mobile.rome.syncsdk.util.c;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9422a = e.class.getSimpleName();
    private final a b;

    public e(a aVar) {
        this.b = aVar;
    }

    public void run() {
        c.a(f9422a, "HeartBeatTask: run: ");
        if (!this.b.q()) {
            c.c(f9422a, "HeartBeatTask: run: [ connection isDeviceBined=false ]");
            return;
        }
        c.b(f9422a, "sendHeartBeat: ");
        com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
        a2.a(3);
        a2.b(0);
        a2.a("");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.b.k().a(a2);
            f.a().a(currentTimeMillis, b.a());
        } catch (Exception e) {
            String str = f9422a;
            StringBuilder sb = new StringBuilder("sendHeartBeat: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
        }
    }
}
