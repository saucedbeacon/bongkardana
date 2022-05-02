package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class enoughToFilter {
    public boolean getMax;
    public PointF getMin;
    public final List<isQueryRefinementEnabled> length;

    public enoughToFilter(PointF pointF, boolean z, List<isQueryRefinementEnabled> list) {
        this.getMin = pointF;
        this.getMax = z;
        this.length = new ArrayList(list);
    }

    public enoughToFilter() {
        this.length = new ArrayList();
    }

    public final boolean getMin() {
        return this.getMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.length.size());
        sb.append("closed=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }
}
