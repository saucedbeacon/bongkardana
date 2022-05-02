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
import o.IResultReceiver;

public abstract class startIntentSenderForResult {
    private int getMax;
    protected float[] getMin = new float[10];
    protected int[] length = new int[10];
    protected IResultReceiver.Default setMax;
    String setMin;

    public abstract void setMin(View view, float f);

    public String toString() {
        String str = this.setMin;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.getMax; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.length[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) this.getMin[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final float length(float f) {
        return (float) this.setMax.getMax((double) f);
    }

    public final float getMax(float f) {
        return (float) this.setMax.setMax((double) f);
    }

    public void setMin(int i, float f) {
        int[] iArr = this.length;
        if (iArr.length < this.getMax + 1) {
            this.length = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.getMin;
            this.getMin = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.length;
        int i2 = this.getMax;
        iArr2[i2] = i;
        this.getMin[i2] = f;
        this.getMax = i2 + 1;
    }

    public void setMin(int i) {
        int i2 = this.getMax;
        if (i2 != 0) {
            int[] iArr = this.length;
            float[] fArr = this.getMin;
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
                            float f = fArr[i9];
                            fArr[i9] = fArr[i8];
                            fArr[i8] = f;
                            i9++;
                        }
                        i8++;
                    }
                    int i11 = iArr[i9];
                    iArr[i9] = iArr[i6];
                    iArr[i6] = i11;
                    float f2 = fArr[i9];
                    fArr[i9] = fArr[i6];
                    fArr[i6] = f2;
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
            for (int i16 = 1; i16 < this.getMax; i16++) {
                int[] iArr3 = this.length;
                if (iArr3[i16 - 1] != iArr3[i16]) {
                    i15++;
                }
            }
            double[] dArr = new double[i15];
            int[] iArr4 = new int[2];
            iArr4[1] = 1;
            iArr4[0] = i15;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr4);
            int i17 = 0;
            for (int i18 = 0; i18 < this.getMax; i18++) {
                if (i18 > 0) {
                    int[] iArr5 = this.length;
                    if (iArr5[i18] == iArr5[i18 - 1]) {
                    }
                }
                double d = (double) this.length[i18];
                Double.isNaN(d);
                dArr[i17] = d * 0.01d;
                dArr2[i17][0] = (double) this.getMin[i18];
                i17++;
            }
            this.setMax = IResultReceiver.Default.length(i, dArr, dArr2);
        }
    }

    static class setMax extends startIntentSenderForResult {
        setMax() {
        }

        public final void setMin(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(length(f));
            }
        }
    }

    static class getMax extends startIntentSenderForResult {
        getMax() {
        }

        public final void setMin(View view, float f) {
            view.setAlpha(length(f));
        }
    }

    static class equals extends startIntentSenderForResult {
        equals() {
        }

        public final void setMin(View view, float f) {
            view.setRotation(length(f));
        }
    }

    static class toFloatRange extends startIntentSenderForResult {
        toFloatRange() {
        }

        public final void setMin(View view, float f) {
            view.setRotationX(length(f));
        }
    }

    static class isInside extends startIntentSenderForResult {
        isInside() {
        }

        public final void setMin(View view, float f) {
            view.setRotationY(length(f));
        }
    }

    static class setMin extends startIntentSenderForResult {
        setMin() {
        }

        public final void setMin(View view, float f) {
            view.setPivotX(length(f));
        }
    }

    static class toIntRange extends startIntentSenderForResult {
        toIntRange() {
        }

        public final void setMin(View view, float f) {
            view.setPivotY(length(f));
        }
    }

    static class getMin extends startIntentSenderForResult {
        public final void setMin(View view, float f) {
        }

        getMin() {
        }
    }

    static class hashCode extends startIntentSenderForResult {
        hashCode() {
        }

        public final void setMin(View view, float f) {
            view.setScaleX(length(f));
        }
    }

    static class values extends startIntentSenderForResult {
        values() {
        }

        public final void setMin(View view, float f) {
            view.setTranslationX(length(f));
        }
    }

    static class toDoubleRange extends startIntentSenderForResult {
        toDoubleRange() {
        }

        public final void setMin(View view, float f) {
            view.setTranslationY(length(f));
        }
    }

    static class toString extends startIntentSenderForResult {
        toString() {
        }

        public final void setMin(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(length(f));
            }
        }
    }

    static class length extends startIntentSenderForResult {
        SparseArray<ConstraintAttribute> IsOverlapping;
        String getMax;
        float[] toIntRange;

        public length(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.getMax = str.split(",")[1];
            this.IsOverlapping = sparseArray;
        }

        public final void setMin(int i) {
            int size = this.IsOverlapping.size();
            int min = this.IsOverlapping.valueAt(0).setMin();
            double[] dArr = new double[size];
            this.toIntRange = new float[min];
            int[] iArr = new int[2];
            iArr[1] = min;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                double keyAt = (double) this.IsOverlapping.keyAt(i2);
                Double.isNaN(keyAt);
                dArr[i2] = keyAt * 0.01d;
                this.IsOverlapping.valueAt(i2).getMax(this.toIntRange);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.toIntRange;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.setMax = IResultReceiver.Default.length(i, dArr, dArr2);
        }

        public final void setMin(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public final void setMin(View view, float f) {
            this.setMax.getMax((double) f, this.toIntRange);
            this.IsOverlapping.valueAt(0).setMin(view, this.toIntRange);
        }
    }

    static class IsOverlapping extends startIntentSenderForResult {
        boolean getMax = false;

        IsOverlapping() {
        }

        public final void setMin(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(length(f));
            } else if (!this.getMax) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.getMax = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(length(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }
}
