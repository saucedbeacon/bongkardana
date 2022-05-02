package com.google.android.gms.internal.measurement;

public final class zzoi implements zzoh {
    public static final zzht<Boolean> zza;
    public static final zzht<Boolean> zzb;
    public static final zzht<Boolean> zzc;
    public static final zzht<Boolean> zzd;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zzb = zzhr.zzb("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzc = zzhr.zzb("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzd = zzhr.zzb("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean zza() {
        return true;
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
