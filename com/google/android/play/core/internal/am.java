package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

final class am extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f9576a;
    final /* synthetic */ ao b;

    am(ao aoVar, IBinder iBinder) {
        this.b = aoVar;
        this.f9576a = iBinder;
    }

    public final void a() {
        ap apVar = this.b.f9578a;
        apVar.l = (IInterface) apVar.h.a(this.f9576a);
        ap.f(this.b.f9578a);
        this.b.f9578a.f = false;
        for (Runnable run : this.b.f9578a.e) {
            run.run();
        }
        this.b.f9578a.e.clear();
    }
}
