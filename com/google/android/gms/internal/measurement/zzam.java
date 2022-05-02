package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzam implements zzap, zzal {
    final Map<String, zzap> zza = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        return this.zza.equals(((zzam) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.zza.isEmpty()) {
            for (String next : this.zza.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{next, this.zza.get(next)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final List<String> zzb() {
        return new ArrayList(this.zza.keySet());
    }

    public zzap zzbK(String str, zzg zzg, List<zzap> list) {
        if ("toString".equals(str)) {
            return new zzat(toString());
        }
        return zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final String zzc() {
        return "[object Object]";
    }

    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    public final Boolean zze() {
        return true;
    }

    public final Iterator<zzap> zzf() {
        return zzaj.zzb(this.zza);
    }

    public final boolean zzj(String str) {
        return this.zza.containsKey(str);
    }

    public final zzap zzk(String str) {
        return this.zza.containsKey(str) ? this.zza.get(str) : zzf;
    }

    public final void zzm(String str, zzap zzap) {
        if (zzap == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzap);
        }
    }

    public final zzap zzt() {
        zzam zzam = new zzam();
        for (Map.Entry next : this.zza.entrySet()) {
            if (next.getValue() instanceof zzal) {
                zzam.zza.put((String) next.getKey(), (zzap) next.getValue());
            } else {
                zzam.zza.put((String) next.getKey(), ((zzap) next.getValue()).zzt());
            }
        }
        return zzam;
    }
}
