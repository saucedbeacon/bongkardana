package o;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

public final class getQuery extends setTitleMarginTop<PointF> {
    private final setTitleMarginTop<PointF> hashCode;
    @Nullable
    Path setMin;

    public getQuery(setVerticalGravity setverticalgravity, setTitleMarginTop<PointF> settitlemargintop) {
        super(setverticalgravity, settitlemargintop.setMax, settitlemargintop.getMin, settitlemargintop.getMax, settitlemargintop.length, settitlemargintop.IsOverlapping, settitlemargintop.equals, settitlemargintop.toIntRange);
        this.hashCode = settitlemargintop;
        setMax();
    }

    public final void setMax() {
        boolean z = (this.getMin == null || this.setMax == null || !((PointF) this.setMax).equals(((PointF) this.getMin).x, ((PointF) this.getMin).y)) ? false : true;
        if (this.setMax != null && this.getMin != null && !z) {
            this.setMin = setTitleMarginStart.getMax((PointF) this.setMax, (PointF) this.getMin, this.hashCode.FastBitmap$CoordinateSystem, this.hashCode.toDoubleRange);
        }
    }
}
