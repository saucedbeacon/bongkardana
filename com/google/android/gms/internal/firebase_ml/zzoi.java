package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import java.util.HashMap;
import java.util.Map;

public abstract class zzoi<K, V> {
    @GuardedBy("instances")
    private final Map<K, V> zzaya = new HashMap();

    /* access modifiers changed from: protected */
    public abstract V create(K k);

    public final V get(K k) {
        synchronized (this.zzaya) {
            if (this.zzaya.containsKey(k)) {
                V v = this.zzaya.get(k);
                return v;
            }
            V create = create(k);
            this.zzaya.put(k, create);
            return create;
        }
    }
}
