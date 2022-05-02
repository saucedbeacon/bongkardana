package com.google.android.gms.internal.measurement;

public final class zzfm extends zzkd<zzfm, zzfl> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfm zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        zzfm zzfm = new zzfm();
        zzg = zzfm;
        zzkd.zzby(zzfm.class, zzfm);
    }

    private zzfm() {
    }

    public static zzfl zze() {
        return (zzfl) zzg.zzbt();
    }

    static /* synthetic */ void zzg(zzfm zzfm, int i) {
        zzfm.zza |= 1;
        zzfm.zze = i;
    }

    static /* synthetic */ void zzh(zzfm zzfm, long j) {
        zzfm.zza |= 2;
        zzfm.zzf = j;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final long zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfm();
        } else {
            if (i2 == 4) {
                return new zzfl((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
