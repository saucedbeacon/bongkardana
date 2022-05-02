package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class zzba implements Comparator<zzap> {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;

    zzba(zzai zzai, zzg zzg) {
        this.zza = zzai;
        this.zzb = zzg;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzap = (zzap) obj;
        zzap zzap2 = (zzap) obj2;
        zzai zzai = this.zza;
        zzg zzg = this.zzb;
        if (zzap instanceof zzau) {
            return !(zzap2 instanceof zzau) ? 1 : 0;
        }
        if (zzap2 instanceof zzau) {
            return -1;
        }
        if (zzai == null) {
            return zzap.zzc().compareTo(zzap2.zzc());
        }
        return (int) zzh.zzi(zzai.zza(zzg, Arrays.asList(new zzap[]{zzap, zzap2})).zzd().doubleValue());
    }
}
