package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzej extends zzkd<zzej, zzei> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzej zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private zzkk<zzel> zzg = zzbE();
    private boolean zzh;
    private zzeq zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzej zzej = new zzej();
        zzm = zzej;
        zzkd.zzby(zzej.class, zzej);
    }

    private zzej() {
    }

    public static zzei zzn() {
        return (zzei) zzm.zzbt();
    }

    static /* synthetic */ void zzp(zzej zzej, String str) {
        zzej.zza |= 2;
        zzej.zzf = str;
    }

    static /* synthetic */ void zzq(zzej zzej, int i, zzel zzel) {
        zzel.getClass();
        zzkk<zzel> zzkk = zzej.zzg;
        if (!zzkk.zza()) {
            zzej.zzg = zzkd.zzbF(zzkk);
        }
        zzej.zzg.set(i, zzel);
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

    public final List<zzel> zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzg.size();
    }

    public final zzel zzf(int i) {
        return (zzel) this.zzg.get(i);
    }

    public final boolean zzg() {
        return (this.zza & 8) != 0;
    }

    public final zzeq zzh() {
        zzeq zzeq = this.zzi;
        return zzeq == null ? zzeq.zzk() : zzeq;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        return this.zzk;
    }

    public final boolean zzk() {
        return (this.zza & 64) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", zzel.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzej();
        } else {
            if (i2 == 4) {
                return new zzei((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzm;
        }
    }

    public final boolean zzm() {
        return this.zzl;
    }
}
