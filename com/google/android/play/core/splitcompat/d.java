package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f9607a;

    d(e eVar) {
        this.f9607a = eVar;
    }

    public final void a(j jVar, File file, boolean z) throws IOException {
        this.f9607a.b.add(file);
        if (!z) {
            this.f9607a.c.set(false);
        }
    }
}
