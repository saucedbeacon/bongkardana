package com.google.android.gms.internal.measurement;

import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.text.Typography;

public enum zzga implements zzkf {
    RADS(1),
    PROVISIONING(2);
    
    private static final zzkg<zzga> zzc = null;
    private final int zzd;

    static {
        zzc = new zzfy();
    }

    private zzga(int i) {
        this.zzd = i;
    }

    public static zzga zza(int i) {
        if (i == 1) {
            return RADS;
        }
        if (i != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static zzkh zzb() {
        return zzfz.zza;
    }

    public final String toString() {
        return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + Typography.greater;
    }
}
