package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.concurrent.ScheduledFuture;

final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f9431a;

    private i(f fVar) {
        this.f9431a = fVar;
    }

    /* synthetic */ i(f fVar, byte b) {
        this(fVar);
    }

    public final void run() {
        c.b(f.f9428a, "HeartBeatTask: ");
        synchronized (this.f9431a) {
            ScheduledFuture unused = this.f9431a.d = null;
        }
        a b = LongLinkService.b();
        if (b == null) {
            c.d(f.f9428a, "HeartBeatTask: [ connManager=null ]");
        } else {
            b.h();
        }
    }
}
