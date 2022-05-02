package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.splitinstall.testing.k;
import java.io.File;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private cn<Context> f10980a;
    private cn<av> b;
    private cn<t> c;
    private cn<p> d = cl.a(q.a(this.f10980a));
    private cn<ax> e;
    private cn<w> f;
    private cn<File> g;
    private cn<FakeSplitInstallManager> h;
    private cn<i> i;
    private cn<SplitInstallManager> j;

    /* synthetic */ c(y yVar) {
        z zVar = new z(yVar);
        this.f10980a = zVar;
        this.b = cl.a(new aw(zVar));
        this.c = cl.a(new ab(yVar));
        cn<ax> a2 = cl.a(new ay(this.f10980a));
        this.e = a2;
        this.f = cl.a(new x(this.b, this.c, this.d, a2));
        cn<File> a3 = cl.a(new aa(this.f10980a));
        this.g = a3;
        cn<FakeSplitInstallManager> a4 = cl.a(new k(this.f10980a, a3, this.d));
        this.h = a4;
        cn<i> a5 = cl.a(new j(this.f, a4, this.g));
        this.i = a5;
        this.j = cl.a(new ac(yVar, a5));
    }

    public final SplitInstallManager a() {
        return this.j.a();
    }

    public final File b() {
        return this.g.a();
    }
}
