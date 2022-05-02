package o;

import androidx.annotation.RestrictTo;

public final class onRtlPropertiesChanged<T> {
    private float getMax;
    private T getMin;
    private float length;
    private float setMax;
    private T setMin;
    private float toFloatRange;
    private float toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final onRtlPropertiesChanged<T> length(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.setMax = f;
        this.length = f2;
        this.setMin = t;
        this.getMin = t2;
        this.getMax = f3;
        this.toFloatRange = f4;
        this.toIntRange = f5;
        return this;
    }
}
