package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzv extends zzai {
    final Map<String, zzai> zza = new HashMap();
    private final zzj zzb;

    public zzv(zzj zzj) {
        super("require");
        this.zzb = zzj;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzap zzap;
        zzh.zza("require", 1, list);
        String zzc = zzg.zza(list.get(0)).zzc();
        if (this.zza.containsKey(zzc)) {
            return this.zza.get(zzc);
        }
        zzj zzj = this.zzb;
        if (zzj.zza.containsKey(zzc)) {
            try {
                zzap = (zzap) zzj.zza.get(zzc).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzc);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            zzap = zzap.zzf;
        }
        if (zzap instanceof zzai) {
            this.zza.put(zzc, (zzai) zzap);
        }
        return zzap;
    }
}
