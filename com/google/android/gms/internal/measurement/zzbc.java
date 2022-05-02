package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbc extends zzaw {
    protected zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzh.zza(zzbl.AND.name(), 2, list);
            zzap zza = zzg.zza(list.get(0));
            if (!zza.zze().booleanValue()) {
                return zza;
            }
            return zzg.zza(list.get(1));
        } else if (ordinal == 47) {
            zzh.zza(zzbl.NOT.name(), 1, list);
            return new zzaf(Boolean.valueOf(!zzg.zza(list.get(0)).zze().booleanValue()));
        } else if (ordinal != 50) {
            return super.zzb(str);
        } else {
            zzh.zza(zzbl.OR.name(), 2, list);
            zzap zza2 = zzg.zza(list.get(0));
            if (zza2.zze().booleanValue()) {
                return zza2;
            }
            return zzg.zza(list.get(1));
        }
    }
}
