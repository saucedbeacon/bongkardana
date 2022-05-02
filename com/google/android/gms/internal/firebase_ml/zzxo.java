package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzxo extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzxd zzcdz;

    private zzxo(zzxd zzxd) {
        this.zzcdz = zzxd;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzxl(this.zzcdz, (zzxg) null);
    }

    public int size() {
        return this.zzcdz.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzcdz.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzcdz.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzcdz.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzcdz.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzxo(zzxd zzxd, zzxg zzxg) {
        this(zzxd);
    }
}
