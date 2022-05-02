package com.google.android.gms.internal.firebase_ml;

final class zzty {
    private final byte[] buffer;
    private final zzuh zzbvy;

    private zzty(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzbvy = zzuh.zzg(bArr);
    }

    public final zztq zzsg() {
        this.zzbvy.zzsk();
        return new zzua(this.buffer);
    }

    public final zzuh zzsh() {
        return this.zzbvy;
    }

    /* synthetic */ zzty(int i, zztt zztt) {
        this(i);
    }
}
