package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
final class FilteredKeyListMultimap<K, V> extends FilteredKeyMultimap<K, V> implements ListMultimap<K, V> {
    FilteredKeyListMultimap(ListMultimap<K, V> listMultimap, Predicate<? super K> predicate) {
        super(listMultimap, predicate);
    }

    public final ListMultimap<K, V> unfiltered() {
        return (ListMultimap) super.unfiltered();
    }

    public final List<V> get(K k) {
        return (List) super.get(k);
    }

    public final List<V> removeAll(@NullableDecl Object obj) {
        return (List) super.removeAll(obj);
    }

    public final List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues(k, iterable);
    }
}
