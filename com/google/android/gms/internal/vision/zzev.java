package com.google.android.gms.internal.vision;

final class zzev {
    private final byte[] buffer;
    private final zzfe zzsd;

    private zzev(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzsd = zzfe.zzg(bArr);
    }

    public final zzeo zzdo() {
        this.zzsd.zzea();
        return new zzex(this.buffer);
    }

    public final zzfe zzdp() {
        return this.zzsd;
    }

    /* synthetic */ zzev(int i, zzep zzep) {
        this(i);
    }
}
