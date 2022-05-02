package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.Callable;

final /* synthetic */ class zzoq implements Callable {
    private final zzor zzayj;
    private final zzpd zzayk;
    private final Callable zzayl;

    zzoq(zzor zzor, zzpd zzpd, Callable callable) {
        this.zzayj = zzor;
        this.zzayk = zzpd;
        this.zzayl = callable;
    }

    public final Object call() {
        return this.zzayj.zzb(this.zzayk, this.zzayl);
    }
}
