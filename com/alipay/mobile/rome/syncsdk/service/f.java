package com.alipay.mobile.rome.syncsdk.service;

import android.content.Context;
import com.alipay.mobile.rome.syncsdk.b.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9428a = f.class.getSimpleName();
    private static volatile ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor(new j());
    private static volatile f c;
    /* access modifiers changed from: private */
    public volatile ScheduledFuture<?> d;
    /* access modifiers changed from: private */
    public volatile ScheduledFuture<?> e;
    /* access modifiers changed from: private */
    public volatile ScheduledFuture<?> f;
    /* access modifiers changed from: private */
    public volatile ScheduledFuture<?> g;
    private volatile ScheduledFuture<?> h;

    private f() {
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (c == null) {
                c = new f();
            }
            fVar = c;
        }
        return fVar;
    }

    public final synchronized void a(int i) {
        String str = f9428a;
        StringBuilder sb = new StringBuilder("startDelayedConnectTimer [ delay=");
        sb.append(i);
        sb.append(" ]");
        c.b(str, sb.toString());
        i();
        if (this.g == null || this.g.isDone() || this.g.isCancelled()) {
            this.g = b.schedule(new g(this, (byte) 0), (long) i, TimeUnit.SECONDS);
            return;
        }
        String str2 = f9428a;
        StringBuilder sb2 = new StringBuilder("already have a DelayedConnectTimer: [ delayedConnectFuture=");
        sb2.append(this.g);
        sb2.append(" ]");
        c.c(str2, sb2.toString());
    }

    private synchronized void e() {
        c.a(f9428a, "stopDelayedConnectTimer: ");
        if (this.g != null && !this.g.isDone()) {
            this.g.cancel(true);
        }
    }

    public final synchronized void b(int i) {
        String str = f9428a;
        StringBuilder sb = new StringBuilder("startHeartBeatTimer [ delay=");
        sb.append(i);
        sb.append(" ]");
        c.b(str, sb.toString());
        i();
        f();
        this.d = b.schedule(new i(this, (byte) 0), (long) i, TimeUnit.SECONDS);
    }

    private synchronized void f() {
        c.a(f9428a, "stopHeartBeatTimer: ");
        if (this.d != null && !this.d.isDone()) {
            this.d.cancel(true);
        }
    }

    public final synchronized void a(long j, int i) {
        a("typeHeartBeat", j, i);
    }

    private synchronized void g() {
        c.a(f9428a, "stopHeartBeatReplayCheckTimer: ");
        if (this.e != null && !this.e.isDone()) {
            this.e.cancel(true);
        }
    }

    public final synchronized boolean b() {
        if (this.e == null || this.e.isDone()) {
            return false;
        }
        return true;
    }

    public final synchronized void b(long j, int i) {
        a("typeInit", j, i);
    }

    private synchronized void h() {
        c.a(f9428a, "stopInitReplayCheckTimer: ");
        if (this.f != null && !this.f.isDone()) {
            this.f.cancel(true);
        }
    }

    private synchronized void a(String str, long j, int i) {
        String str2 = f9428a;
        StringBuilder sb = new StringBuilder("startReplayCheckTimer: [ type=");
        sb.append(str);
        sb.append(" ][ sendTimeMillis=");
        sb.append(j);
        sb.append(" ][ delay=");
        sb.append(i);
        sb.append(" ]");
        c.b(str2, sb.toString());
        i();
        if ("typeHeartBeat".equals(str)) {
            g();
            this.e = b.schedule(new k(this, str, j, i), (long) i, TimeUnit.SECONDS);
        } else if ("typeInit".equals(str)) {
            h();
            this.f = b.schedule(new k(this, str, j, i), (long) i, TimeUnit.SECONDS);
        } else {
            c.d(f9428a, "startReplayCheckTimer: [ unknown type ]");
        }
    }

    public final synchronized void c() {
        c.a(f9428a, "clearAllTimers: ");
        f();
        g();
        h();
        e();
        j();
    }

    private static synchronized void i() {
        synchronized (f.class) {
            if (b == null || b.isTerminated() || b.isShutdown()) {
                c.c(f9428a, "checkExecutorService: newSingleThreadScheduledExecutor ");
                b = Executors.newSingleThreadScheduledExecutor(new j());
            }
        }
    }

    public final synchronized void a(long j) {
        c.a(f9428a, "startFlowControlTimer: controlTime=".concat(String.valueOf(j)));
        com.alipay.mobile.rome.syncsdk.a.c.a(true);
        j();
        this.h = b.schedule(new h(this, (byte) 0), j, TimeUnit.SECONDS);
    }

    public final synchronized void b(long j) {
        a a2 = a.a();
        Context f2 = LongLinkService.a().f();
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(System.currentTimeMillis() + j));
        sb.append(",");
        sb.append(Long.toString(j));
        a2.a(f2, "flow_control", sb.toString());
        a(j);
    }

    private synchronized void j() {
        if (this.h != null && !this.h.isDone()) {
            this.h.cancel(true);
        }
    }
}
