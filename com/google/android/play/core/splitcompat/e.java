package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f9608a;
    final /* synthetic */ Set b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ k d;

    e(k kVar, q qVar, Set set, AtomicBoolean atomicBoolean) {
        this.d = kVar;
        this.f9608a = qVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    public final void a(ZipFile zipFile, Set<j> set) throws IOException {
        this.d.a(this.f9608a, set, new d(this));
    }
}
