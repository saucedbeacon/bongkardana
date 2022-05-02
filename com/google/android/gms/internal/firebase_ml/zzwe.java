package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

final class zzwe implements zzwb {
    zzwe() {
    }

    public final Map<?, ?> zzt(Object obj) {
        return (zzwc) obj;
    }

    public final zzvz<?, ?> zzy(Object obj) {
        return ((zzwa) obj).zzud();
    }

    public final Map<?, ?> zzu(Object obj) {
        return (zzwc) obj;
    }

    public final boolean zzv(Object obj) {
        return !((zzwc) obj).isMutable();
    }

    public final Object zzw(Object obj) {
        ((zzwc) obj).zzrv();
        return obj;
    }

    public final Object zzx(Object obj) {
        return zzwc.zzue().zzuf();
    }

    public final Object zzd(Object obj, Object obj2) {
        zzwc zzwc = (zzwc) obj;
        zzwc zzwc2 = (zzwc) obj2;
        if (!zzwc2.isEmpty()) {
            if (!zzwc.isMutable()) {
                zzwc = zzwc.zzuf();
            }
            zzwc.zza(zzwc2);
        }
        return zzwc;
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzwc zzwc = (zzwc) obj;
        zzwa zzwa = (zzwa) obj2;
        int i2 = 0;
        if (zzwc.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : zzwc.entrySet()) {
            i2 += zzwa.zzc(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
