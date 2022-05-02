package id.dana.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.TwoWheelOptionPickerDialog;

public class OverScrollBounceBehavior extends CoordinatorLayout.Behavior<View> {
    private setMin IsOverlapping;
    private int getMax = 0;
    private boolean getMin;
    private View isInside;
    private int length;
    private float setMax = 1.8f;
    private int setMin = 0;
    private View toFloatRange;

    public interface setMin {
    }

    private static boolean setMax(int i) {
        return i == 0;
    }

    public OverScrollBounceBehavior() {
    }

    public OverScrollBounceBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        if (!setMax(i2) || !getMax()) {
            return true;
        }
        this.length = 0;
        int height = this.isInside.getHeight();
        this.getMax = height;
        this.setMin = (int) (((float) height) * this.setMax);
        return true;
    }

    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        View view3;
        if (i4 < 0) {
            this.length -= i4;
            if (setMax(i5) && getMax() && this.length > 0 && this.isInside.getLayoutParams().height + Math.abs(this.length) <= this.setMin) {
                this.isInside.getLayoutParams().height = this.getMax + Math.abs(this.length);
                this.isInside.requestLayout();
                if (this.IsOverlapping != null && (view3 = this.isInside) != null) {
                    int i6 = view3.getLayoutParams().height;
                }
            }
        }
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i) {
        if (setMax(i) && getMax() && this.isInside.getHeight() > this.getMax) {
            if (this.isInside.getAnimation() != null) {
                this.isInside.getAnimation().cancel();
            }
            boolean z = this.getMin && this.isInside.getHeight() >= this.toFloatRange.getHeight();
            if (this.toFloatRange == null || this.isInside.getHeight() <= this.toFloatRange.getHeight()) {
                View view3 = this.isInside;
                int i2 = this.getMax;
                final setMin setmin = this.IsOverlapping;
                length length2 = new length(view3, i2, setmin);
                length2.setDuration(300);
                length2.setStartOffset(z ? 5000 : 0);
                length2.setAnimationListener(new TwoWheelOptionPickerDialog.OnOptionPickListener.setMax() {
                    public final void onAnimationEnd(Animation animation) {
                    }
                });
                view3.startAnimation(length2);
            } else {
                length length3 = new length(this.isInside, this.toFloatRange.getHeight(), (setMin) null);
                length3.setDuration(150);
                this.isInside.startAnimation(length3);
            }
            this.isInside.getHeight();
            this.toFloatRange.getHeight();
        }
    }

    private boolean getMax() {
        return this.isInside != null;
    }

    public static class length extends Animation {
        int getMax;
        View getMin;
        int length;
        setMin setMax;
        int setMin;

        length(View view, int i, setMin setmin) {
            this.getMin = view;
            this.setMin = i;
            int height = view.getHeight();
            this.getMax = height;
            this.length = this.setMin - height;
            this.setMax = setmin;
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            this.getMin.getLayoutParams().height = (int) (((float) this.setMin) - (((float) this.length) * (1.0f - f)));
            this.getMin.requestLayout();
            if (this.setMax != null) {
                OverScrollBounceBehavior.setMax(this.getMin, this.getMax, this.setMin);
            }
        }
    }

    static /* synthetic */ float setMax(View view, int i, int i2) {
        if (view != null) {
            return (((float) i) - ((float) view.getLayoutParams().height)) / ((float) (i - i2));
        }
        return 0.0f;
    }
}
