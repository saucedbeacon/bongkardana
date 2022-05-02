package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzaq implements zzap {
    private final String zza;
    private final ArrayList<zzap> zzb;

    public zzaq(String str, List<zzap> list) {
        this.zza = str;
        ArrayList<zzap> arrayList = new ArrayList<>();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaq)) {
            return false;
        }
        zzaq zzaq = (zzaq) obj;
        String str = this.zza;
        if (str == null ? zzaq.zza == null : str.equals(zzaq.zza)) {
            return this.zzb.equals(zzaq.zzb);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((str != null ? str.hashCode() : 0) * 31) + this.zzb.hashCode();
    }

    public final String zzb() {
        return this.zza;
    }

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Iterator<zzap> zzf() {
        return null;
    }

    public final ArrayList<zzap> zzg() {
        return this.zzb;
    }

    public final zzap zzt() {
        return this;
    }
}
