package o;

public final class ComponentActivity extends startActivityForResult {
    private float IsOverlapping;
    private float equals;
    private float getMax;
    private float getMin;
    private float hashCode;
    private int isInside;
    private float length;
    private float setMax;
    private float setMin;
    private boolean toDoubleRange = false;
    private float toFloatRange;
    private float toIntRange;
    private float toString;
    private String values;

    private float setMax(float f) {
        float f2 = this.setMin;
        if (f <= f2) {
            float f3 = this.getMax;
            return f3 + (((this.getMin - f3) * f) / f2);
        }
        int i = this.isInside;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.length;
        if (f4 < f5) {
            float f6 = this.getMin;
            return f6 + (((this.setMax - f6) * f4) / f5);
        } else if (i == 2) {
            return this.toFloatRange;
        } else {
            float f7 = f4 - f5;
            float f8 = this.equals;
            if (f7 >= f8) {
                return this.IsOverlapping;
            }
            float f9 = this.setMax;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: o.ComponentActivity$4  reason: invalid class name */
    final class AnonymousClass4 {

        /* renamed from: o.ComponentActivity$4$setMin */
        interface setMin<T> {
            void getMin(T[] tArr, int i);

            boolean getMin(T t);

            T length();
        }

        /* renamed from: o.ComponentActivity$4$getMax */
        static class getMax<T> implements setMin<T> {
            private int getMax;
            private final Object[] getMin = new Object[256];

            getMax() {
            }

            public final T length() {
                int i = this.getMax;
                if (i <= 0) {
                    return null;
                }
                int i2 = i - 1;
                T[] tArr = this.getMin;
                T t = tArr[i2];
                tArr[i2] = null;
                this.getMax = i - 1;
                return t;
            }

            public final boolean getMin(T t) {
                int i = this.getMax;
                Object[] objArr = this.getMin;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.getMax = i + 1;
                return true;
            }

            public final void getMin(T[] tArr, int i) {
                if (i > tArr.length) {
                    i = tArr.length;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    T t = tArr[i2];
                    int i3 = this.getMax;
                    Object[] objArr = this.getMin;
                    if (i3 < objArr.length) {
                        objArr[i3] = t;
                        this.getMax = i3 + 1;
                    }
                }
            }
        }
    }

    public final void getMin(float f, float f2, float f3, float f4, float f5, float f6) {
        this.toString = f;
        boolean z = f > f2;
        this.toDoubleRange = z;
        if (z) {
            getMin(-f3, f - f2, f5, f6, f4);
        } else {
            getMin(f3, f2 - f, f5, f6, f4);
        }
    }

    public final float length() {
        return this.toDoubleRange ? -setMax(this.hashCode) : setMax(this.hashCode);
    }

    private void getMin(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.getMax = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.values = "backward accelerate, decelerate";
                this.isInside = 2;
                this.getMax = f;
                this.getMin = sqrt;
                this.setMax = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.setMin = f8;
                this.length = sqrt / f3;
                this.toIntRange = ((f + sqrt) * f8) / 2.0f;
                this.toFloatRange = f2;
                this.IsOverlapping = f2;
                return;
            }
            this.values = "backward accelerate cruse decelerate";
            this.isInside = 3;
            this.getMax = f;
            this.getMin = f4;
            this.setMax = f4;
            float f9 = (f4 - f) / f3;
            this.setMin = f9;
            float f10 = f4 / f3;
            this.equals = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.length = ((f2 - f11) - f12) / f4;
            this.toIntRange = f11;
            this.toFloatRange = f2 - f12;
            this.IsOverlapping = f2;
        } else if (f7 >= f2) {
            this.values = "hard stop";
            this.isInside = 1;
            this.getMax = f;
            this.getMin = 0.0f;
            this.toIntRange = f2;
            this.setMin = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.values = "cruse decelerate";
                this.isInside = 2;
                this.getMax = f;
                this.getMin = f;
                this.setMax = 0.0f;
                this.toIntRange = f13;
                this.toFloatRange = f2;
                this.setMin = f14;
                this.length = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.setMin = f15;
            float f16 = sqrt2 / f3;
            this.length = f16;
            if (sqrt2 < f4) {
                this.values = "accelerate decelerate";
                this.isInside = 2;
                this.getMax = f;
                this.getMin = sqrt2;
                this.setMax = 0.0f;
                this.setMin = f15;
                this.length = f16;
                this.toIntRange = ((f + sqrt2) * f15) / 2.0f;
                this.toFloatRange = f2;
                return;
            }
            this.values = "accelerate cruse decelerate";
            this.isInside = 3;
            this.getMax = f;
            this.getMin = f4;
            this.setMax = f4;
            float f17 = (f4 - f) / f3;
            this.setMin = f17;
            float f18 = f4 / f3;
            this.equals = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.length = ((f2 - f19) - f20) / f4;
            this.toIntRange = f19;
            this.toFloatRange = f2 - f20;
            this.IsOverlapping = f2;
        }
    }

    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.setMin;
        if (f <= f3) {
            float f4 = this.getMax;
            f2 = (f4 * f) + ((((this.getMin - f4) * f) * f) / (f3 * 2.0f));
        } else {
            int i = this.isInside;
            if (i == 1) {
                f2 = this.toIntRange;
            } else {
                float f5 = f - f3;
                float f6 = this.length;
                if (f5 < f6) {
                    float f7 = this.toIntRange;
                    float f8 = this.getMin;
                    f2 = f7 + (f8 * f5) + ((((this.setMax - f8) * f5) * f5) / (f6 * 2.0f));
                } else if (i == 2) {
                    f2 = this.toFloatRange;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.equals;
                    if (f9 < f10) {
                        float f11 = this.toFloatRange;
                        float f12 = this.setMax;
                        f2 = (f11 + (f12 * f9)) - (((f12 * f9) * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.IsOverlapping;
                    }
                }
            }
        }
        this.hashCode = f;
        return this.toDoubleRange ? this.toString - f2 : this.toString + f2;
    }
}
