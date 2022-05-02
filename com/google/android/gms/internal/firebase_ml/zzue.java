package com.google.android.gms.internal.firebase_ml;

final class zzue extends zzuc {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbwc;
    private int zzbwd;
    private int zzbwe;
    private int zzbwf;

    private zzue(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbwf = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbwe = i;
        this.zzbwc = z;
    }

    public final int zzct(int i) throws zzvi {
        if (i >= 0) {
            int zzsi = i + zzsi();
            int i2 = this.zzbwf;
            if (zzsi <= i2) {
                this.zzbwf = zzsi;
                int i3 = this.limit + this.zzbwd;
                this.limit = i3;
                int i4 = i3 - this.zzbwe;
                if (i4 > zzsi) {
                    int i5 = i4 - zzsi;
                    this.zzbwd = i5;
                    this.limit = i3 - i5;
                } else {
                    this.zzbwd = 0;
                }
                return i2;
            }
            throw zzvi.zztp();
        }
        throw zzvi.zztq();
    }

    public final int zzsi() {
        return this.pos - this.zzbwe;
    }
}
