package com.google.android.gms.internal.measurement;

public final class zzoo implements zzon {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Boolean> zzc;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzb = zzhr.zzb("measurement.client.sessions.check_on_startup", true);
        zzc = zzhr.zzb("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zze().booleanValue();
    }
}
