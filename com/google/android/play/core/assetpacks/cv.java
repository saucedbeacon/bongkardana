package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.i;
import java.util.List;

final /* synthetic */ class cv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cz f10900a;
    private final List b;
    private final az c;
    private final i d;

    cv(cz czVar, List list, az azVar, i iVar) {
        this.f10900a = czVar;
        this.b = list;
        this.c = azVar;
        this.d = iVar;
    }

    public final void run() {
        this.f10900a.a(this.b, this.c, this.d);
    }
}
