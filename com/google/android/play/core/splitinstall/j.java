package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.io.File;

public final class j implements cn<i> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<w> f10984a;
    private final cn<FakeSplitInstallManager> b;
    private final cn<File> c;

    public j(cn<w> cnVar, cn<FakeSplitInstallManager> cnVar2, cn<File> cnVar3) {
        this.f10984a = cnVar;
        this.b = cnVar2;
        this.c = cnVar3;
    }

    public final /* synthetic */ Object a() {
        return new i(cl.b(this.f10984a), cl.b(this.b), cl.b(this.c));
    }
}
