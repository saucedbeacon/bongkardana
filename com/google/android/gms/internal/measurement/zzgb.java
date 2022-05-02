package com.google.android.gms.internal.measurement;

public final class zzgb extends zzkd<zzgb, zzfx> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgb zzg;
    private int zza;
    private int zze = 1;
    private zzkk<zzfq> zzf = zzbE();

    static {
        zzgb zzgb = new zzgb();
        zzg = zzgb;
        zzkd.zzby(zzgb.class, zzgb);
    }

    private zzgb() {
    }

    public static zzfx zza() {
        return (zzfx) zzg.zzbt();
    }

    static /* synthetic */ void zzc(zzgb zzgb, zzfq zzfq) {
        zzfq.getClass();
        zzkk<zzfq> zzkk = zzgb.zzf;
        if (!zzkk.zza()) {
            zzgb.zzf = zzkd.zzbF(zzkk);
        }
        zzgb.zzf.add(zzfq);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zza", "zze", zzga.zzb(), "zzf", zzfq.class});
        } else if (i2 == 3) {
            return new zzgb();
        } else {
            if (i2 == 4) {
                return new zzfx((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
