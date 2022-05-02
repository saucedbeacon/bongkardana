package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzab {
    private zzaa zza;
    private zzaa zzb;
    private final List<zzaa> zzc;

    public zzab() {
        this.zza = new zzaa("", 0, (Map<String, Object>) null);
        this.zzb = new zzaa("", 0, (Map<String, Object>) null);
        this.zzc = new ArrayList();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzab = new zzab(this.zza.clone());
        for (zzaa zzg : this.zzc) {
            zzab.zzc.add(zzg.clone());
        }
        return zzab;
    }

    public final zzaa zza() {
        return this.zza;
    }

    public final void zzb(zzaa zzaa) {
        this.zza = zzaa;
        this.zzb = zzaa.clone();
        this.zzc.clear();
    }

    public final zzaa zzc() {
        return this.zzb;
    }

    public final void zzd(zzaa zzaa) {
        this.zzb = zzaa;
    }

    public final void zze(String str, long j, Map<String, Object> map) {
        this.zzc.add(new zzaa(str, j, map));
    }

    public final List<zzaa> zzf() {
        return this.zzc;
    }

    public zzab(zzaa zzaa) {
        this.zza = zzaa;
        this.zzb = zzaa.clone();
        this.zzc = new ArrayList();
    }
}
