package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfs extends zzkd<zzfs, zzfr> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfs zzk;
    private int zza;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public zzkk<zzfs> zzj = zzbE();

    static {
        zzfs zzfs = new zzfs();
        zzk = zzfs;
        zzkd.zzby(zzfs.class, zzfs);
    }

    private zzfs() {
    }

    public static zzfr zzn() {
        return (zzfr) zzk.zzbt();
    }

    static /* synthetic */ void zzp(zzfs zzfs, String str) {
        str.getClass();
        zzfs.zza |= 1;
        zzfs.zze = str;
    }

    static /* synthetic */ void zzq(zzfs zzfs, String str) {
        str.getClass();
        zzfs.zza |= 2;
        zzfs.zzf = str;
    }

    static /* synthetic */ void zzr(zzfs zzfs) {
        zzfs.zza &= -3;
        zzfs.zzf = zzk.zzf;
    }

    static /* synthetic */ void zzs(zzfs zzfs, long j) {
        zzfs.zza |= 4;
        zzfs.zzg = j;
    }

    static /* synthetic */ void zzt(zzfs zzfs) {
        zzfs.zza &= -5;
        zzfs.zzg = 0;
    }

    static /* synthetic */ void zzu(zzfs zzfs, double d) {
        zzfs.zza |= 16;
        zzfs.zzi = d;
    }

    static /* synthetic */ void zzv(zzfs zzfs) {
        zzfs.zza &= -17;
        zzfs.zzi = 0.0d;
    }

    static /* synthetic */ void zzw(zzfs zzfs, zzfs zzfs2) {
        zzfs2.getClass();
        zzfs.zzz();
        zzfs.zzj.add(zzfs2);
    }

    static /* synthetic */ void zzx(zzfs zzfs, Iterable iterable) {
        zzfs.zzz();
        zzio.zzbs(iterable, zzfs.zzj);
    }

    private final void zzz() {
        zzkk<zzfs> zzkk = this.zzj;
        if (!zzkk.zza()) {
            this.zzj = zzkd.zzbF(zzkk);
        }
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final String zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zza & 4) != 0;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zza & 8) != 0;
    }

    public final float zzh() {
        return this.zzh;
    }

    public final boolean zzi() {
        return (this.zza & 16) != 0;
    }

    public final double zzj() {
        return this.zzi;
    }

    public final List<zzfs> zzk() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfs.class});
        } else if (i2 == 3) {
            return new zzfs();
        } else {
            if (i2 == 4) {
                return new zzfr((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    public final int zzm() {
        return this.zzj.size();
    }
}
