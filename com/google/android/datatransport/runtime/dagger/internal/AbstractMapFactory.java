package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.b;

abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    /* access modifiers changed from: private */
    public final Map<K, b.C0007b<V>> contributingMap;

    AbstractMapFactory(Map<K, b.C0007b<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, b.C0007b<V>> contributingMap() {
        return this.contributingMap;
    }

    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, b.C0007b<V>> map;

        Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* access modifiers changed from: package-private */
        public Builder<K, V, V2> put(K k, b.C0007b<V> bVar) {
            this.map.put(Preconditions.checkNotNull(k, "key"), Preconditions.checkNotNull(bVar, "provider"));
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder<K, V, V2> putAll(b.C0007b<Map<K, V2>> bVar) {
            if (bVar instanceof DelegateFactory) {
                return putAll(((DelegateFactory) bVar).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) bVar).contributingMap);
            return this;
        }
    }
}
