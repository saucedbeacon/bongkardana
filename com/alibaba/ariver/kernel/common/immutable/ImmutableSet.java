package com.alibaba.ariver.kernel.common.immutable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ImmutableSet<E> extends ImmutableCollection<E> implements Immutable<Set<E>> {
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsAll(Collection collection) {
        return super.containsAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ Object[] toArray() {
        return super.toArray();
    }

    public ImmutableSet(Collection<E> collection) {
        super(collection);
    }

    public Set<E> mutable() {
        return new HashSet(this.immutableCollection);
    }
}
