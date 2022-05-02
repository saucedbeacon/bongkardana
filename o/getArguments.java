package o;

import o.setInitialSavedState;

public final class getArguments extends setInitialSavedState.setMax {
    private static setInitialSavedState<getArguments> setMin;
    public float length;
    public float setMax;

    static {
        setInitialSavedState<getArguments> max = setInitialSavedState.getMax(256, new getArguments((byte) 0));
        setMin = max;
        max.setMax = 0.5f;
    }

    /* access modifiers changed from: protected */
    public final setInitialSavedState.setMax setMin() {
        return new getArguments((byte) 0);
    }

    public static getArguments length(float f, float f2) {
        getArguments max = setMin.setMax();
        max.length = f;
        max.setMax = f2;
        return max;
    }

    public static void setMin(getArguments getarguments) {
        setMin.getMax(getarguments);
    }

    public getArguments() {
    }

    private getArguments(byte b) {
        this.length = 0.0f;
        this.setMax = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof getArguments) {
            getArguments getarguments = (getArguments) obj;
            return this.length == getarguments.length && this.setMax == getarguments.setMax;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.length);
        sb.append("x");
        sb.append(this.setMax);
        return sb.toString();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.length) ^ Float.floatToIntBits(this.setMax);
    }
}
