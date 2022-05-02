package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgf extends zzkd<zzgf, zzge> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgf zzg;
    private int zza;
    private int zze;
    private zzkj zzf = zzbC();

    static {
        zzgf zzgf = new zzgf();
        zzg = zzgf;
        zzkd.zzby(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public static zzge zzf() {
        return (zzge) zzg.zzbt();
    }

    static /* synthetic */ void zzh(zzgf zzgf, int i) {
        zzgf.zza |= 1;
        zzgf.zze = i;
    }

    static /* synthetic */ void zzi(zzgf zzgf, Iterable iterable) {
        zzkj zzkj = zzgf.zzf;
        if (!zzkj.zza()) {
            zzgf.zzf = zzkd.zzbD(zzkj);
        }
        zzio.zzbs(iterable, zzgf.zzf);
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<Long> zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    public final long zze(int i) {
        return this.zzf.zzc(i);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgf();
        } else {
            if (i2 == 4) {
                return new zzge((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
