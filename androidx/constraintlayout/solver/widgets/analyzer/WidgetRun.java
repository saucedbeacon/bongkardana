package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import o.ChecksSdkIntAtLeast;
import o.ColorInt;
import o.ContentView;

public abstract class WidgetRun implements ChecksSdkIntAtLeast {
    public DependencyNode FastBitmap$CoordinateSystem = new DependencyNode(this);
    public boolean IsOverlapping = false;
    public ContentView equals;
    public DependencyNode hashCode = new DependencyNode(this);
    public ConstraintWidget.DimensionBehaviour isInside;
    public int length;
    public ConstraintWidget setMax;
    public ColorInt toFloatRange = new ColorInt(this);
    public int toIntRange = 0;
    protected RunType toString = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public abstract void equals();

    public void getMax() {
    }

    /* access modifiers changed from: protected */
    public abstract void getMin();

    public abstract boolean length();

    public abstract void setMin();

    public abstract void toFloatRange();

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.setMax = constraintWidget;
    }

    protected static DependencyNode getMin(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.toIntRange == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.toIntRange.setMax;
        int i = AnonymousClass4.setMin[constraintAnchor.toIntRange.getMax.ordinal()];
        if (i == 1) {
            return constraintWidget.toFloatRange.hashCode;
        }
        if (i == 2) {
            return constraintWidget.toFloatRange.FastBitmap$CoordinateSystem;
        }
        if (i == 3) {
            return constraintWidget.equals.hashCode;
        }
        if (i == 4) {
            return constraintWidget.equals.setMin;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.equals.FastBitmap$CoordinateSystem;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final void getMin(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        int i2;
        DependencyNode min = getMin(constraintAnchor);
        DependencyNode min2 = getMin(constraintAnchor2);
        if (min.toFloatRange && min2.toFloatRange) {
            int min3 = min.isInside + constraintAnchor.getMin();
            int min4 = min2.isInside - constraintAnchor2.getMin();
            int i3 = min4 - min3;
            if (!this.toFloatRange.toFloatRange && this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                int i4 = this.length;
                if (i4 == 0) {
                    this.toFloatRange.getMin(getMin(i3, i));
                } else if (i4 == 1) {
                    this.toFloatRange.getMin(Math.min(getMin(this.toFloatRange.hashCode, i), i3));
                } else if (i4 == 2) {
                    ConstraintWidget constraintWidget = this.setMax.requestPostMessageChannel;
                    if (constraintWidget != null) {
                        WidgetRun widgetRun = i == 0 ? constraintWidget.toFloatRange : constraintWidget.equals;
                        if (widgetRun.toFloatRange.toFloatRange) {
                            ConstraintWidget constraintWidget2 = this.setMax;
                            this.toFloatRange.getMin(getMin((int) ((((float) widgetRun.toFloatRange.isInside) * (i == 0 ? constraintWidget2.ICustomTabsCallback : constraintWidget2.create)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3 && !(this.setMax.toFloatRange.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.setMax.toFloatRange.length == 3 && this.setMax.equals.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.setMax.equals.length == 3)) {
                    ConstraintWidget constraintWidget3 = this.setMax;
                    WidgetRun widgetRun2 = i == 0 ? constraintWidget3.equals : constraintWidget3.toFloatRange;
                    if (widgetRun2.toFloatRange.toFloatRange) {
                        float f2 = this.setMax.updateVisuals;
                        if (i == 1) {
                            i2 = (int) ((((float) widgetRun2.toFloatRange.isInside) / f2) + 0.5f);
                        } else {
                            i2 = (int) ((f2 * ((float) widgetRun2.toFloatRange.isInside)) + 0.5f);
                        }
                        this.toFloatRange.getMin(i2);
                    }
                }
            }
            if (this.toFloatRange.toFloatRange) {
                if (this.toFloatRange.isInside == i3) {
                    this.hashCode.getMin(min3);
                    this.FastBitmap$CoordinateSystem.getMin(min4);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.setMax;
                if (i == 0) {
                    f = constraintWidget4.ITrustedWebActivityCallback$Default;
                } else {
                    f = constraintWidget4.ITrustedWebActivityCallback$Stub;
                }
                if (min == min2) {
                    min3 = min.isInside;
                    min4 = min2.isInside;
                    f = 0.5f;
                }
                this.hashCode.getMin((int) (((float) min3) + 0.5f + (((float) ((min4 - min3) - this.toFloatRange.isInside)) * f)));
                this.FastBitmap$CoordinateSystem.getMin(this.hashCode.isInside + this.toFloatRange.isInside);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getMin(int i, int i2) {
        int i3;
        if (i2 == 0) {
            int i4 = this.setMax.Grayscale$Algorithm;
            i3 = Math.max(this.setMax.invokeSuspend, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            int i5 = this.setMax.getCause;
            int max = Math.max(this.setMax.onNavigationEvent, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    protected static DependencyNode getMin(ConstraintAnchor constraintAnchor, int i) {
        if (constraintAnchor.toIntRange == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.toIntRange.setMax;
        WidgetRun widgetRun = i == 0 ? constraintWidget.toFloatRange : constraintWidget.equals;
        int i2 = AnonymousClass4.setMin[constraintAnchor.toIntRange.getMax.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.FastBitmap$CoordinateSystem;
        }
        return widgetRun.hashCode;
    }

    /* access modifiers changed from: protected */
    public final void length(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, ColorInt colorInt) {
        dependencyNode.values.add(dependencyNode2);
        dependencyNode.values.add(this.toFloatRange);
        dependencyNode.toIntRange = i;
        dependencyNode.IsOverlapping = colorInt;
        dependencyNode2.FastBitmap$CoordinateSystem.add(dependencyNode);
        colorInt.FastBitmap$CoordinateSystem.add(dependencyNode);
    }

    public long setMax() {
        if (this.toFloatRange.toFloatRange) {
            return (long) this.toFloatRange.isInside;
        }
        return 0;
    }

    public final boolean IsOverlapping() {
        return this.IsOverlapping;
    }
}
