package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class zzy implements Runnable {
    private final /* synthetic */ zzu zza;
    private final /* synthetic */ Callable zzb;

    zzy(zzu zzu, Callable callable) {
        this.zza = zzu;
        this.zzb = callable;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb.call());
        } catch (Exception e) {
            this.zza.zza(e);
        }
    }
}
