package com.google.android.gms.internal.measurement;

public final class zznh implements zzng {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Long> zzc;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.frontend.directly_maybe_log_error_events", false);
        zzb = zzhr.zzb("measurement.upload.directly_maybe_log_error_events", true);
        zzc = zzhr.zza("measurement.id.frontend.directly_maybe_log_error_events", 0);
    }

    public final boolean zza() {
        return zza.zze().booleanValue();
    }

    public final boolean zzb() {
        return zzb.zze().booleanValue();
    }
}
