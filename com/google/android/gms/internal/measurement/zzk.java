package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class zzk extends zzai {
    private final zzab zza;

    public zzk(zzab zzab) {
        super("internal.eventLogger");
        this.zza = zzab;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzh.zza(this.zzd, 3, list);
        String zzc = zzg.zza(list.get(0)).zzc();
        long zzi = (long) zzh.zzi(zzg.zza(list.get(1)).zzd().doubleValue());
        zzap zza2 = zzg.zza(list.get(2));
        HashMap hashMap = new HashMap();
        if (zza2 instanceof zzam) {
            zzam zzam = (zzam) zza2;
            for (String next : zzam.zzb()) {
                Object zzj = zzh.zzj(zzam.zzk(next));
                if (zzj != null) {
                    hashMap.put(next, zzj);
                }
            }
        }
        this.zza.zze(zzc, zzi, hashMap);
        return zzap.zzf;
    }
}
