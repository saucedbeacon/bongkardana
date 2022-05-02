package com.google.android.gms.internal.firebase_ml;

final class zzvt extends zzvs {
    private zzvt() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzrv();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzvf zzc = zzc(obj, j);
        zzvf zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzru()) {
                zzc = zzc.zzcp(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzya.zza(obj, j, (Object) zzc2);
    }

    private static <E> zzvf<E> zzc(Object obj, long j) {
        return (zzvf) zzya.zzp(obj, j);
    }
}
