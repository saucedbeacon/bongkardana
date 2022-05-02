package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

public final class cb extends ca {

    /* renamed from: a  reason: collision with root package name */
    private final ca f10954a;
    private final long b;
    private final long c;

    public cb(ca caVar, long j, long j2) {
        this.f10954a = caVar;
        long a2 = a(j);
        this.b = a2;
        this.c = a(a2 + j2);
    }

    private final long a(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f10954a.a() ? this.f10954a.a() : j;
    }

    public final long a() {
        return this.c - this.b;
    }

    /* access modifiers changed from: protected */
    public final InputStream a(long j, long j2) throws IOException {
        long a2 = a(this.b);
        return this.f10954a.a(a2, a(j2 + a2) - a2);
    }

    public final void close() throws IOException {
    }
}
