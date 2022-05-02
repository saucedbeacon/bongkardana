package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.Callable;

final /* synthetic */ class zzot implements Callable {
    private final zzor zzayj;
    private final zzpd zzayk;
    private final zzok zzayr;
    private final zzoo zzays;

    zzot(zzor zzor, zzpd zzpd, zzok zzok, zzoo zzoo) {
        this.zzayj = zzor;
        this.zzayk = zzpd;
        this.zzayr = zzok;
        this.zzays = zzoo;
    }

    public final Object call() {
        return this.zzayj.zza(this.zzayk, this.zzayr, this.zzays);
    }
}
