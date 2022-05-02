package com.google.android.gms.internal.measurement;

public final class zzne implements zznd {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.androidId.delete_feature", true);
        zzb = zzhr.zzb("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return zza.zze().booleanValue();
    }
}
