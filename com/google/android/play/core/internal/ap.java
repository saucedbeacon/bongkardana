package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ap<T extends IInterface> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Handler> f9579a = new HashMap();
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final af c;
    private final String d;
    /* access modifiers changed from: private */
    public final List<ag> e = new ArrayList();
    /* access modifiers changed from: private */
    public boolean f;
    private final Intent g;
    /* access modifiers changed from: private */
    public final al<T> h;
    private final WeakReference<ak> i;
    private final IBinder.DeathRecipient j = new ah(this);
    /* access modifiers changed from: private */
    @Nullable
    public ServiceConnection k;
    /* access modifiers changed from: private */
    @Nullable
    public T l;

    public ap(Context context, af afVar, String str, Intent intent, al<T> alVar) {
        this.b = context;
        this.c = afVar;
        this.d = str;
        this.g = intent;
        this.h = alVar;
        this.i = new WeakReference<>((Object) null);
    }

    static /* synthetic */ void a(ap apVar, ag agVar) {
        if (apVar.l == null && !apVar.f) {
            apVar.c.c("Initiate binding to the service.", new Object[0]);
            apVar.e.add(agVar);
            ao aoVar = new ao(apVar);
            apVar.k = aoVar;
            apVar.f = true;
            if (!apVar.b.bindService(apVar.g, aoVar, 1)) {
                apVar.c.c("Failed to bind to the service.", new Object[0]);
                apVar.f = false;
                List<ag> list = apVar.e;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i<?> b2 = list.get(i2).b();
                    if (b2 != null) {
                        b2.b((Exception) new aq());
                    }
                }
                apVar.e.clear();
            }
        } else if (apVar.f) {
            apVar.c.c("Waiting to bind to the service.", new Object[0]);
            apVar.e.add(agVar);
        } else {
            agVar.run();
        }
    }

    /* access modifiers changed from: private */
    public final void b(ag agVar) {
        Handler handler;
        synchronized (f9579a) {
            if (!f9579a.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                f9579a.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = f9579a.get(this.d);
        }
        handler.post(agVar);
    }

    static /* synthetic */ void f(ap apVar) {
        apVar.c.c("linkToDeath", new Object[0]);
        try {
            apVar.l.asBinder().linkToDeath(apVar.j, 0);
        } catch (RemoteException e2) {
            apVar.c.a((Throwable) e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* synthetic */ void h(ap apVar) {
        apVar.c.c("unlinkToDeath", new Object[0]);
        apVar.l.asBinder().unlinkToDeath(apVar.j, 0);
    }

    public final void a() {
        b((ag) new aj(this));
    }

    public final void a(ag agVar) {
        b((ag) new ai(this, agVar.b(), agVar));
    }

    @Nullable
    public final T b() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.c.c("reportBinderDeath", new Object[0]);
        ak akVar = this.i.get();
        if (akVar == null) {
            this.c.c("%s : Binder has died.", this.d);
            List<ag> list = this.e;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                i<?> b2 = list.get(i2).b();
                if (b2 != null) {
                    b2.b((Exception) Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.d).concat(" : Binder has died.")));
                }
            }
            this.e.clear();
            return;
        }
        this.c.c("calling onBinderDied", new Object[0]);
        akVar.a();
    }
}
