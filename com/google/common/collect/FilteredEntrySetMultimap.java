package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Set;

@GwtCompatible
final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    FilteredEntrySetMultimap(SetMultimap<K, V> setMultimap, Predicate<? super Map.Entry<K, V>> predicate) {
        super(setMultimap, predicate);
    }

    public final SetMultimap<K, V> unfiltered() {
        return (SetMultimap) this.unfiltered;
    }

    public final Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public final Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    public final Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> createEntries() {
        return Sets.filter(unfiltered().entries(), entryPredicate());
    }

    public final Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }
}
