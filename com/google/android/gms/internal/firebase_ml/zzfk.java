package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

final class zzfk implements zzgk {
    private final /* synthetic */ zzgk zzvu;
    private final /* synthetic */ zzge zzvv;
    private final /* synthetic */ zzfl zzvw;

    zzfk(zzfl zzfl, zzgk zzgk, zzge zzge) {
        this.zzvw = zzfl;
        this.zzvu = zzgk;
        this.zzvv = zzge;
    }

    public final void zza(zzgj zzgj) throws IOException {
        zzgk zzgk = this.zzvu;
        if (zzgk != null) {
            zzgk.zza(zzgj);
        }
        if (!zzgj.zzft() && this.zzvv.zzfq()) {
            throw this.zzvw.zzb(zzgj);
        }
    }
}
