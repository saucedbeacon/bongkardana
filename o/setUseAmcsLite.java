package o;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.view.View;

public class setUseAmcsLite {
    public final View equals;
    public final TimeInterpolator getMax;
    public final getEnv getMin;
    public boolean isInside;
    public final long length;
    public final access$1402 setMax;
    public final PointF setMin;
    private final boolean toFloatRange;

    public interface setMin {
    }

    public setUseAmcsLite(getEnv getenv, PointF pointF, long j, TimeInterpolator timeInterpolator, access$1402 access_1402, View view, boolean z) {
        this.getMin = getenv;
        this.setMin = pointF;
        this.length = j;
        this.getMax = timeInterpolator;
        this.setMax = access_1402;
        this.equals = view;
        this.toFloatRange = z;
    }

    public final boolean getMax() {
        return this.toFloatRange;
    }

    public final boolean setMax() {
        return this.isInside;
    }
}
