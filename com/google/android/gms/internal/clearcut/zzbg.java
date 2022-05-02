package com.google.android.gms.internal.clearcut;

final class zzbg {
    private final byte[] buffer;
    private final zzbn zzfo;

    private zzbg(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzfo = zzbn.zzc(bArr);
    }

    /* synthetic */ zzbg(int i, zzbc zzbc) {
        this(i);
    }

    public final zzbb zzad() {
        if (this.zzfo.zzag() == 0) {
            return new zzbi(this.buffer);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzbn zzae() {
        return this.zzfo;
    }
}
