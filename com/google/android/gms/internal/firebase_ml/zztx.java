package com.google.android.gms.internal.firebase_ml;

final class zztx extends zzua {
    private final int zzbvw;
    private final int zzbvx;

    zztx(byte[] bArr, int i, int i2) {
        super(bArr);
        zzd(i, i + i2, bArr.length);
        this.zzbvw = i;
        this.zzbvx = i2;
    }

    public final byte zzcq(int i) {
        zzg(i, size());
        return this.bytes[this.zzbvw + i];
    }

    /* access modifiers changed from: package-private */
    public final byte zzcr(int i) {
        return this.bytes[this.zzbvw + i];
    }

    public final int size() {
        return this.zzbvx;
    }

    /* access modifiers changed from: protected */
    public final int zzsf() {
        return this.zzbvw;
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, zzsf() + i, bArr, i2, i3);
    }
}
