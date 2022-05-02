package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.util.Map;
import o.hasIcon;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextScale extends Transition {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    public void captureStartValues(@NonNull hasIcon hasicon) {
        captureValues(hasicon);
    }

    public void captureEndValues(@NonNull hasIcon hasicon) {
        captureValues(hasicon);
    }

    private void captureValues(@NonNull hasIcon hasicon) {
        if (hasicon.setMin instanceof TextView) {
            hasicon.setMax.put(PROPNAME_SCALE, Float.valueOf(((TextView) hasicon.setMin).getScaleX()));
        }
    }

    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        if (hasicon == null || hasicon2 == null || !(hasicon.setMin instanceof TextView) || !(hasicon2.setMin instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) hasicon2.setMin;
        Map<String, Object> map = hasicon.setMax;
        Map<String, Object> map2 = hasicon2.setMax;
        float f = 1.0f;
        float floatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (map2.get(PROPNAME_SCALE) != null) {
            f = ((Float) map2.get(PROPNAME_SCALE)).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
