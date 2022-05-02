package o;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import o.IResultReceiver;

public abstract class removeOnContextAvailableListener {
    private IResultReceiver.Default equals;
    public int getMax = 0;
    protected ConstraintAttribute getMin;
    public getMax length;
    int setMax = 0;
    String setMin;
    ArrayList<values> toFloatRange = new ArrayList<>();

    public abstract void getMin(View view, float f);

    public final boolean getMin() {
        return this.getMax == 1;
    }

    static class values {
        float getMax;
        float getMin;
        float length;
        int setMin;

        public values(int i, float f, float f2, float f3) {
            this.setMin = i;
            this.getMax = f3;
            this.length = f2;
            this.getMin = f;
        }
    }

    public String toString() {
        String str = this.setMin;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<values> it = this.toFloatRange.iterator();
        while (it.hasNext()) {
            values next = it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(next.setMin);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) next.getMax));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final float getMin(float f) {
        getMax getmax = this.length;
        if (getmax.IsOverlapping != null) {
            getmax.IsOverlapping.length((double) f, getmax.toIntRange);
        } else {
            getmax.toIntRange[0] = (double) getmax.getMax[0];
            getmax.toIntRange[1] = (double) getmax.getMin[0];
        }
        return (float) (getmax.toIntRange[0] + (getmax.setMin.getMin((double) f) * getmax.toIntRange[1]));
    }

    public final void getMax(int i, int i2, int i3, float f, float f2, float f3, ConstraintAttribute constraintAttribute) {
        this.toFloatRange.add(new values(i, f, f2, f3));
        if (i3 != -1) {
            this.getMax = i3;
        }
        this.setMax = i2;
        this.getMin = constraintAttribute;
    }

    @TargetApi(19)
    public final void setMax(float f) {
        Class<double> cls = double.class;
        int size = this.toFloatRange.size();
        if (size != 0) {
            Collections.sort(this.toFloatRange, new Comparator<values>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return Integer.compare(((values) obj).setMin, ((values) obj2).setMin);
                }
            });
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(cls, iArr);
            this.length = new getMax(this.setMax, this.getMax, size);
            Iterator<values> it = this.toFloatRange.iterator();
            int i = 0;
            while (it.hasNext()) {
                values next = it.next();
                double d = (double) next.getMin;
                Double.isNaN(d);
                dArr[i] = d * 0.01d;
                dArr2[i][0] = (double) next.getMax;
                dArr2[i][1] = (double) next.length;
                getMax getmax = this.length;
                int i2 = next.setMin;
                float f2 = next.getMin;
                float f3 = next.length;
                float f4 = next.getMax;
                double[] dArr3 = getmax.length;
                double d2 = (double) i2;
                Double.isNaN(d2);
                dArr3[i] = d2 / 100.0d;
                getmax.setMax[i] = f2;
                getmax.getMax[i] = f3;
                getmax.getMin[i] = f4;
                i++;
                dArr2 = dArr2;
            }
            double[][] dArr4 = dArr2;
            getMax getmax2 = this.length;
            getmax2.hashCode = f;
            int length2 = getmax2.length.length;
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length2;
            double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr2);
            getmax2.toIntRange = new double[(getmax2.getMin.length + 1)];
            getmax2.toFloatRange = new double[(getmax2.getMin.length + 1)];
            if (getmax2.length[0] > 0.0d) {
                getmax2.setMin.setMax(0.0d, getmax2.setMax[0]);
            }
            int length3 = getmax2.length.length - 1;
            if (getmax2.length[length3] < 1.0d) {
                getmax2.setMin.setMax(1.0d, getmax2.setMax[length3]);
            }
            for (int i3 = 0; i3 < dArr5.length; i3++) {
                dArr5[i3][0] = (double) getmax2.getMax[i3];
                for (int i4 = 0; i4 < getmax2.getMin.length; i4++) {
                    dArr5[i4][1] = (double) getmax2.getMin[i4];
                }
                getmax2.setMin.setMax(getmax2.length[i3], getmax2.setMax[i3]);
            }
            onCreate oncreate = getmax2.setMin;
            double d3 = 0.0d;
            for (float f5 : oncreate.getMax) {
                double d4 = (double) f5;
                Double.isNaN(d4);
                d3 += d4;
            }
            double d5 = 0.0d;
            for (int i5 = 1; i5 < oncreate.getMax.length; i5++) {
                int i6 = i5 - 1;
                double d6 = (double) ((oncreate.getMax[i6] + oncreate.getMax[i5]) / 2.0f);
                Double.isNaN(d6);
                d5 += (oncreate.length[i5] - oncreate.length[i6]) * d6;
            }
            for (int i7 = 0; i7 < oncreate.getMax.length; i7++) {
                float[] fArr = oncreate.getMax;
                double d7 = (double) fArr[i7];
                Double.isNaN(d7);
                fArr[i7] = (float) (d7 * (d3 / d5));
            }
            oncreate.getMin[0] = 0.0d;
            for (int i8 = 1; i8 < oncreate.getMax.length; i8++) {
                int i9 = i8 - 1;
                double d8 = oncreate.length[i8] - oncreate.length[i9];
                double[] dArr6 = oncreate.getMin;
                double d9 = dArr6[i9];
                double d10 = (double) ((oncreate.getMax[i9] + oncreate.getMax[i8]) / 2.0f);
                Double.isNaN(d10);
                dArr6[i8] = d9 + (d8 * d10);
            }
            oncreate.IsOverlapping = true;
            if (getmax2.length.length > 1) {
                getmax2.IsOverlapping = IResultReceiver.Default.length(0, getmax2.length, dArr5);
            } else {
                getmax2.IsOverlapping = null;
            }
            this.equals = IResultReceiver.Default.length(0, dArr, dArr4);
        }
    }

    static class setMax extends removeOnContextAvailableListener {
        setMax() {
        }

        public final void getMin(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(getMin(f));
            }
        }
    }

    static class length extends removeOnContextAvailableListener {
        length() {
        }

        public final void getMin(View view, float f) {
            view.setAlpha(getMin(f));
        }
    }

    static class toFloatRange extends removeOnContextAvailableListener {
        toFloatRange() {
        }

        public final void getMin(View view, float f) {
            view.setRotation(getMin(f));
        }
    }

    static class isInside extends removeOnContextAvailableListener {
        isInside() {
        }

        public final void getMin(View view, float f) {
            view.setRotationX(getMin(f));
        }
    }

    static class IsOverlapping extends removeOnContextAvailableListener {
        IsOverlapping() {
        }

        public final void getMin(View view, float f) {
            view.setRotationY(getMin(f));
        }
    }

    static class setMin extends removeOnContextAvailableListener {
        public final void getMin(View view, float f) {
        }

        setMin() {
        }
    }

    static class toIntRange extends removeOnContextAvailableListener {
        toIntRange() {
        }

        public final void getMin(View view, float f) {
            view.setScaleX(getMin(f));
        }
    }

    static class toDoubleRange extends removeOnContextAvailableListener {
        toDoubleRange() {
        }

        public final void getMin(View view, float f) {
            view.setTranslationX(getMin(f));
        }
    }

    static class toString extends removeOnContextAvailableListener {
        toString() {
        }

        public final void getMin(View view, float f) {
            view.setTranslationY(getMin(f));
        }
    }

    static class hashCode extends removeOnContextAvailableListener {
        hashCode() {
        }

        public final void getMin(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(getMin(f));
            }
        }
    }

    static class getMin extends removeOnContextAvailableListener {
        float[] IsOverlapping = new float[1];

        getMin() {
        }

        public final void getMin(View view, float f) {
            this.IsOverlapping[0] = getMin(f);
            this.getMin.setMin(view, this.IsOverlapping);
        }
    }

    static class equals extends removeOnContextAvailableListener {
        boolean toIntRange = false;

        equals() {
        }

        public final void getMin(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(getMin(f));
            } else if (!this.toIntRange) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.toIntRange = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(getMin(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    public static class getMax {
        public HashMap<String, ConstraintAttribute> FastBitmap$CoordinateSystem = new HashMap<>();
        IResultReceiver.Default IsOverlapping;
        int equals;
        float[] getMax;
        float[] getMin;
        float hashCode;
        float[] isInside;
        double[] length;
        float[] setMax;
        onCreate setMin = new onCreate();
        double[] toFloatRange;
        double[] toIntRange;
        private final int toString;

        getMax(int i, int i2, int i3) {
            this.equals = i;
            this.toString = i2;
            this.setMin.setMin = i;
            this.getMin = new float[i3];
            this.length = new double[i3];
            this.setMax = new float[i3];
            this.getMax = new float[i3];
            this.isInside = new float[i3];
        }

        public final double setMax(float f) {
            IResultReceiver.Default defaultR = this.IsOverlapping;
            if (defaultR != null) {
                double d = (double) f;
                defaultR.getMin(d, this.toFloatRange);
                this.IsOverlapping.length(d, this.toIntRange);
            } else {
                double[] dArr = this.toFloatRange;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = (double) f;
            double min = this.setMin.getMin(d2);
            double length2 = this.setMin.length(d2);
            double[] dArr2 = this.toFloatRange;
            return dArr2[0] + (min * dArr2[1]) + (length2 * this.toIntRange[1]);
        }
    }
}
