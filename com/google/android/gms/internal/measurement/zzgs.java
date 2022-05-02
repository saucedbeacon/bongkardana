package com.google.android.gms.internal.measurement;

import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.text.Typography;

public enum zzgs implements zzkf {
    UNKNOWN(0),
    STRING(1),
    zzc(2),
    BOOLEAN(3),
    STATEMENT(4);
    
    private static final zzkg<zzgs> zzf = null;
    private final int zzg;

    static {
        zzf = new zzgq();
    }

    private zzgs(int i) {
        this.zzg = i;
    }

    public static zzgs zza(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STRING;
        }
        if (i == 2) {
            return zzc;
        }
        if (i == 3) {
            return BOOLEAN;
        }
        if (i != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static zzkh zzb() {
        return zzgr.zza;
    }

    public final String toString() {
        return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
    }
}
