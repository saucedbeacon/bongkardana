package com.google.android.gms.internal.measurement;

public final class zzpm implements zzpl {
    public static final zzht<Boolean> zza;
    public static final zzht<Long> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.validation.internal_limits_internal_event_params", false);
        zzb = zzhr.zza("measurement.id.validation.internal_limits_internal_event_params", 0);
    }

    public final boolean zza() {
        return zza.zze().booleanValue();
    }
}
