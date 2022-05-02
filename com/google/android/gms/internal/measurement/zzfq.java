package com.google.android.gms.internal.measurement;

public final class zzfq extends zzkd<zzfq, zzfp> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfq zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        zzfq zzfq = new zzfq();
        zzg = zzfq;
        zzkd.zzby(zzfq.class, zzfq);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zzg.zzbt();
    }

    static /* synthetic */ void zzc(zzfq zzfq, String str) {
        str.getClass();
        zzfq.zza |= 1;
        zzfq.zze = str;
    }

    static /* synthetic */ void zzd(zzfq zzfq, long j) {
        zzfq.zza |= 2;
        zzfq.zzf = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfq();
        } else {
            if (i2 == 4) {
                return new zzfp((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
