package com.google.android.gms.internal.measurement;

final class zzkv extends zzkw {
    private zzkv() {
        super((zzkt) null);
    }

    /* synthetic */ zzkv(zzkt zzkt) {
        super((zzkt) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        ((zzkk) zzmr.zzn(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zzb(Object obj, Object obj2, long j) {
        zzkk zzkk = (zzkk) zzmr.zzn(obj, j);
        zzkk zzkk2 = (zzkk) zzmr.zzn(obj2, j);
        int size = zzkk.size();
        int size2 = zzkk2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkk.zza()) {
                zzkk = zzkk.zze(size2 + size);
            }
            zzkk.addAll(zzkk2);
        }
        if (size > 0) {
            zzkk2 = zzkk;
        }
        zzmr.zzo(obj, j, zzkk2);
    }
}
