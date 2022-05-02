package o;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class isQueryRefinementEnabled {
    public final PointF getMax;
    public final PointF getMin;
    public final PointF setMin;

    public isQueryRefinementEnabled() {
        this.getMin = new PointF();
        this.getMax = new PointF();
        this.setMin = new PointF();
    }

    public isQueryRefinementEnabled(PointF pointF, PointF pointF2, PointF pointF3) {
        this.getMin = pointF;
        this.getMax = pointF2;
        this.setMin = pointF3;
    }
}
