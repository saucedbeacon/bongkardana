package com.google.android.gms.internal.firebase_ml;

import java.util.Collection;
import java.util.HashSet;

public final class zzhe {
    final zzhd zzzb;
    Collection<String> zzzf = new HashSet();

    public zzhe(zzhd zzhd) {
        this.zzzb = (zzhd) zzlp.checkNotNull(zzhd);
    }

    public final zzhf zzgn() {
        return new zzhf(this);
    }

    public final zzhe zza(Collection<String> collection) {
        this.zzzf = collection;
        return this;
    }
}
