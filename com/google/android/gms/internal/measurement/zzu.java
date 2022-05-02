package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzu extends zzai {
    private final zzz zza;

    public zzu(zzz zzz) {
        super("internal.registerCallback");
        this.zza = zzz;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzh.zza(this.zzd, 3, list);
        String zzc = zzg.zza(list.get(0)).zzc();
        zzap zza2 = zzg.zza(list.get(1));
        if (zza2 instanceof zzao) {
            zzap zza3 = zzg.zza(list.get(2));
            if (zza3 instanceof zzam) {
                zzam zzam = (zzam) zza3;
                if (zzam.zzj("type")) {
                    this.zza.zza(zzc, zzam.zzj("priority") ? zzh.zzg(zzam.zzk("priority").zzd().doubleValue()) : 1000, (zzao) zza2, zzam.zzk("type").zzc());
                    return zzap.zzf;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
