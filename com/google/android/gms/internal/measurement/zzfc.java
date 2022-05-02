package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfc extends zzkd<zzfc, zzfb> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfc zzn;
    private int zza;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzkk<zzfe> zzh = zzbE();
    private zzkk<zzfa> zzi = zzbE();
    /* access modifiers changed from: private */
    public zzkk<zzeh> zzj = zzbE();
    private String zzk = "";
    private boolean zzl;
    private zzkk<zzgo> zzm = zzbE();

    static {
        zzfc zzfc = new zzfc();
        zzn = zzfc;
        zzkd.zzby(zzfc.class, zzfc);
    }

    private zzfc() {
    }

    public static zzfb zzm() {
        return (zzfb) zzn.zzbt();
    }

    public static zzfc zzn() {
        return zzn;
    }

    static /* synthetic */ void zzp(zzfc zzfc, int i, zzfa zzfa) {
        zzfa.getClass();
        zzkk<zzfa> zzkk = zzfc.zzi;
        if (!zzkk.zza()) {
            zzfc.zzi = zzkd.zzbF(zzkk);
        }
        zzfc.zzi.set(i, zzfa);
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List<zzfe> zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi.size();
    }

    public final zzfa zzg(int i) {
        return (zzfa) this.zzi.get(i);
    }

    public final List<zzeh> zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzl;
    }

    public final List<zzgo> zzj() {
        return this.zzm;
    }

    public final int zzk() {
        return this.zzm.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", zzfe.class, "zzi", zzfa.class, "zzj", zzeh.class, "zzk", "zzl", "zzm", zzgo.class});
        } else if (i2 == 3) {
            return new zzfc();
        } else {
            if (i2 == 4) {
                return new zzfb((zzey) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzn;
        }
    }
}
