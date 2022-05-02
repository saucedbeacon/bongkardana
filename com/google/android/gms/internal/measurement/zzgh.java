package com.google.android.gms.internal.measurement;

public final class zzgh extends zzkd<zzgh, zzgg> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgh zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zzgh zzgh = new zzgh();
        zzk = zzgh;
        zzkd.zzby(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    public static zzgg zzj() {
        return (zzgg) zzk.zzbt();
    }

    static /* synthetic */ void zzm(zzgh zzgh, long j) {
        zzgh.zza |= 1;
        zzgh.zze = j;
    }

    static /* synthetic */ void zzn(zzgh zzgh, String str) {
        str.getClass();
        zzgh.zza |= 2;
        zzgh.zzf = str;
    }

    static /* synthetic */ void zzo(zzgh zzgh, String str) {
        str.getClass();
        zzgh.zza |= 4;
        zzgh.zzg = str;
    }

    static /* synthetic */ void zzp(zzgh zzgh) {
        zzgh.zza &= -5;
        zzgh.zzg = zzk.zzg;
    }

    static /* synthetic */ void zzq(zzgh zzgh, long j) {
        zzgh.zza |= 8;
        zzgh.zzh = j;
    }

    static /* synthetic */ void zzr(zzgh zzgh) {
        zzgh.zza &= -9;
        zzgh.zzh = 0;
    }

    static /* synthetic */ void zzs(zzgh zzgh, double d) {
        zzgh.zza |= 32;
        zzgh.zzj = d;
    }

    static /* synthetic */ void zzt(zzgh zzgh) {
        zzgh.zza &= -33;
        zzgh.zzj = 0.0d;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zza & 4) != 0;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return (this.zza & 8) != 0;
    }

    public final long zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zza & 32) != 0;
    }

    public final double zzi() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgh();
        } else {
            if (i2 == 4) {
                return new zzgg((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }
}
