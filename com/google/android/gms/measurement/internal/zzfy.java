package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzfy implements Callable<List<zzks>> {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgm zzd;

    zzfy(zzgm zzgm, String str, String str2, String str3) {
        this.zzd = zzgm;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzG();
        return this.zzd.zza.zzi().zzm(this.zza, this.zzb, this.zzc);
    }
}
