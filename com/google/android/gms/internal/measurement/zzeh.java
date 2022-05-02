package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzeh extends zzkd<zzeh, zzeg> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzeh zzj;
    private int zza;
    private int zze;
    private zzkk<zzes> zzf = zzbE();
    private zzkk<zzej> zzg = zzbE();
    private boolean zzh;
    private boolean zzi;

    static {
        zzeh zzeh = new zzeh();
        zzj = zzeh;
        zzkd.zzby(zzeh.class, zzeh);
    }

    private zzeh() {
    }

    static /* synthetic */ void zzj(zzeh zzeh, int i, zzes zzes) {
        zzes.getClass();
        zzkk<zzes> zzkk = zzeh.zzf;
        if (!zzkk.zza()) {
            zzeh.zzf = zzkd.zzbF(zzkk);
        }
        zzeh.zzf.set(i, zzes);
    }

    static /* synthetic */ void zzk(zzeh zzeh, int i, zzej zzej) {
        zzej.getClass();
        zzkk<zzej> zzkk = zzeh.zzg;
        if (!zzkk.zza()) {
            zzeh.zzg = zzkd.zzbF(zzkk);
        }
        zzeh.zzg.set(i, zzej);
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zzes> zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    public final zzes zze(int i) {
        return (zzes) this.zzf.get(i);
    }

    public final List<zzej> zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final zzej zzh(int i) {
        return (zzej) this.zzg.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", zzes.class, "zzg", zzej.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzeh();
        } else {
            if (i2 == 4) {
                return new zzeg((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
