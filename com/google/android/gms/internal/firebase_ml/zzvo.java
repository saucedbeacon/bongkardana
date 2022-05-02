package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzvo<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzcbi;

    public zzvo(Iterator<Map.Entry<K, Object>> it) {
        this.zzcbi = it;
    }

    public final boolean hasNext() {
        return this.zzcbi.hasNext();
    }

    public final void remove() {
        this.zzcbi.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzcbi.next();
        return next.getValue() instanceof zzvj ? new zzvl(next) : next;
    }
}
