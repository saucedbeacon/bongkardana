package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.b;

public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {
    private static final b.C0007b<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    public static <K, V> b.C0007b<Map<K, V>> emptyMapProvider() {
        return EMPTY;
    }

    private MapFactory(Map<K, b.C0007b<V>> map) {
        super(map);
    }

    public final Map<K, V> get() {
        LinkedHashMap newLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (Map.Entry entry : contributingMap().entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey(), ((b.C0007b) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
    }

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        private Builder(int i) {
            super(i);
        }

        public final Builder<K, V> put(K k, b.C0007b<V> bVar) {
            super.put(k, bVar);
            return this;
        }

        public final Builder<K, V> putAll(b.C0007b<Map<K, V>> bVar) {
            super.putAll(bVar);
            return this;
        }

        public final MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
        }
    }
}
