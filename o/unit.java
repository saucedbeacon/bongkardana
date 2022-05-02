package o;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;

public final class unit extends WidgetRun {
    ColorInt getMax = null;
    public DependencyNode setMin = new DependencyNode(this);

    public unit(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.hashCode.getMin = DependencyNode.Type.TOP;
        this.FastBitmap$CoordinateSystem.getMin = DependencyNode.Type.BOTTOM;
        this.setMin.getMin = DependencyNode.Type.BASELINE;
        this.toIntRange = 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalRun ");
        sb.append(this.setMax.ITrustedWebActivityService);
        return sb.toString();
    }

    public final void setMin() {
        this.equals = null;
        this.hashCode.length();
        this.FastBitmap$CoordinateSystem.length();
        this.setMin.length();
        this.toFloatRange.length();
        this.IsOverlapping = false;
    }

    public final void getMin() {
        this.IsOverlapping = false;
        this.hashCode.length();
        this.hashCode.toFloatRange = false;
        this.FastBitmap$CoordinateSystem.length();
        this.FastBitmap$CoordinateSystem.toFloatRange = false;
        this.setMin.length();
        this.setMin.toFloatRange = false;
        this.toFloatRange.toFloatRange = false;
    }

    public final boolean length() {
        if (this.isInside != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.setMax.invoke == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o.unit$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unit.AnonymousClass4.<clinit>():void");
        }
    }

    public final void getMax() {
        int i;
        float f;
        float f2;
        float f3;
        if (AnonymousClass4.getMax[this.toString.ordinal()] != 3) {
            if (this.toFloatRange.getMax && !this.toFloatRange.toFloatRange && this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                int i2 = this.setMax.invoke;
                if (i2 == 2) {
                    ConstraintWidget constraintWidget = this.setMax.requestPostMessageChannel;
                    if (constraintWidget != null && constraintWidget.equals.toFloatRange.toFloatRange) {
                        float f4 = this.setMax.create;
                        this.toFloatRange.getMin((int) ((((float) constraintWidget.equals.toFloatRange.isInside) * f4) + 0.5f));
                    }
                } else if (i2 == 3 && this.setMax.toFloatRange.toFloatRange.toFloatRange) {
                    int onPostMessage = this.setMax.onPostMessage();
                    if (onPostMessage == -1) {
                        f3 = (float) this.setMax.toFloatRange.toFloatRange.isInside;
                        f2 = this.setMax.updateVisuals;
                    } else if (onPostMessage == 0) {
                        f = ((float) this.setMax.toFloatRange.toFloatRange.isInside) * this.setMax.updateVisuals;
                        i = (int) (f + 0.5f);
                        this.toFloatRange.getMin(i);
                    } else if (onPostMessage != 1) {
                        i = 0;
                        this.toFloatRange.getMin(i);
                    } else {
                        f3 = (float) this.setMax.toFloatRange.toFloatRange.isInside;
                        f2 = this.setMax.updateVisuals;
                    }
                    f = f3 / f2;
                    i = (int) (f + 0.5f);
                    this.toFloatRange.getMin(i);
                }
            }
            if (this.hashCode.getMax && this.FastBitmap$CoordinateSystem.getMax) {
                if (this.hashCode.toFloatRange && this.FastBitmap$CoordinateSystem.toFloatRange && this.toFloatRange.toFloatRange) {
                    return;
                }
                if (this.toFloatRange.toFloatRange || this.isInside != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.setMax.Mean$Arithmetic != 0 || this.setMax.onMessageChannelReady()) {
                    if (!this.toFloatRange.toFloatRange && this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.length == 1 && this.hashCode.values.size() > 0 && this.FastBitmap$CoordinateSystem.values.size() > 0) {
                        int i3 = (this.FastBitmap$CoordinateSystem.values.get(0).isInside + this.FastBitmap$CoordinateSystem.equals) - (this.hashCode.values.get(0).isInside + this.hashCode.equals);
                        if (i3 < this.toFloatRange.hashCode) {
                            this.toFloatRange.getMin(i3);
                        } else {
                            this.toFloatRange.getMin(this.toFloatRange.hashCode);
                        }
                    }
                    if (this.toFloatRange.toFloatRange && this.hashCode.values.size() > 0 && this.FastBitmap$CoordinateSystem.values.size() > 0) {
                        DependencyNode dependencyNode = this.hashCode.values.get(0);
                        DependencyNode dependencyNode2 = this.FastBitmap$CoordinateSystem.values.get(0);
                        int i4 = dependencyNode.isInside + this.hashCode.equals;
                        int i5 = dependencyNode2.isInside + this.FastBitmap$CoordinateSystem.equals;
                        float f5 = this.setMax.ITrustedWebActivityCallback$Stub;
                        if (dependencyNode == dependencyNode2) {
                            i4 = dependencyNode.isInside;
                            i5 = dependencyNode2.isInside;
                            f5 = 0.5f;
                        }
                        this.hashCode.getMin((int) (((float) i4) + 0.5f + (((float) ((i5 - i4) - this.toFloatRange.isInside)) * f5)));
                        this.FastBitmap$CoordinateSystem.getMin(this.hashCode.isInside + this.toFloatRange.isInside);
                        return;
                    }
                    return;
                }
                int i6 = this.hashCode.values.get(0).isInside + this.hashCode.equals;
                int i7 = this.FastBitmap$CoordinateSystem.values.get(0).isInside + this.FastBitmap$CoordinateSystem.equals;
                this.hashCode.getMin(i6);
                this.FastBitmap$CoordinateSystem.getMin(i7);
                this.toFloatRange.getMin(i7 - i6);
                return;
            }
            return;
        }
        getMin(this.setMax.setDefaultImpl, this.setMax.getInterfaceDescriptor, 1);
    }

