package o;

import android.animation.TimeInterpolator;

public final class onDragEnd extends onLongPress {
    private final boolean toFloatRange;

    public onDragEnd(long j, boolean z, TimeInterpolator timeInterpolator, int i, boolean z2, int i2, int i3, float f) {
        super(j, timeInterpolator, i, z2, i2, i3, f);
        this.toFloatRange = z;
    }

    public final boolean setMax() {
        return this.toFloatRange;
    }
}
