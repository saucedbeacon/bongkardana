package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.cj;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import java.util.concurrent.Executor;

public final class ax implements cn<aw> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<Context> f10852a;
    private final cn<cp> b;
    private final cn<bw> c;
    private final cn<w> d;
    private final cn<bz> e;
    private final cn<bn> f;
    private final cn<a> g;
    private final cn<Executor> h;
    private final cn<Executor> i;

    public ax(cn<Context> cnVar, cn<cp> cnVar2, cn<bw> cnVar3, cn<w> cnVar4, cn<bz> cnVar5, cn<bn> cnVar6, cn<a> cnVar7, cn<Executor> cnVar8, cn<Executor> cnVar9) {
        this.f10852a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
        this.e = cnVar5;
        this.f = cnVar6;
        this.g = cnVar7;
        this.h = cnVar8;
        this.i = cnVar9;
    }

    public final /* synthetic */ Object a() {
        Context b2 = ((s) this.f10852a).a();
        cp a2 = this.b.a();
        bw a3 = this.c.a();
        cj<w> b3 = cl.b(this.d);
        bz a4 = this.e.a();
        bn a5 = this.f.a();
        return new aw(b2, a2, a3, b3, a4, a5, this.g.a(), cl.b(this.h), cl.b(this.i));
    }
}
