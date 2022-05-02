package com.google.android.gms.internal.measurement;

public final class zzel extends zzkd<zzel, zzek> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzel zzi;
    private int zza;
    private zzex zze;
    private zzeq zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzel zzel = new zzel();
        zzi = zzel;
        zzkd.zzby(zzel.class, zzel);
    }

    private zzel() {
    }

    public static zzel zzi() {
        return zzi;
    }

    static /* synthetic */ void zzk(zzel zzel, String str) {
        zzel.zza |= 8;
        zzel.zzh = str;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzex zzb() {
        zzex zzex = this.zze;
        return zzex == null ? zzex.zzi() : zzex;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzeq zzd() {
        zzeq zzeq = this.zzf;
        return zzeq == null ? zzeq.zzk() : zzeq;
    }

    public final boolean zze() {
        return (this.zza & 4) != 0;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zza & 8) != 0;
    }

    public final String zzh() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzel();
        } else {
            if (i2 == 4) {
                return new zzek((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
