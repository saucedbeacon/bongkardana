package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfo extends zzkd<zzfo, zzfn> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfo zzj;
    private int zza;
    /* access modifiers changed from: private */
    public zzkk<zzfs> zze = zzbE();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzfo zzfo = new zzfo();
        zzj = zzfo;
        zzkd.zzby(zzfo.class, zzfo);
    }

    private zzfo() {
    }

    public static zzfn zzk() {
        return (zzfn) zzj.zzbt();
    }

    static /* synthetic */ void zzn(zzfo zzfo, int i, zzfs zzfs) {
        zzfs.getClass();
        zzfo.zzv();
        zzfo.zze.set(i, zzfs);
    }

    static /* synthetic */ void zzo(zzfo zzfo, zzfs zzfs) {
        zzfs.getClass();
        zzfo.zzv();
        zzfo.zze.add(zzfs);
    }

    static /* synthetic */ void zzp(zzfo zzfo, Iterable iterable) {
        zzfo.zzv();
        zzio.zzbs(iterable, zzfo.zze);
    }

    static /* synthetic */ void zzr(zzfo zzfo, int i) {
        zzfo.zzv();
        zzfo.zze.remove(i);
    }

    static /* synthetic */ void zzs(zzfo zzfo, String str) {
        str.getClass();
        zzfo.zza |= 1;
        zzfo.zzf = str;
    }

    static /* synthetic */ void zzt(zzfo zzfo, long j) {
        zzfo.zza |= 2;
        zzfo.zzg = j;
    }

    static /* synthetic */ void zzu(zzfo zzfo, long j) {
        zzfo.zza |= 4;
        zzfo.zzh = j;
    }

    private final void zzv() {
        zzkk<zzfs> zzkk = this.zze;
        if (!zzkk.zza()) {
            this.zze = zzkd.zzbF(zzkk);
        }
    }

    public final List<zzfs> zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final zzfs zzc(int i) {
        return (zzfs) this.zze.get(i);
    }

    public final String zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zza & 2) != 0;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zza & 4) != 0;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final boolean zzi() {
        return (this.zza & 8) != 0;
    }

    public final int zzj() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", zzfs.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzfo();
        } else {
            if (i2 == 4) {
                return new zzfn((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
