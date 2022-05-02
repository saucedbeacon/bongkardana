package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzwt {
    private static final zzwt zzccy = new zzwt();
    private final zzxb zzccz = new zzvv();
    private final ConcurrentMap<Class<?>, zzxc<?>> zzcda = new ConcurrentHashMap();

    public static zzwt zzur() {
        return zzccy;
    }

    public final <T> zzxc<T> zzk(Class<T> cls) {
        zzva.zza(cls, "messageType");
        zzxc<T> zzxc = (zzxc) this.zzcda.get(cls);
        if (zzxc != null) {
            return zzxc;
        }
        zzxc<T> zzj = this.zzccz.zzj(cls);
        zzva.zza(cls, "messageType");
        zzva.zza(zzj, "schema");
        zzxc<T> putIfAbsent = this.zzcda.putIfAbsent(cls, zzj);
        return putIfAbsent != null ? putIfAbsent : zzj;
    }

    public final <T> zzxc<T> zzad(T t) {
        return zzk(t.getClass());
    }

    private zzwt() {
    }
}
