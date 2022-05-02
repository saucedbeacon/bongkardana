package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.b;

public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.emptySet());
    private final List<b.C0007b<Collection<T>>> collectionProviders;
    private final List<b.C0007b<T>> individualProviders;

    public static <T> Factory<Set<T>> empty() {
        return EMPTY_FACTORY;
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = (!SetFactory.class.desiredAssertionStatus());
        private final List<b.C0007b<Collection<T>>> collectionProviders;
        private final List<b.C0007b<T>> individualProviders;

        private Builder(int i, int i2) {
            this.individualProviders = DaggerCollections.presizedList(i);
            this.collectionProviders = DaggerCollections.presizedList(i2);
        }

        public final Builder<T> addProvider(b.C0007b<? extends T> bVar) {
            if ($assertionsDisabled || bVar != null) {
                this.individualProviders.add(bVar);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public final Builder<T> addCollectionProvider(b.C0007b<? extends Collection<? extends T>> bVar) {
            if ($assertionsDisabled || bVar != null) {
                this.collectionProviders.add(bVar);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public final SetFactory<T> build() {
            if (!$assertionsDisabled && DaggerCollections.hasDuplicates(this.individualProviders)) {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            } else if ($assertionsDisabled || !DaggerCollections.hasDuplicates(this.collectionProviders)) {
                return new SetFactory<>(this.individualProviders, this.collectionProviders);
            } else {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            }
        }
    }

    private SetFactory(List<b.C0007b<T>> list, List<b.C0007b<Collection<T>>> list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    public final Set<T> get() {
        int size = this.individualProviders.size();
        ArrayList arrayList = new ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.collectionProviders.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet newHashSetWithExpectedSize = DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i2 = 0; i2 < size3; i2++) {
            newHashSetWithExpectedSize.add(Preconditions.checkNotNull(this.individualProviders.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object checkNotNull : (Collection) arrayList.get(i3)) {
                newHashSetWithExpectedSize.add(Preconditions.checkNotNull(checkNotNull));
            }
        }
        return Collections.unmodifiableSet(newHashSetWithExpectedSize);
    }
}
