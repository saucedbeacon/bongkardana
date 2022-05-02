package com.facebook.litho;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;
import o.NotificationCompatSideChannelService;
import o.ViewCompat$ScrollIndicators;
import o.access$setStartingWakeLock$cp;
import o.computeHorizontalScrollRange;
import o.isStopped;
import o.keyToDirection;
import o.pageScroll;

public final class LayoutOutput implements Cloneable, access$setStartingWakeLock$cp {
    public int FastBitmap$CoordinateSystem;
    public int IsOverlapping;
    int equals;
    public long getMax;
    public isStopped getMin;
    public int hashCode;
    public AtomicInteger isInside = new AtomicInteger(0);
    public computeHorizontalScrollRange length;
    public final Rect setMax = new Rect();
    @Nullable
    public ViewCompat$ScrollIndicators setMin;
    public int toDoubleRange = 0;
    public long toFloatRange = -1;
    int toIntRange;
    @Nullable
    public pageScroll toString;
    public int values = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface UpdateState {
    }

    public final void getMin(Rect rect) {
        rect.left = this.setMax.left - this.toIntRange;
        rect.top = this.setMax.top - this.equals;
        rect.right = this.setMax.right - this.toIntRange;
        rect.bottom = this.setMax.bottom - this.equals;
    }

    public final Rect setMin() {
        return this.setMax;
    }

    public final float length() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        if (viewCompat$ScrollIndicators != null) {
            return viewCompat$ScrollIndicators.isInside;
        }
        return 1.0f;
    }

    public final float setMax() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        if (viewCompat$ScrollIndicators != null) {
            return viewCompat$ScrollIndicators.IsOverlapping;
        }
        return 1.0f;
    }

    public final float getMax() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        if (viewCompat$ScrollIndicators != null) {
            return viewCompat$ScrollIndicators.hashCode;
        }
        return 0.0f;
    }

    public final boolean getMin() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        return viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.toIntRange();
    }

    public final boolean toFloatRange() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        return viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.toFloatRange();
    }

    public final boolean toIntRange() {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
        return viewCompat$ScrollIndicators != null && viewCompat$ScrollIndicators.equals();
    }

    /* access modifiers changed from: package-private */
    public final void getMax(ViewCompat$ScrollIndicators viewCompat$ScrollIndicators) {
        if (this.setMin != null) {
            throw new IllegalStateException("NodeInfo set more than once on the same LayoutOutput.");
        } else if (viewCompat$ScrollIndicators == null) {
        } else {
            if (viewCompat$ScrollIndicators.getMax.getAndIncrement() > 0) {
                this.setMin = viewCompat$ScrollIndicators;
                return;
            }
            throw new IllegalStateException("The NodeInfo being acquired wasn't correctly initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(computeHorizontalScrollRange computehorizontalscrollrange) {
        if (this.length != null) {
            throw new IllegalStateException("Try to set a new ViewNodeInfo in a LayoutOutput that is already initialized with one.");
        } else if (computehorizontalscrollrange.getMax.getAndIncrement() > 0) {
            this.length = computehorizontalscrollrange;
        } else {
            throw new IllegalStateException("The ViewNodeInfo being acquired wasn't correctly initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isInside() {
        return this.length != null;
    }

    public final void IsOverlapping() {
        int decrementAndGet = this.isInside.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Trying to release a recycled LayoutOutput.");
        } else if (decrementAndGet <= 0) {
            isStopped isstopped = this.getMin;
            if (isstopped != null) {
                isstopped.hashCode = false;
                this.getMin = null;
            }
            if (!keyToDirection.ICustomTabsCallback$Default) {
                ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.setMin;
                if (viewCompat$ScrollIndicators != null) {
                    viewCompat$ScrollIndicators.IsOverlapping();
                    this.setMin = null;
                }
                computeHorizontalScrollRange computehorizontalscrollrange = this.length;
                if (computehorizontalscrollrange != null) {
                    computehorizontalscrollrange.length();
                    this.length = null;
                }
                this.setMax.setEmpty();
                this.toIntRange = 0;
                this.equals = 0;
                this.IsOverlapping = 0;
                this.toFloatRange = -1;
                this.toDoubleRange = 0;
                this.values = 0;
                this.toString = null;
                NotificationCompatSideChannelService.getMin(this);
            }
        }
    }
}
