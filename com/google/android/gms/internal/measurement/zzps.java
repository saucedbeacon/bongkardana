package com.google.android.gms.internal.measurement;

public final class zzps implements zzpr {
    public static final zzht<Boolean> zza;
    public static final zzht<Double> zzb;
    public static final zzht<Long> zzc;
    public static final zzht<Long> zzd;
    public static final zzht<String> zze;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzb("measurement.test.boolean_flag", false);
        zzb = zzhr.zzc("measurement.test.double_flag", -3.0d);
        zzc = zzhr.zza("measurement.test.int_flag", -2);
        zzd = zzhr.zza("measurement.test.long_flag", -1);
        zze = zzhr.zzd("measurement.test.string_flag", "---");
    }

    public final boolean zza() {
        return zza.zze().booleanValue();
    }

    public final double zzb() {
        return zzb.zze().doubleValue();
    }

    public final long zzc() {
        return zzc.zze().longValue();
    }

    public final long zzd() {
        return zzd.zze().longValue();
    }

    public final String zze() {
        return zze.zze();
    }
}
