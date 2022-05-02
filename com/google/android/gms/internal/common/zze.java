package com.google.android.gms.internal.common;

public final class zze {
    private static final zzf zza;
    private static volatile zzf zzb;

    public static zzf zza() {
        return zzb;
    }

    static {
        zzg zzg = new zzg();
        zza = zzg;
        zzb = zzg;
    }
}
