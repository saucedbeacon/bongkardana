package o;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import o.IResultReceiver;

public abstract class onActivityResult {
    private static float values = 6.2831855f;
    private float[] IsOverlapping = new float[3];
    private int equals;
    protected int[] getMax = new int[10];
    String getMin;
    protected boolean isInside = false;
    protected float[][] length = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));
    protected IResultReceiver.Default setMax;
    protected int setMin = 0;
    long toFloatRange;
    float toIntRange = Float.NaN;

    public abstract boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners);

    public String toString() {
        String str = this.getMin;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.equals; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.getMax[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.length[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final float length(float f, long j, View view, initViewTreeOwners initviewtreeowners) {
        long j2 = j;
        View view2 = view;
        initViewTreeOwners initviewtreeowners2 = initviewtreeowners;
        this.setMax.getMax((double) f, this.IsOverlapping);
        float[] fArr = this.IsOverlapping;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.isInside = false;
            return fArr[2];
        }
        if (Float.isNaN(this.toIntRange)) {
            float min = initviewtreeowners2.getMin(view2, this.getMin);
            this.toIntRange = min;
            if (Float.isNaN(min)) {
                this.toIntRange = 0.0f;
            }
        }
        double d = (double) this.toIntRange;
        double d2 = (double) (j2 - this.toFloatRange);
        Double.isNaN(d2);
        double d3 = (double) f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f3 = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
        this.toIntRange = f3;
        String str = this.getMin;
        if (!initviewtreeowners2.length.containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f3});
            initviewtreeowners2.length.put(view2, hashMap);
        } else {
            HashMap hashMap2 = initviewtreeowners2.length.get(view2);
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f3});
                initviewtreeowners2.length.put(view2, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            }
        }
        this.toFloatRange = j2;
        float f4 = this.IsOverlapping[0];
        float length2 = (length(this.toIntRange) * f4) + this.IsOverlapping[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.isInside = z;
        return length2;
    }

    /* access modifiers changed from: protected */
    public final float length(float f) {
        float abs;
        switch (this.setMin) {
            case 1:
                return Math.signum(f * values);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * values));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * values));
        }
        return 1.0f - abs;
    }

    static onActivityResult getMax(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new setMin(str, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.onActivityResult setMin(java.lang.String r1, long r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x007d;
                case -1249320805: goto L_0x0073;
                case -1225497657: goto L_0x0068;
                case -1225497656: goto L_0x005d;
                case -1225497655: goto L_0x0052;
                case -1001078227: goto L_0x0047;
                case -908189618: goto L_0x003d;
                case -908189617: goto L_0x0033;
                case -40300674: goto L_0x0029;
                case -4379043: goto L_0x001f;
                case 37232917: goto L_0x0014;
                case 92909918: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x003d:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x0047:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0052:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x0073:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009f;
                case 9: goto L_0x0099;
                case 10: goto L_0x0093;
                case 11: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            r1 = 0
            return r1
        L_0x008d:
            o.onActivityResult$getMin r1 = new o.onActivityResult$getMin
            r1.<init>()
            goto L_0x00d4
        L_0x0093:
            o.onActivityResult$FastBitmap$CoordinateSystem r1 = new o.onActivityResult$FastBitmap$CoordinateSystem
            r1.<init>()
            goto L_0x00d4
        L_0x0099:
            o.onActivityResult$hashCode r1 = new o.onActivityResult$hashCode
            r1.<init>()
            goto L_0x00d4
        L_0x009f:
            o.onActivityResult$values r1 = new o.onActivityResult$values
            r1.<init>()
            goto L_0x00d4
        L_0x00a5:
            o.onActivityResult$toFloatRange r1 = new o.onActivityResult$toFloatRange
            r1.<init>()
            goto L_0x00d4
        L_0x00ab:
            o.onActivityResult$IsOverlapping r1 = new o.onActivityResult$IsOverlapping
            r1.<init>()
            goto L_0x00d4
        L_0x00b1:
            o.onActivityResult$setMax r1 = new o.onActivityResult$setMax
            r1.<init>()
            goto L_0x00d4
        L_0x00b7:
            o.onActivityResult$isInside r1 = new o.onActivityResult$isInside
            r1.<init>()
            goto L_0x00d4
        L_0x00bd:
            o.onActivityResult$equals r1 = new o.onActivityResult$equals
            r1.<init>()
            goto L_0x00d4
        L_0x00c3:
            o.onActivityResult$toIntRange r1 = new o.onActivityResult$toIntRange
            r1.<init>()
            goto L_0x00d4
        L_0x00c9:
            o.onActivityResult$length r1 = new o.onActivityResult$length
            r1.<init>()
            goto L_0x00d4
        L_0x00cf:
            o.onActivityResult$getMax r1 = new o.onActivityResult$getMax
            r1.<init>()
        L_0x00d4:
            r1.toFloatRange = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityResult.setMin(java.lang.String, long):o.onActivityResult");
    }

    public void getMin(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.getMax;
        int i3 = this.equals;
        iArr[i3] = i;
        float[][] fArr = this.length;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.setMin = Math.max(this.setMin, i2);
        this.equals++;
    }

    public void setMin(int i) {
        int i2 = this.equals;
        if (i2 != 0) {
            int[] iArr = this.getMax;
            float[][] fArr = this.length;
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2 - 1;
            iArr2[1] = 0;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int i7 = iArr[i6];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < i6) {
                        if (iArr[i8] <= i7) {
                            int i10 = iArr[i9];
                            iArr[i9] = iArr[i8];
                            iArr[i8] = i10;
                            float[] fArr2 = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = fArr2;
                            i9++;
                        }
                        i8++;
                    }
                    int i11 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i11;
                    float[] fArr3 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = fArr3;
                    int i12 = i3 + 1;
                    iArr2[i3] = i9 - 1;
                    int i13 = i12 + 1;
                    iArr2[i12] = i5;
                    int i14 = i13 + 1;
                    iArr2[i13] = i6;
                    i3 = i14 + 1;
                    iArr2[i14] = i9 + 1;
                }
            }
            int i15 = 1;
            int i16 = 0;
            while (true) {
                int[] iArr3 = this.getMax;
                if (i15 >= iArr3.length) {
                    break;
                }
                if (iArr3[i15] != iArr3[i15 - 1]) {
                    i16++;
                }
                i15++;
            }
            if (i16 == 0) {
                i16 = 1;
            }
            double[] dArr = new double[i16];
            int[] iArr4 = new int[2];
            iArr4[1] = 3;
            iArr4[0] = i16;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
            int i17 = 0;
            for (int i18 = 0; i18 < this.equals; i18++) {
                if (i18 > 0) {
                    int[] iArr5 = this.getMax;
                    if (iArr5[i18] == iArr5[i18 - 1]) {
                    }
                }
                double d = (double) this.getMax[i18];
                Double.isNaN(d);
                dArr[i17] = d * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[][] fArr4 = this.length;
                dArr3[0] = (double) fArr4[i18][0];
                dArr2[i17][1] = (double) fArr4[i18][1];
                dArr2[i17][2] = (double) fArr4[i18][2];
                i17++;
            }
            this.setMax = IResultReceiver.Default.length(i, dArr, dArr2);
        }
    }

    static class length extends onActivityResult {
        length() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(length(f, j, view, initviewtreeowners));
            }
            return this.isInside;
        }
    }

    static class getMax extends onActivityResult {
        getMax() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setAlpha(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class toIntRange extends onActivityResult {
        toIntRange() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setRotation(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class equals extends onActivityResult {
        equals() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setRotationX(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class isInside extends onActivityResult {
        isInside() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setRotationY(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class setMax extends onActivityResult {
        setMax() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            return this.isInside;
        }

        public final boolean getMax(View view, initViewTreeOwners initviewtreeowners, float f, long j, double d, double d2) {
            view.setRotation(length(f, j, view, initviewtreeowners) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.isInside;
        }
    }

    static class IsOverlapping extends onActivityResult {
        IsOverlapping() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setScaleX(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class toFloatRange extends onActivityResult {
        toFloatRange() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setScaleY(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class values extends onActivityResult {
        values() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setTranslationX(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class hashCode extends onActivityResult {
        hashCode() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            view.setTranslationY(length(f, j, view, initviewtreeowners));
            return this.isInside;
        }
    }

    static class setMin extends onActivityResult {
        float[] FastBitmap$CoordinateSystem;
        SparseArray<ConstraintAttribute> IsOverlapping;
        String equals;
        SparseArray<float[]> toString = new SparseArray<>();
        float[] values;

        public setMin(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.equals = str.split(",")[1];
            this.IsOverlapping = sparseArray;
        }

        public final void setMin(int i) {
            int size = this.IsOverlapping.size();
            int min = this.IsOverlapping.valueAt(0).setMin();
            double[] dArr = new double[size];
            int i2 = min + 2;
            this.FastBitmap$CoordinateSystem = new float[i2];
            this.values = new float[min];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.IsOverlapping.keyAt(i3);
                float[] valueAt = this.toString.valueAt(i3);
                double d = (double) keyAt;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                this.IsOverlapping.valueAt(i3).getMax(this.FastBitmap$CoordinateSystem);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.FastBitmap$CoordinateSystem;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][min] = (double) valueAt[0];
                dArr2[i3][min + 1] = (double) valueAt[1];
            }
            this.setMax = IResultReceiver.Default.length(i, dArr, dArr2);
        }

        public final void getMin(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public final void length(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.IsOverlapping.append(i, constraintAttribute);
            this.toString.append(i, new float[]{f, f2});
            this.setMin = Math.max(this.setMin, i2);
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            this.setMax.getMax((double) f, this.FastBitmap$CoordinateSystem);
            float[] fArr = this.FastBitmap$CoordinateSystem;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.toFloatRange;
            if (Float.isNaN(this.toIntRange)) {
                this.toIntRange = initviewtreeowners.getMin(view, this.equals);
                if (Float.isNaN(this.toIntRange)) {
                    this.toIntRange = 0.0f;
                }
            }
            double d = (double) this.toIntRange;
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) f2;
            Double.isNaN(d3);
            Double.isNaN(d);
            this.toIntRange = (float) ((d + ((d2 * 1.0E-9d) * d3)) % 1.0d);
            this.toFloatRange = j;
            float length = length(this.toIntRange);
            this.isInside = false;
            for (int i = 0; i < this.values.length; i++) {
                this.isInside |= ((double) this.FastBitmap$CoordinateSystem[i]) != 0.0d;
                this.values[i] = (this.FastBitmap$CoordinateSystem[i] * length) + f3;
            }
            this.IsOverlapping.valueAt(0).setMin(view, this.values);
            if (f2 != 0.0f) {
                this.isInside = true;
            }
            return this.isInside;
        }
    }

    static class getMin extends onActivityResult {
        boolean IsOverlapping = false;

        getMin() {
        }

        public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(length(f, j, view, initviewtreeowners));
            } else if (this.IsOverlapping) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.IsOverlapping = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(length(f, j, view, initviewtreeowners))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.isInside;
        }
    }
}
