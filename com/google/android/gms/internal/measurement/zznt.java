package com.google.android.gms.internal.measurement;

public final class zznt implements zzns {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Boolean> zzc;
    public static final zzht<Long> zzd;
    public static final zzht<Long> zze;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.client.consent_state_v1", true);
        zzb = zzhr.zzb("measurement.client.3p_consent_state_v1", true);
        zzc = zzhr.zzb("measurement.service.consent_state_v1_W36", true);
        zzd = zzhr.zza("measurement.id.service.consent_state_v1_W36", 0);
        zze = zzhr.zza("measurement.service.storage_consent_support_version", 203590);
    }

    public final long zza() {
        return zze.zze().longValue();
    }
}
