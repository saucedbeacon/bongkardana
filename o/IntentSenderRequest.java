package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public final class IntentSenderRequest {
    int FastBitmap$CoordinateSystem;
    boolean Grayscale$Algorithm;
    private boolean ICustomTabsCallback = false;
    protected int IsOverlapping;
    protected boolean Mean$Arithmetic;
    private int b;
    protected int equals;
    protected ConstraintWidget getMax;
    protected ConstraintWidget getMin;
    boolean hashCode;
    protected boolean invoke;
    protected boolean invokeSuspend;
    protected ConstraintWidget isInside;
    protected ConstraintWidget length;
    protected ConstraintWidget setMax;
    protected ConstraintWidget setMin;
    int toDoubleRange;
    protected ConstraintWidget toFloatRange;
    protected ArrayList<ConstraintWidget> toIntRange;
    int toString;
    protected boolean valueOf;
    protected float values = 0.0f;

    public IntentSenderRequest(ConstraintWidget constraintWidget, int i, boolean z) {
        this.length = constraintWidget;
        this.b = i;
        this.ICustomTabsCallback = z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0123, code lost:
        if (r2.getCause == 0) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin() {
        /*
            r13 = this;
            int r0 = r13.b
            r1 = 2
            int r0 = r0 * 2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r13.length
            r3 = 1
            r13.hashCode = r3
            r4 = 0
            r5 = r2
            r6 = 0
        L_0x000d:
            if (r6 != 0) goto L_0x0163
            int r7 = r13.IsOverlapping
            int r7 = r7 + r3
            r13.IsOverlapping = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r2.MediaBrowserCompat$CustomActionResultReceiver
            int r8 = r13.b
            r9 = 0
            r7[r8] = r9
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r2.read
            int r8 = r13.b
            r7[r8] = r9
            int r7 = r2.areNotificationsEnabled
            r8 = 8
            if (r7 == r8) goto L_0x0131
            int r7 = r13.toString
            int r7 = r7 + r3
            r13.toString = r7
            int r7 = r13.b
            if (r7 != 0) goto L_0x0035
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.extraCommand
            r7 = r7[r4]
            goto L_0x003d
        L_0x0035:
            if (r7 != r3) goto L_0x003c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.extraCommand
            r7 = r7[r3]
            goto L_0x003d
        L_0x003c:
            r7 = r9
        L_0x003d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x005b
            int r7 = r13.toDoubleRange
            int r10 = r13.b
            if (r10 != 0) goto L_0x004e
            int r10 = r2.areNotificationsEnabled
            if (r10 == r8) goto L_0x0057
            int r8 = r2.requestPostMessageChannelWithExtras
            goto L_0x0058
        L_0x004e:
            if (r10 != r3) goto L_0x0057
            int r10 = r2.areNotificationsEnabled
            if (r10 == r8) goto L_0x0057
            int r8 = r2.postMessage
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            int r7 = r7 + r8
            r13.toDoubleRange = r7
        L_0x005b:
            int r7 = r13.toDoubleRange
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r2.newSession
            r8 = r8[r0]
            int r8 = r8.getMin()
            int r7 = r7 + r8
            r13.toDoubleRange = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r2.newSession
            int r10 = r0 + 1
            r8 = r8[r10]
            int r8 = r8.getMin()
            int r7 = r7 + r8
            r13.toDoubleRange = r7
            int r7 = r13.FastBitmap$CoordinateSystem
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r2.newSession
            r8 = r8[r0]
            int r8 = r8.getMin()
            int r7 = r7 + r8
            r13.FastBitmap$CoordinateSystem = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r2.newSession
            r8 = r8[r10]
            int r8 = r8.getMin()
            int r7 = r7 + r8
            r13.FastBitmap$CoordinateSystem = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r13.setMin
            if (r7 != 0) goto L_0x0093
            r13.setMin = r2
        L_0x0093:
            r13.getMin = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.extraCommand
            int r8 = r13.b
            r7 = r7[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0131
            int[] r7 = r2.valueOf
            int r8 = r13.b
            r7 = r7[r8]
            r8 = 0
            if (r7 == 0) goto L_0x00b9
            int[] r7 = r2.valueOf
            int r10 = r13.b
            r7 = r7[r10]
            r10 = 3
            if (r7 == r10) goto L_0x00b9
            int[] r7 = r2.valueOf
            int r10 = r13.b
            r7 = r7[r10]
            if (r7 != r1) goto L_0x0106
        L_0x00b9:
            int r7 = r13.equals
            int r7 = r7 + r3
            r13.equals = r7
            float[] r7 = r2.IconCompatParcelizer
            int r10 = r13.b
            r7 = r7[r10]
            int r10 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d3
            float r10 = r13.values
            float[] r11 = r2.IconCompatParcelizer
            int r12 = r13.b
            r11 = r11[r12]
            float r10 = r10 + r11
            r13.values = r10
        L_0x00d3:
            int r10 = r13.b
            boolean r10 = getMax(r2, r10)
            if (r10 == 0) goto L_0x00f4
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e2
            r13.invokeSuspend = r3
            goto L_0x00e4
        L_0x00e2:
            r13.Mean$Arithmetic = r3
        L_0x00e4:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r13.toIntRange
            if (r7 != 0) goto L_0x00ef
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.toIntRange = r7
        L_0x00ef:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r13.toIntRange
            r7.add(r2)
        L_0x00f4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r13.isInside
            if (r7 != 0) goto L_0x00fa
            r13.isInside = r2
        L_0x00fa:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r13.toFloatRange
            if (r7 == 0) goto L_0x0104
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r7.read
            int r10 = r13.b
            r7[r10] = r2
        L_0x0104:
            r13.toFloatRange = r2
        L_0x0106:
            int r7 = r13.b
            if (r7 != 0) goto L_0x0119
            int r7 = r2.Mean$Arithmetic
            if (r7 != 0) goto L_0x0125
            int r7 = r2.invokeSuspend
            if (r7 != 0) goto L_0x0116
            int r7 = r2.Grayscale$Algorithm
            if (r7 == 0) goto L_0x0127
        L_0x0116:
            r13.hashCode = r4
            goto L_0x0127
        L_0x0119:
            int r7 = r2.invoke
            if (r7 != 0) goto L_0x0125
            int r7 = r2.onNavigationEvent
            if (r7 != 0) goto L_0x0125
            int r7 = r2.getCause
            if (r7 == 0) goto L_0x0127
        L_0x0125:
            r13.hashCode = r4
        L_0x0127:
            float r7 = r2.updateVisuals
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0131
            r13.hashCode = r4
            r13.valueOf = r3
        L_0x0131:
            if (r5 == r2) goto L_0x0139
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r13.b
            r5[r7] = r2
        L_0x0139:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r2.newSession
            int r7 = r0 + 1
            r5 = r5[r7]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.toIntRange
            if (r5 == 0) goto L_0x0159
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.setMax
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r5.newSession
            r7 = r7[r0]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.toIntRange
            if (r7 == 0) goto L_0x0159
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r5.newSession
            r7 = r7[r0]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.setMax
            if (r7 == r2) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r9 = r5
        L_0x0159:
            if (r9 == 0) goto L_0x015f
            r5 = r2
            r2 = r9
            goto L_0x000d
        L_0x015f:
            r5 = r2
            r6 = 1
            goto L_0x000d
        L_0x0163:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.setMin
            if (r1 == 0) goto L_0x0174
            int r5 = r13.toDoubleRange
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.newSession
            r1 = r1[r0]
            int r1 = r1.getMin()
            int r5 = r5 - r1
            r13.toDoubleRange = r5
        L_0x0174:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r13.getMin
            if (r1 == 0) goto L_0x0186
            int r5 = r13.toDoubleRange
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.newSession
            int r0 = r0 + r3
            r0 = r1[r0]
            int r0 = r0.getMin()
            int r5 = r5 - r0
            r13.toDoubleRange = r5
        L_0x0186:
            r13.getMax = r2
            int r0 = r13.b
            if (r0 != 0) goto L_0x0193
            boolean r0 = r13.ICustomTabsCallback
            if (r0 == 0) goto L_0x0193
            r13.setMax = r2
            goto L_0x0197
        L_0x0193:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r13.length
            r13.setMax = r0
        L_0x0197:
            boolean r0 = r13.Mean$Arithmetic
            if (r0 == 0) goto L_0x01a0
            boolean r0 = r13.invokeSuspend
            if (r0 == 0) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r3 = 0
        L_0x01a1:
            r13.invoke = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IntentSenderRequest.getMin():void");
    }

    private static boolean getMax(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.areNotificationsEnabled == 8 || constraintWidget.extraCommand[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        return constraintWidget.valueOf[i] == 0 || constraintWidget.valueOf[i] == 3;
    }
}
