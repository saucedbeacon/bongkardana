package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import java.util.concurrent.Executor;

public final class cq implements cn<cp> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<bb> f10896a;
    private final cn<w> b;
    private final cn<bz> c;
    private final cn<Executor> d;

    public cq(cn<bb> cnVar, cn<w> cnVar2, cn<bz> cnVar3, cn<Executor> cnVar4) {
        this.f10896a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
    }

    public final /* synthetic */ Object a() {
        bb a2 = this.f10896a.a();
        return new cp(a2, cl.b(this.b), this.c.a(), cl.b(this.d));
    }
}
