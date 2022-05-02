package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzvw extends zztk<Long> implements zzvf<Long>, zzwu, RandomAccess {
    private static final zzvw zzcbr;
    private int size;
    private long[] zzcbs;

    zzvw() {
        this(new long[10], 0);
    }

    private zzvw(long[] jArr, int i) {
        this.zzcbs = jArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzrw();
        if (i2 >= i) {
            long[] jArr = this.zzcbs;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvw)) {
            return super.equals(obj);
        }
        zzvw zzvw = (zzvw) obj;
        if (this.size != zzvw.size) {
            return false;
        }
        long[] jArr = zzvw.zzcbs;
        for (int i = 0; i < this.size; i++) {
            if (this.zzcbs[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzva.zzaf(this.zzcbs[i2]);
        }
        return i;
    }

    public final long getLong(int i) {
        zzcn(i);
        return this.zzcbs[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzag(long j) {
        zzrw();
        int i = this.size;
        long[] jArr = this.zzcbs;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzcbs = jArr2;
        }
        long[] jArr3 = this.zzcbs;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zzrw();
        zzva.checkNotNull(collection);
        if (!(collection instanceof zzvw)) {
            return super.addAll(collection);
        }
        zzvw zzvw = (zzvw) collection;
        int i = zzvw.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zzcbs;
            if (i3 > jArr.length) {
                this.zzcbs = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zzvw.zzcbs, 0, this.zzcbs, this.size, zzvw.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzrw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzcbs[i]))) {
                long[] jArr = this.zzcbs;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzrw();
        zzcn(i);
        long[] jArr = this.zzcbs;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        zzcn(i);
        long[] jArr = this.zzcbs;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        long[] jArr = this.zzcbs;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzcbs, i, jArr2, i + 1, this.size - i);
            this.zzcbs = jArr2;
        }
        this.zzcbs[i] = longValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzag(((Long) obj).longValue());
        return true;
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= this.size) {
            return new zzvw(Arrays.copyOf(this.zzcbs, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzvw zzvw = new zzvw(new long[0], 0);
        zzcbr = zzvw;
        zzvw.zzrv();
    }
}
