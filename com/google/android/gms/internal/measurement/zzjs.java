package com.google.android.gms.internal.measurement;

final class zzjs {
    private static final zzjq<?> zza = new zzjr();
    private static final zzjq<?> zzb;

    static {
        zzjq<?> zzjq;
        try {
            zzjq = (zzjq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjq = null;
        }
        zzb = zzjq;
    }

    static zzjq<?> zza() {
        return zza;
    }

    static zzjq<?> zzb() {
        zzjq<?> zzjq = zzb;
        if (zzjq != null) {
            return zzjq;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
