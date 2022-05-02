package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzal, zzap zzap, zzg zzg, List<zzap> list) {
        if (zzal.zzj(zzap.zzc())) {
            zzap zzk = zzal.zzk(zzap.zzc());
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(zzg, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{zzap.zzc()}));
        } else if ("hasOwnProperty".equals(zzap.zzc())) {
            zzh.zza("hasOwnProperty", 1, list);
            if (zzal.zzj(zzg.zza(list.get(0)).zzc())) {
                return zzap.zzk;
            }
            return zzap.zzl;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{zzap.zzc()}));
        }
    }

    public static Iterator<zzap> zzb(Map<String, zzap> map) {
        return new zzak(map.keySet().iterator());
    }
}
