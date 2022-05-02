package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import me.zhanghai.android.materialprogressbar.internal.AnimationScaleListDrawableCompat;

public class AnimationScaleIndeterminateCircularProgressDrawable extends AnimationScaleListDrawableCompat implements MaterialProgressDrawable, IntrinsicPaddingDrawable, TintableDrawable {
    public AnimationScaleIndeterminateCircularProgressDrawable(@NonNull Context context) {
        super(new Drawable[]{new StaticIndeterminateCircularProgressDrawable(context), new IndeterminateCircularProgressDrawable(context)});
    }

    public boolean getUseIntrinsicPadding() {
        return getIntrinsicPaddingDrawable().getUseIntrinsicPadding();
    }

    public void setUseIntrinsicPadding(boolean z) {
        getIntrinsicPaddingDrawable().setUseIntrinsicPadding(z);
    }

    @NonNull
    private IntrinsicPaddingDrawable getIntrinsicPaddingDrawable() {
        return (IntrinsicPaddingDrawable) getCurrent();
    }
}
