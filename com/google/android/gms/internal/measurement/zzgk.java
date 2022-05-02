package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgk extends zzkd<zzgk, zzgj> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgk zze;
    private zzkk<zzgm> zza = zzbE();

    static {
        zzgk zzgk = new zzgk();
        zze = zzgk;
        zzkd.zzby(zzgk.class, zzgk);
    }

    private zzgk() {
    }

    public static zzgk zzc() {
        return zze;
    }

    public final List<zzgm> zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zza.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzgm.class});
        } else if (i2 == 3) {
            return new zzgk();
        } else {
            if (i2 == 4) {
                return new zzgj((zzgi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
