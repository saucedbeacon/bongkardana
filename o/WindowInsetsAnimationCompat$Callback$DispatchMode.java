package o;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.litho.ComponentHost;

public class WindowInsetsAnimationCompat$Callback$DispatchMode {
    int IsOverlapping;
    public boolean equals;
    public computeHorizontalScrollRange getMax;
    public ViewCompat$ScrollIndicators getMin;
    @Nullable
    public pageScroll isInside;
    public Object length;
    public Object setMax;
    public isStopped setMin;
    public int toDoubleRange;
    public ComponentHost toFloatRange;
    int toIntRange;
    int values;

    public static boolean getMax(int i) {
        return (i & 2) == 2;
    }

    public static boolean setMax(int i) {
        return (i & 1) == 1;
    }

    WindowInsetsAnimationCompat$Callback$DispatchMode() {
    }

    /* access modifiers changed from: package-private */
    public final void setMax(isStopped isstopped, ComponentHost componentHost, Object obj, ViewCompat$ScrollIndicators viewCompat$ScrollIndicators, computeHorizontalScrollRange computehorizontalscrollrange, int i, int i2, int i3, pageScroll pagescroll) {
        if (this.toFloatRange != null) {
            throw new RuntimeException("Calling init() on a MountItem that has not been released!");
        } else if (isstopped != null) {
            this.setMin = isstopped;
            this.setMax = obj;
            this.toFloatRange = componentHost;
            this.toDoubleRange = i;
            this.IsOverlapping = i2;
            this.toIntRange = i3;
            this.isInside = pagescroll;
            if (viewCompat$ScrollIndicators != null) {
                if (viewCompat$ScrollIndicators.getMax.getAndIncrement() > 0) {
                    this.getMin = viewCompat$ScrollIndicators;
                } else {
                    throw new IllegalStateException("The NodeInfo being acquired wasn't correctly initialized.");
                }
            }
            if (computehorizontalscrollrange != null) {
                if (computehorizontalscrollrange.getMax.getAndIncrement() > 0) {
                    this.getMax = computehorizontalscrollrange;
                } else {
                    throw new IllegalStateException("The ViewNodeInfo being acquired wasn't correctly initialized.");
                }
            }
            Object obj2 = this.setMax;
            if (obj2 instanceof View) {
                View view = (View) obj2;
                if (view.isClickable()) {
                    this.values |= 1;
                }
                if (view.isLongClickable()) {
                    this.values |= 2;
                }
                if (view.isFocusable()) {
                    this.values |= 4;
                }
                if (view.isEnabled()) {
                    this.values |= 8;
                }
                if (view.isSelected()) {
                    this.values |= 16;
                }
            }
        } else {
            throw new RuntimeException("Calling init() on a MountItem with a null Component!");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        return this.isInside != null;
    }

    public final boolean getMin() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators;
        if (this.setMin == null || this.IsOverlapping == 2 || (viewCompat$ScrollIndicators = this.getMin) == null || !viewCompat$ScrollIndicators.isInside()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void getMax() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.getMin;
        if (viewCompat$ScrollIndicators != null) {
            viewCompat$ScrollIndicators.IsOverlapping();
            this.getMin = null;
        }
        computeHorizontalScrollRange computehorizontalscrollrange = this.getMax;
        if (computehorizontalscrollrange != null) {
            computehorizontalscrollrange.length();
            this.getMax = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax() {
        return (this.values & 1) == 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        return (this.values & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInside() {
        return (this.values & 4) == 4;
    }

    /* access modifiers changed from: package-private */
    public final boolean IsOverlapping() {
        return (this.values & 8) == 8;
    }

    /* access modifiers changed from: package-private */
    public final boolean toIntRange() {
        return (this.values & 16) == 16;
    }

    public final boolean equals() {
        return this.equals;
    }
}
