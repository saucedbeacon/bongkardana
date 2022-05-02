package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public final class setQueryHint extends setInputType<enoughToFilter, Path> {
    private final enoughToFilter getMax = new enoughToFilter();
    private final Path toIntRange = new Path();

    public setQueryHint(List<setTitleMarginTop<enoughToFilter>> list) {
        super(list);
    }

    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        enoughToFilter enoughtofilter = (enoughToFilter) settitlemargintop.setMax;
        enoughToFilter enoughtofilter2 = (enoughToFilter) settitlemargintop.getMin;
        enoughToFilter enoughtofilter3 = this.getMax;
        if (enoughtofilter3.getMin == null) {
            enoughtofilter3.getMin = new PointF();
        }
        enoughtofilter3.getMax = enoughtofilter.getMin() || enoughtofilter2.getMin();
        if (enoughtofilter.length.size() != enoughtofilter2.length.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(enoughtofilter.length.size());
            sb.append("\tShape 2: ");
            sb.append(enoughtofilter2.length.size());
            setTitleMargin.setMax(sb.toString());
        }
        int min = Math.min(enoughtofilter.length.size(), enoughtofilter2.length.size());
        if (enoughtofilter3.length.size() < min) {
            for (int size = enoughtofilter3.length.size(); size < min; size++) {
                enoughtofilter3.length.add(new isQueryRefinementEnabled());
            }
        } else if (enoughtofilter3.length.size() > min) {
            for (int size2 = enoughtofilter3.length.size() - 1; size2 >= min; size2--) {
                enoughtofilter3.length.remove(enoughtofilter3.length.size() - 1);
            }
        }
        PointF pointF = enoughtofilter.getMin;
        PointF pointF2 = enoughtofilter2.getMin;
        float min2 = getTitleMarginTop.getMin(pointF.x, pointF2.x, f);
        float min3 = getTitleMarginTop.getMin(pointF.y, pointF2.y, f);
        if (enoughtofilter3.getMin == null) {
            enoughtofilter3.getMin = new PointF();
        }
        enoughtofilter3.getMin.set(min2, min3);
        for (int size3 = enoughtofilter3.length.size() - 1; size3 >= 0; size3--) {
            isQueryRefinementEnabled isqueryrefinementenabled = enoughtofilter.length.get(size3);
            isQueryRefinementEnabled isqueryrefinementenabled2 = enoughtofilter2.length.get(size3);
            PointF pointF3 = isqueryrefinementenabled.getMin;
            PointF pointF4 = isqueryrefinementenabled.getMax;
            PointF pointF5 = isqueryrefinementenabled.setMin;
            PointF pointF6 = isqueryrefinementenabled2.getMin;
            PointF pointF7 = isqueryrefinementenabled2.getMax;
            PointF pointF8 = isqueryrefinementenabled2.setMin;
            enoughtofilter3.length.get(size3).getMin.set(getTitleMarginTop.getMin(pointF3.x, pointF6.x, f), getTitleMarginTop.getMin(pointF3.y, pointF6.y, f));
            enoughtofilter3.length.get(size3).getMax.set(getTitleMarginTop.getMin(pointF4.x, pointF7.x, f), getTitleMarginTop.getMin(pointF4.y, pointF7.y, f));
            enoughtofilter3.length.get(size3).setMin.set(getTitleMarginTop.getMin(pointF5.x, pointF8.x, f), getTitleMarginTop.getMin(pointF5.y, pointF8.y, f));
        }
        getTitleMarginTop.length(this.getMax, this.toIntRange);
        return this.toIntRange;
    }
}
