package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.concurrent.ScheduledFuture;

final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f9429a;

    private g(f fVar) {
        this.f9429a = fVar;
    }

    /* synthetic */ g(f fVar, byte b) {
        this(fVar);
    }

    public final void run() {
        c.b(f.f9428a, "DelayedConnectTask: ");
        synchronized (this.f9429a) {
            ScheduledFuture unused = this.f9429a.g = null;
        }
        a b = LongLinkService.b();
        if (b == null) {
            c.d(f.f9428a, "DelayedConnectTask: [ connManager=null ]");
        } else {
            b.c();
        }
    }
}
