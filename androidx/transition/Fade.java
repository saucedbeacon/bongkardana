package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import o.NonNull;
import o.dismissPopups;
import o.getActionBarHideOffset;
import o.hasIcon;
import o.setActionBarHideOffset;

public class Fade extends Visibility {
    public Fade(int i) {
        setMode(i);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.IsOverlapping);
        int mode = getMode();
        setMode(NonNull.setMin((XmlResourceParser) attributeSet, "fadingMode") ? obtainStyledAttributes.getInt(0, mode) : mode);
        obtainStyledAttributes.recycle();
    }

    public void captureStartValues(@androidx.annotation.NonNull hasIcon hasicon) {
        super.captureStartValues(hasicon);
        hasicon.setMax.put("android:fade:transitionAlpha", Float.valueOf(dismissPopups.getMin(hasicon.setMin)));
    }

    private Animator length(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        dismissPopups.getMax(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, dismissPopups.setMax, new float[]{f2});
        ofFloat.addListener(new setMax(view));
        addListener(new getActionBarHideOffset() {
            public final void onTransitionEnd(@androidx.annotation.NonNull Transition transition) {
                dismissPopups.getMax(view, 1.0f);
                dismissPopups.length(view);
                transition.removeListener(this);
            }
        });
        return ofFloat;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        float f;
        Float f2;
        dismissPopups.getMax(view);
        if (hasicon == null || (f2 = (Float) hasicon.setMax.get("android:fade:transitionAlpha")) == null) {
            f = 1.0f;
        } else {
            f = f2.floatValue();
        }
        return length(view, f, 0.0f);
    }

    static class setMax extends AnimatorListenerAdapter {
        private final View getMax;
        private boolean setMin = false;

        setMax(View view) {
            this.getMax = view;
        }

        public final void onAnimationStart(Animator animator) {
            if (ViewCompat.extraCallbackWithResult(this.getMax) && this.getMax.getLayerType() == 0) {
                this.setMin = true;
                this.getMax.setLayerType(2, (Paint) null);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            dismissPopups.getMax(this.getMax, 1.0f);
            if (this.setMin) {
                this.getMax.setLayerType(0, (Paint) null);
            }
        }
    }

    public Animator onAppear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        float f;
        Float f2;
        float f3 = 0.0f;
        if (hasicon == null || (f2 = (Float) hasicon.setMax.get("android:fade:transitionAlpha")) == null) {
            f = 0.0f;
        } else {
            f = f2.floatValue();
        }
        if (f != 1.0f) {
            f3 = f;
        }
        return length(view, f3, 1.0f);
    }
}
