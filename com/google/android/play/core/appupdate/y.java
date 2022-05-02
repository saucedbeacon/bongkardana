package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private cn<Context> f9564a;
    private cn<r> b;
    private cn<p> c;
    private cn<a> d;
    private cn<e> e;
    private cn<AppUpdateManager> f;

    /* synthetic */ y(g gVar) {
        i iVar = new i(gVar);
        this.f9564a = iVar;
        cn<r> a2 = cl.a(new s(iVar));
        this.b = a2;
        this.c = cl.a(new q(this.f9564a, a2));
        cn<a> a3 = cl.a(new b(this.f9564a));
        this.d = a3;
        cn<e> a4 = cl.a(new f(this.c, a3, this.f9564a));
        this.e = a4;
        this.f = cl.a(new h(a4));
    }

    public final AppUpdateManager a() {
        return this.f.a();
    }
}
