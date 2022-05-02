package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.concurrent.ScheduledFuture;

final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f9432a;
    private int b = 0;
    private long c;
    private String d;

    public k(f fVar, String str, long j, int i) {
        this.f9432a = fVar;
        this.d = str;
        this.c = j;
        this.b = i;
    }

    public final void run() {
        long j;
        String d2 = f.f9428a;
        StringBuilder sb = new StringBuilder("ReplyCheckTask: [ type=");
        sb.append(this.d);
        sb.append(" ][ sendTimeMillis=");
        sb.append(this.c);
        sb.append(" ][ delay=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(d2, sb.toString());
        a b2 = LongLinkService.b();
        if (b2 == null) {
            c.d(f.f9428a, "ReplyCheckTask: [ connManager=null ]");
            return;
        }
        if ("typeHeartBeat".equals(this.d)) {
            j = b2.n();
            synchronized (this.f9432a) {
                ScheduledFuture unused = this.f9432a.e = null;
            }
        } else if ("typeInit".equals(this.d)) {
            j = b2.o();
            synchronized (this.f9432a) {
                ScheduledFuture unused2 = this.f9432a.f = null;
            }
        } else {
            String d3 = f.f9428a;
            StringBuilder sb2 = new StringBuilder("ReplyCheckTask: [ unknown type ][ type=");
            sb2.append(this.d);
            sb2.append(" ]");
            c.d(d3, sb2.toString());
            return;
        }
        if (this.c > j) {
            String d4 = f.f9428a;
            StringBuilder sb3 = new StringBuilder("ReplyCheckTask: Reply check Timeout[ type=");
            sb3.append(this.d);
            sb3.append(" ][ sendTimeMillis=");
            sb3.append(this.c);
            sb3.append(" ][ lastTime=");
            sb3.append(j);
            sb3.append(" ]");
            c.d(d4, sb3.toString());
            com.alipay.mobile.rome.syncsdk.a.c.c();
            b2.f();
        }
    }
}
