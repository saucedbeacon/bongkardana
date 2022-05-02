package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.NonNull;
import o.hasIcon;
import o.onNestedFling;
import o.setActionBarHideOffset;
import o.setUiOptions;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final length IsOverlapping = new getMin() {
        public final float getMin(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final length equals = new getMin() {
        public final float getMin(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.IsOverlapping(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final TimeInterpolator getMax = new DecelerateInterpolator();
    private static final length isInside = new setMax() {
        public final float setMax(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };
    private static final TimeInterpolator length = new AccelerateInterpolator();
    private static final length setMax = new getMin() {
        public final float getMin(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final length toFloatRange = new setMax() {
        public final float setMax(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };
    private static final length toIntRange = new getMin() {
        public final float getMin(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.IsOverlapping(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private int getMin;
    private length setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    interface length {
        float getMin(ViewGroup viewGroup, View view);

        float setMax(ViewGroup viewGroup, View view);
    }

    static abstract class getMin implements length {
        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final float setMax(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    static abstract class setMax implements length {
        private setMax() {
        }

        /* synthetic */ setMax(byte b) {
            this();
        }

        public final float getMin(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.setMin = isInside;
        this.getMin = 80;
        getMin(80);
    }

    public Slide(int i) {
        this.setMin = isInside;
        this.getMin = 80;
        getMin(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setMin = isInside;
        int i = 80;
        this.getMin = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.toIntRange);
        i = NonNull.setMin((XmlPullParser) attributeSet, "slideEdge") ? obtainStyledAttributes.getInt(0, 80) : i;
        obtainStyledAttributes.recycle();
        getMin(i);
    }

    public void captureStartValues(@androidx.annotation.NonNull hasIcon hasicon) {
        super.captureStartValues(hasicon);
        int[] iArr = new int[2];
        hasicon.setMin.getLocationOnScreen(iArr);
        hasicon.setMax.put("android:slide:screenPosition", iArr);
    }

    public void captureEndValues(@androidx.annotation.NonNull hasIcon hasicon) {
        super.captureEndValues(hasicon);
        int[] iArr = new int[2];
        hasicon.setMin.getLocationOnScreen(iArr);
        hasicon.setMax.put("android:slide:screenPosition", iArr);
    }

    private void getMin(int i) {
        if (i == 3) {
            this.setMin = setMax;
        } else if (i == 5) {
            this.setMin = IsOverlapping;
        } else if (i == 48) {
            this.setMin = toFloatRange;
        } else if (i == 80) {
            this.setMin = isInside;
        } else if (i == 8388611) {
            this.setMin = equals;
        } else if (i == 8388613) {
            this.setMin = toIntRange;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.getMin = i;
        onNestedFling onnestedfling = new onNestedFling();
        onnestedfling.length = i;
        setPropagation(onnestedfling);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        if (hasicon2 == null) {
            return null;
        }
        int[] iArr = (int[]) hasicon2.setMax.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return setUiOptions.getMin(view, hasicon2, iArr[0], iArr[1], this.setMin.getMin(viewGroup, view), this.setMin.setMax(viewGroup, view), translationX, translationY, getMax, this);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        if (hasicon == null) {
            return null;
        }
        int[] iArr = (int[]) hasicon.setMax.get("android:slide:screenPosition");
        return setUiOptions.getMin(view, hasicon, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.setMin.getMin(viewGroup, view), this.setMin.setMax(viewGroup, view), length, this);
    }
}
