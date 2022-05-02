package com.google.android.gms.internal.measurement;

public final class zzpp implements zzpo {
    public static final zzht<Boolean> zza;
    public static final zzht<Long> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.config.persist_last_modified", true);
        zzb = zzhr.zza("measurement.id.config.persist_last_modified", 0);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zze().booleanValue();
    }
}
