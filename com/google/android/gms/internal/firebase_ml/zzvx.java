package com.google.android.gms.internal.firebase_ml;

final class zzvx implements zzwf {
    private zzwf[] zzcbt;

    zzvx(zzwf... zzwfArr) {
        this.zzcbt = zzwfArr;
    }

    public final boolean zzg(Class<?> cls) {
        for (zzwf zzg : this.zzcbt) {
            if (zzg.zzg(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzwg zzh(Class<?> cls) {
        for (zzwf zzwf : this.zzcbt) {
            if (zzwf.zzg(cls)) {
                return zzwf.zzh(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
