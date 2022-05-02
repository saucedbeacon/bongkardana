package o;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;

public class ColorInt extends DependencyNode {
    public int hashCode;

    public ColorInt(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof DimenRes) {
            this.getMin = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.getMin = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    public final void getMin(int i) {
        if (!this.toFloatRange) {
            this.toFloatRange = true;
            this.isInside = i;
            for (ChecksSdkIntAtLeast max : this.FastBitmap$CoordinateSystem) {
                max.getMax();
            }
        }
    }
}
