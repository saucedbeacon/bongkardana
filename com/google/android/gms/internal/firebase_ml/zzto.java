package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzto extends zztk<Boolean> implements zzvf<Boolean>, zzwu, RandomAccess {
    private static final zzto zzbvn;
    private int size;
    private boolean[] zzbvo;

    zzto() {
        this(new boolean[10], 0);
    }

    private zzto(boolean[] zArr, int i) {
        this.zzbvo = zArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzrw();
        if (i2 >= i) {
            boolean[] zArr = this.zzbvo;
            System.arraycopy(zArr, i2, zArr, i, this.size - i2);
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
        if (!(obj instanceof zzto)) {
            return super.equals(obj);
        }
        zzto zzto = (zzto) obj;
        if (this.size != zzto.size) {
            return false;
        }
        boolean[] zArr = zzto.zzbvo;
        for (int i = 0; i < this.size; i++) {
            if (this.zzbvo[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzva.zzbd(this.zzbvo[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zzrw();
        int i = this.size;
        boolean[] zArr = this.zzbvo;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzbvo = zArr2;
        }
        boolean[] zArr3 = this.zzbvo;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzrw();
        zzva.checkNotNull(collection);
        if (!(collection instanceof zzto)) {
            return super.addAll(collection);
        }
        zzto zzto = (zzto) collection;
        int i = zzto.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zzbvo;
            if (i3 > zArr.length) {
                this.zzbvo = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzto.zzbvo, 0, this.zzbvo, this.size, zzto.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzrw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zzbvo[i]))) {
                boolean[] zArr = this.zzbvo;
                System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzrw();
        zzcn(i);
        boolean[] zArr = this.zzbvo;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        zzcn(i);
        boolean[] zArr = this.zzbvo;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        boolean[] zArr = this.zzbvo;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzbvo, i, zArr2, i + 1, this.size - i);
            this.zzbvo = zArr2;
        }
        this.zzbvo[i] = booleanValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= this.size) {
            return new zzto(Arrays.copyOf(this.zzbvo, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzcn(i);
        return Boolean.valueOf(this.zzbvo[i]);
    }

    static {
        zzto zzto = new zzto(new boolean[0], 0);
        zzbvn = zzto;
        zzto.zzrv();
    }
}
