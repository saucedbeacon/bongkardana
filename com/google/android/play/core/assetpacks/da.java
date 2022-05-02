package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import java.io.File;
import java.util.concurrent.Executor;

public final class da implements cn<cz> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<String> f10906a;
    private final cn<aw> b;
    private final cn<bz> c;
    private final cn<Context> d;
    private final cn<dl> e;
    private final cn<Executor> f;

    public da(cn<String> cnVar, cn<aw> cnVar2, cn<bz> cnVar3, cn<Context> cnVar4, cn<dl> cnVar5, cn<Executor> cnVar6) {
        this.f10906a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
        this.d = cnVar4;
        this.e = cnVar5;
        this.f = cnVar6;
    }

    public final /* synthetic */ Object a() {
        String a2 = this.f10906a.a();
        aw a3 = this.b.a();
        bz a4 = this.c.a();
        Context b2 = ((s) this.d).a();
        dl a5 = this.e.a();
        return new cz(a2 != null ? new File(b2.getExternalFilesDir((String) null), a2) : b2.getExternalFilesDir((String) null), a3, a4, b2, a5, cl.b(this.f));
    }
}
