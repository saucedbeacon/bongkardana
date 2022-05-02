package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

public final class zzgb implements zziw {
    private final zziw zzwr;
    private final zzfy zzws;

    public zzgb(zziw zziw, zzfy zzfy) {
        this.zzwr = (zziw) zzlp.checkNotNull(zziw);
        this.zzws = (zzfy) zzlp.checkNotNull(zzfy);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        this.zzws.zza(this.zzwr, outputStream);
    }
}
