package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f9609a;
    final /* synthetic */ q b;
    final /* synthetic */ k c;

    f(k kVar, Set set, q qVar) {
        this.c = kVar;
        this.f9609a = set;
        this.b = qVar;
    }

    public final void a(ZipFile zipFile, Set<j> set) throws IOException {
        this.f9609a.addAll(k.a(this.c, (Set) set, this.b, zipFile));
    }
}
