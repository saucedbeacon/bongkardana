package com.google.android.gms.internal.firebase_ml;

public abstract class zzhr {
    @Deprecated
    private final byte zzaaf;
    protected final byte zzaag;
    private final int zzaah;
    private final int zzaai;
    protected final int zzaaj;
    private final int zzaak;

    protected zzhr(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, (byte) 61);
    }

    /* access modifiers changed from: package-private */
    public abstract void zza(byte[] bArr, int i, int i2, zzhu zzhu);

    /* access modifiers changed from: protected */
    public abstract boolean zza(byte b);

    private zzhr(int i, int i2, int i3, int i4, byte b) {
        this.zzaaf = 61;
        this.zzaah = 3;
        this.zzaai = 4;
        this.zzaaj = i3 > 0 && i4 > 0 ? (i3 / 4) << 2 : 0;
        this.zzaak = i4;
        this.zzaag = 61;
    }

    /* access modifiers changed from: protected */
    public final byte[] zza(int i, zzhu zzhu) {
        if (zzhu.buffer != null && zzhu.buffer.length >= zzhu.pos + i) {
            return zzhu.buffer;
        }
        if (zzhu.buffer == null) {
            zzhu.buffer = new byte[8192];
            zzhu.pos = 0;
            zzhu.zzaav = 0;
        } else {
            byte[] bArr = new byte[(zzhu.buffer.length << 1)];
            System.arraycopy(zzhu.buffer, 0, bArr, 0, zzhu.buffer.length);
            zzhu.buffer = bArr;
        }
        return zzhu.buffer;
    }

    public final long zzb(byte[] bArr) {
        int length = bArr.length;
        int i = this.zzaah;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.zzaai);
        int i2 = this.zzaaj;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.zzaak)) : j;
    }
}
