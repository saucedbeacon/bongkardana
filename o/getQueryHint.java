package o;

import android.graphics.PointF;
import java.util.List;

public final class getQueryHint extends setOnCloseListener<PointF> {
    private final PointF getMax = new PointF();

    public getQueryHint(List<setTitleMarginTop<PointF>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: getMax */
    public PointF setMax(setTitleMarginTop<PointF> settitlemargintop, float f, float f2, float f3) {
        if (settitlemargintop.setMax == null || settitlemargintop.getMin == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) settitlemargintop.setMax;
        PointF pointF2 = (PointF) settitlemargintop.getMin;
        if (this.length != null) {
            setTitleMarginBottom settitlemarginbottom = this.length;
            settitlemarginbottom.setMax.length(settitlemargintop.equals, settitlemargintop.toIntRange.floatValue(), pointF, pointF2, f, length(), IsOverlapping());
            PointF pointF3 = (PointF) settitlemarginbottom.getMax();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.getMax.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.getMax;
    }

    public final /* bridge */ /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        return setMax(settitlemargintop, f, f, f);
    }
}
