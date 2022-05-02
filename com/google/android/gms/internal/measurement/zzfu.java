package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfu extends zzkd<zzfu, zzft> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfu zze;
    private zzkk<zzfw> zza = zzbE();

    static {
        zzfu zzfu = new zzfu();
        zze = zzfu;
        zzkd.zzby(zzfu.class, zzfu);
    }

    private zzfu() {
    }

    public static zzft zzc() {
        return (zzft) zze.zzbt();
    }

    static /* synthetic */ void zze(zzfu zzfu, zzfw zzfw) {
        zzfw.getClass();
        zzkk<zzfw> zzkk = zzfu.zza;
        if (!zzkk.zza()) {
            zzfu.zza = zzkd.zzbF(zzkk);
        }
        zzfu.zza.add(zzfw);
    }

    public final List<zzfw> zza() {
        return this.zza;
    }

    public final zzfw zzb(int i) {
        return (zzfw) this.zza.get(0);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfw.class});
        } else if (i2 == 3) {
            return new zzfu();
        } else {
            if (i2 == 4) {
                return new zzft((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
