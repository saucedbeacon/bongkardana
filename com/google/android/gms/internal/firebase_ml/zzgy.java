package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

public final class zzgy extends zzfs {
    private final Object data;
    private final zzhd zzzb;
    private String zzzc;

    public zzgy(zzhd zzhd, Object obj) {
        super("application/json; charset=UTF-8");
        this.zzzb = (zzhd) zzlp.checkNotNull(zzhd);
        this.data = zzlp.checkNotNull(obj);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        zzhc zza = this.zzzb.zza(outputStream, zzfe());
        if (this.zzzc != null) {
            zza.zzgj();
            zza.zzaj(this.zzzc);
        }
        zza.zzc(this.data);
        if (this.zzzc != null) {
            zza.zzgk();
        }
        zza.flush();
    }

    public final zzgy zzai(String str) {
        this.zzzc = str;
        return this;
    }
}
