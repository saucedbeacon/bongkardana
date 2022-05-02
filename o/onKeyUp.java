package o;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;
import o.DrawerLayout;

public abstract class onKeyUp<T extends PieRadarChartBase> implements DrawerLayout.SavedState {
    protected List<addFocusables> getMax = new ArrayList();
    protected T setMax;

    /* access modifiers changed from: protected */
    public abstract addFocusables getMin(int i, float f, float f2);

    public onKeyUp(T t) {
        this.setMax = t;
    }

    public final addFocusables setMax(float f, float f2) {
        if (this.setMax.distanceToCenter(f, f2) > this.setMax.getRadius()) {
            return null;
        }
        float angleForPoint = this.setMax.getAngleForPoint(f, f2);
        T t = this.setMax;
        if (t instanceof PieChart) {
            angleForPoint /= t.getAnimator().length();
        }
        int indexForAngle = this.setMax.getIndexForAngle(angleForPoint);
        if (indexForAngle < 0 || indexForAngle >= this.setMax.getData().FastBitmap$CoordinateSystem().ICustomTabsCallback()) {
            return null;
        }
        return getMin(indexForAngle, f, f2);
    }
}
