package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.cj;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.p;
import java.util.concurrent.Executor;

public final class k implements cn<j> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<bb> f10936a;
    private final cn<w> b;
    private final cn<aw> c;
    private final cn<p> d;
    private final cn<cp> e;
    private final cn<bz> f;
    private final cn<bn> g;
    private final cn<Executor> h;

    public k(cn<bb> cnVar, cn<w> cnVar2, cn<aw> cnVar3, cn<p> cnVar4, cn<cp> cnVar5, cn<bz> cnVar6, cn<bn> cnVar7, cn<Executor> cnVar8) {
        this.f10936a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
        this.e = cnVar5;
        this.f = cnVar6;
        this.g = cnVar7;
        this.h = cnVar8;
    }

    public final /* synthetic */ Object a() {
        bb a2 = this.f10936a.a();
        cj<w> b2 = cl.b(this.b);
        aw a3 = this.c.a();
        return new j(a2, b2, a3, this.d.a(), this.e.a(), this.f.a(), this.g.a(), cl.b(this.h));
    }
}
