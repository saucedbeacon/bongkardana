package androidx.constraintlayout.solver.widgets.analyzer;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.List;
import o.ChecksSdkIntAtLeast;
import o.ColorInt;

public class DependencyNode implements ChecksSdkIntAtLeast {
    public List<ChecksSdkIntAtLeast> FastBitmap$CoordinateSystem = new ArrayList();
    ColorInt IsOverlapping = null;
    public int equals;
    public boolean getMax = false;
    public Type getMin = Type.UNKNOWN;
    public int isInside;
    public ChecksSdkIntAtLeast length = null;
    public WidgetRun setMax;
    public boolean setMin = false;
    public boolean toFloatRange = false;
    int toIntRange = 1;
    public List<DependencyNode> values = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.setMax = widgetRun;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMax.setMax.ITrustedWebActivityService);
        sb.append(":");
        sb.append(this.getMin);
        sb.append("(");
        sb.append(this.toFloatRange ? Integer.valueOf(this.isInside) : "unresolved");
        sb.append(") <t=");
        sb.append(this.values.size());
        sb.append(":d=");
        sb.append(this.FastBitmap$CoordinateSystem.size());
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }

    public void getMin(int i) {
        if (!this.toFloatRange) {
            this.toFloatRange = true;
            this.isInside = i;
            for (ChecksSdkIntAtLeast max : this.FastBitmap$CoordinateSystem) {
                max.getMax();
            }
        }
    }

    public final void getMax() {
        for (DependencyNode dependencyNode : this.values) {
            if (!dependencyNode.toFloatRange) {
                return;
            }
        }
        this.getMax = true;
        ChecksSdkIntAtLeast checksSdkIntAtLeast = this.length;
        if (checksSdkIntAtLeast != null) {
            checksSdkIntAtLeast.getMax();
        }
        if (this.setMin) {
            this.setMax.getMax();
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode next : this.values) {
            if (!(next instanceof ColorInt)) {
                i++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.toFloatRange) {
            ColorInt colorInt = this.IsOverlapping;
            if (colorInt != null) {
                if (colorInt.toFloatRange) {
                    this.equals = this.toIntRange * this.IsOverlapping.isInside;
                } else {
                    return;
                }
            }
            getMin(dependencyNode2.isInside + this.equals);
        }
        ChecksSdkIntAtLeast checksSdkIntAtLeast2 = this.length;
        if (checksSdkIntAtLeast2 != null) {
            checksSdkIntAtLeast2.getMax();
        }
    }

    public final void length() {
        this.values.clear();
        this.FastBitmap$CoordinateSystem.clear();
        this.toFloatRange = false;
        this.isInside = 0;
        this.getMax = false;
        this.setMin = false;
    }
}
