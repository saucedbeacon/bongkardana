package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import java.util.concurrent.Executor;

public final class dk implements cn<dj> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<bb> f10916a;
    private final cn<w> b;
    private final cn<cp> c;
    private final cn<Executor> d;
    private final cn<bz> e;

    public dk(cn<bb> cnVar, cn<w> cnVar2, cn<cp> cnVar3, cn<Executor> cnVar4, cn<bz> cnVar5) {
        this.f10916a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
        this.e = cnVar5;
    }

    public final /* synthetic */ Object a() {
        bb a2 = this.f10916a.a();
        return new dj(a2, cl.b(this.b), this.c.a(), cl.b(this.d), this.e.a());
    }
}
