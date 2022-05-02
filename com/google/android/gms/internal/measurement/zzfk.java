package com.google.android.gms.internal.measurement;

public final class zzfk extends zzkd<zzfk, zzfj> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfk zzi;
    private int zza;
    private int zze;
    private zzgd zzf;
    private zzgd zzg;
    private boolean zzh;

    static {
        zzfk zzfk = new zzfk();
        zzi = zzfk;
        zzkd.zzby(zzfk.class, zzfk);
    }

    private zzfk() {
    }

    public static zzfj zzh() {
        return (zzfj) zzi.zzbt();
    }

    static /* synthetic */ void zzj(zzfk zzfk, int i) {
        zzfk.zza |= 1;
        zzfk.zze = i;
    }

    static /* synthetic */ void zzk(zzfk zzfk, zzgd zzgd) {
        zzgd.getClass();
        zzfk.zzf = zzgd;
        zzfk.zza |= 2;
    }

    static /* synthetic */ void zzm(zzfk zzfk, zzgd zzgd) {
        zzfk.zzg = zzgd;
        zzfk.zza |= 4;
    }

    static /* synthetic */ void zzn(zzfk zzfk, boolean z) {
        zzfk.zza |= 8;
        zzfk.zzh = z;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzgd zzc() {
        zzgd zzgd = this.zzf;
        return zzgd == null ? zzgd.zzm() : zzgd;
    }

    public final boolean zzd() {
        return (this.zza & 4) != 0;
    }

    public final zzgd zze() {
        zzgd zzgd = this.zzg;
        return zzgd == null ? zzgd.zzm() : zzgd;
    }

    public final boolean zzf() {
        return (this.zza & 8) != 0;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzfk();
        } else {
            if (i2 == 4) {
                return new zzfj((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
