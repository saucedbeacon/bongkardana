package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zztk<E> extends AbstractList<E> implements zzvf<E> {
    private boolean zzbvj = true;

    zztk() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzrw();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzrw();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzrw();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzrw();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzrw();
        super.clear();
    }

    public boolean zzru() {
        return this.zzbvj;
    }

    public final void zzrv() {
        this.zzbvj = false;
    }

    public E remove(int i) {
        zzrw();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzrw();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzrw();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzrw();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzrw();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzrw() {
        if (!this.zzbvj) {
            throw new UnsupportedOperationException();
        }
    }
}
