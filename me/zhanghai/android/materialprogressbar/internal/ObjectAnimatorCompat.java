package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    @NonNull
    public static ObjectAnimator ofArgb(@Nullable Object obj, @NonNull String str, int... iArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofArgb(obj, str, iArr);
        }
        return ObjectAnimatorCompatBase.ofArgb(obj, str, iArr);
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(@Nullable T t, @NonNull Property<T, Integer> property, int... iArr) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofArgb(t, property, iArr);
        }
        return ObjectAnimatorCompatBase.ofArgb(t, property, iArr);
    }

    @NonNull
    public static ObjectAnimator ofFloat(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofFloat(obj, str, str2, path);
        }
        return ObjectAnimatorCompatBase.ofFloat(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(@Nullable T t, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofFloat(t, property, property2, path);
        }
        return ObjectAnimatorCompatBase.ofFloat(t, property, property2, path);
    }

    @NonNull
    public static ObjectAnimator ofInt(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofInt(obj, str, str2, path);
        }
        return ObjectAnimatorCompatBase.ofInt(obj, str, str2, path);
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(@Nullable T t, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimatorCompatLollipop.ofInt(t, property, property2, path);
        }
        return ObjectAnimatorCompatBase.ofInt(t, property, property2, path);
    }
}
