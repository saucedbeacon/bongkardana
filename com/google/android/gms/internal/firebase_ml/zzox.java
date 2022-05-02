package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.Callable;

final /* synthetic */ class zzox implements Callable {
    private final zzph zzazn;

    private zzox(zzph zzph) {
        this.zzazn = zzph;
    }

    static Callable zza(zzph zzph) {
        return new zzox(zzph);
    }

    public final Object call() {
        return this.zzazn.zznj();
    }
}
