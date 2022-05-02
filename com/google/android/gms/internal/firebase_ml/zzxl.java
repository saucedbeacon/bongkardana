package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzxl implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzcdy;
    private final /* synthetic */ zzxd zzcdz;
    private boolean zzcec;

    private zzxl(zzxd zzxd) {
        this.zzcdz = zzxd;
        this.pos = -1;
    }

    public final boolean hasNext() {
        if (this.pos + 1 < this.zzcdz.zzcdp.size() || (!this.zzcdz.zzcdq.isEmpty() && zzvg().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.zzcec) {
            this.zzcec = false;
            this.zzcdz.zzuz();
            if (this.pos < this.zzcdz.zzcdp.size()) {
                zzxd zzxd = this.zzcdz;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzxd.zzdw(i);
                return;
            }
            zzvg().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator<Map.Entry<K, V>> zzvg() {
        if (this.zzcdy == null) {
            this.zzcdy = this.zzcdz.zzcdq.entrySet().iterator();
        }
        return this.zzcdy;
    }

    public final /* synthetic */ Object next() {
        this.zzcec = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzcdz.zzcdp.size()) {
            return (Map.Entry) this.zzcdz.zzcdp.get(this.pos);
        }
        return (Map.Entry) zzvg().next();
    }

    /* synthetic */ zzxl(zzxd zzxd, zzxg zzxg) {
        this(zzxd);
    }
}
