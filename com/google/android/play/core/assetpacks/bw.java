package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.cj;
import java.util.concurrent.atomic.AtomicBoolean;

final class bw {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10877a = new af("ExtractorLooper");
    private final cp b;
    private final bt c;
    private final dv d;
    private final df e;
    private final dj f;
    private final Cdo g;
    private final cj<w> h;
    private final cs i;
    private final AtomicBoolean j = new AtomicBoolean(false);

    bw(cp cpVar, cj<w> cjVar, bt btVar, dv dvVar, df dfVar, dj djVar, Cdo doVar, cs csVar) {
        this.b = cpVar;
        this.h = cjVar;
        this.c = btVar;
        this.d = dvVar;
        this.e = dfVar;
        this.f = djVar;
        this.g = doVar;
        this.i = csVar;
    }

    private final void a(int i2, Exception exc) {
        try {
            this.b.d(i2);
            this.b.a(i2);
        } catch (bv unused) {
            f10877a.b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        f10877a.a("Run extractor loop", new Object[0]);
        if (this.j.compareAndSet(false, true)) {
            while (true) {
                cr crVar = null;
                try {
                    crVar = this.i.a();
                } catch (bv e2) {
                    f10877a.b("Error while getting next extraction task: %s", e2.getMessage());
                    if (e2.f10876a >= 0) {
                        this.h.a().a(e2.f10876a);
                        a(e2.f10876a, e2);
                    }
                }
                if (crVar == null) {
                    this.j.set(false);
                    return;
                } else if (crVar instanceof bs) {
                    try {
                        this.c.a((bs) crVar);
                    } catch (Exception e3) {
                        f10877a.b("Error during extraction task: %s", e3.getMessage());
                        this.h.a().a(crVar.j);
                        a(crVar.j, e3);
                    }
                } else if (crVar instanceof du) {
                    this.d.a((du) crVar);
                } else if (crVar instanceof de) {
                    this.e.a((de) crVar);
                } else if (crVar instanceof dh) {
                    this.f.a((dh) crVar);
                } else if (crVar instanceof dn) {
                    this.g.a((dn) crVar);
                } else {
                    f10877a.b("Unknown task type: %s", crVar.getClass().getName());
                }
            }
        } else {
            f10877a.d("runLoop already looping; return", new Object[0]);
        }
    }
}
