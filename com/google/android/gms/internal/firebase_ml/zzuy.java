package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzuy extends zztk<Integer> implements zzvd, zzwu, RandomAccess {
    private static final zzuy zzbzw;
    private int size;
    private int[] zzbzx;

    public static zzuy zzto() {
        return zzbzw;
    }

    zzuy() {
        this(new int[10], 0);
    }

    private zzuy(int[] iArr, int i) {
        this.zzbzx = iArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzrw();
        if (i2 >= i) {
            int[] iArr = this.zzbzx;
            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
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
        if (!(obj instanceof zzuy)) {
            return super.equals(obj);
        }
        zzuy zzuy = (zzuy) obj;
        if (this.size != zzuy.size) {
            return false;
        }
        int[] iArr = zzuy.zzbzx;
        for (int i = 0; i < this.size; i++) {
            if (this.zzbzx[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzbzx[i2];
        }
        return i;
    }

    /* renamed from: zzdl */
    public final zzvd zzcp(int i) {
        if (i >= this.size) {
            return new zzuy(Arrays.copyOf(this.zzbzx, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final int getInt(int i) {
        zzcn(i);
        return this.zzbzx[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzdm(int i) {
        zzrw();
        int i2 = this.size;
        int[] iArr = this.zzbzx;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzbzx = iArr2;
        }
        int[] iArr3 = this.zzbzx;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzrw();
        zzva.checkNotNull(collection);
        if (!(collection instanceof zzuy)) {
            return super.addAll(collection);
        }
        zzuy zzuy = (zzuy) collection;
        int i = zzuy.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzbzx;
            if (i3 > iArr.length) {
                this.zzbzx = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzuy.zzbzx, 0, this.zzbzx, this.size, zzuy.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzrw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzbzx[i]))) {
                int[] iArr = this.zzbzx;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int intValue = ((Integer) obj).intValue();
        zzrw();
        zzcn(i);
        int[] iArr = this.zzbzx;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        zzcn(i);
        int[] iArr = this.zzbzx;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        int[] iArr = this.zzbzx;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzbzx, i, iArr2, i + 1, this.size - i);
            this.zzbzx = iArr2;
        }
        this.zzbzx[i] = intValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzdm(((Integer) obj).intValue());
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzuy zzuy = new zzuy(new int[0], 0);
        zzbzw = zzuy;
        zzuy.zzrv();
    }
}
