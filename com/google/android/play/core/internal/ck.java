package com.google.android.play.core.internal;

public final class ck<T> implements cn<T> {

    /* renamed from: a  reason: collision with root package name */
    private cn<T> f10955a;

    public static <T> void a(cn<T> cnVar, cn<T> cnVar2) {
        bq.a(cnVar2);
        ck ckVar = (ck) cnVar;
        if (ckVar.f10955a == null) {
            ckVar.f10955a = cnVar2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T a() {
        cn<T> cnVar = this.f10955a;
        if (cnVar != null) {
            return cnVar.a();
        }
        throw new IllegalStateException();
    }
}
