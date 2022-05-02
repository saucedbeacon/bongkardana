package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgo extends zzkd<zzgo, zzgn> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgo zzg;
    private int zza;
    private zzkk<zzgt> zze = zzbE();
    private zzgk zzf;

    static {
        zzgo zzgo = new zzgo();
        zzg = zzgo;
        zzkd.zzby(zzgo.class, zzgo);
    }

    private zzgo() {
    }

    public final List<zzgt> zza() {
        return this.zze;
    }

    public final zzgk zzb() {
        zzgk zzgk = this.zzf;
        return zzgk == null ? zzgk.zzc() : zzgk;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zze", zzgt.class, "zzf"});
        } else if (i2 == 3) {
            return new zzgo();
        } else {
            if (i2 == 4) {
                return new zzgn((zzgi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
