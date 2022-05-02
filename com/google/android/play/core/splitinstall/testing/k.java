package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.p;
import com.google.android.play.core.splitinstall.z;
import java.io.File;

public final class k implements cn<FakeSplitInstallManager> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<Context> f10999a;
    private final cn<File> b;
    private final cn<p> c;

    public k(cn<Context> cnVar, cn<File> cnVar2, cn<p> cnVar3) {
        this.f10999a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
    }

    public final /* synthetic */ Object a() {
        return new FakeSplitInstallManager(((z) this.f10999a).a(), this.b.a(), this.c.a());
    }
}
