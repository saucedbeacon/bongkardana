package com.google.android.gms.internal.firebase_ml;

import java.util.NoSuchElementException;

final class zzwx extends zztv {
    private final zzwz zzcdc = new zzwz(this.zzcde, (zzwx) null);
    private zztz zzcdd = zzuv();
    private final /* synthetic */ zzwy zzcde;

    zzwx(zzwy zzwy) {
        this.zzcde = zzwy;
    }

    private final zztz zzuv() {
        if (this.zzcdc.hasNext()) {
            return (zztz) ((zzub) this.zzcdc.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzcdd != null;
    }

    public final byte nextByte() {
        zztz zztz = this.zzcdd;
        if (zztz != null) {
            byte nextByte = zztz.nextByte();
            if (!this.zzcdd.hasNext()) {
                this.zzcdd = zzuv();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
