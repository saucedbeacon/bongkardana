package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

final class zzgc {
    final zzhx zzwt;
    final StringBuilder zzwu;
    final zzib zzwv;
    final List<Type> zzww;

    public zzgc(zzgd zzgd, StringBuilder sb) {
        Class<?> cls = zzgd.getClass();
        this.zzww = Arrays.asList(new Type[]{cls});
        this.zzwv = zzib.zza(cls, true);
        this.zzwu = sb;
        this.zzwt = new zzhx(zzgd);
    }
}
