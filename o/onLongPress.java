package o;

import android.animation.TimeInterpolator;

public class onLongPress {
    final TimeInterpolator getMax;
    final int getMin;
    private final boolean isInside;
    final long length;
    final int setMax;
    final int setMin;
    float toIntRange;

    public onLongPress(long j, TimeInterpolator timeInterpolator, int i, boolean z, int i2, int i3, float f) {
        this.length = j;
        this.getMax = timeInterpolator;
        this.setMax = i;
        this.isInside = z;
        this.setMin = i2;
        this.getMin = i3;
        this.toIntRange = f;
    }

    public final boolean getMin() {
        return this.isInside;
    }
}
