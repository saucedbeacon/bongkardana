package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private final ImmutableSortedSet<E> forward;

    DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.from(immutableSortedSet.comparator()).reverse());
        this.forward = immutableSortedSet;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.forward.contains(obj);
    }

    public final int size() {
        return this.forward.size();
    }

    public final UnmodifiableIterator<E> iterator() {
        return this.forward.descendingIterator();
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.forward.tailSet(e, z).descendingSet();
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.forward.subSet(e2, z2, e, z).descendingSet();
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.forward.headSet(e, z).descendingSet();
    }

    @GwtIncompatible("NavigableSet")
    public final ImmutableSortedSet<E> descendingSet() {
        return this.forward;
    }

    @GwtIncompatible("NavigableSet")
    public final UnmodifiableIterator<E> descendingIterator() {
        return this.forward.iterator();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible("NavigableSet")
    public final ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    public final E lower(E e) {
        return this.forward.higher(e);
    }

    public final E floor(E e) {
        return this.forward.ceiling(e);
    }

    public final E ceiling(E e) {
        return this.forward.floor(e);
    }

    public final E higher(E e) {
        return this.forward.lower(e);
    }

    /* access modifiers changed from: package-private */
    public final int indexOf(@NullableDecl Object obj) {
        int indexOf = this.forward.indexOf(obj);
        if (indexOf == -1) {
            return indexOf;
        }
        return (size() - 1) - indexOf;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.forward.isPartialView();
    }
}
