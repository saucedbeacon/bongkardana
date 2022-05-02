package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.af;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

final class dv {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10927a = new af("VerifySliceTaskHandler");
    private final bb b;

    dv(bb bbVar) {
        this.b = bbVar;
    }

    private final void a(du duVar, File file) {
        try {
            File f = this.b.f(duVar.k, duVar.f10926a, duVar.b, duVar.c);
            if (f.exists()) {
                try {
                    if (db.a(dt.a(file, f)).equals(duVar.d)) {
                        f10927a.c("Verification of slice %s of pack %s successful.", duVar.c, duVar.k);
                        return;
                    }
                    throw new bv(String.format("Verification failed for slice %s.", new Object[]{duVar.c}), duVar.j);
                } catch (NoSuchAlgorithmException e) {
                    throw new bv("SHA256 algorithm not supported.", e, duVar.j);
                } catch (IOException e2) {
                    throw new bv(String.format("Could not digest file during verification for slice %s.", new Object[]{duVar.c}), e2, duVar.j);
                }
            } else {
                throw new bv(String.format("Cannot find metadata files for slice %s.", new Object[]{duVar.c}), duVar.j);
            }
        } catch (IOException e3) {
            throw new bv(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{duVar.c}), e3, duVar.j);
        }
    }

    public final void a(du duVar) {
        File a2 = this.b.a(duVar.k, duVar.f10926a, duVar.b, duVar.c);
        if (a2.exists()) {
            a(duVar, a2);
            File b2 = this.b.b(duVar.k, duVar.f10926a, duVar.b, duVar.c);
            if (!b2.exists()) {
                b2.mkdirs();
            }
            if (!a2.renameTo(b2)) {
                throw new bv(String.format("Failed to move slice %s after verification.", new Object[]{duVar.c}), duVar.j);
            }
            return;
        }
        throw new bv(String.format("Cannot find unverified files for slice %s.", new Object[]{duVar.c}), duVar.j);
    }
}
