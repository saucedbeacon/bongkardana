package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgd extends zzkd<zzgd, zzgc> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzgd zzh;
    /* access modifiers changed from: private */
    public zzkj zza = zzbC();
    /* access modifiers changed from: private */
    public zzkj zze = zzbC();
    private zzkk<zzfm> zzf = zzbE();
    private zzkk<zzgf> zzg = zzbE();

    static {
        zzgd zzgd = new zzgd();
        zzh = zzgd;
        zzkd.zzby(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    public static zzgc zzk() {
        return (zzgc) zzh.zzbt();
    }

    public static zzgd zzm() {
        return zzh;
    }

    static /* synthetic */ void zzo(zzgd zzgd, Iterable iterable) {
        zzkj zzkj = zzgd.zza;
        if (!zzkj.zza()) {
            zzgd.zza = zzkd.zzbD(zzkj);
        }
        zzio.zzbs(iterable, zzgd.zza);
    }

    static /* synthetic */ void zzq(zzgd zzgd, Iterable iterable) {
        zzkj zzkj = zzgd.zze;
        if (!zzkj.zza()) {
            zzgd.zze = zzkd.zzbD(zzkj);
        }
        zzio.zzbs(iterable, zzgd.zze);
    }

    static /* synthetic */ void zzs(zzgd zzgd, Iterable iterable) {
        zzgd.zzw();
        zzio.zzbs(iterable, zzgd.zzf);
    }

    static /* synthetic */ void zzt(zzgd zzgd, int i) {
        zzgd.zzw();
        zzgd.zzf.remove(i);
    }

    static /* synthetic */ void zzu(zzgd zzgd, Iterable iterable) {
        zzgd.zzx();
        zzio.zzbs(iterable, zzgd.zzg);
    }

    static /* synthetic */ void zzv(zzgd zzgd, int i) {
        zzgd.zzx();
        zzgd.zzg.remove(i);
    }

    private final void zzw() {
        zzkk<zzfm> zzkk = this.zzf;
        if (!zzkk.zza()) {
            this.zzf = zzkd.zzbF(zzkk);
        }
    }

    private final void zzx() {
        zzkk<zzgf> zzkk = this.zzg;
        if (!zzkk.zza()) {
            this.zzg = zzkd.zzbF(zzkk);
        }
    }

    public final List<Long> zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final List<Long> zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final List<zzfm> zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzf.size();
    }

    public final zzfm zzg(int i) {
        return (zzfm) this.zzf.get(i);
    }

    public final List<zzgf> zzh() {
        return this.zzg;
    }

    public final int zzi() {
        return this.zzg.size();
    }

    public final zzgf zzj(int i) {
        return (zzgf) this.zzg.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", zzfm.class, "zzg", zzgf.class});
        } else if (i2 == 3) {
            return new zzgd();
        } else {
            if (i2 == 4) {
                return new zzgc((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }
}
