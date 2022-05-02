package com.google.android.gms.internal.measurement;

public final class zzfe extends zzkd<zzfe, zzfd> implements zzlj {
    /* access modifiers changed from: private */
    public static final zzfe zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        zzfe zzfe = new zzfe();
        zzg = zzfe;
        zzkd.zzby(zzfe.class, zzfe);
    }

    private zzfe() {
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzfe();
        } else {
            if (i2 == 4) {
                return new zzfd((zzey) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
