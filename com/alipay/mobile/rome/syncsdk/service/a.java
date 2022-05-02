package com.alipay.mobile.rome.syncsdk.service;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.rome.longlinkservice.ConnectionEvent;
import com.alipay.mobile.rome.syncsdk.service.ConnStateFsm;
import com.alipay.mobile.rome.syncsdk.service.a.d;
import com.alipay.mobile.rome.syncsdk.service.a.f;
import com.alipay.mobile.rome.syncsdk.service.a.g;
import com.alipay.mobile.rome.syncsdk.service.a.h;
import com.alipay.mobile.rome.syncsdk.transport.b.b;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class a {
    private static final String b = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f9416a;
    private volatile com.alipay.mobile.rome.syncsdk.transport.connection.a c;
    private volatile long d;
    private volatile long e;
    private volatile ConnStateFsm f = new ConnStateFsm();
    private volatile int g = b.b;
    private volatile e h;
    private volatile ExecutorService i;
    private volatile Future<?> j;
    private volatile Future<?> k;
    private volatile Future<?> l;
    private volatile Future<?> m;
    private volatile Future<?> n;

    /* renamed from: o  reason: collision with root package name */
    private volatile Future<?> f9417o;
    private d p;

    public a(Context context) {
        c.b(b, "ConnManager");
        this.f9416a = context;
    }

    private boolean A() {
        c.a(b, "checkCanConnect");
        if (TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().h()) || TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().i())) {
            c.c(b, "checkCanConnect: [ isForceStopped=false host or port is null] ");
            return false;
        } else if (com.alipay.mobile.rome.syncsdk.a.c.a()) {
            c.c(b, "checkCanConnect: [ isForceStopped=false ] ");
            return false;
        } else if (!com.alipay.mobile.rome.syncsdk.a.c.f()) {
            c.c(b, "checkCanConnect: [ isReconnEnable=false ] ");
            return false;
        } else if (e.b(this.f9416a)) {
            return true;
        } else {
            c.c(b, "checkCanConnect: [ isNetAvailable=false ] ");
            return false;
        }
    }

    public final synchronized void a() {
        this.f.a();
    }

    public final synchronized ConnStateFsm.State b() {
        return this.f.b();
    }

    public final synchronized void c() {
        c.a(b, "connect: ");
        if (A()) {
            if (this.j == null || this.j.isDone() || (this.k != null && !this.k.isDone())) {
                this.j = a((Runnable) new com.alipay.mobile.rome.syncsdk.service.a.c(this));
                return;
            }
            String str = b;
            StringBuilder sb = new StringBuilder("connect: [ already has a connect task ][ futureConnect=");
            sb.append(this.j);
            sb.append(" ]");
            c.c(str, sb.toString());
        }
    }

    public final synchronized void d() {
        c.a(b, "connectOnRunned: ");
        this.j = null;
    }

    public final synchronized void e() {
        c.a(b, "disconnect: ");
        f.a().c();
        if (this.j != null && !this.j.isDone()) {
            this.j.cancel(false);
        }
        if (this.l != null && !this.l.isDone()) {
            this.l.cancel(false);
        }
        if (this.m != null && !this.m.isDone()) {
            this.m.cancel(false);
        }
        if (this.n != null && !this.n.isDone()) {
            this.n.cancel(false);
        }
        if (this.f9417o != null && !this.f9417o.isDone()) {
            this.f9417o.cancel(false);
        }
        if (this.k == null || this.k.isDone()) {
            a((Runnable) new com.alipay.mobile.rome.syncsdk.service.a.b(this));
            this.k = a((Runnable) new d(this));
            return;
        }
        String str = b;
        StringBuilder sb = new StringBuilder("disconnect: [ already has a disconnect task ][ futureDisconnect=");
        sb.append(this.k);
        sb.append(" ]");
        c.c(str, sb.toString());
    }

    public final synchronized void f() {
        c.a(b, "reconnect: ");
        e();
        if (A()) {
            this.j = a((Runnable) new com.alipay.mobile.rome.syncsdk.service.a.c(this));
        }
    }

    public final synchronized void g() {
        c.a(b, "sendRegisterPacket: ");
        if (p()) {
            this.l = a((Runnable) new f(this));
        }
    }

    public final synchronized void h() {
        c.a(b, "sendHeartBeatPacket: ");
        if (p()) {
            if (f.a().b()) {
                c.c(b, "sendHeartBeatPacket: [ wait heartbeat reply ] ");
                return;
            }
            if (this.n != null && !this.n.isDone()) {
                this.n.cancel(false);
            }
            this.n = a((Runnable) new com.alipay.mobile.rome.syncsdk.service.a.e(this));
        }
    }

    public final synchronized void i() {
        c.a(b, "sendBindUerPacket");
        if (!p()) {
            if (!com.alipay.mobile.rome.syncsdk.a.c.f()) {
                com.alipay.mobile.rome.syncsdk.a.c.e();
            }
            if (A()) {
                c();
                return;
            }
            return;
        }
        this.m = a((Runnable) new com.alipay.mobile.rome.syncsdk.service.a.a(this));
    }

    public final synchronized void j() {
        c.a(b, "sendUnBindUerPacket");
        if (!p()) {
            if (!com.alipay.mobile.rome.syncsdk.a.c.f()) {
                com.alipay.mobile.rome.syncsdk.a.c.e();
            }
            if (A()) {
                c();
                return;
            }
            return;
        }
        this.f9417o = a((Runnable) new h(this));
    }

    public final synchronized void a(byte[] bArr) {
        if (!p()) {
            c.c(b, "sendLinkSyncData [ isConnected=false ]");
            if (!com.alipay.mobile.rome.syncsdk.a.c.f()) {
                com.alipay.mobile.rome.syncsdk.a.c.e();
            }
            if (A()) {
                f.a().a(com.alipay.mobile.rome.syncsdk.a.b.b());
                return;
            }
            return;
        }
        a((Runnable) new g(this, bArr));
    }

    public final synchronized com.alipay.mobile.rome.syncsdk.transport.connection.a k() {
        return this.c;
    }

    public final synchronized void a(com.alipay.mobile.rome.syncsdk.transport.connection.a aVar) {
        c.a(b, "setConnection");
        this.c = aVar;
    }

    public final synchronized e l() {
        return this.h;
    }

    public final synchronized void a(e eVar) {
        this.h = eVar;
    }

    public final synchronized int m() {
        return this.g;
    }

    public final synchronized long n() {
        return this.d;
    }

    public final synchronized void a(long j2) {
        this.d = j2;
    }

    public final synchronized long o() {
        return this.e;
    }

    public final synchronized void b(long j2) {
        this.e = j2;
    }

    public final synchronized boolean p() {
        boolean i2;
        i2 = this.f.i();
        String str = b;
        StringBuilder sb = new StringBuilder("isConnected [ ");
        sb.append(i2);
        sb.append(" ]");
        c.a(str, sb.toString());
        return i2;
    }

    public final synchronized boolean q() {
        boolean j2;
        j2 = this.f.j();
        String str = b;
        StringBuilder sb = new StringBuilder("isDeviceBinded [ ");
        sb.append(j2);
        sb.append(" ]");
        c.a(str, sb.toString());
        return j2;
    }

    public final synchronized boolean r() {
        boolean k2;
        k2 = this.f.k();
        String str = b;
        StringBuilder sb = new StringBuilder("isUserBinded [ ");
        sb.append(k2);
        sb.append(" ]");
        c.a(str, sb.toString());
        return k2;
    }

    public final synchronized void s() {
        try {
            this.f.c();
            if (this.f.k()) {
                com.alipay.mobile.rome.syncsdk.a.c.a("");
            }
        } catch (Exception e2) {
            String str = b;
            StringBuilder sb = new StringBuilder("onRecvRegisterReply: [ Exception=");
            sb.append(e2);
            sb.append(" ]");
            c.d(str, sb.toString());
            f.a().c();
            e();
            f.a().a(com.alipay.mobile.rome.syncsdk.a.b.b());
        }
    }

    public final synchronized void c(long j2) {
        this.f.d();
        c.b(b, "[onConnecting] Notify connected event.");
        z().a(new ConnectionEvent(ConnectionEvent.Type.Connected, Long.valueOf(j2)));
    }

    public final synchronized void t() {
        c.b(b, "[onConnecting] Notify connecting event.");
        z().a(new ConnectionEvent(ConnectionEvent.Type.Connecting));
    }

    public final synchronized void a(String str) {
        c.b(b, "[onConnectFailed] Notify connect failed event.");
        z().a(new ConnectionEvent(ConnectionEvent.Type.ConnectFailed, str));
    }

    public final synchronized void u() {
        c.b(b, "[onConnecting] Notify disconnected event.");
        z().a(new ConnectionEvent(ConnectionEvent.Type.Disconnected));
    }

    public final synchronized void v() {
        this.f.e();
    }

    public final synchronized void w() {
        this.f.f();
    }

    public final synchronized void x() {
        this.f.g();
    }

    public final synchronized void y() {
        this.f.h();
    }

    public final d z() {
        d dVar = this.p;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.p != null) {
                d dVar2 = this.p;
                return dVar2;
            }
            d dVar3 = new d();
            this.p = dVar3;
            return dVar3;
        }
    }

    private Future<?> a(Runnable runnable) {
        if (this.i == null || this.i.isTerminated() || this.i.isShutdown()) {
            this.i = Executors.newSingleThreadExecutor(new b(this));
        }
        return this.i.submit(runnable);
    }
}
