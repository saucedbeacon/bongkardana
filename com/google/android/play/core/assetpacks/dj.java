package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.cj;
import java.io.File;
import java.util.concurrent.Executor;

final class dj {

    /* renamed from: a  reason: collision with root package name */
    private final bb f10915a;
    private final cj<w> b;
    private final cp c;
    private final cj<Executor> d;
    private final bz e;

    dj(bb bbVar, cj<w> cjVar, cp cpVar, cj<Executor> cjVar2, bz bzVar) {
        this.f10915a = bbVar;
        this.b = cjVar;
        this.c = cpVar;
        this.d = cjVar2;
        this.e = bzVar;
    }

    public final void a(dh dhVar) {
        File c2 = this.f10915a.c(dhVar.k, dhVar.f10913a, dhVar.b);
        File e2 = this.f10915a.e(dhVar.k, dhVar.f10913a, dhVar.b);
        if (!c2.exists() || !e2.exists()) {
            throw new bv(String.format("Cannot find pack files to move for pack %s.", new Object[]{dhVar.k}), dhVar.j);
        }
        File a2 = this.f10915a.a(dhVar.k, dhVar.f10913a, dhVar.b);
        a2.mkdirs();
        if (c2.renameTo(a2)) {
            new File(this.f10915a.a(dhVar.k, dhVar.f10913a, dhVar.b), "merge.tmp").delete();
            File b2 = this.f10915a.b(dhVar.k, dhVar.f10913a, dhVar.b);
            b2.mkdirs();
            if (e2.renameTo(b2)) {
                this.d.a().execute(di.a(this.f10915a));
                this.c.a(dhVar.k, dhVar.f10913a, dhVar.b);
                this.e.a(dhVar.k);
                this.b.a().a(dhVar.j, dhVar.k);
                return;
            }
            throw new bv("Cannot move metadata files to final location.", dhVar.j);
        }
        throw new bv("Cannot move merged pack files to final location.", dhVar.j);
    }
}
