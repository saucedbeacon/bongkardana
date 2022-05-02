package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Iterator;

public final class CallSuper extends WidgetRun {
    private int getMax;
    ArrayList<WidgetRun> getMin = new ArrayList<>();

    public CallSuper(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.toIntRange = i;
        toIntRange();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.toIntRange == 0 ? "horizontal : " : "vertical : ");
        String obj = sb.toString();
        Iterator<WidgetRun> it = this.getMin.iterator();
        while (it.hasNext()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(SimpleComparison.LESS_THAN_OPERATION);
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(it.next());
            String obj3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("> ");
            obj = sb4.toString();
        }
        return obj;
    }

    public final boolean length() {
        int size = this.getMin.size();
        for (int i = 0; i < size; i++) {
            if (!this.getMin.get(i).length()) {
                return false;
            }
        }
        return true;
    }

    public final long setMax() {
        int size = this.getMin.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.getMin.get(i);
            j = j + ((long) widgetRun.hashCode.equals) + widgetRun.setMax() + ((long) widgetRun.FastBitmap$CoordinateSystem.equals);
        }
        return j;
    }

    private void toIntRange() {
        ConstraintWidget constraintWidget;
        Object obj;
        int i;
        Object obj2;
        ConstraintWidget constraintWidget2 = this.setMax;
        ConstraintWidget IsOverlapping = constraintWidget2.IsOverlapping(this.toIntRange);
        while (true) {
            ConstraintWidget constraintWidget3 = IsOverlapping;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            IsOverlapping = constraintWidget2.IsOverlapping(this.toIntRange);
        }
        this.setMax = constraintWidget;
        ArrayList<WidgetRun> arrayList = this.getMin;
        int i2 = this.toIntRange;
        if (i2 == 0) {
            obj = constraintWidget.toFloatRange;
        } else if (i2 == 1) {
            obj = constraintWidget.equals;
        } else {
            obj = null;
        }
        arrayList.add(obj);
        ConstraintWidget equals = constraintWidget.equals(this.toIntRange);
        while (equals != null) {
            ArrayList<WidgetRun> arrayList2 = this.getMin;
            int i3 = this.toIntRange;
            if (i3 == 0) {
                obj2 = equals.toFloatRange;
            } else if (i3 == 1) {
                obj2 = equals.equals;
            } else {
                obj2 = null;
            }
            arrayList2.add(obj2);
            equals = equals.equals(this.toIntRange);
        }
        Iterator<WidgetRun> it = this.getMin.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            if (this.toIntRange == 0) {
                next.setMax.isInside = this;
            } else if (this.toIntRange == 1) {
                next.setMax.IsOverlapping = this;
            }
        }
        if ((this.toIntRange == 0 && ((AnimRes) this.setMax.requestPostMessageChannel).toFloatRange()) && this.getMin.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.getMin;
            this.setMax = arrayList3.get(arrayList3.size() - 1).setMax;
        }
        if (this.toIntRange == 0) {
            i = this.setMax.cancelAll;
        } else {
            i = this.setMax.INotificationSideChannel$Stub$Proxy;
        }
        this.getMax = i;
    }

    public final void setMin() {
        this.equals = null;
        Iterator<WidgetRun> it = this.getMin.iterator();
        while (it.hasNext()) {
            it.next().setMin();
        }
    }

    public final void getMin() {
        this.hashCode.toFloatRange = false;
        this.FastBitmap$CoordinateSystem.toFloatRange = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        if (r2.toFloatRange.toFloatRange != false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax() {
        /*
            r22 = this;
            r0 = r22
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.hashCode
            boolean r1 = r1.toFloatRange
            if (r1 == 0) goto L_0x041f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.FastBitmap$CoordinateSystem
            boolean r1 = r1.toFloatRange
            if (r1 != 0) goto L_0x0010
            goto L_0x041f
        L_0x0010:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.requestPostMessageChannel
            if (r1 == 0) goto L_0x0021
            boolean r3 = r1 instanceof o.AnimRes
            if (r3 == 0) goto L_0x0021
            o.AnimRes r1 = (o.AnimRes) r1
            boolean r1 = r1.toFloatRange()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r0.FastBitmap$CoordinateSystem
            int r3 = r3.isInside
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.hashCode
            int r4 = r4.isInside
            int r3 = r3 - r4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r0.getMin
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x0049
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r8 = r0.getMin
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r8.setMax
            int r8 = r8.areNotificationsEnabled
            if (r8 == r7) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x0049:
            r5 = -1
        L_0x004a:
            int r8 = r4 + -1
            r9 = r8
        L_0x004d:
            if (r9 < 0) goto L_0x0062
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.getMin
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.setMax
            int r10 = r10.areNotificationsEnabled
            if (r10 == r7) goto L_0x005f
            r6 = r9
            goto L_0x0062
        L_0x005f:
            int r9 = r9 + -1
            goto L_0x004d
        L_0x0062:
            r9 = 0
        L_0x0063:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x00fd
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006e:
            if (r13 >= r4) goto L_0x00f0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r2 = r0.getMin
            java.lang.Object r2 = r2.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r2.setMax
            int r11 = r11.areNotificationsEnabled
            if (r11 == r7) goto L_0x00e9
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0089
            if (r13 < r5) goto L_0x0089
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r2.hashCode
            int r11 = r11.equals
            int r14 = r14 + r11
        L_0x0089:
            o.ColorInt r11 = r2.toFloatRange
            int r11 = r11.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = r2.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x0095
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            if (r7 == 0) goto L_0x00b6
            int r10 = r0.toIntRange
            if (r10 != 0) goto L_0x00a7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r2.setMax
            o.DimenRes r10 = r10.toFloatRange
            o.ColorInt r10 = r10.toFloatRange
            boolean r10 = r10.toFloatRange
            if (r10 != 0) goto L_0x00a7
            return
        L_0x00a7:
            int r10 = r0.toIntRange
            if (r10 != r12) goto L_0x00ca
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r2.setMax
            o.unit r10 = r10.equals
            o.ColorInt r10 = r10.toFloatRange
            boolean r10 = r10.toFloatRange
            if (r10 != 0) goto L_0x00ca
            return
        L_0x00b6:
            int r10 = r2.length
            if (r10 != r12) goto L_0x00c3
            if (r9 != 0) goto L_0x00c3
            o.ColorInt r7 = r2.toFloatRange
            int r11 = r7.hashCode
            int r15 = r15 + 1
            goto L_0x00c9
        L_0x00c3:
            o.ColorInt r10 = r2.toFloatRange
            boolean r10 = r10.toFloatRange
            if (r10 == 0) goto L_0x00ca
        L_0x00c9:
            r7 = 1
        L_0x00ca:
            if (r7 != 0) goto L_0x00de
            int r15 = r15 + 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r2.setMax
            float[] r7 = r7.IconCompatParcelizer
            int r10 = r0.toIntRange
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00df
            float r17 = r17 + r7
            goto L_0x00df
        L_0x00de:
            int r14 = r14 + r11
        L_0x00df:
            if (r13 >= r8) goto L_0x00e9
            if (r13 >= r6) goto L_0x00e9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.FastBitmap$CoordinateSystem
            int r2 = r2.equals
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00e9:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006e
        L_0x00f0:
            if (r14 < r3) goto L_0x00fa
            if (r15 == 0) goto L_0x00fa
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0063
        L_0x00fa:
            r2 = r16
            goto L_0x0102
        L_0x00fd:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0102:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.hashCode
            int r7 = r7.isInside
            if (r1 == 0) goto L_0x010c
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.FastBitmap$CoordinateSystem
            int r7 = r7.isInside
        L_0x010c:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0123
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x011c
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x0123
        L_0x011c:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x0123:
            if (r15 <= 0) goto L_0x0228
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0130:
            if (r13 >= r4) goto L_0x01e0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r12 = r0.getMin
            java.lang.Object r12 = r12.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r12 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r12
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r12.setMax
            int r9 = r9.areNotificationsEnabled
            r18 = r11
            r11 = 8
            if (r9 == r11) goto L_0x01cb
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r12.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01cb
            o.ColorInt r9 = r12.toFloatRange
            boolean r9 = r9.toFloatRange
            if (r9 != 0) goto L_0x01cb
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0166
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r12.setMax
            float[] r11 = r11.IconCompatParcelizer
            int r9 = r0.toIntRange
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L_0x0168
        L_0x0166:
            r9 = r18
        L_0x0168:
            int r11 = r0.toIntRange
            if (r11 != 0) goto L_0x0199
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r12.setMax
            int r11 = r11.Grayscale$Algorithm
            r19 = r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r12.setMax
            int r10 = r10.invokeSuspend
            r20 = r14
            int r14 = r12.length
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x0188
            o.ColorInt r7 = r12.toFloatRange
            int r7 = r7.hashCode
            int r7 = java.lang.Math.min(r9, r7)
            goto L_0x0189
        L_0x0188:
            r7 = r9
        L_0x0189:
            int r7 = java.lang.Math.max(r10, r7)
            if (r11 <= 0) goto L_0x0193
            int r7 = java.lang.Math.min(r11, r7)
        L_0x0193:
            if (r7 == r9) goto L_0x01c5
            int r16 = r16 + 1
            r9 = r7
            goto L_0x01c5
        L_0x0199:
            r21 = r7
            r19 = r10
            r20 = r14
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r12.setMax
            int r7 = r7.getCause
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r12.setMax
            int r10 = r10.onNavigationEvent
            int r11 = r12.length
            r14 = 1
            if (r11 != r14) goto L_0x01b5
            o.ColorInt r11 = r12.toFloatRange
            int r11 = r11.hashCode
            int r11 = java.lang.Math.min(r9, r11)
            goto L_0x01b6
        L_0x01b5:
            r11 = r9
        L_0x01b6:
            int r10 = java.lang.Math.max(r10, r11)
            if (r7 <= 0) goto L_0x01c0
            int r10 = java.lang.Math.min(r7, r10)
        L_0x01c0:
            if (r10 == r9) goto L_0x01c5
            int r16 = r16 + 1
            r9 = r10
        L_0x01c5:
            o.ColorInt r7 = r12.toFloatRange
            r7.getMin(r9)
            goto L_0x01d1
        L_0x01cb:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d1:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0130
        L_0x01e0:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x0219
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01ea:
            if (r7 >= r4) goto L_0x0217
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.getMin
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r10.setMax
            int r11 = r11.areNotificationsEnabled
            r12 = 8
            if (r11 == r12) goto L_0x0214
            if (r7 <= 0) goto L_0x0205
            if (r7 < r5) goto L_0x0205
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r11 = r10.hashCode
            int r11 = r11.equals
            int r9 = r9 + r11
        L_0x0205:
            o.ColorInt r11 = r10.toFloatRange
            int r11 = r11.isInside
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x0214
            if (r7 >= r6) goto L_0x0214
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.FastBitmap$CoordinateSystem
            int r10 = r10.equals
            int r10 = -r10
            int r9 = r9 + r10
        L_0x0214:
            int r7 = r7 + 1
            goto L_0x01ea
        L_0x0217:
            r14 = r9
            goto L_0x021b
        L_0x0219:
            r14 = r20
        L_0x021b:
            int r7 = r0.getMax
            r9 = 2
            if (r7 != r9) goto L_0x0226
            if (r16 != 0) goto L_0x0226
            r7 = 0
            r0.getMax = r7
            goto L_0x022e
        L_0x0226:
            r7 = 0
            goto L_0x022e
        L_0x0228:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x022e:
            if (r14 <= r3) goto L_0x0232
            r0.getMax = r9
        L_0x0232:
            if (r2 <= 0) goto L_0x023a
            if (r15 != 0) goto L_0x023a
            if (r5 != r6) goto L_0x023a
            r0.getMax = r9
        L_0x023a:
            int r9 = r0.getMax
            r10 = 1
            if (r9 != r10) goto L_0x02dc
            if (r2 <= r10) goto L_0x0245
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L_0x024c
        L_0x0245:
            if (r2 != r10) goto L_0x024b
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x024c
        L_0x024b:
            r3 = 0
        L_0x024c:
            if (r15 <= 0) goto L_0x024f
            r3 = 0
        L_0x024f:
            r7 = r21
            r2 = 0
        L_0x0252:
            if (r2 >= r4) goto L_0x02db
            if (r1 == 0) goto L_0x025b
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x025c
        L_0x025b:
            r9 = r2
        L_0x025c:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.getMin
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r9.setMax
            int r10 = r10.areNotificationsEnabled
            r11 = 8
            if (r10 != r11) goto L_0x0277
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            r9.getMin(r7)
            goto L_0x02d7
        L_0x0277:
            if (r2 <= 0) goto L_0x027e
            if (r1 == 0) goto L_0x027d
            int r7 = r7 - r3
            goto L_0x027e
        L_0x027d:
            int r7 = r7 + r3
        L_0x027e:
            if (r2 <= 0) goto L_0x028f
            if (r2 < r5) goto L_0x028f
            if (r1 == 0) goto L_0x028a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            int r10 = r10.equals
            int r7 = r7 - r10
            goto L_0x028f
        L_0x028a:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            int r10 = r10.equals
            int r7 = r7 + r10
        L_0x028f:
            if (r1 == 0) goto L_0x0297
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.FastBitmap$CoordinateSystem
            r10.getMin(r7)
            goto L_0x029c
        L_0x0297:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
        L_0x029c:
            o.ColorInt r10 = r9.toFloatRange
            int r10 = r10.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02af
            int r11 = r9.length
            r12 = 1
            if (r11 != r12) goto L_0x02af
            o.ColorInt r10 = r9.toFloatRange
            int r10 = r10.hashCode
        L_0x02af:
            if (r1 == 0) goto L_0x02b3
            int r7 = r7 - r10
            goto L_0x02b4
        L_0x02b3:
            int r7 = r7 + r10
        L_0x02b4:
            if (r1 == 0) goto L_0x02bc
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
            goto L_0x02c1
        L_0x02bc:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.FastBitmap$CoordinateSystem
            r10.getMin(r7)
        L_0x02c1:
            r10 = 1
            r9.IsOverlapping = r10
            if (r2 >= r8) goto L_0x02d7
            if (r2 >= r6) goto L_0x02d7
            if (r1 == 0) goto L_0x02d1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            int r9 = r9.equals
            int r9 = -r9
            int r7 = r7 - r9
            goto L_0x02d7
        L_0x02d1:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            int r9 = r9.equals
            int r9 = -r9
            int r7 = r7 + r9
        L_0x02d7:
            int r2 = r2 + 1
            goto L_0x0252
        L_0x02db:
            return
        L_0x02dc:
            if (r9 != 0) goto L_0x0371
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L_0x02e5
            r3 = 0
        L_0x02e5:
            r7 = r21
            r2 = 0
        L_0x02e8:
            if (r2 >= r4) goto L_0x0370
            if (r1 == 0) goto L_0x02f1
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x02f2
        L_0x02f1:
            r9 = r2
        L_0x02f2:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r0.getMin
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r9.setMax
            int r10 = r10.areNotificationsEnabled
            r11 = 8
            if (r10 != r11) goto L_0x030d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            r9.getMin(r7)
            goto L_0x036c
        L_0x030d:
            if (r1 == 0) goto L_0x0311
            int r7 = r7 - r3
            goto L_0x0312
        L_0x0311:
            int r7 = r7 + r3
        L_0x0312:
            if (r2 <= 0) goto L_0x0323
            if (r2 < r5) goto L_0x0323
            if (r1 == 0) goto L_0x031e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            int r10 = r10.equals
            int r7 = r7 - r10
            goto L_0x0323
        L_0x031e:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            int r10 = r10.equals
            int r7 = r7 + r10
        L_0x0323:
            if (r1 == 0) goto L_0x032b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.FastBitmap$CoordinateSystem
            r10.getMin(r7)
            goto L_0x0330
        L_0x032b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
        L_0x0330:
            o.ColorInt r10 = r9.toFloatRange
            int r10 = r10.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0347
            int r11 = r9.length
            r12 = 1
            if (r11 != r12) goto L_0x0347
            o.ColorInt r11 = r9.toFloatRange
            int r11 = r11.hashCode
            int r10 = java.lang.Math.min(r10, r11)
        L_0x0347:
            if (r1 == 0) goto L_0x034b
            int r7 = r7 - r10
            goto L_0x034c
        L_0x034b:
            int r7 = r7 + r10
        L_0x034c:
            if (r1 == 0) goto L_0x0354
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.hashCode
            r10.getMin(r7)
            goto L_0x0359
        L_0x0354:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r9.FastBitmap$CoordinateSystem
            r10.getMin(r7)
        L_0x0359:
            if (r2 >= r8) goto L_0x036c
            if (r2 >= r6) goto L_0x036c
            if (r1 == 0) goto L_0x0366
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            int r9 = r9.equals
            int r9 = -r9
            int r7 = r7 - r9
            goto L_0x036c
        L_0x0366:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r9.FastBitmap$CoordinateSystem
            int r9 = r9.equals
            int r9 = -r9
            int r7 = r7 + r9
        L_0x036c:
            int r2 = r2 + 1
            goto L_0x02e8
        L_0x0370:
            return
        L_0x0371:
            r2 = 2
            if (r9 != r2) goto L_0x041f
            int r2 = r0.toIntRange
            if (r2 != 0) goto L_0x037d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.setMax
            float r2 = r2.ITrustedWebActivityCallback$Default
            goto L_0x0381
        L_0x037d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.setMax
            float r2 = r2.ITrustedWebActivityCallback$Stub
        L_0x0381:
            if (r1 == 0) goto L_0x0387
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x0387:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0393
            if (r15 <= 0) goto L_0x0394
        L_0x0393:
            r2 = 0
        L_0x0394:
            if (r1 == 0) goto L_0x0399
            int r2 = r21 - r2
            goto L_0x039b
        L_0x0399:
            int r2 = r21 + r2
        L_0x039b:
            r3 = r2
            r2 = 0
        L_0x039d:
            if (r2 >= r4) goto L_0x041f
            if (r1 == 0) goto L_0x03a6
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L_0x03a7
        L_0x03a6:
            r7 = r2
        L_0x03a7:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r9 = r0.getMin
            java.lang.Object r7 = r9.get(r7)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r7.setMax
            int r9 = r9.areNotificationsEnabled
            r10 = 8
            if (r9 != r10) goto L_0x03c3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.hashCode
            r9.getMin(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.FastBitmap$CoordinateSystem
            r7.getMin(r3)
            r12 = 1
            goto L_0x041b
        L_0x03c3:
            if (r2 <= 0) goto L_0x03d4
            if (r2 < r5) goto L_0x03d4
            if (r1 == 0) goto L_0x03cf
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.hashCode
            int r9 = r9.equals
            int r3 = r3 - r9
            goto L_0x03d4
        L_0x03cf:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.hashCode
            int r9 = r9.equals
            int r3 = r3 + r9
        L_0x03d4:
            if (r1 == 0) goto L_0x03dc
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.FastBitmap$CoordinateSystem
            r9.getMin(r3)
            goto L_0x03e1
        L_0x03dc:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.hashCode
            r9.getMin(r3)
        L_0x03e1:
            o.ColorInt r9 = r7.toFloatRange
            int r9 = r9.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r7.isInside
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03f5
            int r11 = r7.length
            r12 = 1
            if (r11 != r12) goto L_0x03f6
            o.ColorInt r9 = r7.toFloatRange
            int r9 = r9.hashCode
            goto L_0x03f6
        L_0x03f5:
            r12 = 1
        L_0x03f6:
            if (r1 == 0) goto L_0x03fa
            int r3 = r3 - r9
            goto L_0x03fb
        L_0x03fa:
            int r3 = r3 + r9
        L_0x03fb:
            if (r1 == 0) goto L_0x0403
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.hashCode
            r9.getMin(r3)
            goto L_0x0408
        L_0x0403:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r7.FastBitmap$CoordinateSystem
            r9.getMin(r3)
        L_0x0408:
            if (r2 >= r8) goto L_0x041b
            if (r2 >= r6) goto L_0x041b
            if (r1 == 0) goto L_0x0415
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.FastBitmap$CoordinateSystem
            int r7 = r7.equals
            int r7 = -r7
            int r3 = r3 - r7
            goto L_0x041b
        L_0x0415:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.FastBitmap$CoordinateSystem
            int r7 = r7.equals
            int r7 = -r7
            int r3 = r3 + r7
        L_0x041b:
            int r2 = r2 + 1
            goto L_0x039d
        L_0x041f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CallSuper.getMax():void");
    }

    public final void toFloatRange() {
        for (int i = 0; i < this.getMin.size(); i++) {
            this.getMin.get(i).toFloatRange();
        }
    }

    private ConstraintWidget isInside() {
        for (int i = 0; i < this.getMin.size(); i++) {
            WidgetRun widgetRun = this.getMin.get(i);
            if (widgetRun.setMax.areNotificationsEnabled != 8) {
                return widgetRun.setMax;
            }
        }
        return null;
    }

    private ConstraintWidget values() {
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.getMin.get(size);
            if (widgetRun.setMax.areNotificationsEnabled != 8) {
                return widgetRun.setMax;
            }
        }
        return null;
    }

    public final void equals() {
        Iterator<WidgetRun> it = this.getMin.iterator();
        while (it.hasNext()) {
            it.next().equals();
        }
        int size = this.getMin.size();
        if (size > 0) {
            ConstraintWidget constraintWidget = this.getMin.get(0).setMax;
            ConstraintWidget constraintWidget2 = this.getMin.get(size - 1).setMax;
            if (this.toIntRange == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.ICustomTabsCallback$Default;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.ICustomTabsCallback$Stub$Proxy;
                DependencyNode min = getMin(constraintAnchor, 0);
                int min2 = constraintAnchor.getMin();
                ConstraintWidget isInside = isInside();
                if (isInside != null) {
                    min2 = isInside.ICustomTabsCallback$Default.getMin();
                }
                if (min != null) {
                    DependencyNode dependencyNode = this.hashCode;
                    dependencyNode.values.add(min);
                    dependencyNode.equals = min2;
                    min.FastBitmap$CoordinateSystem.add(dependencyNode);
                }
                DependencyNode min3 = getMin(constraintAnchor2, 0);
                int min4 = constraintAnchor2.getMin();
                ConstraintWidget values = values();
                if (values != null) {
                    min4 = values.ICustomTabsCallback$Stub$Proxy.getMin();
                }
                if (min3 != null) {
                    DependencyNode dependencyNode2 = this.FastBitmap$CoordinateSystem;
                    dependencyNode2.values.add(min3);
                    dependencyNode2.equals = -min4;
                    min3.FastBitmap$CoordinateSystem.add(dependencyNode2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.setDefaultImpl;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.getInterfaceDescriptor;
                DependencyNode min5 = getMin(constraintAnchor3, 1);
                int min6 = constraintAnchor3.getMin();
                ConstraintWidget isInside2 = isInside();
                if (isInside2 != null) {
                    min6 = isInside2.setDefaultImpl.getMin();
                }
                if (min5 != null) {
                    DependencyNode dependencyNode3 = this.hashCode;
                    dependencyNode3.values.add(min5);
                    dependencyNode3.equals = min6;
                    min5.FastBitmap$CoordinateSystem.add(dependencyNode3);
                }
                DependencyNode min7 = getMin(constraintAnchor4, 1);
                int min8 = constraintAnchor4.getMin();
                ConstraintWidget values2 = values();
                if (values2 != null) {
                    min8 = values2.getInterfaceDescriptor.getMin();
                }
                if (min7 != null) {
                    DependencyNode dependencyNode4 = this.FastBitmap$CoordinateSystem;
                    dependencyNode4.values.add(min7);
                    dependencyNode4.equals = -min8;
                    min7.FastBitmap$CoordinateSystem.add(dependencyNode4);
                }
            }
            this.hashCode.length = this;
            this.FastBitmap$CoordinateSystem.length = this;
        }
    }
}
