package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    /* access modifiers changed from: protected */
    public abstract Map.Entry<K, V> delegate();

    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    public boolean equals(@NullableDecl Object obj) {
        return delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(@NullableDecl Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!Objects.equal(getKey(), entry.getKey()) || !Objects.equal(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    /* access modifiers changed from: protected */
    @Beta
    public String standardToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb.append(getValue());
        return sb.toString();
    }
}
