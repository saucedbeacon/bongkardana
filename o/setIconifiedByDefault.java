package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

public final class setIconifiedByDefault extends setOnCloseListener<PointF> {
    private final PathMeasure IsOverlapping = new PathMeasure();
    private final PointF getMax = new PointF();
    private getQuery isInside;
    private final float[] toFloatRange = new float[2];

    public setIconifiedByDefault(List<? extends setTitleMarginTop<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        getQuery getquery = (getQuery) settitlemargintop;
        Path path = getquery.setMin;
        if (path == null) {
            return (PointF) settitlemargintop.setMax;
        }
        if (this.length != null) {
            setTitleMarginBottom settitlemarginbottom = this.length;
            settitlemarginbottom.setMax.length(getquery.equals, getquery.toIntRange.floatValue(), getquery.setMax, getquery.getMin, length(), f, IsOverlapping());
            PointF pointF = (PointF) settitlemarginbottom.getMax();
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.isInside != getquery) {
            this.IsOverlapping.setPath(path, false);
            this.isInside = getquery;
        }
        PathMeasure pathMeasure = this.IsOverlapping;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.toFloatRange, (float[]) null);
        PointF pointF2 = this.getMax;
        float[] fArr = this.toFloatRange;
        pointF2.set(fArr[0], fArr[1]);
        return this.getMax;
    }
}
