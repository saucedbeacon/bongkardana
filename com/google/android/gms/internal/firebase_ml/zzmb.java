package com.google.android.gms.internal.firebase_ml;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzmb<E> extends zzly<E> implements List<E>, RandomAccess {
    private static final zzmh<Object> zzafw = new zzma(zzmf.zzafy, 0);

    public static <E> zzmb<E> zziy() {
        return zzmf.zzafy;
    }

    public final zzmb<E> zziw() {
        return this;
    }

    public static <E> zzmb<E> zzl(E e) {
        Object[] objArr = {e};
        int i = 0;
        while (i <= 0) {
            if (objArr[0] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index 0");
                throw new NullPointerException(sb.toString());
            }
        }
        return new zzmf(objArr, 1);
    }

    public static <E> zzmb<E> zza(E e, E e2, E e3) {
        int i = 0;
        Object[] objArr = {e, e2, e3};
        while (i < 3) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new zzmf(objArr, 3);
    }

    public static <E> zzmb<E> zza(E e, E e2, E e3, E e4) {
        int i = 0;
        Object[] objArr = {e, e2, e3, e4};
        while (i < 4) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new zzmf(objArr, 4);
    }

    public static <E> zzmb<E> zzb(Collection<? extends E> collection) {
        if (collection instanceof zzly) {
            zzmb<E> zziw = ((zzly) collection).zziw();
            if (!zziw.zzix()) {
                return zziw;
            }
            Object[] array = zziw.toArray();
            int length = array.length;
            if (length == 0) {
                return zzmf.zzafy;
            }
            return new zzmf(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        int i = 0;
        while (i < length2) {
            if (array2[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length3 = array2.length;
        if (length3 == 0) {
            return zzmf.zzafy;
        }
        return new zzmf(array2, length3);
    }

    static <E> zzmb<E> zza(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return zzmf.zzafy;
        }
        return new zzmf(objArr, length);
    }

    zzmb() {
    }

    public final zzme<E> zzis() {
        return (zzmh) listIterator();
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzlk.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (zzlk.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: zzd */
    public zzmb<E> subList(int i, int i2) {
        zzlp.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzmf.zzafy;
        }
        return new zzmd(this, i, i3);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzlp.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    zzmb zzmb = this;
                    int size2 = zzmb.size();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj2 = zzmb.get(i);
                            i++;
                            if (!zzlk.equal(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzlk.equal(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        zzlp.zzc(i, size());
        if (isEmpty()) {
            return zzafw;
        }
        return new zzma(this, i);
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzmh) listIterator(0);
    }
}
