package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

final class zzvl<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzvj> zzcbe;

    private zzvl(Map.Entry<K, zzvj> entry) {
        this.zzcbe = entry;
    }

    public final K getKey() {
        return this.zzcbe.getKey();
    }

    public final Object getValue() {
        if (this.zzcbe.getValue() == null) {
            return null;
        }
        return zzvj.zztv();
    }

    public final zzvj zztx() {
        return this.zzcbe.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzwi) {
            return this.zzcbe.getValue().zzi((zzwi) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
