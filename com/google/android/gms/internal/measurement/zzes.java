package com.google.android.gms.internal.measurement;

public final class zzes extends zzkd<zzes, zzer> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzes zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private zzel zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzes zzes = new zzes();
        zzk = zzes;
        zzkd.zzby(zzes.class, zzes);
    }

    private zzes() {
    }

    public static zzer zzi() {
        return (zzer) zzk.zzbt();
    }

    static /* synthetic */ void zzk(zzes zzes, String str) {
        zzes.zza |= 2;
        zzes.zzf = str;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final zzel zzd() {
        zzel zzel = this.zzg;
        return zzel == null ? zzel.zzi() : zzel;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zza & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzes();
        } else {
            if (i2 == 4) {
                return new zzer((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }
}
