package o;

import com.facebook.infer.annotation.ThreadSafe;
import o.setPositiveButtonIcon;

@ThreadSafe(enableChecks = false)
public class getBottomFadingEdgeStrength<T> {
    private final boolean getMax;
    private final int getMin;
    private int length = 0;
    private final String setMax;
    private final setPositiveButtonIcon.length<T> setMin;

    public getBottomFadingEdgeStrength(String str, int i, boolean z) {
        this.getMax = z;
        this.setMax = str;
        this.getMin = i;
        this.setMin = z ? new setPositiveButtonIcon.setMax<>(i) : new setPositiveButtonIcon.getMin<>(i);
    }

    public T getMax() {
        T max;
        if (this.getMax) {
            synchronized (this) {
                max = this.setMin.getMax();
                this.length = Math.max(0, this.length - 1);
            }
            return max;
        }
        T max2 = this.setMin.getMax();
        this.length = Math.max(0, this.length - 1);
        return max2;
    }

    public final void getMax(T t) {
        if (this.getMax) {
            synchronized (this) {
                this.setMin.getMin(t);
                this.length = Math.min(this.getMin, this.length + 1);
            }
            return;
        }
        this.setMin.getMin(t);
        this.length = Math.min(this.getMin, this.length + 1);
    }

    public final boolean setMin() {
        return this.length >= this.getMin;
    }
}
