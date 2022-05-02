package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzax {
    final Map<String, zzaw> zza = new HashMap();
    final zzbj zzb = new zzbj();

    public zzax() {
        zza(new zzav());
        zza(new zzay());
        zza(new zzaz());
        zza(new zzbc());
        zza(new zzbh());
        zza(new zzbi());
        zza(new zzbk());
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzaw zzaw) {
        for (zzbl zzb2 : zzaw.zza) {
            this.zza.put(zzb2.zzb().toString(), zzaw);
        }
    }

    public final zzap zzb(zzg zzg, zzap zzap) {
        zzaw zzaw;
        zzh.zzk(zzg);
        if (!(zzap instanceof zzaq)) {
            return zzap;
        }
        zzaq zzaq = (zzaq) zzap;
        ArrayList<zzap> zzg2 = zzaq.zzg();
        String zzb2 = zzaq.zzb();
        if (this.zza.containsKey(zzb2)) {
            zzaw = this.zza.get(zzb2);
        } else {
            zzaw = this.zzb;
        }
        return zzaw.zza(zzb2, zzg, zzg2);
    }
}
