package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzxf implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzcdy;
    private final /* synthetic */ zzxd zzcdz;

    private zzxf(zzxd zzxd) {
        this.zzcdz = zzxd;
        this.pos = this.zzcdz.zzcdp.size();
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzcdz.zzcdp.size()) || zzvg().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzvg() {
        if (this.zzcdy == null) {
            this.zzcdy = this.zzcdz.zzcds.entrySet().iterator();
        }
        return this.zzcdy;
    }

    public final /* synthetic */ Object next() {
        if (zzvg().hasNext()) {
            return (Map.Entry) zzvg().next();
        }
        List zzb = this.zzcdz.zzcdp;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzxf(zzxd zzxd, zzxg zzxg) {
        this(zzxd);
    }
}
