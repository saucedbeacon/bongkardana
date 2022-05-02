package com.google.android.gms.internal.measurement;

public final class zzor implements zzoq {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Long> zzc;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        zzb = zzhr.zzb("measurement.collection.redundant_engagement_removal_enabled", false);
        zzc = zzhr.zza("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean zza() {
        return zzb.zze().booleanValue();
    }
}
