package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 3;
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @VisibleForTesting
    transient int expectedValuesPerKey;

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    public final /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ List get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ List removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ List replaceValues(@NullableDecl Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    public static <K, V> ArrayListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new ArrayListMultimap<>(multimap);
    }

    private ArrayListMultimap() {
        this(12, 3);
    }

    private ArrayListMultimap(int i, int i2) {
        super(Platform.newHashMapWithExpectedSize(i));
        CollectPreconditions.checkNonnegative(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private ArrayListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size(), multimap instanceof ArrayListMultimap ? ((ArrayListMultimap) multimap).expectedValuesPerKey : 3);
        putAll(multimap);
    }

    /* access modifiers changed from: package-private */
    public final List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    @Deprecated
    public final void trimToSize() {
        for (Collection collection : backingMap().values()) {
            ((ArrayList) collection).trimToSize();
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int readCount = Serialization.readCount(objectInputStream);
        setMap(CompactHashMap.create());
        Serialization.populateMultimap(this, objectInputStream, readCount);
    }
}
