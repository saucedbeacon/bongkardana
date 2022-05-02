package o;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ThreadUtils;
import java.util.List;
import javax.annotation.Nullable;

public final class doStopCurrentWork extends dismiss {
    private static final Rect setMin = new Rect(0, 0, 1, 1);
    private final setOnCancelListener getMax;
    public ViewCompat$ScrollIndicators length;
    private final View setMax;

    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        return false;
    }

    public doStopCurrentWork(View view, ViewCompat$ScrollIndicators viewCompat$ScrollIndicators, boolean z, int i) {
        super(view);
        this.setMax = view;
        this.length = viewCompat$ScrollIndicators;
        this.getMax = new length(this, (byte) 0);
        this.setMax.setFocusable(z);
        ViewCompat.setMin(this.setMax, i);
    }

    public doStopCurrentWork(View view, boolean z, int i) {
        this(view, (ViewCompat$ScrollIndicators) null, z, i);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
        View view2 = this.setMax;
        if (view2 instanceof ComponentHost) {
            ((ComponentHost) view2).getAccessibleMountItem();
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.ICustomTabsCallback == null) {
            super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
        } else {
            IconCompat<AccessibilityEventCompat$ContentChangeType> iconCompat = this.length.ICustomTabsCallback;
            setOnCancelListener setoncancellistener = this.getMax;
            ThreadUtils.getMax();
            if (getHandler.toIntRange == null) {
                getHandler.toIntRange = new AccessibilityEventCompat$ContentChangeType();
            }
            getHandler.toIntRange.getMin = view;
            getHandler.toIntRange.setMax = onsupportactionmodefinished;
            getHandler.toIntRange.getMax = setoncancellistener;
            iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.toIntRange);
            getHandler.toIntRange.getMin = null;
            getHandler.toIntRange.setMax = null;
            getHandler.toIntRange.getMax = null;
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators2 = this.length;
        if (viewCompat$ScrollIndicators2 != null && viewCompat$ScrollIndicators2.invoke != null) {
            onsupportactionmodefinished.getMax((CharSequence) this.length.invoke);
        }
    }

    public final void getVisibleVirtualViews(List<Integer> list) {
        WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode;
        View view = this.setMax;
        if (!(view instanceof ComponentHost)) {
            windowInsetsAnimationCompat$Callback$DispatchMode = null;
        } else {
            windowInsetsAnimationCompat$Callback$DispatchMode = ((ComponentHost) view).getAccessibleMountItem();
        }
        if (windowInsetsAnimationCompat$Callback$DispatchMode == null) {
        }
    }

    public final void onPopulateNodeForVirtualView(int i, onSupportActionModeFinished onsupportactionmodefinished) {
        WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode;
        View view = this.setMax;
        if (!(view instanceof ComponentHost)) {
            windowInsetsAnimationCompat$Callback$DispatchMode = null;
        } else {
            windowInsetsAnimationCompat$Callback$DispatchMode = ((ComponentHost) view).getAccessibleMountItem();
        }
        if (windowInsetsAnimationCompat$Callback$DispatchMode == null) {
            onsupportactionmodefinished.length((CharSequence) "");
            onsupportactionmodefinished.setMin(setMin);
            return;
        }
        Rect bounds = ((Drawable) (windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax)).getBounds();
        onsupportactionmodefinished.getMax((CharSequence) windowInsetsAnimationCompat$Callback$DispatchMode.setMin.getClass().getName());
        if (i >= 0) {
            onsupportactionmodefinished.length((CharSequence) "");
            onsupportactionmodefinished.setMin(setMin);
            return;
        }
        int i2 = bounds.left;
        int i3 = bounds.top;
    }

    public final int getVirtualViewAt(float f, float f2) {
        WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode;
        View view = this.setMax;
        if (!(view instanceof ComponentHost)) {
            windowInsetsAnimationCompat$Callback$DispatchMode = null;
        } else {
            windowInsetsAnimationCompat$Callback$DispatchMode = ((ComponentHost) view).getAccessibleMountItem();
        }
        if (windowInsetsAnimationCompat$Callback$DispatchMode == null) {
        }
        return Integer.MIN_VALUE;
    }

    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Nullable
    public final onWindowStartingSupportActionMode getAccessibilityNodeProvider(View view) {
        View view2 = this.setMax;
        if (!(view2 instanceof ComponentHost)) {
            return null;
        }
        ((ComponentHost) view2).getAccessibleMountItem();
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.Grayscale$Algorithm == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        IconCompat<NestedScrollView> iconCompat = this.length.Grayscale$Algorithm;
        setOnCancelListener setoncancellistener = this.getMax;
        ThreadUtils.getMax();
        if (getHandler.IsOverlapping == null) {
            getHandler.IsOverlapping = new NestedScrollView();
        }
        getHandler.IsOverlapping.setMin = view;
        getHandler.IsOverlapping.getMin = accessibilityEvent;
        getHandler.IsOverlapping.length = setoncancellistener;
        iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.IsOverlapping);
        getHandler.IsOverlapping.setMin = null;
        getHandler.IsOverlapping.getMin = null;
        getHandler.IsOverlapping.length = null;
    }

    public final void sendAccessibilityEvent(View view, int i) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.create == null) {
            super.sendAccessibilityEvent(view, i);
            return;
        }
        IconCompat<isFillViewport> iconCompat = this.length.create;
        setOnCancelListener setoncancellistener = this.getMax;
        ThreadUtils.getMax();
        if (getHandler.values == null) {
            getHandler.values = new isFillViewport();
        }
        getHandler.values.length = view;
        getHandler.values.setMax = i;
        getHandler.values.getMax = setoncancellistener;
        iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.values);
        getHandler.values.length = null;
        getHandler.values.setMax = 0;
        getHandler.values.getMax = null;
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.b == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            return;
        }
        IconCompat<getMaxScrollAmount> iconCompat = this.length.b;
        setOnCancelListener setoncancellistener = this.getMax;
        ThreadUtils.getMax();
        if (getHandler.toString == null) {
            getHandler.toString = new getMaxScrollAmount();
        }
        getHandler.toString.setMax = view;
        getHandler.toString.length = accessibilityEvent;
        getHandler.toString.getMin = setoncancellistener;
        iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.toString);
        getHandler.toString.setMax = null;
        getHandler.toString.length = null;
        getHandler.toString.getMin = null;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.invokeSuspend == null) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return getHandler.length(this.length.invokeSuspend, view, accessibilityEvent, this.getMax);
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.Mean$Arithmetic == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        IconCompat<dispatchNestedScroll> iconCompat = this.length.Mean$Arithmetic;
        setOnCancelListener setoncancellistener = this.getMax;
        ThreadUtils.getMax();
        if (getHandler.equals == null) {
            getHandler.equals = new dispatchNestedScroll();
        }
        getHandler.equals.setMin = view;
        getHandler.equals.setMax = accessibilityEvent;
        getHandler.equals.getMin = setoncancellistener;
        iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.equals);
        getHandler.equals.setMin = null;
        getHandler.equals.setMax = null;
        getHandler.equals.getMin = null;
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.getCause == null) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return getHandler.length(this.length.getCause, viewGroup, view, accessibilityEvent, this.getMax);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length;
        if (viewCompat$ScrollIndicators == null || viewCompat$ScrollIndicators.onNavigationEvent == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        return getHandler.setMin(this.length.onNavigationEvent, view, i, bundle, this.getMax);
    }

    class length extends setOnCancelListener {
        private length() {
        }

        /* synthetic */ length(doStopCurrentWork dostopcurrentwork, byte b) {
            this();
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return doStopCurrentWork.super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            doStopCurrentWork.super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            doStopCurrentWork.super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            doStopCurrentWork.super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return doStopCurrentWork.super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return doStopCurrentWork.super.performAccessibilityAction(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            doStopCurrentWork.super.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            doStopCurrentWork.super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
