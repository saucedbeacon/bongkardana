package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzgj implements Callable<List<zzks>> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgm zzb;

    zzgj(zzgm zzgm, String str) {
        this.zzb = zzgm;
        this.zza = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzG();
        return this.zzb.zza.zzi().zzl(this.zza);
    }
}
