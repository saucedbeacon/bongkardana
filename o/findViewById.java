package o;

import android.view.VelocityTracker;

@Deprecated
public final class findViewById {
    @Deprecated
    public static float getMax(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @Deprecated
    public static float setMax(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
