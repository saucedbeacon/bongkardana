package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {
    private List<Present<V>> values;

    /* access modifiers changed from: package-private */
    public abstract C combine(List<Present<V>> list);

    CollectionFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List<Present<V>> list;
        if (immutableCollection.isEmpty()) {
            list = ImmutableList.of();
        } else {
            list = Lists.newArrayListWithCapacity(immutableCollection.size());
        }
        List<Present<V>> list2 = list;
        for (int i = 0; i < immutableCollection.size(); i++) {
            list2.add((Object) null);
        }
        this.values = list2;
    }

    /* access modifiers changed from: package-private */
    public final void collectOneValue(int i, @NullableDecl V v) {
        List<Present<V>> list = this.values;
        if (list != null) {
            list.set(i, new Present(v));
        }
    }

    /* access modifiers changed from: package-private */
    public final void handleAllCompleted() {
        List<Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    /* access modifiers changed from: package-private */
    public void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }

    static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
            super(immutableCollection, z);
            init();
        }

        public final List<V> combine(List<Present<V>> list) {
            ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present next = it.next();
                newArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(newArrayListWithCapacity);
        }
    }

    static final class Present<V> {
        V value;

        Present(V v) {
            this.value = v;
        }
    }
}
