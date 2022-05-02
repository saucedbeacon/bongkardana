package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzlq {
    private static final zzlq zza = new zzlq();
    private final zzlu zzb = new zzla();
    private final ConcurrentMap<Class<?>, zzlt<?>> zzc = new ConcurrentHashMap();

    private zzlq() {
    }

    public static zzlq zza() {
        return zza;
    }

    public final <T> zzlt<T> zzb(Class<T> cls) {
        zzkl.zzb(cls, "messageType");
        zzlt<T> zzlt = (zzlt) this.zzc.get(cls);
        if (zzlt == null) {
            zzlt = this.zzb.zza(cls);
            zzkl.zzb(cls, "messageType");
            zzkl.zzb(zzlt, "schema");
            zzlt<T> putIfAbsent = this.zzc.putIfAbsent(cls, zzlt);
            return putIfAbsent == null ? zzlt : putIfAbsent;
        }
    }
}
