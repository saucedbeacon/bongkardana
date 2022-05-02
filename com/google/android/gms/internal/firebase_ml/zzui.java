package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzui extends zztk<Double> implements zzvf<Double>, zzwu, RandomAccess {
    private static final zzui zzbwi;
    private int size;
    private double[] zzbwj;

    zzui() {
        this(new double[10], 0);
    }

    private zzui(double[] dArr, int i) {
        this.zzbwj = dArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzrw();
        if (i2 >= i) {
            double[] dArr = this.zzbwj;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
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
        if (!(obj instanceof zzui)) {
            return super.equals(obj);
        }
        zzui zzui = (zzui) obj;
        if (this.size != zzui.size) {
            return false;
        }
        double[] dArr = zzui.zzbwj;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzbwj[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzva.zzaf(Double.doubleToLongBits(this.zzbwj[i2]));
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zze(double d) {
        zzrw();
        int i = this.size;
        double[] dArr = this.zzbwj;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzbwj = dArr2;
        }
        double[] dArr3 = this.zzbwj;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zzrw();
        zzva.checkNotNull(collection);
        if (!(collection instanceof zzui)) {
            return super.addAll(collection);
        }
        zzui zzui = (zzui) collection;
        int i = zzui.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzbwj;
            if (i3 > dArr.length) {
                this.zzbwj = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzui.zzbwj, 0, this.zzbwj, this.size, zzui.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzrw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzbwj[i]))) {
                double[] dArr = this.zzbwj;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzrw();
        zzcn(i);
        double[] dArr = this.zzbwj;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        zzcn(i);
        double[] dArr = this.zzbwj;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzrw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzco(i));
        }
        double[] dArr = this.zzbwj;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzbwj, i, dArr2, i + 1, this.size - i);
            this.zzbwj = dArr2;
        }
        this.zzbwj[i] = doubleValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= this.size) {
            return new zzui(Arrays.copyOf(this.zzbwj, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzcn(i);
        return Double.valueOf(this.zzbwj[i]);
    }

    static {
        zzui zzui = new zzui(new double[0], 0);
        zzbwi = zzui;
        zzui.zzrv();
    }
}
