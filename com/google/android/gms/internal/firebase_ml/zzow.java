package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzmn;

final /* synthetic */ class zzow implements Runnable {
    private final zzov zzazk;
    private final zzmn.zzaa.zza zzazl;
    private final zznc zzazm;

    zzow(zzov zzov, zzmn.zzaa.zza zza, zznc zznc) {
        this.zzazk = zzov;
        this.zzazl = zza;
        this.zzazm = zznc;
    }

    public final void run() {
        this.zzazk.zzb(this.zzazl, this.zzazm);
    }
}
