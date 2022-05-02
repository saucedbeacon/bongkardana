package com.google.android.gms.internal.measurement;

public final class zzfa extends zzkd<zzfa, zzez> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfa zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzfa zzfa = new zzfa();
        zzi = zzfa;
        zzkd.zzby(zzfa.class, zzfa);
    }

    private zzfa() {
    }

    static /* synthetic */ void zzg(zzfa zzfa, String str) {
        str.getClass();
        zzfa.zza |= 1;
        zzfa.zze = str;
    }

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zza & 8) != 0;
    }

    public final int zze() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzfa();
        } else {
            if (i2 == 4) {
                return new zzez((zzey) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }
}
