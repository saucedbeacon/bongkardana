package o;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable extends AnyThread {
    boolean getMin = false;
    public boolean length = true;
    public int setMax = 0;
    public int setMin = 0;

    public final boolean getMax() {
        return true;
    }

    public final boolean length() {
        return this.length;
    }

    public final boolean getMin() {
        return this.getMin;
    }

    public final boolean setMin() {
        return this.getMin;
    }

    public final void setMax(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.setMax(constraintWidget, hashMap);
        OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable = (OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget;
        this.setMin = onBackPressedDispatcher$LifecycleOnBackPressedCancellable.setMin;
        this.length = onBackPressedDispatcher$LifecycleOnBackPressedCancellable.length;
        this.setMax = onBackPressedDispatcher$LifecycleOnBackPressedCancellable.setMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Barrier] ");
        sb.append(this.ITrustedWebActivityService);
        sb.append(" {");
        String obj = sb.toString();
        for (int i = 0; i < this.onSessionDestroyed; i++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i];
            if (i > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(", ");
                obj = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(constraintWidget.ITrustedWebActivityService);
            obj = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj);
        sb4.append("}");
        return sb4.toString();
    }

    /* access modifiers changed from: protected */
    public final void setMax() {
        for (int i = 0; i < this.onSessionDestroyed; i++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i];
            int i2 = this.setMin;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.length(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.length(1, true);
            }
        }
    }

    public final void setMin(reportFullyDrawn reportfullydrawn, boolean z) {
        boolean z2;
        int i;
        int i2;
        this.newSession[0] = this.ICustomTabsCallback$Default;
        this.newSession[2] = this.setDefaultImpl;
        this.newSession[1] = this.ICustomTabsCallback$Stub$Proxy;
        this.newSession[3] = this.getInterfaceDescriptor;
        for (int i3 = 0; i3 < this.newSession.length; i3++) {
            this.newSession[i3].IsOverlapping = reportfullydrawn.getMin((Object) this.newSession[i3]);
        }
        int i4 = this.setMin;
        if (i4 >= 0 && i4 < 4) {
            ConstraintAnchor constraintAnchor = this.newSession[this.setMin];
            if (!this.getMin) {
                toFloatRange();
            }
            if (this.getMin) {
                this.getMin = false;
                int i5 = this.setMin;
                if (i5 == 0 || i5 == 1) {
                    reportfullydrawn.setMin(this.ICustomTabsCallback$Default.IsOverlapping, this.ICustomTabsService$Stub$Proxy);
                    reportfullydrawn.setMin(this.ICustomTabsCallback$Stub$Proxy.IsOverlapping, this.ICustomTabsService$Stub$Proxy);
                } else if (i5 == 2 || i5 == 3) {
                    reportfullydrawn.setMin(this.setDefaultImpl.IsOverlapping, this.ICustomTabsService$Stub);
                    reportfullydrawn.setMin(this.getInterfaceDescriptor.IsOverlapping, this.ICustomTabsService$Stub);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.onSessionDestroyed) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i6];
                    if ((this.length || constraintWidget.getMax()) && ((((i = this.setMin) == 0 || i == 1) && constraintWidget.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.ICustomTabsCallback$Default.toIntRange != null && constraintWidget.ICustomTabsCallback$Stub$Proxy.toIntRange != null) || (((i2 = this.setMin) == 2 || i2 == 3) && constraintWidget.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.setDefaultImpl.toIntRange != null && constraintWidget.getInterfaceDescriptor.toIntRange != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                z2 = true;
                boolean z3 = this.ICustomTabsCallback$Default.length() || this.ICustomTabsCallback$Stub$Proxy.length();
                boolean z4 = this.setDefaultImpl.length() || this.getInterfaceDescriptor.length();
                boolean z5 = !z2 && ((this.setMin == 0 && z3) || ((this.setMin == 2 && z4) || ((this.setMin == 1 && z3) || (this.setMin == 3 && z4))));
                int i7 = 5;
                if (!z5) {
                    i7 = 4;
                }
                for (int i8 = 0; i8 < this.onSessionDestroyed; i8++) {
                    ConstraintWidget constraintWidget2 = this.onPlaybackStateChanged[i8];
                    if (this.length || constraintWidget2.getMax()) {
                        SolverVariable min = reportfullydrawn.getMin((Object) constraintWidget2.newSession[this.setMin]);
                        constraintWidget2.newSession[this.setMin].IsOverlapping = min;
                        int i9 = (constraintWidget2.newSession[this.setMin].toIntRange == null || constraintWidget2.newSession[this.setMin].toIntRange.setMax != this) ? 0 : constraintWidget2.newSession[this.setMin].equals + 0;
                        int i10 = this.setMin;
                        if (i10 == 0 || i10 == 2) {
                            registerForActivityResult length2 = reportfullydrawn.length();
                            SolverVariable max = reportfullydrawn.setMax();
                            max.setMax = 0;
                            length2.setMin(constraintAnchor.IsOverlapping, min, max, this.setMax - i9);
                            reportfullydrawn.getMin(length2);
                        } else {
                            registerForActivityResult length3 = reportfullydrawn.length();
                            SolverVariable max2 = reportfullydrawn.setMax();
                            max2.setMax = 0;
                            length3.length(constraintAnchor.IsOverlapping, min, max2, this.setMax + i9);
                            reportfullydrawn.getMin(length3);
                        }
                        reportfullydrawn.getMax(constraintAnchor.IsOverlapping, min, this.setMax + i9, i7);
                    }
                }
                int i11 = this.setMin;
                if (i11 == 0) {
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Stub$Proxy.IsOverlapping, this.ICustomTabsCallback$Default.IsOverlapping, 0, 8);
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Default.IsOverlapping, this.requestPostMessageChannel.ICustomTabsCallback$Stub$Proxy.IsOverlapping, 0, 4);
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Default.IsOverlapping, this.requestPostMessageChannel.ICustomTabsCallback$Default.IsOverlapping, 0, 0);
                } else if (i11 == 1) {
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Default.IsOverlapping, this.ICustomTabsCallback$Stub$Proxy.IsOverlapping, 0, 8);
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Default.IsOverlapping, this.requestPostMessageChannel.ICustomTabsCallback$Default.IsOverlapping, 0, 4);
                    reportfullydrawn.getMax(this.ICustomTabsCallback$Default.IsOverlapping, this.requestPostMessageChannel.ICustomTabsCallback$Stub$Proxy.IsOverlapping, 0, 0);
                } else if (i11 == 2) {
                    reportfullydrawn.getMax(this.getInterfaceDescriptor.IsOverlapping, this.setDefaultImpl.IsOverlapping, 0, 8);
                    reportfullydrawn.getMax(this.setDefaultImpl.IsOverlapping, this.requestPostMessageChannel.getInterfaceDescriptor.IsOverlapping, 0, 4);
                    reportfullydrawn.getMax(this.setDefaultImpl.IsOverlapping, this.requestPostMessageChannel.setDefaultImpl.IsOverlapping, 0, 0);
                } else if (i11 == 3) {
                    reportfullydrawn.getMax(this.setDefaultImpl.IsOverlapping, this.getInterfaceDescriptor.IsOverlapping, 0, 8);
                    reportfullydrawn.getMax(this.setDefaultImpl.IsOverlapping, this.requestPostMessageChannel.setDefaultImpl.IsOverlapping, 0, 4);
                    reportfullydrawn.getMax(this.setDefaultImpl.IsOverlapping, this.requestPostMessageChannel.getInterfaceDescriptor.IsOverlapping, 0, 0);
                }
            }
        }
    }

    public final int isInside() {
        int i = this.setMin;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean toFloatRange() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = true;
        for (int i7 = 0; i7 < this.onSessionDestroyed; i7++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i7];
            if ((this.length || constraintWidget.getMax()) && ((((i5 = this.setMin) == 0 || i5 == 1) && !constraintWidget.getMin()) || (((i6 = this.setMin) == 2 || i6 == 3) && !constraintWidget.setMin()))) {
                z = false;
            }
        }
        if (!z || this.onSessionDestroyed <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z2 = false;
        for (int i9 = 0; i9 < this.onSessionDestroyed; i9++) {
            ConstraintWidget constraintWidget2 = this.onPlaybackStateChanged[i9];
            if (this.length || constraintWidget2.getMax()) {
                if (!z2) {
                    int i10 = this.setMin;
                    if (i10 == 0) {
                        ConstraintAnchor max = constraintWidget2.setMax(ConstraintAnchor.Type.LEFT);
                        if (max.setMin) {
                            i8 = max.getMin;
                            z2 = true;
                        }
                    } else if (i10 == 1) {
                        ConstraintAnchor max2 = constraintWidget2.setMax(ConstraintAnchor.Type.RIGHT);
                        if (max2.setMin) {
                            i8 = max2.getMin;
                            z2 = true;
                        }
                    } else if (i10 == 2) {
                        ConstraintAnchor max3 = constraintWidget2.setMax(ConstraintAnchor.Type.TOP);
                        if (max3.setMin) {
                            i8 = max3.getMin;
                            z2 = true;
                        }
                    } else {
                        if (i10 == 3) {
                            ConstraintAnchor max4 = constraintWidget2.setMax(ConstraintAnchor.Type.BOTTOM);
                            if (max4.setMin) {
                                i8 = max4.getMin;
                            }
                        }
                        z2 = true;
                    }
                    i8 = 0;
                    z2 = true;
                }
                int i11 = this.setMin;
                if (i11 == 0) {
                    ConstraintAnchor max5 = constraintWidget2.setMax(ConstraintAnchor.Type.LEFT);
                    if (!max5.setMin) {
                        i4 = 0;
                    } else {
                        i4 = max5.getMin;
                    }
                    i8 = Math.min(i8, i4);
                } else if (i11 == 1) {
                    ConstraintAnchor max6 = constraintWidget2.setMax(ConstraintAnchor.Type.RIGHT);
                    if (!max6.setMin) {
                        i3 = 0;
                    } else {
                        i3 = max6.getMin;
                    }
                    i8 = Math.max(i8, i3);
                } else if (i11 == 2) {
                    ConstraintAnchor max7 = constraintWidget2.setMax(ConstraintAnchor.Type.TOP);
                    if (!max7.setMin) {
                        i2 = 0;
                    } else {
                        i2 = max7.getMin;
                    }
                    i8 = Math.min(i8, i2);
                } else if (i11 == 3) {
                    ConstraintAnchor max8 = constraintWidget2.setMax(ConstraintAnchor.Type.BOTTOM);
                    if (!max8.setMin) {
                        i = 0;
                    } else {
                        i = max8.getMin;
                    }
                    i8 = Math.max(i8, i);
                }
            }
        }
        int i12 = i8 + this.setMax;
        int i13 = this.setMin;
        if (i13 == 0 || i13 == 1) {
            getMax(i12, i12);
        } else {
            setMin(i12, i12);
        }
        this.getMin = true;
        return true;
    }
}
