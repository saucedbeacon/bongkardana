package com.google.android.gms.internal.firebase_ml;

import java.util.NoSuchElementException;

final class zztt extends zztv {
    private final int limit = this.zzbvv.size();
    private int position = 0;
    private final /* synthetic */ zztq zzbvv;

    zztt(zztq zztq) {
        this.zzbvv = zztq;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.zzbvv.zzcr(i);
        }
        throw new NoSuchElementException();
    }
}
