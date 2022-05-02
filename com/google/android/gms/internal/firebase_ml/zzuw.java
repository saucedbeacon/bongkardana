package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzuw extends zztk<Float> implements zzvf<Float>, zzwu, RandomAccess {
    private static final zzuw zzbzn;
    private int size;
    private float[] zzbzo;

    public static zzuw zzsz() {
        return zzbzn;
    }

    zzuw() {
        this(new float[10], 0);
    }

    private zzuw(float[] fArr, int i) {
        this.zzbzo = fArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzrw();
        if (i2 >= i) {
            float[] fArr = this.zzbzo;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
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
        if (!(obj instanceof zzuw)) {
            return super.equals(obj);
        }
        zzuw zzuw = (zzuw) obj;
        if (this.size != zzuw.size) {
            return false;
        }
        float[] fArr = zzuw.zzbzo;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzbzo[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzbzo[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzs(float f) {
        zzrw();
        int i = this.size;
        float[] fArr = this.zzbzo;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzbzo = fArr2;
        }
        float[] fArr3 = this.zzbzo;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzrw();
        zzva.checkNotNull(collection);
        if (!(collection instanceof zzuw)) {
            return super.addAll(collection);
        }
        zzuw zzuw = (zzuw) collection;
        int i = zzuw.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzbzo;
            if (i3 > fArr.length) {
                this.zzbzo = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzuw.zzbzo, 0, this.zzbzo, this.size, zzuw.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzrw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzbzo[i]))) {
                float[] fArr = this.zzbzo;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
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
        float floatValue = ((Float) obj).floatValue();
        zzrw();
        zzcn(i);
        float[] fArr = this.zzbzo;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        zzcn(i);
        float[] fArr = this.zzbzo;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        float[] fArr = this.zzbzo;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzbzo, i, fArr2, i + 1, this.size - i);
            this.zzbzo = fArr2;
        }
        this.zzbzo[i] = floatValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzs(((Float) obj).floatValue());
        return true;
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= this.size) {
            return new zzuw(Arrays.copyOf(this.zzbzo, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzcn(i);
        return Float.valueOf(this.zzbzo[i]);
    }

    static {
        zzuw zzuw = new zzuw(new float[0], 0);
        zzbzn = zzuw;
        zzuw.zzrv();
    }
}
