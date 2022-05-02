package o;

import o.setInitialSavedState;

public class isStateSaved extends setInitialSavedState.setMax {
    private static setInitialSavedState<isStateSaved> setMin;
    public double getMin = 0.0d;
    public double length = 0.0d;

    static {
        setInitialSavedState<isStateSaved> max = setInitialSavedState.getMax(64, new isStateSaved());
        setMin = max;
        max.setMax = 0.5f;
    }

    public static isStateSaved getMin(double d, double d2) {
        isStateSaved max = setMin.setMax();
        max.length = d;
        max.getMin = d2;
        return max;
    }

    public static void getMax(isStateSaved isstatesaved) {
        setMin.getMax(isstatesaved);
    }

    /* access modifiers changed from: protected */
    public final setInitialSavedState.setMax setMin() {
        return new isStateSaved();
    }

    private isStateSaved() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MPPointD, x: ");
        sb.append(this.length);
        sb.append(", y: ");
        sb.append(this.getMin);
        return sb.toString();
    }
}
