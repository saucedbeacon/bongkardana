package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzg {
    public final zzg zza;
    final zzax zzb;
    final Map<String, zzap> zzc = new HashMap();
    final Map<String, Boolean> zzd = new HashMap();

    public zzg(zzg zzg, zzax zzax) {
        this.zza = zzg;
        this.zzb = zzax;
    }

    public final zzap zza(zzap zzap) {
        return this.zzb.zzb(this, zzap);
    }

    public final zzap zzb(zzae zzae) {
        zzap zzap = zzap.zzf;
        Iterator<Integer> zzg = zzae.zzg();
        while (zzg.hasNext()) {
            zzap = this.zzb.zzb(this, zzae.zzl(zzg.next().intValue()));
            if (zzap instanceof zzag) {
                break;
            }
        }
        return zzap;
    }

    public final zzg zzc() {
        return new zzg(this, this.zzb);
    }

    public final boolean zzd(String str) {
        if (this.zzc.containsKey(str)) {
            return true;
        }
        zzg zzg = this.zza;
        if (zzg != null) {
            return zzg.zzd(str);
        }
        return false;
    }

    public final void zze(String str, zzap zzap) {
        zzg zzg;
        if (!this.zzc.containsKey(str) && (zzg = this.zza) != null && zzg.zzd(str)) {
            this.zza.zze(str, zzap);
        } else if (!this.zzd.containsKey(str)) {
            if (zzap == null) {
                this.zzc.remove(str);
            } else {
                this.zzc.put(str, zzap);
            }
        }
    }

    public final void zzf(String str, zzap zzap) {
        if (!this.zzd.containsKey(str)) {
            if (zzap == null) {
                this.zzc.remove(str);
            } else {
                this.zzc.put(str, zzap);
            }
        }
    }

    public final void zzg(String str, zzap zzap) {
        zzf(str, zzap);
        this.zzd.put(str, true);
    }

    public final zzap zzh(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        zzg zzg = this.zza;
        if (zzg != null) {
            return zzg.zzh(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }
}
