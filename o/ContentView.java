package o;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

public final class ContentView {
    public static int getMax;
    public int getMin = 0;
    int isInside;
    WidgetRun length = null;
    WidgetRun setMax = null;
    public boolean setMin = false;
    ArrayList<WidgetRun> toFloatRange = new ArrayList<>();
    int toIntRange = 0;

    public ContentView(WidgetRun widgetRun, int i) {
        int i2 = getMax;
        this.toIntRange = i2;
        getMax = i2 + 1;
        this.setMax = widgetRun;
        this.length = widgetRun;
        this.isInside = i;
    }

    /* access modifiers changed from: package-private */
    public final long getMin(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.setMax;
        if (widgetRun instanceof lambda) {
            return j;
        }
        int size = dependencyNode.FastBitmap$CoordinateSystem.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ChecksSdkIntAtLeast checksSdkIntAtLeast = dependencyNode.FastBitmap$CoordinateSystem.get(i);
            if (checksSdkIntAtLeast instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) checksSdkIntAtLeast;
                if (dependencyNode2.setMax != widgetRun) {
                    j2 = Math.max(j2, getMin(dependencyNode2, ((long) dependencyNode2.equals) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.hashCode) {
            return j2;
        }
        long max = j + widgetRun.setMax();
        return Math.max(Math.max(j2, getMin(widgetRun.FastBitmap$CoordinateSystem, max)), max - ((long) widgetRun.FastBitmap$CoordinateSystem.equals));
    }

    /* access modifiers changed from: package-private */
    public final long getMax(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.setMax;
        if (widgetRun instanceof lambda) {
            return j;
        }
        int size = dependencyNode.FastBitmap$CoordinateSystem.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ChecksSdkIntAtLeast checksSdkIntAtLeast = dependencyNode.FastBitmap$CoordinateSystem.get(i);
            if (checksSdkIntAtLeast instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) checksSdkIntAtLeast;
                if (dependencyNode2.setMax != widgetRun) {
                    j2 = Math.min(j2, getMax(dependencyNode2, ((long) dependencyNode2.equals) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.FastBitmap$CoordinateSystem) {
            return j2;
        }
        long max = j - widgetRun.setMax();
        return Math.min(Math.min(j2, getMax(widgetRun.hashCode, max)), max - ((long) widgetRun.hashCode.equals));
    }
}
