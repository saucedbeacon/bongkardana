package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> forward;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.forward = immutableSortedMultiset;
    }

    public final int count(@NullableDecl Object obj) {
        return this.forward.count(obj);
    }

    public final Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    public final Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    public final int size() {
        return this.forward.size();
    }

    public final ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }

    /* access modifiers changed from: package-private */
    public final Multiset.Entry<E> getEntry(int i) {
        return (Multiset.Entry) this.forward.entrySet().asList().reverse().get(i);
    }

    public final ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }

    public final ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.forward.tailMultiset(e, boundType).descendingMultiset();
    }

    public final ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.forward.headMultiset(e, boundType).descendingMultiset();
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.forward.isPartialView();
    }
}
