package com.alibaba.ariver.kernel.common.immutable;

import java.util.Collection;
import java.util.Iterator;

class ImmutableCollection<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private static Iterator f9135a = new Iterator() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            return null;
        }

        public final void remove() {
            throw new UnsupportedOperationException("removing is unsupported");
        }
    };
    protected Collection<E> immutableCollection;

    static class ImmutableIterator implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private Iterator f9136a;

        public ImmutableIterator(Iterator it) {
            this.f9136a = it;
        }

        public boolean hasNext() {
            Iterator it = this.f9136a;
            return it != null && it.hasNext();
        }

        public Object next() {
            Iterator it = this.f9136a;
            if (it != null) {
                return it.next();
            }
            return null;
        }

        public void remove() {
            throw new UnsupportedOperationException("removing is unsupported");
        }
    }

    public ImmutableCollection(Collection<E> collection) {
        this.immutableCollection = collection;
    }

    public ImmutableCollection() {
    }

    public int size() {
        Collection<E> collection = this.immutableCollection;
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        Collection<E> collection = this.immutableCollection;
        return collection == null || collection.isEmpty();
    }

    public boolean contains(Object obj) {
        Collection<E> collection = this.immutableCollection;
        return collection != null && collection.contains(obj);
    }

    public Iterator<E> iterator() {
        Collection<E> collection = this.immutableCollection;
        if (collection == null) {
            return f9135a;
        }
        return new ImmutableIterator(collection.iterator());
    }

    public Object[] toArray() {
        Collection<E> collection = this.immutableCollection;
        if (collection != null) {
            return collection.toArray();
        }
        return null;
    }

    public boolean containsAll(Collection<?> collection) {
        Collection<E> collection2 = this.immutableCollection;
        return collection2 != null && collection2.containsAll(collection);
    }
}
