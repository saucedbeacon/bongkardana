package com.google.android.gms.internal.measurement;

public final class zzeq extends zzkd<zzeq, zzem> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzeq zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzeq zzeq = new zzeq();
        zzj = zzeq;
        zzkd.zzby(zzeq.class, zzeq);
    }

    private zzeq() {
    }

    public static zzeq zzk() {
        return zzj;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzep zzb() {
        zzep zza2 = zzep.zza(this.zze);
        return zza2 == null ? zzep.UNKNOWN_COMPARISON_TYPE : zza2;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final boolean zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zza & 4) != 0;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zza & 8) != 0;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final boolean zzi() {
        return (this.zza & 16) != 0;
    }

    public final String zzj() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", zzep.zzb(), "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzeq();
        } else {
            if (i2 == 4) {
                return new zzem((zzef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }
}
