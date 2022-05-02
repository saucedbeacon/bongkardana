package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.allOf;

public interface TintableDrawable extends allOf {
    void setTint(@ColorInt int i);

    void setTintList(@Nullable ColorStateList colorStateList);

    void setTintMode(@NonNull PorterDuff.Mode mode);
}
