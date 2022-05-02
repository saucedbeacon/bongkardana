package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.a;
import com.google.android.play.core.common.c;
import com.google.android.play.core.internal.ck;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.p;
import com.google.android.play.core.splitinstall.q;
import java.util.concurrent.Executor;

public final class br implements a {

    /* renamed from: a  reason: collision with root package name */
    private final n f10871a;
    private cn<Context> b;
    private cn<dl> c;
    private cn<bb> d;
    private cn<bz> e;
    private cn<ar> f;
    private cn<String> g = cl.a(new t(this.b));
    private cn<w> h = new ck();
    private cn<Executor> i;
    private cn<cp> j;
    private cn<aw> k;
    private cn<bt> l;
    private cn<dv> m;
    private cn<df> n;

    /* renamed from: o  reason: collision with root package name */
    private cn<dj> f10872o;
    private cn<a> p;
    private cn<Cdo> q;
    private cn<bk> r;
    private cn<cs> s;
    private cn<bw> t;
    private cn<bn> u;
    private cn<Executor> v;
    private cn<cz> w;
    private cn<p> x;
    private cn<j> y;
    private cn<AssetPackManager> z;

    /* synthetic */ br(n nVar) {
        this.f10871a = nVar;
        s sVar = new s(nVar);
        this.b = sVar;
        cn<dl> a2 = cl.a(new dm(sVar));
        this.c = a2;
        this.d = cl.a(new bc(this.b, a2));
        cn<bz> a3 = cl.a(ca.f10882a);
        this.e = a3;
        this.f = cl.a(new as(this.b, a3));
        cn<Executor> a4 = cl.a(o.f10941a);
        this.i = a4;
        this.j = cl.a(new cq(this.d, this.h, this.e, a4));
        ck ckVar = new ck();
        this.k = ckVar;
        this.l = cl.a(new bu(this.d, this.h, ckVar, this.e));
        this.m = cl.a(new dw(this.d));
        this.n = cl.a(new dg(this.d));
        this.f10872o = cl.a(new dk(this.d, this.h, this.j, this.i, this.e));
        cn<a> a5 = cl.a(c.b());
        this.p = a5;
        this.q = cl.a(new dp(this.d, this.h, a5));
        cn<bk> a6 = cl.a(new bl(this.h));
        this.r = a6;
        cn<cs> a7 = cl.a(new ct(this.j, this.d, a6));
        this.s = a7;
        this.t = cl.a(new bx(this.j, this.h, this.l, this.m, this.n, this.f10872o, this.q, a7));
        this.u = cl.a(bo.f10869a);
        cn<Executor> a8 = cl.a(u.f10946a);
        this.v = a8;
        ck.a(this.k, cl.a(new ax(this.b, this.j, this.t, this.h, this.e, this.u, this.p, this.i, a8)));
        cn<cz> a9 = cl.a(new da(this.g, this.k, this.e, this.b, this.c, this.i));
        this.w = a9;
        ck.a(this.h, cl.a(new r(this.b, this.f, a9)));
        cn<p> a10 = cl.a(q.a(this.b));
        this.x = a10;
        cn<j> a11 = cl.a(new k(this.d, this.h, this.k, a10, this.j, this.e, this.u, this.i));
        this.y = a11;
        this.z = cl.a(new q(a11, this.b));
    }

    public final AssetPackManager a() {
        return this.z.a();
    }

    public final void a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f10834a = s.a(this.f10871a);
        assetPackExtractionService.b = this.y.a();
        assetPackExtractionService.c = this.d.a();
    }
}
