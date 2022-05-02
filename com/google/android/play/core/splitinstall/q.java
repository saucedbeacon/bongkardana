package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.cn;

public final class q implements cn<p> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<Context> f10986a;

    public q(cn<Context> cnVar) {
        this.f10986a = cnVar;
    }

    public static q a(cn<Context> cnVar) {
        return new q(cnVar);
    }

    public final /* synthetic */ Object a() {
        return new p(this.f10986a.a());
    }
}
