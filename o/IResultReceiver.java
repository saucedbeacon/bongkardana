package o;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import o.PlaybackStateCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class IResultReceiver<V> extends send<V> {

    public abstract class Default {
        public abstract double getMax(double d);

        public abstract void getMax(double d, float[] fArr);

        public abstract void getMin(double d, double[] dArr);

        public abstract double[] getMin();

        public abstract void length(double d, double[] dArr);

        public abstract double setMax(double d);

        public static Default length(int i, double[] dArr, double[][] dArr2) {
            if (dArr.length == 1) {
                i = 2;
            }
            if (i == 0) {
                return new onSaveInstanceState(dArr, dArr2);
            }
            if (i != 2) {
                return new ResultReceiver(dArr, dArr2);
            }
            return new setMax(dArr[0], dArr2[0]);
        }

        static class setMax extends Default {
            double[] setMax;
            double setMin;

            public final double setMax(double d) {
                return 0.0d;
            }

            setMax(double d, double[] dArr) {
                this.setMin = d;
                this.setMax = dArr;
            }

            public final void length(double d, double[] dArr) {
                double[] dArr2 = this.setMax;
                System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
            }

            public final void getMax(double d, float[] fArr) {
                int i = 0;
                while (true) {
                    double[] dArr = this.setMax;
                    if (i < dArr.length) {
                        fArr[i] = (float) dArr[i];
                        i++;
                    } else {
                        return;
                    }
                }
            }

            public final double getMax(double d) {
                return this.setMax[0];
            }

            public final void getMin(double d, double[] dArr) {
                for (int i = 0; i < this.setMax.length; i++) {
                    dArr[i] = 0.0d;
                }
            }

            public final double[] getMin() {
                return new double[]{this.setMin};
            }
        }
    }

    public class Stub<E> implements Cloneable {
        private static final Object setMin = new Object();
        private Object[] getMax;
        private int[] getMin;
        private boolean length;
        private int setMax;

        public final class Proxy extends Default {
            setMax[] getMin;
            private final double[] setMax;

            public final void length(double d, double[] dArr) {
                if (d < this.getMin[0].setMin) {
                    d = this.getMin[0].setMin;
                }
                setMax[] setmaxArr = this.getMin;
                if (d > setmaxArr[setmaxArr.length - 1].length) {
                    setMax[] setmaxArr2 = this.getMin;
                    d = setmaxArr2[setmaxArr2.length - 1].length;
                }
                int i = 0;
                while (true) {
                    setMax[] setmaxArr3 = this.getMin;
                    if (i >= setmaxArr3.length) {
                        return;
                    }
                    if (d > setmaxArr3[i].length) {
                        i++;
                    } else if (this.getMin[i].Grayscale$Algorithm) {
                        setMax setmax = this.getMin[i];
                        dArr[0] = setmax.setMax + ((d - setmax.setMin) * setmax.toFloatRange * (setmax.isInside - setmax.setMax));
                        setMax setmax2 = this.getMin[i];
                        dArr[1] = setmax2.toIntRange + ((d - setmax2.setMin) * setmax2.toFloatRange * (setmax2.IsOverlapping - setmax2.toIntRange));
                        return;
                    } else {
                        this.getMin[i].getMin(d);
                        setMax setmax3 = this.getMin[i];
                        dArr[0] = setmax3.hashCode + (setmax3.equals * setmax3.values);
                        setMax setmax4 = this.getMin[i];
                        dArr[1] = setmax4.FastBitmap$CoordinateSystem + (setmax4.toString * setmax4.valueOf);
                        return;
                    }
                }
            }

            public final void getMax(double d, float[] fArr) {
                if (d < this.getMin[0].setMin) {
                    d = this.getMin[0].setMin;
                } else {
                    setMax[] setmaxArr = this.getMin;
                    if (d > setmaxArr[setmaxArr.length - 1].length) {
                        setMax[] setmaxArr2 = this.getMin;
                        d = setmaxArr2[setmaxArr2.length - 1].length;
                    }
                }
                int i = 0;
                while (true) {
                    setMax[] setmaxArr3 = this.getMin;
                    if (i >= setmaxArr3.length) {
                        return;
                    }
                    if (d > setmaxArr3[i].length) {
                        i++;
                    } else if (this.getMin[i].Grayscale$Algorithm) {
                        setMax setmax = this.getMin[i];
                        fArr[0] = (float) (setmax.setMax + ((d - setmax.setMin) * setmax.toFloatRange * (setmax.isInside - setmax.setMax)));
                        setMax setmax2 = this.getMin[i];
                        fArr[1] = (float) (setmax2.toIntRange + ((d - setmax2.setMin) * setmax2.toFloatRange * (setmax2.IsOverlapping - setmax2.toIntRange)));
                        return;
                    } else {
                        this.getMin[i].getMin(d);
                        setMax setmax3 = this.getMin[i];
                        fArr[0] = (float) (setmax3.hashCode + (setmax3.equals * setmax3.values));
                        setMax setmax4 = this.getMin[i];
                        fArr[1] = (float) (setmax4.FastBitmap$CoordinateSystem + (setmax4.toString * setmax4.valueOf));
                        return;
                    }
                }
            }

            public final void getMin(double d, double[] dArr) {
                if (d < this.getMin[0].setMin) {
                    d = this.getMin[0].setMin;
                } else {
                    setMax[] setmaxArr = this.getMin;
                    if (d > setmaxArr[setmaxArr.length - 1].length) {
                        setMax[] setmaxArr2 = this.getMin;
                        d = setmaxArr2[setmaxArr2.length - 1].length;
                    }
                }
                int i = 0;
                while (true) {
                    setMax[] setmaxArr3 = this.getMin;
                    if (i >= setmaxArr3.length) {
                        return;
                    }
                    if (d > setmaxArr3[i].length) {
                        i++;
                    } else if (this.getMin[i].Grayscale$Algorithm) {
                        dArr[0] = this.getMin[i].hashCode;
                        dArr[1] = this.getMin[i].FastBitmap$CoordinateSystem;
                        return;
                    } else {
                        this.getMin[i].getMin(d);
                        dArr[0] = this.getMin[i].length();
                        setMax setmax = this.getMin[i];
                        double d2 = setmax.equals * setmax.valueOf;
                        double d3 = (-setmax.toString) * setmax.values;
                        double hypot = setmax.toDoubleRange / Math.hypot(d2, d3);
                        dArr[1] = setmax.invoke ? (-d3) * hypot : d3 * hypot;
                        return;
                    }
                }
            }

            public final double getMax(double d) {
                int i = 0;
                if (d < this.getMin[0].setMin) {
                    d = this.getMin[0].setMin;
                } else {
                    setMax[] setmaxArr = this.getMin;
                    if (d > setmaxArr[setmaxArr.length - 1].length) {
                        setMax[] setmaxArr2 = this.getMin;
                        d = setmaxArr2[setmaxArr2.length - 1].length;
                    }
                }
                while (true) {
                    setMax[] setmaxArr3 = this.getMin;
                    if (i >= setmaxArr3.length) {
                        return Double.NaN;
                    }
                    if (d > setmaxArr3[i].length) {
                        i++;
                    } else if (this.getMin[i].Grayscale$Algorithm) {
                        setMax setmax = this.getMin[i];
                        return setmax.setMax + ((d - setmax.setMin) * setmax.toFloatRange * (setmax.isInside - setmax.setMax));
                    } else {
                        this.getMin[i].getMin(d);
                        setMax setmax2 = this.getMin[i];
                        return setmax2.hashCode + (setmax2.equals * setmax2.values);
                    }
                }
            }

            public final double setMax(double d) {
                int i = 0;
                if (d < this.getMin[0].setMin) {
                    d = this.getMin[0].setMin;
                }
                setMax[] setmaxArr = this.getMin;
                if (d > setmaxArr[setmaxArr.length - 1].length) {
                    setMax[] setmaxArr2 = this.getMin;
                    d = setmaxArr2[setmaxArr2.length - 1].length;
                }
                while (true) {
                    setMax[] setmaxArr3 = this.getMin;
                    if (i >= setmaxArr3.length) {
                        return Double.NaN;
                    }
                    if (d > setmaxArr3[i].length) {
                        i++;
                    } else if (this.getMin[i].Grayscale$Algorithm) {
                        return this.getMin[i].hashCode;
                    } else {
                        this.getMin[i].getMin(d);
                        return this.getMin[i].length();
                    }
                }
            }

            public final double[] getMin() {
                return this.setMax;
            }

            public Proxy(int[] iArr, double[] dArr, double[][] dArr2) {
                int i;
                double[] dArr3 = dArr;
                this.setMax = dArr3;
                this.getMin = new setMax[(dArr3.length - 1)];
                int i2 = 0;
                int i3 = 1;
                int i4 = 1;
                while (i2 < this.getMin.length) {
                    int i5 = iArr[i2];
                    if (i5 == 0) {
                        i = 3;
                    } else if (i5 == 1) {
                        i3 = 1;
                        i = 1;
                    } else if (i5 == 2) {
                        i3 = 2;
                        i = 2;
                    } else if (i5 != 3) {
                        i = i4;
                    } else {
                        i3 = i3 == 1 ? 2 : 1;
                        i = i3;
                    }
                    int i6 = i2 + 1;
                    this.getMin[i2] = new setMax(i, dArr3[i2], dArr3[i6], dArr2[i2][0], dArr2[i2][1], dArr2[i6][0], dArr2[i6][1]);
                    i4 = i;
                    i2 = i6;
                }
            }

            static class setMax {
                private static double[] Mean$Arithmetic = new double[91];
                double FastBitmap$CoordinateSystem;
                boolean Grayscale$Algorithm = false;
                double IsOverlapping;
                double equals;
                double[] getMax;
                double getMin;
                double hashCode;
                boolean invoke;
                double isInside;
                double length;
                double setMax;
                double setMin;
                double toDoubleRange;
                double toFloatRange;
                double toIntRange;
                double toString;
                double valueOf;
                double values;

                setMax(int i, double d, double d2, double d3, double d4, double d5, double d6) {
                    int i2 = i;
                    double d7 = d;
                    double d8 = d2;
                    double d9 = d3;
                    double d10 = d4;
                    double d11 = d5;
                    double d12 = d6;
                    boolean z = false;
                    this.invoke = i2 == 1 ? true : z;
                    this.setMin = d7;
                    this.length = d8;
                    this.toFloatRange = 1.0d / (d8 - d7);
                    if (3 == i2) {
                        this.Grayscale$Algorithm = true;
                    }
                    double d13 = d11 - d9;
                    double d14 = d12 - d10;
                    if (this.Grayscale$Algorithm || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                        this.Grayscale$Algorithm = true;
                        this.setMax = d9;
                        this.isInside = d11;
                        this.toIntRange = d10;
                        this.IsOverlapping = d12;
                        double hypot = Math.hypot(d14, d13);
                        this.getMin = hypot;
                        this.toDoubleRange = hypot * this.toFloatRange;
                        double d15 = this.length;
                        double d16 = this.setMin;
                        this.hashCode = d13 / (d15 - d16);
                        this.FastBitmap$CoordinateSystem = d14 / (d15 - d16);
                        return;
                    }
                    this.getMax = new double[101];
                    double d17 = (double) (this.invoke ? -1 : 1);
                    Double.isNaN(d17);
                    this.equals = d13 * d17;
                    double d18 = (double) (this.invoke ? 1 : -1);
                    Double.isNaN(d18);
                    this.toString = d14 * d18;
                    this.hashCode = this.invoke ? d11 : d9;
                    this.FastBitmap$CoordinateSystem = this.invoke ? d10 : d12;
                    getMin(d3, d4, d5, d6);
                    this.toDoubleRange = this.getMin * this.toFloatRange;
                }

                /* access modifiers changed from: package-private */
                public final void getMin(double d) {
                    double length2 = length((this.invoke ? this.length - d : d - this.setMin) * this.toFloatRange) * 1.5707963267948966d;
                    this.values = Math.sin(length2);
                    this.valueOf = Math.cos(length2);
                }

                /* access modifiers changed from: package-private */
                public final double length() {
                    double d = this.equals * this.valueOf;
                    double hypot = this.toDoubleRange / Math.hypot(d, (-this.toString) * this.values);
                    return this.invoke ? (-d) * hypot : d * hypot;
                }

                private double length(double d) {
                    if (d <= 0.0d) {
                        return 0.0d;
                    }
                    if (d >= 1.0d) {
                        return 1.0d;
                    }
                    double[] dArr = this.getMax;
                    double length2 = (double) (dArr.length - 1);
                    Double.isNaN(length2);
                    double d2 = d * length2;
                    int i = (int) d2;
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    return dArr[i] + ((d2 - d3) * (dArr[i + 1] - dArr[i]));
                }

                private void getMin(double d, double d2, double d3, double d4) {
                    double d5;
                    double d6 = d3 - d;
                    double d7 = d2 - d4;
                    int i = 0;
                    double d8 = 0.0d;
                    double d9 = 0.0d;
                    double d10 = 0.0d;
                    while (true) {
                        double[] dArr = Mean$Arithmetic;
                        if (i >= dArr.length) {
                            break;
                        }
                        double d11 = (double) i;
                        Double.isNaN(d11);
                        double d12 = d8;
                        double length2 = (double) (dArr.length - 1);
                        Double.isNaN(length2);
                        double radians = Math.toRadians((d11 * 90.0d) / length2);
                        double sin = Math.sin(radians) * d6;
                        double cos = Math.cos(radians) * d7;
                        if (i > 0) {
                            d5 = d12 + Math.hypot(sin - d9, cos - d10);
                            Mean$Arithmetic[i] = d5;
                        } else {
                            d5 = d12;
                        }
                        i++;
                        d10 = cos;
                        double d13 = sin;
                        d8 = d5;
                        d9 = d13;
                    }
                    double d14 = d8;
                    this.getMin = d14;
                    int i2 = 0;
                    while (true) {
                        double[] dArr2 = Mean$Arithmetic;
                        if (i2 >= dArr2.length) {
                            break;
                        }
                        dArr2[i2] = dArr2[i2] / d14;
                        i2++;
                    }
                    int i3 = 0;
                    while (true) {
                        double[] dArr3 = this.getMax;
                        if (i3 < dArr3.length) {
                            double d15 = (double) i3;
                            double length3 = (double) (dArr3.length - 1);
                            Double.isNaN(d15);
                            Double.isNaN(length3);
                            double d16 = d15 / length3;
                            int binarySearch = Arrays.binarySearch(Mean$Arithmetic, d16);
                            if (binarySearch >= 0) {
                                this.getMax[i3] = (double) (binarySearch / (Mean$Arithmetic.length - 1));
                            } else if (binarySearch == -1) {
                                this.getMax[i3] = 0.0d;
                            } else {
                                int i4 = -binarySearch;
                                int i5 = i4 - 2;
                                double d17 = (double) i5;
                                double[] dArr4 = Mean$Arithmetic;
                                Double.isNaN(d17);
                                double length4 = (double) (dArr4.length - 1);
                                Double.isNaN(length4);
                                this.getMax[i3] = (d17 + ((d16 - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / length4;
                            }
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public Stub() {
            this(10);
        }

        public Stub(int i) {
            this.length = false;
            if (i == 0) {
                this.getMin = PlaybackStateCompat.State.getMax;
                this.getMax = PlaybackStateCompat.State.getMin;
                return;
            }
            int max = PlaybackStateCompat.State.setMax(i);
            this.getMin = new int[max];
            this.getMax = new Object[max];
        }

        /* renamed from: setMax */
        public Stub<E> clone() {
            try {
                Stub<E> stub = (Stub) super.clone();
                stub.getMin = (int[]) this.getMin.clone();
                stub.getMax = (Object[]) this.getMax.clone();
                return stub;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Nullable
        public E setMin(int i) {
            return getMin(i, (Object) null);
        }

        public E getMin(int i, E e) {
            int max = PlaybackStateCompat.State.getMax(this.getMin, this.setMax, i);
            if (max >= 0) {
                E[] eArr = this.getMax;
                if (eArr[max] != setMin) {
                    return eArr[max];
                }
            }
            return e;
        }

        @Deprecated
        public void setMax(int i) {
            getMax(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r3.getMax;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getMax(int r4) {
            /*
                r3 = this;
                int[] r0 = r3.getMin
                int r1 = r3.setMax
                int r4 = o.PlaybackStateCompat.State.getMax((int[]) r0, (int) r1, (int) r4)
                if (r4 < 0) goto L_0x0017
                java.lang.Object[] r0 = r3.getMax
                r1 = r0[r4]
                java.lang.Object r2 = setMin
                if (r1 == r2) goto L_0x0017
                r0[r4] = r2
                r4 = 1
                r3.length = r4
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IResultReceiver.Stub.getMax(int):void");
        }

        public void length(int i) {
            Object[] objArr = this.getMax;
            Object obj = objArr[i];
            Object obj2 = setMin;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.length = true;
            }
        }

        private void getMax() {
            int i = this.setMax;
            int[] iArr = this.getMin;
            Object[] objArr = this.getMax;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != setMin) {
                    if (i3 != i2) {
                        iArr[i2] = iArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.length = false;
            this.setMax = i2;
        }

        public void setMax(int i, E e) {
            int max = PlaybackStateCompat.State.getMax(this.getMin, this.setMax, i);
            if (max >= 0) {
                this.getMax[max] = e;
                return;
            }
            int i2 = max ^ -1;
            if (i2 < this.setMax) {
                Object[] objArr = this.getMax;
                if (objArr[i2] == setMin) {
                    this.getMin[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.length && this.setMax >= this.getMin.length) {
                getMax();
                i2 = PlaybackStateCompat.State.getMax(this.getMin, this.setMax, i) ^ -1;
            }
            int i3 = this.setMax;
            if (i3 >= this.getMin.length) {
                int max2 = PlaybackStateCompat.State.setMax(i3 + 1);
                int[] iArr = new int[max2];
                Object[] objArr2 = new Object[max2];
                int[] iArr2 = this.getMin;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.getMax;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.getMin = iArr;
                this.getMax = objArr2;
            }
            int i4 = this.setMax;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.getMin;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.getMax;
                System.arraycopy(objArr4, i2, objArr4, i5, this.setMax - i2);
            }
            this.getMin[i2] = i;
            this.getMax[i2] = e;
            this.setMax++;
        }

        public int getMin() {
            if (this.length) {
                getMax();
            }
            return this.setMax;
        }

        public int getMin(int i) {
            if (this.length) {
                getMax();
            }
            return this.getMin[i];
        }

        public E IsOverlapping(int i) {
            if (this.length) {
                getMax();
            }
            return this.getMax[i];
        }

        public int equals(int i) {
            if (this.length) {
                getMax();
            }
            return PlaybackStateCompat.State.getMax(this.getMin, this.setMax, i);
        }

        public int getMax(E e) {
            if (this.length) {
                getMax();
            }
            for (int i = 0; i < this.setMax; i++) {
                if (this.getMax[i] == e) {
                    return i;
                }
            }
            return -1;
        }

        public void length() {
            int i = this.setMax;
            Object[] objArr = this.getMax;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            this.setMax = 0;
            this.length = false;
        }

        public void setMin(int i, E e) {
            int i2 = this.setMax;
            if (i2 == 0 || i > this.getMin[i2 - 1]) {
                if (this.length && this.setMax >= this.getMin.length) {
                    getMax();
                }
                int i3 = this.setMax;
                if (i3 >= this.getMin.length) {
                    int max = PlaybackStateCompat.State.setMax(i3 + 1);
                    int[] iArr = new int[max];
                    Object[] objArr = new Object[max];
                    int[] iArr2 = this.getMin;
                    System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                    Object[] objArr2 = this.getMax;
                    System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                    this.getMin = iArr;
                    this.getMax = objArr;
                }
                this.getMin[i3] = i;
                this.getMax[i3] = e;
                this.setMax = i3 + 1;
                return;
            }
            setMax(i, e);
        }

        public String toString() {
            if (getMin() <= 0) {
                return "{}";
            }
            StringBuilder sb = new StringBuilder(this.setMax * 28);
            sb.append('{');
            for (int i = 0; i < this.setMax; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(getMin(i));
                sb.append('=');
                Object IsOverlapping = IsOverlapping(i);
                if (IsOverlapping != this) {
                    sb.append(IsOverlapping);
                } else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <V> IResultReceiver<V> getMax() {
        return new IResultReceiver<>();
    }

    public final boolean setMin(@Nullable V v) {
        return super.setMin(v);
    }

    public final boolean getMax(Throwable th) {
        return super.getMax(th);
    }

    private IResultReceiver() {
    }
}
