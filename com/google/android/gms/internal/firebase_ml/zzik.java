package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzik {
    /* JADX INFO: finally extract failed */
    public static long zzb(zziw zziw) throws IOException {
        zzhz zzhz = new zzhz();
        try {
            zziw.writeTo(zzhz);
            zzhz.close();
            return zzhz.zzabh;
        } catch (Throwable th) {
            zzhz.close();
            throw th;
        }
    }
}
