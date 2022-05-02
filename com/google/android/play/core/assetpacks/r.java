package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;

public final class r implements cn<w> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<Context> f10943a;
    private final cn<ar> b;
    private final cn<cz> c;

    public r(cn<Context> cnVar, cn<ar> cnVar2, cn<cz> cnVar3) {
        this.f10943a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
    }

    public final /* synthetic */ Object a() {
        w wVar = (w) (n.a(((s) this.f10943a).a()) == null ? cl.b(this.b).a() : cl.b(this.c).a());
        bq.b(wVar);
        return wVar;
    }
}
