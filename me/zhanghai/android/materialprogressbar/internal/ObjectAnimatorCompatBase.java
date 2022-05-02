package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    @NonNull
    public static ObjectAnimator ofArgb(@Nullable Object obj, @NonNull String str, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, str, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    @NonNull
    public static <T> ObjectAnimator ofArgb(@Nullable T t, @NonNull Property<T, Integer> property, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(t, property, iArr);
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    @NonNull
    public static ObjectAnimator ofFloat(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str, fArr), PropertyValuesHolder.ofFloat(str2, fArr2)});
    }

    @NonNull
    public static <T> ObjectAnimator ofFloat(@Nullable T t, @NonNull Property<T, Float> property, @NonNull Property<T, Float> property2, @NonNull Path path) {
        float[] fArr = new float[201];
        float[] fArr2 = new float[201];
        calculateXYValues(path, fArr, fArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, fArr), PropertyValuesHolder.ofFloat(property2, fArr2)});
    }

    @NonNull
    public static ObjectAnimator ofInt(@Nullable Object obj, @NonNull String str, @NonNull String str2, @NonNull Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(str, iArr), PropertyValuesHolder.ofInt(str2, iArr2)});
    }

    @NonNull
    public static <T> ObjectAnimator ofInt(@Nullable T t, @NonNull Property<T, Integer> property, @NonNull Property<T, Integer> property2, @NonNull Path path) {
        int[] iArr = new int[201];
        int[] iArr2 = new int[201];
        calculateXYValues(path, iArr, iArr2);
        return ObjectAnimator.ofPropertyValuesHolder(t, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(property, iArr), PropertyValuesHolder.ofInt(property2, iArr2)});
    }

    private static void calculateXYValues(@NonNull Path path, @Size(201) @NonNull float[] fArr, @Size(201) @NonNull float[] fArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr3 = new float[2];
        for (int i = 0; i < 201; i++) {
            pathMeasure.getPosTan((((float) i) * length) / 200.0f, fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
        }
    }

    private static void calculateXYValues(@NonNull Path path, @Size(201) @NonNull int[] iArr, @Size(201) @NonNull int[] iArr2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        for (int i = 0; i < 201; i++) {
            pathMeasure.getPosTan((((float) i) * length) / 200.0f, fArr, (float[]) null);
            iArr[i] = Math.round(fArr[0]);
            iArr2[i] = Math.round(fArr[1]);
        }
    }
}
