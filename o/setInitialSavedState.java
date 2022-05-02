package o;

import o.setInitialSavedState.setMax;

public final class setInitialSavedState<T extends setMax> {
    private static int getMax;
    private T IsOverlapping;
    private Object[] getMin;
    private int length;
    public float setMax;
    private int setMin;
    private int toFloatRange;

    public static abstract class setMax {
        public static int invokeSuspend = -1;
        int Mean$Arithmetic = invokeSuspend;

        /* access modifiers changed from: protected */
        public abstract setMax setMin();
    }

    public static synchronized setInitialSavedState getMax(int i, setMax setmax) {
        setInitialSavedState setinitialsavedstate;
        synchronized (setInitialSavedState.class) {
            setinitialsavedstate = new setInitialSavedState(i, setmax);
            setinitialsavedstate.setMin = getMax;
            getMax++;
        }
        return setinitialsavedstate;
    }

    private setInitialSavedState(int i, T t) {
        if (i > 0) {
            this.length = i;
            this.getMin = new Object[i];
            this.toFloatRange = 0;
            this.IsOverlapping = t;
            this.setMax = 1.0f;
            setMin(1.0f);
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    private void setMin(float f) {
        int i = this.length;
        int i2 = (int) (((float) i) * f);
        if (i2 <= 0) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.getMin[i3] = this.IsOverlapping.setMin();
        }
        this.toFloatRange = i - 1;
    }

    public final synchronized T setMax() {
        T t;
        if (this.toFloatRange == -1 && this.setMax > 0.0f) {
            setMin(this.setMax);
        }
        t = (setMax) this.getMin[this.toFloatRange];
        t.Mean$Arithmetic = setMax.invokeSuspend;
        this.toFloatRange--;
        return t;
    }

    public final synchronized void getMax(T t) {
        if (t.Mean$Arithmetic == setMax.invokeSuspend) {
            int i = this.toFloatRange + 1;
            this.toFloatRange = i;
            if (i >= this.getMin.length) {
                length();
            }
            t.Mean$Arithmetic = this.setMin;
            this.getMin[this.toFloatRange] = t;
        } else if (t.Mean$Arithmetic == this.setMin) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            StringBuilder sb = new StringBuilder("The object to recycle already belongs to poolId ");
            sb.append(t.Mean$Arithmetic);
            sb.append(".  Object cannot belong to two different pool instances simultaneously!");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void length() {
        int i = this.length;
        int i2 = i * 2;
        this.length = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.getMin[i3];
        }
        this.getMin = objArr;
    }
}
