package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class zzly<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzafu = new Object[0];

    zzly() {
    }

    /* renamed from: zzis */
    public abstract zzme<E> iterator();

    /* access modifiers changed from: package-private */
    public Object[] zzit() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean zzix();

    public final Object[] toArray() {
        return toArray(zzafu);
    }

    public final <T> T[] toArray(T[] tArr) {
        zzlp.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzit = zzit();
            if (zzit != null) {
                return Arrays.copyOfRange(zzit, zziu(), zziv(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int zziu() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zziv() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzmb<E> zziw() {
        return isEmpty() ? zzmb.zziy() : zzmb.zza(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzme zzme = (zzme) iterator();
        while (zzme.hasNext()) {
            objArr[i] = zzme.next();
            i++;
        }
        return i;
    }
}
