package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgm extends zzkd<zzgm, zzgl> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgm zzg;
    private int zza;
    private String zze = "";
    private zzkk<zzgt> zzf = zzbE();

    static {
        zzgm zzgm = new zzgm();
        zzg = zzgm;
        zzkd.zzby(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    public final String zza() {
        return this.zze;
    }

    public final List<zzgt> zzb() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zze", "zzf", zzgt.class});
        } else if (i2 == 3) {
            return new zzgm();
        } else {
            if (i2 == 4) {
                return new zzgl((zzgi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
