package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

public final class zzz {
    final TreeMap<Integer, zzao> zza = new TreeMap<>();
    final TreeMap<Integer, zzao> zzb = new TreeMap<>();

    private static final int zzc(zzg zzg, zzao zzao, zzap zzap) {
        zzap zza2 = zzao.zza(zzg, Collections.singletonList(zzap));
        if (zza2 instanceof zzah) {
            return zzh.zzg(zza2.zzd().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i, zzao zzao, String str2) {
        TreeMap<Integer, zzao> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.zzb;
        } else if ("edit".equals(str2)) {
            treeMap = this.zza;
        } else {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzao);
    }

    public final void zzb(zzg zzg, zzab zzab) {
        zzl zzl = new zzl(zzab);
        for (Integer num : this.zza.keySet()) {
            zzaa zzg2 = zzab.zzc().clone();
            int zzc = zzc(zzg, this.zza.get(num), zzl);
            if (zzc == 2 || zzc == -1) {
                zzab.zzd(zzg2);
            }
        }
        for (Integer num2 : this.zzb.keySet()) {
            zzc(zzg, this.zzb.get(num2), zzl);
        }
    }
}
