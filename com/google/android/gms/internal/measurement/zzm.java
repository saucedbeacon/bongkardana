package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzm extends zzai {
    final /* synthetic */ zzo zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzm(zzn zzn, String str, zzo zzo) {
        super("getValue");
        this.zza = zzo;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzh.zza("getValue", 2, list);
        zzap zza2 = zzg.zza(list.get(0));
        zzap zza3 = zzg.zza(list.get(1));
        String zza4 = this.zza.zza(zza2.zzc());
        return zza4 != null ? new zzat(zza4) : zza3;
    }
}
