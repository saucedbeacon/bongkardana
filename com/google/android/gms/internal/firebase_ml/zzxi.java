package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzxi extends zzxo {
    private final /* synthetic */ zzxd zzcdz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzxi(zzxd zzxd) {
        super(zzxd, (zzxg) null);
        this.zzcdz = zzxd;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzxf(this.zzcdz, (zzxg) null);
    }

    /* synthetic */ zzxi(zzxd zzxd, zzxg zzxg) {
        this(zzxd);
    }
}
