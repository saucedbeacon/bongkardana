package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Map;
import o.b;

public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, b.C0007b<V>> implements Lazy<Map<K, b.C0007b<V>>> {
    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    private MapProviderFactory(Map<K, b.C0007b<V>> map) {
        super(map);
    }

    public final Map<K, b.C0007b<V>> get() {
        return contributingMap();
    }

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, b.C0007b<V>> {
        private Builder(int i) {
            super(i);
        }

        public final Builder<K, V> put(K k, b.C0007b<V> bVar) {
            super.put(k, bVar);
            return this;
        }

        public final Builder<K, V> putAll(b.C0007b<Map<K, b.C0007b<V>>> bVar) {
            super.putAll(bVar);
            return this;
        }

        public final MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }
    }
}
