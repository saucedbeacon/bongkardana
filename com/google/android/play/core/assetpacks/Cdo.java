package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.ca;
import com.google.android.play.core.internal.ci;
import com.google.android.play.core.internal.cj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.play.core.assetpacks.do  reason: invalid class name */
final class Cdo {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10920a = new af("PatchSliceTaskHandler");
    private final bb b;
    private final cj<w> c;
    private final a d;

    Cdo(bb bbVar, cj<w> cjVar, a aVar) {
        this.b = bbVar;
        this.c = cjVar;
        this.d = aVar;
    }

    public final void a(dn dnVar) {
        InputStream inputStream;
        Throwable th;
        dn dnVar2 = dnVar;
        File a2 = this.b.a(dnVar2.k, dnVar2.f10919a, dnVar2.b);
        bb bbVar = this.b;
        String str = dnVar2.k;
        int i = dnVar2.f10919a;
        long j = dnVar2.b;
        File file = new File(bbVar.b(str, i, j), dnVar2.f);
        try {
            inputStream = dnVar2.h;
            if (dnVar2.e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            be beVar = new be(a2, file);
            if (this.d.a()) {
                File a3 = this.b.a(dnVar2.k, dnVar2.c, dnVar2.d, dnVar2.f);
                if (!a3.exists()) {
                    a3.mkdirs();
                }
                dr drVar = new dr(this.b, dnVar2.k, dnVar2.c, dnVar2.d, dnVar2.f);
                bq.a((ca) beVar, inputStream, (OutputStream) new by(a3, drVar), dnVar2.g);
                drVar.b(0);
            } else {
                File file2 = new File(this.b.f(dnVar2.k, dnVar2.c, dnVar2.d, dnVar2.f), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                bq.a((ca) beVar, inputStream, (OutputStream) new FileOutputStream(file2), dnVar2.g);
                if (!file2.renameTo(this.b.e(dnVar2.k, dnVar2.c, dnVar2.d, dnVar2.f))) {
                    throw new bv(String.format("Error moving patch for slice %s of pack %s.", new Object[]{dnVar2.f, dnVar2.k}), dnVar2.j);
                }
            }
            inputStream.close();
            if (this.d.a()) {
                f10920a.c("Patching and extraction finished for slice %s of pack %s.", dnVar2.f, dnVar2.k);
            } else {
                f10920a.c("Patching finished for slice %s of pack %s.", dnVar2.f, dnVar2.k);
            }
            this.c.a().a(dnVar2.j, dnVar2.k, dnVar2.f, 0);
            try {
                dnVar2.h.close();
                return;
            } catch (IOException unused) {
                f10920a.d("Could not close file for slice %s of pack %s.", dnVar2.f, dnVar2.k);
                return;
            }
        } catch (IOException e) {
            f10920a.b("IOException during patching %s.", e.getMessage());
            throw new bv(String.format("Error patching slice %s of pack %s.", new Object[]{dnVar2.f, dnVar2.k}), e, dnVar2.j);
        } catch (Throwable th2) {
            ci.a(th, th2);
        }
        throw th;
    }
}
