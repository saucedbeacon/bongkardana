package com.google.android.gms.internal.measurement;

public final class zzpg implements zzpf {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.sdk.screen.manual_screen_view_logging", true);
        zzb = zzhr.zzb("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zze().booleanValue();
    }

    public final boolean zzc() {
        return zzb.zze().booleanValue();
    }
}
