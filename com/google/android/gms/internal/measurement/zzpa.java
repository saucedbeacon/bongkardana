package com.google.android.gms.internal.measurement;

public final class zzpa implements zzoz {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Boolean> zzc;
    public static final zzht<Boolean> zzd;
    public static final zzht<Long> zze;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zzhr.zzb("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zzhr.zzb("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zzhr.zzb("measurement.sdk.collection.last_gclid_from_referrer2", false);
        zze = zzhr.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return zza.zze().booleanValue();
    }

    public final boolean zzb() {
        return zzb.zze().booleanValue();
    }

    public final boolean zzc() {
        return zzc.zze().booleanValue();
    }

    public final boolean zzd() {
        return zzd.zze().booleanValue();
    }
}
