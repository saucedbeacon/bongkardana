package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.supercharge.shimmerlayout.ShimmerLayout;
import o.requestChildRectangleOnScreen;

public class getInsetDodgeRect implements onDetachedFromLayoutParams {
    private static final String getMax = getInsetDodgeRect.class.getName();
    private final int IsOverlapping;
    private final int getMin;
    private final boolean isInside;
    private final int length;
    private final layoutDependsOn setMax;
    private final View setMin;
    private final int toIntRange;

    public /* synthetic */ getInsetDodgeRect(setMax setmax, byte b) {
        this(setmax);
    }

    private getInsetDodgeRect(setMax setmax) {
        this.setMin = setmax.getMin;
        this.getMin = setmax.getMax;
        this.isInside = setmax.length;
        this.IsOverlapping = setmax.setMax;
        this.toIntRange = setmax.isInside;
        this.length = setmax.setMin;
        this.setMax = new layoutDependsOn(setmax.getMin);
    }

    public final void length() {
        if (this.setMax.length instanceof ShimmerLayout) {
            ((ShimmerLayout) this.setMax.length).stopShimmerAnimation();
        }
        layoutDependsOn layoutdependson = this.setMax;
        if (layoutdependson.setMax != null) {
            layoutdependson.setMax.removeView(layoutdependson.setMin);
            layoutdependson.setMax.addView(layoutdependson.getMin, layoutdependson.isInside, layoutdependson.IsOverlapping);
            layoutdependson.setMin = layoutdependson.getMin;
            layoutdependson.length = null;
            layoutdependson.getMax = -1;
        }
    }

    public static class setMax {
        public int getMax;
        public final View getMin;
        public int isInside = 20;
        public boolean length = true;
        public int setMax = 1000;
        public int setMin;

        public setMax(View view) {
            this.getMin = view;
            this.setMin = IntRange.setMax(view.getContext(), requestChildRectangleOnScreen.getMin.getMin);
        }
    }

    public final void getMin() {
        ShimmerLayout shimmerLayout;
        ViewParent parent = this.setMin.getParent();
        if (parent == null) {
            shimmerLayout = null;
        } else {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.isInside) {
                final ShimmerLayout shimmerLayout2 = (ShimmerLayout) LayoutInflater.from(this.setMin.getContext()).inflate(requestChildRectangleOnScreen.setMin.layout_shimmer, viewGroup, false);
                shimmerLayout2.setShimmerColor(this.length);
                shimmerLayout2.setShimmerAngle(this.toIntRange);
                shimmerLayout2.setShimmerAnimationDuration(this.IsOverlapping);
                View inflate = LayoutInflater.from(this.setMin.getContext()).inflate(this.getMin, shimmerLayout2, false);
                ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                if (layoutParams != null) {
                    shimmerLayout2.setLayoutParams(layoutParams);
                }
                shimmerLayout2.addView(inflate);
                shimmerLayout2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    public final void onViewAttachedToWindow(View view) {
                        shimmerLayout2.startShimmerAnimation();
                    }

                    public final void onViewDetachedFromWindow(View view) {
                        shimmerLayout2.stopShimmerAnimation();
                    }
                });
                shimmerLayout2.startShimmerAnimation();
                shimmerLayout = shimmerLayout2;
            } else {
                shimmerLayout = LayoutInflater.from(this.setMin.getContext()).inflate(this.getMin, viewGroup, false);
            }
        }
        if (shimmerLayout != null) {
            layoutDependsOn layoutdependson = this.setMax;
            if (layoutdependson.setMin != shimmerLayout) {
                if (shimmerLayout.getParent() != null) {
                    ((ViewGroup) shimmerLayout.getParent()).removeView(shimmerLayout);
                }
                if (layoutdependson.setMin()) {
                    layoutdependson.length = shimmerLayout;
                    layoutdependson.setMax.removeView(layoutdependson.setMin);
                    layoutdependson.length.setId(layoutdependson.equals);
                    layoutdependson.setMax.addView(layoutdependson.length, layoutdependson.isInside, layoutdependson.IsOverlapping);
                    layoutdependson.setMin = layoutdependson.length;
                }
            }
        }
    }
}
