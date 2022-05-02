package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class zzai implements zzap, zzal {
    protected final String zzd;
    protected final Map<String, zzap> zze = new HashMap();

    public zzai(String str) {
        this.zzd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzai = (zzai) obj;
        String str = this.zzd;
        if (str != null) {
            return str.equals(zzai.zzd);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzap zza(zzg zzg, List<zzap> list);

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        if ("toString".equals(str)) {
            return new zzat(this.zzd);
        }
        return zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    public final Boolean zze() {
        return true;
    }

    public final Iterator<zzap> zzf() {
        return zzaj.zzb(this.zze);
    }

    public final String zzg() {
        return this.zzd;
    }

    public final boolean zzj(String str) {
        return this.zze.containsKey(str);
    }

    public final zzap zzk(String str) {
        return this.zze.containsKey(str) ? this.zze.get(str) : zzf;
    }

    public final void zzm(String str, zzap zzap) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1539847303, oncanceled);
            onCancelLoad.getMin(1539847303, oncanceled);
        }
        if (zzap == null) {
            this.zze.remove(str);
        } else {
            this.zze.put(str, zzap);
        }
    }

    public zzap zzt() {
        return this;
    }
}
