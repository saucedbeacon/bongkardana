package o;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.LinkedHashMap;
import o.ResultReceiver;
import o.from;

public final class getSavedStateRegistry implements Comparable<getSavedStateRegistry> {
    static String[] getMin = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> FastBitmap$CoordinateSystem = new LinkedHashMap<>();
    public float IsOverlapping;
    public float equals;
    int getMax = 0;
    double[] hashCode = new double[18];
    public float isInside;
    public float length;
    ResultReceiver.MyResultReceiver setMax;
    public float setMin;
    int toDoubleRange = 0;
    public float toFloatRange;
    float toIntRange = Float.NaN;
    int toString = onRetainNonConfigurationInstance.getMin;
    double[] valueOf = new double[18];
    float values = Float.NaN;

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        return Float.compare(this.length, ((getSavedStateRegistry) obj).length);
    }

    public getSavedStateRegistry() {
    }

    public getSavedStateRegistry(int i, int i2, peekAvailableContext peekavailablecontext, getSavedStateRegistry getsavedstateregistry, getSavedStateRegistry getsavedstateregistry2) {
        float f;
        int i3;
        peekAvailableContext peekavailablecontext2 = peekavailablecontext;
        getSavedStateRegistry getsavedstateregistry3 = getsavedstateregistry;
        getSavedStateRegistry getsavedstateregistry4 = getsavedstateregistry2;
        int i4 = peekavailablecontext2.invokeSuspend;
        if (i4 == 1) {
            getSavedStateRegistry getsavedstateregistry5 = getsavedstateregistry3;
            float f2 = ((float) peekavailablecontext2.length) / 100.0f;
            this.setMin = f2;
            this.getMax = peekavailablecontext2.equals;
            float f3 = Float.isNaN(peekavailablecontext2.isInside) ? f2 : peekavailablecontext2.isInside;
            float f4 = Float.isNaN(peekavailablecontext2.FastBitmap$CoordinateSystem) ? f2 : peekavailablecontext2.FastBitmap$CoordinateSystem;
            float f5 = getsavedstateregistry4.isInside - getsavedstateregistry5.isInside;
            float f6 = getsavedstateregistry4.IsOverlapping - getsavedstateregistry5.IsOverlapping;
            this.length = this.setMin;
            f2 = !Float.isNaN(peekavailablecontext2.toDoubleRange) ? peekavailablecontext2.toDoubleRange : f2;
            float f7 = getsavedstateregistry5.toFloatRange;
            float f8 = getsavedstateregistry5.isInside;
            float f9 = getsavedstateregistry5.equals;
            float f10 = getsavedstateregistry5.IsOverlapping;
            float f11 = (getsavedstateregistry4.toFloatRange + (getsavedstateregistry4.isInside / 2.0f)) - ((f8 / 2.0f) + f7);
            float f12 = (getsavedstateregistry4.equals + (getsavedstateregistry4.IsOverlapping / 2.0f)) - (f9 + (f10 / 2.0f));
            float f13 = f11 * f2;
            float f14 = f5 * f3;
            float f15 = f14 / 2.0f;
            this.toFloatRange = (float) ((int) ((f7 + f13) - f15));
            float f16 = f2 * f12;
            float f17 = f6 * f4;
            float f18 = f17 / 2.0f;
            this.equals = (float) ((int) ((f9 + f16) - f18));
            this.isInside = (float) ((int) (f8 + f14));
            this.IsOverlapping = (float) ((int) (f10 + f17));
            float f19 = Float.isNaN(peekavailablecontext2.hashCode) ? 0.0f : peekavailablecontext2.hashCode;
            this.toDoubleRange = 1;
            getSavedStateRegistry getsavedstateregistry6 = getsavedstateregistry;
            float f20 = (float) ((int) ((getsavedstateregistry6.toFloatRange + f13) - f15));
            this.toFloatRange = f20;
            float f21 = (float) ((int) ((getsavedstateregistry6.equals + f16) - f18));
            this.equals = f21;
            this.toFloatRange = f20 + ((-f12) * f19);
            this.equals = f21 + (f11 * f19);
            this.setMax = ResultReceiver.MyResultReceiver.getMax(peekavailablecontext2.toFloatRange);
            this.toString = peekavailablecontext2.IsOverlapping;
        } else if (i4 != 2) {
            float f22 = ((float) peekavailablecontext2.length) / 100.0f;
            this.setMin = f22;
            this.getMax = peekavailablecontext2.equals;
            float f23 = Float.isNaN(peekavailablecontext2.isInside) ? f22 : peekavailablecontext2.isInside;
            float f24 = Float.isNaN(peekavailablecontext2.FastBitmap$CoordinateSystem) ? f22 : peekavailablecontext2.FastBitmap$CoordinateSystem;
            float f25 = getsavedstateregistry4.isInside;
            float f26 = getsavedstateregistry3.isInside;
            float f27 = getsavedstateregistry4.IsOverlapping;
            float f28 = getsavedstateregistry3.IsOverlapping;
            this.length = this.setMin;
            float f29 = getsavedstateregistry3.toFloatRange;
            float f30 = getsavedstateregistry3.equals;
            float f31 = (getsavedstateregistry4.toFloatRange + (f25 / 2.0f)) - (f29 + (f26 / 2.0f));
            float f32 = (getsavedstateregistry4.equals + (f27 / 2.0f)) - (f30 + (f28 / 2.0f));
            float f33 = (f25 - f26) * f23;
            float f34 = f33 / 2.0f;
            this.toFloatRange = (float) ((int) ((f29 + (f31 * f22)) - f34));
            float f35 = (f27 - f28) * f24;
            float f36 = f35 / 2.0f;
            this.equals = (float) ((int) ((f30 + (f32 * f22)) - f36));
            this.isInside = (float) ((int) (f26 + f33));
            this.IsOverlapping = (float) ((int) (f28 + f35));
            float f37 = Float.isNaN(peekavailablecontext2.toDoubleRange) ? f22 : peekavailablecontext2.toDoubleRange;
            float f38 = Float.isNaN(peekavailablecontext2.toString) ? 0.0f : peekavailablecontext2.toString;
            f22 = !Float.isNaN(peekavailablecontext2.hashCode) ? peekavailablecontext2.hashCode : f22;
            if (Float.isNaN(peekavailablecontext2.values)) {
                i3 = 2;
                f = 0.0f;
            } else {
                f = peekavailablecontext2.values;
                i3 = 2;
            }
            this.toDoubleRange = i3;
            getSavedStateRegistry getsavedstateregistry7 = getsavedstateregistry;
            this.toFloatRange = (float) ((int) (((getsavedstateregistry7.toFloatRange + (f37 * f31)) + (f * f32)) - f34));
            this.equals = (float) ((int) (((getsavedstateregistry7.equals + (f31 * f38)) + (f32 * f22)) - f36));
            this.setMax = ResultReceiver.MyResultReceiver.getMax(peekavailablecontext2.toFloatRange);
            this.toString = peekavailablecontext2.IsOverlapping;
        } else {
            getSavedStateRegistry getsavedstateregistry8 = getsavedstateregistry3;
            float f39 = ((float) peekavailablecontext2.length) / 100.0f;
            this.setMin = f39;
            this.getMax = peekavailablecontext2.equals;
            float f40 = Float.isNaN(peekavailablecontext2.isInside) ? f39 : peekavailablecontext2.isInside;
            float f41 = Float.isNaN(peekavailablecontext2.FastBitmap$CoordinateSystem) ? f39 : peekavailablecontext2.FastBitmap$CoordinateSystem;
            float f42 = getsavedstateregistry4.isInside;
            float f43 = getsavedstateregistry8.isInside;
            float f44 = getsavedstateregistry4.IsOverlapping;
            float f45 = getsavedstateregistry8.IsOverlapping;
            this.length = this.setMin;
            float f46 = getsavedstateregistry8.toFloatRange;
            float f47 = getsavedstateregistry8.equals;
            float f48 = getsavedstateregistry4.toFloatRange + (f42 / 2.0f);
            float f49 = getsavedstateregistry4.equals + (f44 / 2.0f);
            float f50 = (f42 - f43) * f40;
            this.toFloatRange = (float) ((int) ((f46 + ((f48 - ((f43 / 2.0f) + f46)) * f39)) - (f50 / 2.0f)));
            float f51 = (f44 - f45) * f41;
            this.equals = (float) ((int) ((f47 + ((f49 - (f47 + (f45 / 2.0f))) * f39)) - (f51 / 2.0f)));
            this.isInside = (float) ((int) (f43 + f50));
            this.IsOverlapping = (float) ((int) (f45 + f51));
            this.toDoubleRange = 3;
            peekAvailableContext peekavailablecontext3 = peekavailablecontext;
            if (!Float.isNaN(peekavailablecontext3.toDoubleRange)) {
                this.toFloatRange = (float) ((int) (peekavailablecontext3.toDoubleRange * ((float) ((int) (((float) i) - this.isInside)))));
            }
            if (!Float.isNaN(peekavailablecontext3.hashCode)) {
                this.equals = (float) ((int) (peekavailablecontext3.hashCode * ((float) ((int) (((float) i2) - this.IsOverlapping)))));
            }
            this.setMax = ResultReceiver.MyResultReceiver.getMax(peekavailablecontext3.toFloatRange);
            this.toString = peekavailablecontext3.IsOverlapping;
        }
    }

    static boolean setMin(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.toFloatRange;
        float f2 = this.equals;
        float f3 = this.isInside;
        float f4 = this.IsOverlapping;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public static void length(float f, float f2, float[] fArr, int[] iArr, double[] dArr) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * 0.0f) / 2.0f);
        float f9 = f5 - ((f6 * 0.0f) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(double[] dArr, int[] iArr) {
        float[] fArr = {this.length, this.toFloatRange, this.equals, this.isInside, this.IsOverlapping, this.toIntRange};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(String str) {
        return this.FastBitmap$CoordinateSystem.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public final int getMax(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.FastBitmap$CoordinateSystem.get(str);
        int i2 = 0;
        if (constraintAttribute.setMin() == 1) {
            dArr[0] = (double) constraintAttribute.length();
            return 1;
        }
        int min = constraintAttribute.setMin();
        float[] fArr = new float[min];
        constraintAttribute.getMax(fArr);
        while (i2 < min) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return min;
    }

    public final void setMin(from.length length2) {
        this.setMax = ResultReceiver.MyResultReceiver.getMax(length2.getMax.setMin);
        this.toString = length2.getMax.getMax;
        this.toIntRange = length2.getMax.IsOverlapping;
        this.getMax = length2.getMax.setMax;
        this.values = length2.length.setMin;
        for (String next : length2.toFloatRange.keySet()) {
            ConstraintAttribute constraintAttribute = length2.toFloatRange.get(next);
            if (constraintAttribute.getMax != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.FastBitmap$CoordinateSystem.put(next, constraintAttribute);
            }
        }
    }
}
