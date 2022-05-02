package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ImmutableList<E> implements List<E>, RandomAccess {
    private final List<E> immutableList;

    @NonNull
    public static <E> ImmutableList<E> from(E... eArr) {
        return new ImmutableList<>(Arrays.asList(eArr));
    }

    @NonNull
    public static <E> ImmutableList<E> from(@NonNull List<E> list) {
        return new ImmutableList<>(list);
    }

    private ImmutableList(List<E> list) {
        this.immutableList = Collections.unmodifiableList(list);
    }

    public final int size() {
        return this.immutableList.size();
    }

    public final boolean isEmpty() {
        return this.immutableList.isEmpty();
    }

    public final boolean contains(@Nullable Object obj) {
        return this.immutableList.contains(obj);
    }

    @NonNull
    public final Iterator<E> iterator() {
        return this.immutableList.iterator();
    }

    @Nullable
    public final Object[] toArray() {
        return this.immutableList.toArray();
    }

    public final <T> T[] toArray(@Nullable T[] tArr) {
        return this.immutableList.toArray(tArr);
    }

    public final boolean add(@NonNull E e) {
        return this.immutableList.add(e);
    }

    public final boolean remove(@Nullable Object obj) {
        return this.immutableList.remove(obj);
    }

    public final boolean containsAll(@NonNull Collection<?> collection) {
        return this.immutableList.containsAll(collection);
    }

    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.immutableList.addAll(collection);
    }

    public final boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.immutableList.addAll(i, collection);
    }

    public final boolean removeAll(@NonNull Collection<?> collection) {
        return this.immutableList.removeAll(collection);
    }

    public final boolean retainAll(@NonNull Collection<?> collection) {
        return this.immutableList.retainAll(collection);
    }

    public final void clear() {
        this.immutableList.clear();
    }

    public final boolean equals(@Nullable Object obj) {
        return this.immutableList.equals(obj);
    }

    public final int hashCode() {
        return this.immutableList.hashCode();
    }

    @NonNull
    public final E get(int i) {
        return this.immutableList.get(i);
    }

    @NonNull
    public final E set(int i, @NonNull E e) {
        return this.immutableList.set(i, e);
    }

    public final void add(int i, @NonNull E e) {
        this.immutableList.add(i, e);
    }

    public final E remove(int i) {
        return this.immutableList.remove(i);
    }

    public final int indexOf(@Nullable Object obj) {
        return this.immutableList.indexOf(obj);
    }

    public final int lastIndexOf(@Nullable Object obj) {
        return this.immutableList.lastIndexOf(obj);
    }

    @NonNull
    public final ListIterator<E> listIterator() {
        return this.immutableList.listIterator();
    }

    @NonNull
    public final ListIterator<E> listIterator(int i) {
        return this.immutableList.listIterator(i);
    }

    @NonNull
    public final List<E> subList(int i, int i2) {
        return this.immutableList.subList(i, i2);
    }
}
