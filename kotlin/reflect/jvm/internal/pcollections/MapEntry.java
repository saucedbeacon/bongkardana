package kotlin.reflect.jvm.internal.pcollections;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;

final class MapEntry<K, V> implements Serializable {
    public final K key;
    public final V value;

    public MapEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        K k = this.key;
        if (k != null ? k.equals(mapEntry.key) : mapEntry.key == null) {
            V v = this.value;
            V v2 = mapEntry.value;
            if (v == null) {
                if (v2 == null) {
                    return true;
                }
            } else if (v.equals(v2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        K k = this.key;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.value;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.key);
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(this.value);
        return sb.toString();
    }
}
