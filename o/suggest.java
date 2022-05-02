package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.CheckResult;

public final class suggest {
    private AnimRes IsOverlapping;
    private ArrayList<ContentView> equals = new ArrayList<>();
    public boolean getMax = true;
    public boolean getMin = true;
    private ArrayList<WidgetRun> isInside = new ArrayList<>();
    public CheckResult.getMax length = null;
    private AnimRes setMax;
    ArrayList<ContentView> setMin = new ArrayList<>();
    private CheckResult.setMax toFloatRange = new CheckResult.setMax();

    public suggest(AnimRes animRes) {
        this.setMax = animRes;
        this.IsOverlapping = animRes;
    }

    private int getMax(AnimRes animRes, int i) {
        int i2;
        long j;
        float f;
        AnimRes animRes2 = animRes;
        int i3 = i;
        int size = this.setMin.size();
        long j2 = 0;
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            ContentView contentView = this.setMin.get(i4);
            if (contentView.setMax instanceof CallSuper) {
                if (((CallSuper) contentView.setMax).toIntRange != i3) {
                    j3 = Math.max(j3, j2);
                    i4++;
                    j2 = 0;
                }
            } else if (i3 == 0) {
                if (!(contentView.setMax instanceof DimenRes)) {
                    j3 = Math.max(j3, j2);
                    i4++;
                    j2 = 0;
                }
            } else if (!(contentView.setMax instanceof unit)) {
                j3 = Math.max(j3, j2);
                i4++;
                j2 = 0;
            }
            DependencyNode dependencyNode = i3 == 0 ? animRes2.toFloatRange.hashCode : animRes2.equals.hashCode;
            DependencyNode dependencyNode2 = i3 == 0 ? animRes2.toFloatRange.FastBitmap$CoordinateSystem : animRes2.equals.FastBitmap$CoordinateSystem;
            boolean contains = contentView.setMax.hashCode.values.contains(dependencyNode);
            boolean contains2 = contentView.setMax.FastBitmap$CoordinateSystem.values.contains(dependencyNode2);
            long max = contentView.setMax.setMax();
            if (!contains || !contains2) {
                if (contains) {
                    j2 = Math.max(contentView.getMin(contentView.setMax.hashCode, (long) contentView.setMax.hashCode.equals), ((long) contentView.setMax.hashCode.equals) + max);
                } else if (contains2) {
                    j2 = Math.max(-contentView.getMax(contentView.setMax.FastBitmap$CoordinateSystem, (long) contentView.setMax.FastBitmap$CoordinateSystem.equals), ((long) (-contentView.setMax.FastBitmap$CoordinateSystem.equals)) + max);
                } else {
                    j = ((long) contentView.setMax.hashCode.equals) + contentView.setMax.setMax();
                    i2 = contentView.setMax.FastBitmap$CoordinateSystem.equals;
                }
                j3 = Math.max(j3, j2);
                i4++;
                j2 = 0;
            } else {
                long min = contentView.getMin(contentView.setMax.hashCode, j2);
                long max2 = contentView.getMax(contentView.setMax.FastBitmap$CoordinateSystem, j2);
                long j4 = min - max;
                if (j4 >= ((long) (-contentView.setMax.FastBitmap$CoordinateSystem.equals))) {
                    j4 += (long) contentView.setMax.FastBitmap$CoordinateSystem.equals;
                }
                long j5 = ((-max2) - max) - ((long) contentView.setMax.hashCode.equals);
                if (j5 >= ((long) contentView.setMax.hashCode.equals)) {
                    j5 -= (long) contentView.setMax.hashCode.equals;
                }
                ConstraintWidget constraintWidget = contentView.setMax.setMax;
                if (i3 == 0) {
                    f = constraintWidget.ITrustedWebActivityCallback$Default;
                } else if (i3 == 1) {
                    f = constraintWidget.ITrustedWebActivityCallback$Stub;
                } else {
                    f = -1.0f;
                }
                float f2 = (float) (f > 0.0f ? (long) ((((float) j5) / f) + (((float) j4) / (1.0f - f))) : 0);
                j = ((long) contentView.setMax.hashCode.equals) + ((long) ((f2 * f) + 0.5f)) + max + ((long) ((f2 * (1.0f - f)) + 0.5f));
                i2 = contentView.setMax.FastBitmap$CoordinateSystem.equals;
            }
            j2 = j - ((long) i2);
            j3 = Math.max(j3, j2);
            i4++;
            j2 = 0;
        }
        return (int) j3;
    }

    public final boolean getMin(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4 = z & true;
        if (this.getMax || this.getMin) {
            Iterator it = this.setMax.onVolumeInfoChanged.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.invoke();
                constraintWidget.getMax = false;
                constraintWidget.toFloatRange.getMin();
                constraintWidget.equals.getMin();
            }
            this.setMax.invoke();
            this.setMax.getMax = false;
            this.setMax.toFloatRange.getMin();
            this.setMax.equals.getMin();
            this.getMin = false;
        }
        length(this.IsOverlapping);
        this.setMax.length(0);
        this.setMax.setMin(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.setMax.extraCommand[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.setMax.extraCommand[1];
        if (this.getMax) {
            length();
        }
        int Mean$Arithmetic = this.setMax.Mean$Arithmetic();
        int onNavigationEvent = this.setMax.onNavigationEvent();
        this.setMax.toFloatRange.hashCode.getMin(Mean$Arithmetic);
        this.setMax.equals.hashCode.getMin(onNavigationEvent);
        getMin();
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.isInside.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().length()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                AnimRes animRes = this.setMax;
                animRes.extraCommand[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                AnimRes animRes2 = this.setMax;
                animRes2.getMax(getMax(animRes2, 0));
                ColorInt colorInt = this.setMax.toFloatRange.toFloatRange;
                AnimRes animRes3 = this.setMax;
                if (animRes3.areNotificationsEnabled == 8) {
                    i4 = 0;
                } else {
                    i4 = animRes3.requestPostMessageChannelWithExtras;
                }
                colorInt.getMin(i4);
            }
            if (z4 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                AnimRes animRes4 = this.setMax;
                animRes4.extraCommand[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                AnimRes animRes5 = this.setMax;
                animRes5.toFloatRange(getMax(animRes5, 1));
                ColorInt colorInt2 = this.setMax.equals.toFloatRange;
                AnimRes animRes6 = this.setMax;
                if (animRes6.areNotificationsEnabled == 8) {
                    i3 = 0;
                } else {
                    i3 = animRes6.postMessage;
                }
                colorInt2.getMin(i3);
            }
        }
        if (this.setMax.extraCommand[0] == ConstraintWidget.DimensionBehaviour.FIXED || this.setMax.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            AnimRes animRes7 = this.setMax;
            if (animRes7.areNotificationsEnabled == 8) {
                i = 0;
            } else {
                i = animRes7.requestPostMessageChannelWithExtras;
            }
            int i5 = i + Mean$Arithmetic;
            this.setMax.toFloatRange.FastBitmap$CoordinateSystem.getMin(i5);
            this.setMax.toFloatRange.toFloatRange.getMin(i5 - Mean$Arithmetic);
            getMin();
            if (this.setMax.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED || this.setMax.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                AnimRes animRes8 = this.setMax;
                if (animRes8.areNotificationsEnabled == 8) {
                    i2 = 0;
                } else {
                    i2 = animRes8.postMessage;
                }
                int i6 = i2 + onNavigationEvent;
                this.setMax.equals.FastBitmap$CoordinateSystem.getMin(i6);
                this.setMax.equals.toFloatRange.getMin(i6 - onNavigationEvent);
            }
            getMin();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.isInside.iterator();
        while (it3.hasNext()) {
            WidgetRun next = it3.next();
            if (next.setMax != this.setMax || next.IsOverlapping) {
                next.toFloatRange();
            }
        }
        Iterator<WidgetRun> it4 = this.isInside.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = true;
                break;
            }
            WidgetRun next2 = it4.next();
            if ((z2 || next2.setMax != this.setMax) && (!next2.hashCode.toFloatRange || ((!next2.FastBitmap$CoordinateSystem.toFloatRange && !(next2 instanceof parameter)) || (!next2.toFloatRange.toFloatRange && !(next2 instanceof CallSuper) && !(next2 instanceof parameter))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.setMax.extraCommand[0] = dimensionBehaviour;
        this.setMax.extraCommand[1] = dimensionBehaviour2;
        return z3;
    }

    public final boolean getMax() {
        if (this.getMax) {
            Iterator it = this.setMax.onVolumeInfoChanged.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.invoke();
                constraintWidget.getMax = false;
                constraintWidget.toFloatRange.toFloatRange.toFloatRange = false;
                constraintWidget.toFloatRange.IsOverlapping = false;
                constraintWidget.toFloatRange.getMin();
                constraintWidget.equals.toFloatRange.toFloatRange = false;
                constraintWidget.equals.IsOverlapping = false;
                constraintWidget.equals.getMin();
            }
            this.setMax.invoke();
            this.setMax.getMax = false;
            this.setMax.toFloatRange.toFloatRange.toFloatRange = false;
            this.setMax.toFloatRange.IsOverlapping = false;
            this.setMax.toFloatRange.getMin();
            this.setMax.equals.toFloatRange.toFloatRange = false;
            this.setMax.equals.IsOverlapping = false;
            this.setMax.equals.getMin();
            length();
        }
        length(this.IsOverlapping);
        this.setMax.length(0);
        this.setMax.setMin(0);
        this.setMax.toFloatRange.hashCode.getMin(0);
        this.setMax.equals.hashCode.getMin(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0165 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean length(boolean r11, int r12) {
        /*
            r10 = this;
            r0 = 1
            r11 = r11 & r0
            o.AnimRes r1 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.extraCommand
            r2 = 0
            r1 = r1[r2]
            o.AnimRes r3 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r3.extraCommand
            r3 = r3[r0]
            o.AnimRes r4 = r10.setMax
            int r4 = r4.Mean$Arithmetic()
            o.AnimRes r5 = r10.setMax
            int r5 = r5.onNavigationEvent()
            r6 = 8
            if (r11 == 0) goto L_0x009b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r7) goto L_0x0027
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r7) goto L_0x009b
        L_0x0027:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r10.isInside
            java.util.Iterator r7 = r7.iterator()
        L_0x002d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0044
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            int r9 = r8.toIntRange
            if (r9 != r12) goto L_0x002d
            boolean r8 = r8.length()
            if (r8 != 0) goto L_0x002d
            r11 = 0
        L_0x0044:
            if (r12 != 0) goto L_0x0071
            if (r11 == 0) goto L_0x009b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r11) goto L_0x009b
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11[r2] = r7
            o.AnimRes r11 = r10.setMax
            int r7 = r10.getMax(r11, r2)
            r11.getMax((int) r7)
            o.AnimRes r11 = r10.setMax
            o.DimenRes r11 = r11.toFloatRange
            o.ColorInt r11 = r11.toFloatRange
            o.AnimRes r7 = r10.setMax
            int r8 = r7.areNotificationsEnabled
            if (r8 != r6) goto L_0x006b
            r7 = 0
            goto L_0x006d
        L_0x006b:
            int r7 = r7.requestPostMessageChannelWithExtras
        L_0x006d:
            r11.getMin(r7)
            goto L_0x009b
        L_0x0071:
            if (r11 == 0) goto L_0x009b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r11) goto L_0x009b
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11[r0] = r7
            o.AnimRes r11 = r10.setMax
            int r7 = r10.getMax(r11, r0)
            r11.toFloatRange(r7)
            o.AnimRes r11 = r10.setMax
            o.unit r11 = r11.equals
            o.ColorInt r11 = r11.toFloatRange
            o.AnimRes r7 = r10.setMax
            int r8 = r7.areNotificationsEnabled
            if (r8 != r6) goto L_0x0096
            r7 = 0
            goto L_0x0098
        L_0x0096:
            int r7 = r7.postMessage
        L_0x0098:
            r11.getMin(r7)
        L_0x009b:
            if (r12 != 0) goto L_0x00d0
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11 = r11[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 == r5) goto L_0x00b1
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11 = r11[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r11 != r5) goto L_0x00e5
        L_0x00b1:
            o.AnimRes r11 = r10.setMax
            int r5 = r11.areNotificationsEnabled
            if (r5 != r6) goto L_0x00b9
            r11 = 0
            goto L_0x00bb
        L_0x00b9:
            int r11 = r11.requestPostMessageChannelWithExtras
        L_0x00bb:
            int r11 = r11 + r4
            o.AnimRes r5 = r10.setMax
            o.DimenRes r5 = r5.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.FastBitmap$CoordinateSystem
            r5.getMin(r11)
            o.AnimRes r5 = r10.setMax
            o.DimenRes r5 = r5.toFloatRange
            o.ColorInt r5 = r5.toFloatRange
            int r11 = r11 - r4
            r5.getMin(r11)
            goto L_0x0105
        L_0x00d0:
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11 = r11[r0]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 == r4) goto L_0x00e7
            o.AnimRes r11 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r11.extraCommand
            r11 = r11[r0]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r11 != r4) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = 0
            goto L_0x0106
        L_0x00e7:
            o.AnimRes r11 = r10.setMax
            int r4 = r11.areNotificationsEnabled
            if (r4 != r6) goto L_0x00ef
            r11 = 0
            goto L_0x00f1
        L_0x00ef:
            int r11 = r11.postMessage
        L_0x00f1:
            int r11 = r11 + r5
            o.AnimRes r4 = r10.setMax
            o.unit r4 = r4.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.FastBitmap$CoordinateSystem
            r4.getMin(r11)
            o.AnimRes r4 = r10.setMax
            o.unit r4 = r4.equals
            o.ColorInt r4 = r4.toFloatRange
            int r11 = r11 - r5
            r4.getMin(r11)
        L_0x0105:
            r11 = 1
        L_0x0106:
            r10.getMin()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r10.isInside
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.toIntRange
            if (r6 != r12) goto L_0x010f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.setMax
            o.AnimRes r7 = r10.setMax
            if (r6 != r7) goto L_0x0129
            boolean r6 = r5.IsOverlapping
            if (r6 == 0) goto L_0x010f
        L_0x0129:
            r5.toFloatRange()
            goto L_0x010f
        L_0x012d:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r4 = r10.isInside
            java.util.Iterator r4 = r4.iterator()
        L_0x0133:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0165
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r5
            int r6 = r5.toIntRange
            if (r6 != r12) goto L_0x0133
            if (r11 != 0) goto L_0x014b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r5.setMax
            o.AnimRes r7 = r10.setMax
            if (r6 == r7) goto L_0x0133
        L_0x014b:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.hashCode
            boolean r6 = r6.toFloatRange
            if (r6 != 0) goto L_0x0153
        L_0x0151:
            r11 = 0
            goto L_0x0166
        L_0x0153:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r5.FastBitmap$CoordinateSystem
            boolean r6 = r6.toFloatRange
            if (r6 != 0) goto L_0x015a
            goto L_0x0151
        L_0x015a:
            boolean r6 = r5 instanceof o.CallSuper
            if (r6 != 0) goto L_0x0133
            o.ColorInt r5 = r5.toFloatRange
            boolean r5 = r5.toFloatRange
            if (r5 != 0) goto L_0x0133
            goto L_0x0151
        L_0x0165:
            r11 = 1
        L_0x0166:
            o.AnimRes r12 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r12.extraCommand
            r12[r2] = r1
            o.AnimRes r12 = r10.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r12.extraCommand
            r12[r0] = r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.suggest.length(boolean, int):boolean");
    }

    private void getMax(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        this.toFloatRange.getMin = dimensionBehaviour;
        this.toFloatRange.setMax = dimensionBehaviour2;
        this.toFloatRange.IsOverlapping = i;
        this.toFloatRange.isInside = i2;
        this.length.setMax(constraintWidget, this.toFloatRange);
        constraintWidget.getMax(this.toFloatRange.toFloatRange);
        constraintWidget.toFloatRange(this.toFloatRange.toIntRange);
        constraintWidget.ICustomTabsCallback$Stub = this.toFloatRange.toDoubleRange;
        int i3 = this.toFloatRange.equals;
        constraintWidget.IPostMessageService$Stub = i3;
        constraintWidget.ICustomTabsCallback$Stub = i3 > 0;
    }

    private boolean length(AnimRes animRes) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Iterator it = animRes.onVolumeInfoChanged.iterator();
        while (true) {
            int i24 = 0;
            if (!it.hasNext()) {
                return false;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.extraCommand[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.extraCommand[1];
            if (constraintWidget.areNotificationsEnabled == 8) {
                constraintWidget.getMax = true;
            } else {
                if (constraintWidget.ICustomTabsCallback < 1.0f && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.Mean$Arithmetic = 2;
                }
                if (constraintWidget.create < 1.0f && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.invoke = 2;
                }
                if (constraintWidget.updateVisuals > 0.0f) {
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.Mean$Arithmetic = 3;
                    } else if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.invoke = 3;
                    } else if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.Mean$Arithmetic == 0) {
                            constraintWidget.Mean$Arithmetic = 3;
                        }
                        if (constraintWidget.invoke == 0) {
                            constraintWidget.invoke = 3;
                        }
                    }
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Mean$Arithmetic == 1 && (constraintWidget.ICustomTabsCallback$Default.toIntRange == null || constraintWidget.ICustomTabsCallback$Stub$Proxy.toIntRange == null)) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviour;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.invoke == 1 && (constraintWidget.setDefaultImpl.toIntRange == null || constraintWidget.getInterfaceDescriptor.toIntRange == null)) ? ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : dimensionBehaviour2;
                constraintWidget.toFloatRange.isInside = dimensionBehaviour3;
                constraintWidget.toFloatRange.length = constraintWidget.Mean$Arithmetic;
                constraintWidget.equals.isInside = dimensionBehaviour4;
                constraintWidget.equals.length = constraintWidget.invoke;
                if ((dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    if (constraintWidget.areNotificationsEnabled == 8) {
                        i17 = 0;
                    } else {
                        i17 = constraintWidget.requestPostMessageChannelWithExtras;
                    }
                    if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        if (animRes.areNotificationsEnabled == 8) {
                            i23 = 0;
                        } else {
                            i23 = animRes.requestPostMessageChannelWithExtras;
                        }
                        i18 = (i23 - constraintWidget.ICustomTabsCallback$Default.equals) - constraintWidget.ICustomTabsCallback$Stub$Proxy.equals;
                        dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i18 = i17;
                    }
                    if (constraintWidget.areNotificationsEnabled == 8) {
                        i19 = 0;
                    } else {
                        i19 = constraintWidget.postMessage;
                    }
                    if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        if (animRes.areNotificationsEnabled == 8) {
                            i22 = 0;
                        } else {
                            i22 = animRes.postMessage;
                        }
                        i20 = (i22 - constraintWidget.setDefaultImpl.equals) - constraintWidget.getInterfaceDescriptor.equals;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i20 = i19;
                    }
                    getMax(constraintWidget, dimensionBehaviour3, i18, dimensionBehaviour4, i20);
                    ColorInt colorInt = constraintWidget.toFloatRange.toFloatRange;
                    if (constraintWidget.areNotificationsEnabled == 8) {
                        i21 = 0;
                    } else {
                        i21 = constraintWidget.requestPostMessageChannelWithExtras;
                    }
                    colorInt.getMin(i21);
                    ColorInt colorInt2 = constraintWidget.equals.toFloatRange;
                    if (constraintWidget.areNotificationsEnabled != 8) {
                        i24 = constraintWidget.postMessage;
                    }
                    colorInt2.getMin(i24);
                    constraintWidget.getMax = true;
                } else {
                    if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.Mean$Arithmetic == 3) {
                            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i15 = 0;
                            } else {
                                i15 = constraintWidget.postMessage;
                            }
                            int i25 = (int) ((((float) i15) * constraintWidget.updateVisuals) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                            getMax(constraintWidget, dimensionBehaviour5, i25, dimensionBehaviour5, i15);
                            ColorInt colorInt3 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i16 = 0;
                            } else {
                                i16 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt3.getMin(i16);
                            ColorInt colorInt4 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt4.getMin(i24);
                            constraintWidget.getMax = true;
                        } else if (constraintWidget.Mean$Arithmetic == 1) {
                            getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            ColorInt colorInt5 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt5.hashCode = i24;
                        } else if (constraintWidget.Mean$Arithmetic == 2) {
                            if (animRes.extraCommand[0] == ConstraintWidget.DimensionBehaviour.FIXED || animRes.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                float f = constraintWidget.ICustomTabsCallback;
                                if (animRes.areNotificationsEnabled == 8) {
                                    i12 = 0;
                                } else {
                                    i12 = animRes.requestPostMessageChannelWithExtras;
                                }
                                int i26 = (int) ((f * ((float) i12)) + 0.5f);
                                if (constraintWidget.areNotificationsEnabled == 8) {
                                    i13 = 0;
                                } else {
                                    i13 = constraintWidget.postMessage;
                                }
                                getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i26, dimensionBehaviour4, i13);
                                ColorInt colorInt6 = constraintWidget.toFloatRange.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled == 8) {
                                    i14 = 0;
                                } else {
                                    i14 = constraintWidget.requestPostMessageChannelWithExtras;
                                }
                                colorInt6.getMin(i14);
                                ColorInt colorInt7 = constraintWidget.equals.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled != 8) {
                                    i24 = constraintWidget.postMessage;
                                }
                                colorInt7.getMin(i24);
                                constraintWidget.getMax = true;
                            }
                        } else if (constraintWidget.newSession[0].toIntRange == null || constraintWidget.newSession[1].toIntRange == null) {
                            getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            ColorInt colorInt8 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i11 = 0;
                            } else {
                                i11 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt8.getMin(i11);
                            ColorInt colorInt9 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt9.getMin(i24);
                            constraintWidget.getMax = true;
                        }
                    }
                    if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.invoke == 3) {
                            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i9 = 0;
                            } else {
                                i9 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            float f2 = constraintWidget.updateVisuals;
                            if (constraintWidget.onPostMessage() == -1) {
                                f2 = 1.0f / f2;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                            getMax(constraintWidget, dimensionBehaviour6, i9, dimensionBehaviour6, (int) ((((float) i9) * f2) + 0.5f));
                            ColorInt colorInt10 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i10 = 0;
                            } else {
                                i10 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt10.getMin(i10);
                            ColorInt colorInt11 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt11.getMin(i24);
                            constraintWidget.getMax = true;
                        } else if (constraintWidget.invoke == 1) {
                            getMax(constraintWidget, dimensionBehaviour3, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            ColorInt colorInt12 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt12.hashCode = i24;
                        } else if (constraintWidget.invoke == 2) {
                            if (animRes.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED || animRes.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                float f3 = constraintWidget.create;
                                if (constraintWidget.areNotificationsEnabled == 8) {
                                    i6 = 0;
                                } else {
                                    i6 = constraintWidget.requestPostMessageChannelWithExtras;
                                }
                                if (animRes.areNotificationsEnabled == 8) {
                                    i7 = 0;
                                } else {
                                    i7 = animRes.postMessage;
                                }
                                getMax(constraintWidget, dimensionBehaviour3, i6, ConstraintWidget.DimensionBehaviour.FIXED, (int) ((f3 * ((float) i7)) + 0.5f));
                                ColorInt colorInt13 = constraintWidget.toFloatRange.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled == 8) {
                                    i8 = 0;
                                } else {
                                    i8 = constraintWidget.requestPostMessageChannelWithExtras;
                                }
                                colorInt13.getMin(i8);
                                ColorInt colorInt14 = constraintWidget.equals.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled != 8) {
                                    i24 = constraintWidget.postMessage;
                                }
                                colorInt14.getMin(i24);
                                constraintWidget.getMax = true;
                            }
                        } else if (constraintWidget.newSession[2].toIntRange == null || constraintWidget.newSession[3].toIntRange == null) {
                            getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            ColorInt colorInt15 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i5 = 0;
                            } else {
                                i5 = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt15.getMin(i5);
                            ColorInt colorInt16 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt16.getMin(i24);
                            constraintWidget.getMax = true;
                        }
                    }
                    if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.Mean$Arithmetic == 1 || constraintWidget.invoke == 1) {
                            getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            ColorInt colorInt17 = constraintWidget.toFloatRange.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled == 8) {
                                i = 0;
                            } else {
                                i = constraintWidget.requestPostMessageChannelWithExtras;
                            }
                            colorInt17.hashCode = i;
                            ColorInt colorInt18 = constraintWidget.equals.toFloatRange;
                            if (constraintWidget.areNotificationsEnabled != 8) {
                                i24 = constraintWidget.postMessage;
                            }
                            colorInt18.hashCode = i24;
                        } else if (constraintWidget.invoke == 2 && constraintWidget.Mean$Arithmetic == 2) {
                            if ((animRes.extraCommand[0] == ConstraintWidget.DimensionBehaviour.FIXED || animRes.extraCommand[0] == ConstraintWidget.DimensionBehaviour.FIXED) && (animRes.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED || animRes.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                float f4 = constraintWidget.ICustomTabsCallback;
                                float f5 = constraintWidget.create;
                                if (animRes.areNotificationsEnabled == 8) {
                                    i2 = 0;
                                } else {
                                    i2 = animRes.requestPostMessageChannelWithExtras;
                                }
                                int i27 = (int) ((f4 * ((float) i2)) + 0.5f);
                                if (animRes.areNotificationsEnabled == 8) {
                                    i3 = 0;
                                } else {
                                    i3 = animRes.postMessage;
                                }
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
                                getMax(constraintWidget, dimensionBehaviour7, i27, dimensionBehaviour7, (int) ((f5 * ((float) i3)) + 0.5f));
                                ColorInt colorInt19 = constraintWidget.toFloatRange.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled == 8) {
                                    i4 = 0;
                                } else {
                                    i4 = constraintWidget.requestPostMessageChannelWithExtras;
                                }
                                colorInt19.getMin(i4);
                                ColorInt colorInt20 = constraintWidget.equals.toFloatRange;
                                if (constraintWidget.areNotificationsEnabled != 8) {
                                    i24 = constraintWidget.postMessage;
                                }
                                colorInt20.getMin(i24);
                                constraintWidget.getMax = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private void getMin() {
        Iterator it = this.setMax.onVolumeInfoChanged.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.getMax) {
                int i = 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.extraCommand[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.extraCommand[1];
                int i2 = constraintWidget.Mean$Arithmetic;
                int i3 = constraintWidget.invoke;
                boolean z = dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1);
                boolean z2 = dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i3 == 1);
                boolean z3 = constraintWidget.toFloatRange.toFloatRange.toFloatRange;
                boolean z4 = constraintWidget.equals.toFloatRange.toFloatRange;
                if (z3 && z4) {
                    getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.toFloatRange.toFloatRange.isInside, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.equals.toFloatRange.isInside);
                    constraintWidget.getMax = true;
                } else if (z3 && z2) {
                    getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.toFloatRange.toFloatRange.isInside, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.equals.toFloatRange.isInside);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ColorInt colorInt = constraintWidget.equals.toFloatRange;
                        if (constraintWidget.areNotificationsEnabled != 8) {
                            i = constraintWidget.postMessage;
                        }
                        colorInt.hashCode = i;
                    } else {
                        ColorInt colorInt2 = constraintWidget.equals.toFloatRange;
                        if (constraintWidget.areNotificationsEnabled != 8) {
                            i = constraintWidget.postMessage;
                        }
                        colorInt2.getMin(i);
                        constraintWidget.getMax = true;
                    }
                } else if (z4 && z) {
                    getMax(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.toFloatRange.toFloatRange.isInside, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.equals.toFloatRange.isInside);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ColorInt colorInt3 = constraintWidget.toFloatRange.toFloatRange;
                        if (constraintWidget.areNotificationsEnabled != 8) {
                            i = constraintWidget.requestPostMessageChannelWithExtras;
                        }
                        colorInt3.hashCode = i;
                    } else {
                        ColorInt colorInt4 = constraintWidget.toFloatRange.toFloatRange;
                        if (constraintWidget.areNotificationsEnabled != 8) {
                            i = constraintWidget.requestPostMessageChannelWithExtras;
                        }
                        colorInt4.getMin(i);
                        constraintWidget.getMax = true;
                    }
                }
                if (constraintWidget.getMax && constraintWidget.equals.getMax != null) {
                    constraintWidget.equals.getMax.getMin(constraintWidget.IPostMessageService$Stub);
                }
            }
        }
    }

    private void length() {
        getMax(this.isInside);
        this.setMin.clear();
        ContentView.getMax = 0;
        getMax(this.setMax.toFloatRange, 0, this.setMin);
        getMax(this.setMax.equals, 1, this.setMin);
        this.getMax = false;
    }

    private void getMax(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        DimenRes dimenRes = this.IsOverlapping.toFloatRange;
        HashSet hashSet = null;
        dimenRes.equals = null;
        dimenRes.hashCode.length();
        dimenRes.FastBitmap$CoordinateSystem.length();
        dimenRes.toFloatRange.length();
        dimenRes.IsOverlapping = false;
        this.IsOverlapping.equals.setMin();
        arrayList.add(this.IsOverlapping.toFloatRange);
        arrayList.add(this.IsOverlapping.equals);
        Iterator it = this.IsOverlapping.onVolumeInfoChanged.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof AnimatorRes) {
                arrayList.add(new parameter(constraintWidget));
            } else {
                if (constraintWidget.extraCallback()) {
                    if (constraintWidget.isInside == null) {
                        constraintWidget.isInside = new CallSuper(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.isInside);
                } else {
                    arrayList.add(constraintWidget.toFloatRange);
                }
                if (constraintWidget.onMessageChannelReady()) {
                    if (constraintWidget.IsOverlapping == null) {
                        constraintWidget.IsOverlapping = new CallSuper(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.IsOverlapping);
                } else {
                    arrayList.add(constraintWidget.equals);
                }
                if (constraintWidget instanceof AnyThread) {
                    arrayList.add(new lambda(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().setMin();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next = it3.next();
            if (next.setMax != this.IsOverlapping) {
                next.equals();
            }
        }
    }

    private void setMax(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<ContentView> arrayList, ContentView contentView) {
        WidgetRun widgetRun = dependencyNode.setMax;
        if (widgetRun.equals == null && widgetRun != this.setMax.toFloatRange && widgetRun != this.setMax.equals) {
            if (contentView == null) {
                contentView = new ContentView(widgetRun, i2);
                arrayList.add(contentView);
            }
            widgetRun.equals = contentView;
            contentView.toFloatRange.add(widgetRun);
            contentView.length = widgetRun;
            for (ChecksSdkIntAtLeast next : widgetRun.hashCode.FastBitmap$CoordinateSystem) {
                if (next instanceof DependencyNode) {
                    setMax((DependencyNode) next, i, 0, dependencyNode2, arrayList, contentView);
                }
            }
            for (ChecksSdkIntAtLeast next2 : widgetRun.FastBitmap$CoordinateSystem.FastBitmap$CoordinateSystem) {
                if (next2 instanceof DependencyNode) {
                    setMax((DependencyNode) next2, i, 1, dependencyNode2, arrayList, contentView);
                }
            }
            if (i == 1 && (widgetRun instanceof unit)) {
                for (ChecksSdkIntAtLeast next3 : ((unit) widgetRun).setMin.FastBitmap$CoordinateSystem) {
                    if (next3 instanceof DependencyNode) {
                        setMax((DependencyNode) next3, i, 2, dependencyNode2, arrayList, contentView);
                    }
                }
            }
            for (DependencyNode next4 : widgetRun.hashCode.values) {
                if (next4 == dependencyNode2) {
                    contentView.setMin = true;
                }
                setMax(next4, i, 0, dependencyNode2, arrayList, contentView);
            }
            for (DependencyNode next5 : widgetRun.FastBitmap$CoordinateSystem.values) {
                if (next5 == dependencyNode2) {
                    contentView.setMin = true;
                }
                setMax(next5, i, 1, dependencyNode2, arrayList, contentView);
            }
            if (i == 1 && (widgetRun instanceof unit)) {
                for (DependencyNode max : ((unit) widgetRun).setMin.values) {
                    setMax(max, i, 2, dependencyNode2, arrayList, contentView);
                }
            }
        }
    }

    private void getMax(WidgetRun widgetRun, int i, ArrayList<ContentView> arrayList) {
        for (ChecksSdkIntAtLeast next : widgetRun.hashCode.FastBitmap$CoordinateSystem) {
            if (next instanceof DependencyNode) {
                setMax((DependencyNode) next, i, 0, widgetRun.FastBitmap$CoordinateSystem, arrayList, (ContentView) null);
            } else if (next instanceof WidgetRun) {
                setMax(((WidgetRun) next).hashCode, i, 0, widgetRun.FastBitmap$CoordinateSystem, arrayList, (ContentView) null);
            }
        }
        for (ChecksSdkIntAtLeast next2 : widgetRun.FastBitmap$CoordinateSystem.FastBitmap$CoordinateSystem) {
            if (next2 instanceof DependencyNode) {
                setMax((DependencyNode) next2, i, 1, widgetRun.hashCode, arrayList, (ContentView) null);
            } else if (next2 instanceof WidgetRun) {
                setMax(((WidgetRun) next2).FastBitmap$CoordinateSystem, i, 1, widgetRun.hashCode, arrayList, (ContentView) null);
            }
        }
        if (i == 1) {
            for (ChecksSdkIntAtLeast next3 : ((unit) widgetRun).setMin.FastBitmap$CoordinateSystem) {
                if (next3 instanceof DependencyNode) {
                    setMax((DependencyNode) next3, i, 2, (DependencyNode) null, arrayList, (ContentView) null);
                }
            }
        }
    }
}
