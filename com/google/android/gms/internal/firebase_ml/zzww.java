package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.RandomAccess;

final class zzww<E> extends zztk<E> implements RandomAccess {
    private static final zzww<Object> zzcdb;
    private int size;
    private E[] zzafz;

    public static <E> zzww<E> zzuu() {
        return zzcdb;
    }

    zzww() {
        this(new Object[10], 0);
    }

    private zzww(E[] eArr, int i) {
        this.zzafz = eArr;
        this.size = i;
    }

    public final boolean add(E e) {
        zzrw();
        int i = this.size;
        E[] eArr = this.zzafz;
        if (i == eArr.length) {
            this.zzafz = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzafz;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        int i2;
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        E[] eArr = this.zzafz;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzafz, i, eArr2, i + 1, this.size - i);
            this.zzafz = eArr2;
        }
        this.zzafz[i] = e;
        this.size++;
        this.modCount++;
    }

    public final E get(int i) {
        zzcn(i);
        return this.zzafz[i];
    }

    public final E remove(int i) {
        zzrw();
        zzcn(i);
        E[] eArr = this.zzafz;
        E e = eArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        zzrw();
        zzcn(i);
        E[] eArr = this.zzafz;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.size;
    }

    private final void zzcn(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
    }

    private final String zzco(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= this.size) {
            return new zzww(Arrays.copyOf(this.zzafz, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    static {
        zzww<Object> zzww = new zzww<>(new Object[0], 0);
        zzcdb = zzww;
        zzww.zzrv();
    }
}
