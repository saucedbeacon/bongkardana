package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzex extends zzkd<zzex, zzet> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzex zzi;
    private int zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private zzkk<String> zzh = zzkd.zzbE();

    static {
        zzex zzex = new zzex();
        zzi = zzex;
        zzkd.zzby(zzex.class, zzex);
    }

    private zzex() {
    }

    public static zzex zzi() {
        return zzi;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzew zzb() {
        zzew zza2 = zzew.zza(this.zze);
        return zza2 == null ? zzew.UNKNOWN_MATCH_TYPE : zza2;
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

    public final boolean zzf() {
        return this.zzg;
    }

    public final List<String> zzg() {
        return this.zzh;
    }

    public final int zzh() {
        return this.zzh.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", zzew.zzb(), "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzex();
        } else {
            if (i2 == 4) {
                return new zzet((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
