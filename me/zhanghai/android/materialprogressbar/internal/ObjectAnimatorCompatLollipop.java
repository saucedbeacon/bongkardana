package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@TargetApi(21)
class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    @NonNull
    public static ObjectAnimator ofArgb(@Nullable Object obj, @NonNull String str, int... iArr) {
        return ObjectAnimator.ofArgb(obj, str, iArr);
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(@Nullable T t, @NonNull Property<T, Integer> property, int... iArr) {
        return ObjectAnimator.ofArgb(t, property, iArr);
    }

    @NonNull
    public static ObjectAnimator ofFloat(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimator.ofFloat(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(@Nullable T t, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        return ObjectAnimator.ofFloat(t, property, property2, path);
    }

    @NonNull
    public static ObjectAnimator ofInt(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        return ObjectAnimator.ofInt(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(@Nullable T t, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        return ObjectAnimator.ofInt(t, property, property2, path);
    }
}