    public final void equals() {
        ConstraintWidget constraintWidget;
        int i;
        ConstraintWidget constraintWidget2;
        int i2;
        int i3 = 0;
        if (this.setMax.getMax) {
            ColorInt colorInt = this.toFloatRange;
            ConstraintWidget constraintWidget3 = this.setMax;
            if (constraintWidget3.areNotificationsEnabled == 8) {
                i2 = 0;
            } else {
                i2 = constraintWidget3.postMessage;
            }
            colorInt.getMin(i2);
        }
        if (!this.toFloatRange.toFloatRange) {
            this.isInside = this.setMax.extraCommand[1];
            if (this.setMax.onRelationshipValidationResult()) {
                this.getMax = new api(this);
            }
            if (this.isInside != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = this.setMax.requestPostMessageChannel) != null && constraintWidget2.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    if (constraintWidget2.areNotificationsEnabled != 8) {
                        i3 = constraintWidget2.postMessage;
                    }
                    int min = (i3 - this.setMax.setDefaultImpl.getMin()) - this.setMax.getInterfaceDescriptor.getMin();
                    DependencyNode dependencyNode = this.hashCode;
                    DependencyNode dependencyNode2 = constraintWidget2.equals.hashCode;
                    int min2 = this.setMax.setDefaultImpl.getMin();
                    dependencyNode.values.add(dependencyNode2);
                    dependencyNode.equals = min2;
                    dependencyNode2.FastBitmap$CoordinateSystem.add(dependencyNode);
                    DependencyNode dependencyNode3 = this.FastBitmap$CoordinateSystem;
                    DependencyNode dependencyNode4 = constraintWidget2.equals.FastBitmap$CoordinateSystem;
                    dependencyNode3.values.add(dependencyNode4);
                    dependencyNode3.equals = -this.setMax.getInterfaceDescriptor.getMin();
                    dependencyNode4.FastBitmap$CoordinateSystem.add(dependencyNode3);
                    this.toFloatRange.getMin(min);
                    return;
                } else if (this.isInside == ConstraintWidget.DimensionBehaviour.FIXED) {
                    ColorInt colorInt2 = this.toFloatRange;
                    ConstraintWidget constraintWidget4 = this.setMax;
                    if (constraintWidget4.areNotificationsEnabled == 8) {
                        i = 0;
                    } else {
                        i = constraintWidget4.postMessage;
                    }
                    colorInt2.getMin(i);
                }
            }
        } else if (this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget = this.setMax.requestPostMessageChannel) != null && constraintWidget.extraCommand[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            DependencyNode dependencyNode5 = this.hashCode;
            DependencyNode dependencyNode6 = constraintWidget.equals.hashCode;
            int min3 = this.setMax.setDefaultImpl.getMin();
            dependencyNode5.values.add(dependencyNode6);
            dependencyNode5.equals = min3;
            dependencyNode6.FastBitmap$CoordinateSystem.add(dependencyNode5);
            DependencyNode dependencyNode7 = this.FastBitmap$CoordinateSystem;
            DependencyNode dependencyNode8 = constraintWidget.equals.FastBitmap$CoordinateSystem;
            dependencyNode7.values.add(dependencyNode8);
            dependencyNode7.equals = -this.setMax.getInterfaceDescriptor.getMin();
            dependencyNode8.FastBitmap$CoordinateSystem.add(dependencyNode7);
            return;
        }
        if (!this.toFloatRange.toFloatRange || !this.setMax.getMax) {
            if (this.toFloatRange.toFloatRange || this.isInside != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ColorInt colorInt3 = this.toFloatRange;
                colorInt3.FastBitmap$CoordinateSystem.add(this);
                if (colorInt3.toFloatRange) {
                    getMax();
                }
            } else {
                int i4 = this.setMax.invoke;
                if (i4 == 2) {
                    ConstraintWidget constraintWidget5 = this.setMax.requestPostMessageChannel;
                    if (constraintWidget5 != null) {
                        ColorInt colorInt4 = constraintWidget5.equals.toFloatRange;
                        this.toFloatRange.values.add(colorInt4);
                        colorInt4.FastBitmap$CoordinateSystem.add(this.toFloatRange);
                        this.toFloatRange.setMin = true;
                        this.toFloatRange.FastBitmap$CoordinateSystem.add(this.hashCode);
                        this.toFloatRange.FastBitmap$CoordinateSystem.add(this.FastBitmap$CoordinateSystem);
                    }
                } else if (i4 == 3 && !this.setMax.onMessageChannelReady() && this.setMax.Mean$Arithmetic != 3) {
                    ColorInt colorInt5 = this.setMax.toFloatRange.toFloatRange;
                    this.toFloatRange.values.add(colorInt5);
                    colorInt5.FastBitmap$CoordinateSystem.add(this.toFloatRange);
                    this.toFloatRange.setMin = true;
                    this.toFloatRange.FastBitmap$CoordinateSystem.add(this.hashCode);
                    this.toFloatRange.FastBitmap$CoordinateSystem.add(this.FastBitmap$CoordinateSystem);
                }
            }
            if (this.setMax.newSession[2].toIntRange != null && this.setMax.newSession[3].toIntRange != null) {
                if (this.setMax.onMessageChannelReady()) {
                    this.hashCode.equals = this.setMax.newSession[2].getMin();
                    this.FastBitmap$CoordinateSystem.equals = -this.setMax.newSession[3].getMin();
                } else {
                    DependencyNode min4 = getMin(this.setMax.newSession[2]);
                    DependencyNode min5 = getMin(this.setMax.newSession[3]);
                    min4.FastBitmap$CoordinateSystem.add(this);
                    if (min4.toFloatRange) {
                        getMax();
                    }
                    min5.FastBitmap$CoordinateSystem.add(this);
                    if (min5.toFloatRange) {
                        getMax();
                    }
                    this.toString = WidgetRun.RunType.CENTER;
                }
                if (this.setMax.onRelationshipValidationResult()) {
                    length(this.setMin, this.hashCode, 1, this.getMax);
                }
            } else if (this.setMax.newSession[2].toIntRange != null) {
                DependencyNode min6 = getMin(this.setMax.newSession[2]);
                if (min6 != null) {
                    DependencyNode dependencyNode9 = this.hashCode;
                    int min7 = this.setMax.newSession[2].getMin();
                    dependencyNode9.values.add(min6);
                    dependencyNode9.equals = min7;
                    min6.FastBitmap$CoordinateSystem.add(dependencyNode9);
                    length(this.FastBitmap$CoordinateSystem, this.hashCode, 1, this.toFloatRange);
                    if (this.setMax.onRelationshipValidationResult()) {
                        length(this.setMin, this.hashCode, 1, this.getMax);
                    }
                    if (this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.setMax.updateVisuals > 0.0f && this.setMax.toFloatRange.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        this.setMax.toFloatRange.toFloatRange.FastBitmap$CoordinateSystem.add(this.toFloatRange);
                        this.toFloatRange.values.add(this.setMax.toFloatRange.toFloatRange);
                        this.toFloatRange.length = this;
                    }
                }
            } else if (this.setMax.newSession[3].toIntRange != null) {
                DependencyNode min8 = getMin(this.setMax.newSession[3]);
                if (min8 != null) {
                    DependencyNode dependencyNode10 = this.FastBitmap$CoordinateSystem;
                    dependencyNode10.values.add(min8);
                    dependencyNode10.equals = -this.setMax.newSession[3].getMin();
                    min8.FastBitmap$CoordinateSystem.add(dependencyNode10);
                    length(this.hashCode, this.FastBitmap$CoordinateSystem, -1, this.toFloatRange);
                    if (this.setMax.onRelationshipValidationResult()) {
                        length(this.setMin, this.hashCode, 1, this.getMax);
                    }
                }
            } else if (this.setMax.newSession[4].toIntRange != null) {
                DependencyNode min9 = getMin(this.setMax.newSession[4]);
                if (min9 != null) {
                    DependencyNode dependencyNode11 = this.setMin;
                    dependencyNode11.values.add(min9);
                    dependencyNode11.equals = 0;
                    min9.FastBitmap$CoordinateSystem.add(dependencyNode11);
                    length(this.hashCode, this.setMin, -1, this.getMax);
                    length(this.FastBitmap$CoordinateSystem, this.hashCode, 1, this.toFloatRange);
                }
            } else if (!(this.setMax instanceof AttrRes) && this.setMax.requestPostMessageChannel != null) {
                DependencyNode dependencyNode12 = this.setMax.requestPostMessageChannel.equals.hashCode;
                DependencyNode dependencyNode13 = this.hashCode;
                int onNavigationEvent = this.setMax.onNavigationEvent();
                dependencyNode13.values.add(dependencyNode12);
                dependencyNode13.equals = onNavigationEvent;
                dependencyNode12.FastBitmap$CoordinateSystem.add(dependencyNode13);
                length(this.FastBitmap$CoordinateSystem, this.hashCode, 1, this.toFloatRange);
                if (this.setMax.onRelationshipValidationResult()) {
                    length(this.setMin, this.hashCode, 1, this.getMax);
                }
                if (this.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.setMax.updateVisuals > 0.0f && this.setMax.toFloatRange.isInside == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.setMax.toFloatRange.toFloatRange.FastBitmap$CoordinateSystem.add(this.toFloatRange);
                    this.toFloatRange.values.add(this.setMax.toFloatRange.toFloatRange);
                    this.toFloatRange.length = this;
                }
            }
            if (this.toFloatRange.values.size() == 0) {
                this.toFloatRange.getMax = true;
            }
        } else if (this.setMax.newSession[2].toIntRange != null && this.setMax.newSession[3].toIntRange != null) {
            if (this.setMax.onMessageChannelReady()) {
                this.hashCode.equals = this.setMax.newSession[2].getMin();
                this.FastBitmap$CoordinateSystem.equals = -this.setMax.newSession[3].getMin();
            } else {
                DependencyNode min10 = getMin(this.setMax.newSession[2]);
                if (min10 != null) {
                    DependencyNode dependencyNode14 = this.hashCode;
                    int min11 = this.setMax.newSession[2].getMin();
                    dependencyNode14.values.add(min10);
                    dependencyNode14.equals = min11;
                    min10.FastBitmap$CoordinateSystem.add(dependencyNode14);
                }
                DependencyNode min12 = getMin(this.setMax.newSession[3]);
                if (min12 != null) {
                    DependencyNode dependencyNode15 = this.FastBitmap$CoordinateSystem;
                    dependencyNode15.values.add(min12);
                    dependencyNode15.equals = -this.setMax.newSession[3].getMin();
                    min12.FastBitmap$CoordinateSystem.add(dependencyNode15);
                }
                this.hashCode.setMin = true;
                this.FastBitmap$CoordinateSystem.setMin = true;
            }
            if (this.setMax.onRelationshipValidationResult()) {
                DependencyNode dependencyNode16 = this.setMin;
                DependencyNode dependencyNode17 = this.hashCode;
                int i5 = this.setMax.IPostMessageService$Stub;
                dependencyNode16.values.add(dependencyNode17);
                dependencyNode16.equals = i5;
                dependencyNode17.FastBitmap$CoordinateSystem.add(dependencyNode16);
            }
        } else if (this.setMax.newSession[2].toIntRange != null) {
            DependencyNode min13 = getMin(this.setMax.newSession[2]);
            if (min13 != null) {
                DependencyNode dependencyNode18 = this.hashCode;
                int min14 = this.setMax.newSession[2].getMin();
                dependencyNode18.values.add(min13);
                dependencyNode18.equals = min14;
                min13.FastBitmap$CoordinateSystem.add(dependencyNode18);
                DependencyNode dependencyNode19 = this.FastBitmap$CoordinateSystem;
                DependencyNode dependencyNode20 = this.hashCode;
                int i6 = this.toFloatRange.isInside;
                dependencyNode19.values.add(dependencyNode20);
                dependencyNode19.equals = i6;
                dependencyNode20.FastBitmap$CoordinateSystem.add(dependencyNode19);
                if (this.setMax.onRelationshipValidationResult()) {
                    DependencyNode dependencyNode21 = this.setMin;
                    DependencyNode dependencyNode22 = this.hashCode;
                    int i7 = this.setMax.IPostMessageService$Stub;
                    dependencyNode21.values.add(dependencyNode22);
                    dependencyNode21.equals = i7;
                    dependencyNode22.FastBitmap$CoordinateSystem.add(dependencyNode21);
                }
            }
        } else if (this.setMax.newSession[3].toIntRange != null) {
            DependencyNode min15 = getMin(this.setMax.newSession[3]);
            if (min15 != null) {
                DependencyNode dependencyNode23 = this.FastBitmap$CoordinateSystem;
                dependencyNode23.values.add(min15);
                dependencyNode23.equals = -this.setMax.newSession[3].getMin();
                min15.FastBitmap$CoordinateSystem.add(dependencyNode23);
                DependencyNode dependencyNode24 = this.hashCode;
                DependencyNode dependencyNode25 = this.FastBitmap$CoordinateSystem;
                dependencyNode24.values.add(dependencyNode25);
                dependencyNode24.equals = -this.toFloatRange.isInside;
                dependencyNode25.FastBitmap$CoordinateSystem.add(dependencyNode24);
            }
            if (this.setMax.onRelationshipValidationResult()) {
                DependencyNode dependencyNode26 = this.setMin;
                DependencyNode dependencyNode27 = this.hashCode;
                int i8 = this.setMax.IPostMessageService$Stub;
                dependencyNode26.values.add(dependencyNode27);
                dependencyNode26.equals = i8;
                dependencyNode27.FastBitmap$CoordinateSystem.add(dependencyNode26);
            }
        } else if (this.setMax.newSession[4].toIntRange != null) {
            DependencyNode min16 = getMin(this.setMax.newSession[4]);
            if (min16 != null) {
                DependencyNode dependencyNode28 = this.setMin;
                dependencyNode28.values.add(min16);
                dependencyNode28.equals = 0;
                min16.FastBitmap$CoordinateSystem.add(dependencyNode28);
                DependencyNode dependencyNode29 = this.hashCode;
                DependencyNode dependencyNode30 = this.setMin;
                dependencyNode29.values.add(dependencyNode30);
                dependencyNode29.equals = -this.setMax.IPostMessageService$Stub;
                dependencyNode30.FastBitmap$CoordinateSystem.add(dependencyNode29);
                DependencyNode dependencyNode31 = this.FastBitmap$CoordinateSystem;
                DependencyNode dependencyNode32 = this.hashCode;
                int i9 = this.toFloatRange.isInside;
                dependencyNode31.values.add(dependencyNode32);
                dependencyNode31.equals = i9;
                dependencyNode32.FastBitmap$CoordinateSystem.add(dependencyNode31);
            }
        } else if (!(this.setMax instanceof AttrRes) && this.setMax.requestPostMessageChannel != null && this.setMax.setMax(ConstraintAnchor.Type.CENTER).toIntRange == null) {
            DependencyNode dependencyNode33 = this.setMax.requestPostMessageChannel.equals.hashCode;
            DependencyNode dependencyNode34 = this.hashCode;
            int onNavigationEvent2 = this.setMax.onNavigationEvent();
            dependencyNode34.values.add(dependencyNode33);
            dependencyNode34.equals = onNavigationEvent2;
            dependencyNode33.FastBitmap$CoordinateSystem.add(dependencyNode34);
            DependencyNode dependencyNode35 = this.FastBitmap$CoordinateSystem;
            DependencyNode dependencyNode36 = this.hashCode;
            int i10 = this.toFloatRange.isInside;
            dependencyNode35.values.add(dependencyNode36);
            dependencyNode35.equals = i10;
            dependencyNode36.FastBitmap$CoordinateSystem.add(dependencyNode35);
            if (this.setMax.onRelationshipValidationResult()) {
                DependencyNode dependencyNode37 = this.setMin;
                DependencyNode dependencyNode38 = this.hashCode;
                int i11 = this.setMax.IPostMessageService$Stub;
                dependencyNode37.values.add(dependencyNode38);
                dependencyNode37.equals = i11;
                dependencyNode38.FastBitmap$CoordinateSystem.add(dependencyNode37);
            }
        }
    }

    public final void toFloatRange() {
        if (this.hashCode.toFloatRange) {
            this.setMax.setMin(this.hashCode.isInside);
        }
    }
}
