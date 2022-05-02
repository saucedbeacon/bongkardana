package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzmj extends zzmh<zzmi, zzmi> {
    zzmj() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzmi) obj).zzh(i << 3, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzmi.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzc(Object obj, Object obj2) {
        ((zzkd) obj).zzc = (zzmi) obj2;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zzd(Object obj) {
        return ((zzkd) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        ((zzkd) obj).zzc.zzd();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzmi zzmi = (zzmi) obj2;
        if (zzmi.equals(zzmi.zza())) {
            return obj;
        }
        return zzmi.zzc((zzmi) obj, zzmi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzg(Object obj) {
        return ((zzmi) obj).zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzh(Object obj) {
        return ((zzmi) obj).zzf();
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzi(Object obj, zzjl zzjl) throws IOException {
        ((zzmi) obj).zzi(zzjl);
    }
}
