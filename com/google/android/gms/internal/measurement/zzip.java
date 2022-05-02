package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzip<E> extends AbstractList<E> implements zzkk<E> {
    private boolean zza = true;

    zzip() {
    }

    public void add(int i, E e) {
        zzbM();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzbM();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzbM();
        super.clear();
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

    public E remove(int i) {
        zzbM();
        return super.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        zzbM();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        zzbM();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzbM();
        return super.set(i, e);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza = false;
    }

    /* access modifiers changed from: protected */
    public final void zzbM() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        zzbM();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzbM();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzbM();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
