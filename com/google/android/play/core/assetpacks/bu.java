package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;

public final class bu implements cn<bt> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<bb> f10875a;
    private final cn<w> b;
    private final cn<aw> c;
    private final cn<bz> d;

    public bu(cn<bb> cnVar, cn<w> cnVar2, cn<aw> cnVar3, cn<bz> cnVar4) {
        this.f10875a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
    }

    public final /* synthetic */ Object a() {
        return new bt(this.f10875a.a(), cl.b(this.b), cl.b(this.c), this.d.a());
    }
}
