package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

public final class z implements cn<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final y f11005a;

    public z(y yVar) {
        this.f11005a = yVar;
    }

    /* renamed from: b */
    public final Context a() {
        Context b = this.f11005a.b();
        bq.b(b);
        return b;
    }
}
