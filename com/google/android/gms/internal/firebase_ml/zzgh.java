package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzgh {
    private final zzgn zzvj;
    private final zzgg zzxu;

    zzgh(zzgn zzgn, zzgg zzgg) {
        this.zzvj = zzgn;
        this.zzxu = zzgg;
    }

    public final zzge zza(String str, zzfw zzfw, zzfz zzfz) throws IOException {
        zzge zzge = new zzge(this.zzvj, (String) null);
        zzgg zzgg = this.zzxu;
        if (zzgg != null) {
            zzgg.zza(zzge);
        }
        zzge.zzac(str);
        zzge.zza(zzfw);
        if (zzfz != null) {
            zzge.zza(zzfz);
        }
        return zzge;
    }
}
