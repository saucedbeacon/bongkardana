package com.google.android.gms.internal.firebase_ml;

public abstract class zzuc {
    private int zzbvz;
    private int zzbwa;
    private boolean zzbwb;

    static zzuc zza(byte[] bArr, int i, int i2, boolean z) {
        zzue zzue = new zzue(bArr, 0, i2, false);
        try {
            zzue.zzct(i2);
            return zzue;
        } catch (zzvi e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzcu(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzv(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract int zzct(int i) throws zzvi;

    public abstract int zzsi();

    private zzuc() {
        this.zzbvz = 100;
        this.zzbwa = Integer.MAX_VALUE;
        this.zzbwb = false;
    }
}
