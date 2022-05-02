package com.google.android.gms.internal.measurement;

public final class zzpd implements zzpc {
    public static final zzht<Long> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Boolean> zzc;
    public static final zzht<Boolean> zzd;
    public static final zzht<Long> zze;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zza("measurement.id.lifecycle.app_in_background_parameter", 0);
        zzb = zzhr.zzb("measurement.lifecycle.app_backgrounded_engagement", false);
        zzc = zzhr.zzb("measurement.lifecycle.app_backgrounded_tracking", true);
        zzd = zzhr.zzb("measurement.lifecycle.app_in_background_parameter", false);
        zze = zzhr.zza("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return zzb.zze().booleanValue();
    }

    public final boolean zzb() {
        return zzd.zze().booleanValue();
    }
}
