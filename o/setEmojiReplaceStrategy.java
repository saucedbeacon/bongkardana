package o;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import o.setInitialSavedState;

@SuppressLint({"NewApi"})
public final class setEmojiReplaceStrategy extends ExifInterface$IfdType {
    private static setInitialSavedState<setEmojiReplaceStrategy> setMin;

    static {
        setInitialSavedState<setEmojiReplaceStrategy> max = setInitialSavedState.getMax(4, new setEmojiReplaceStrategy());
        setMin = max;
        max.setMax = 0.5f;
    }

    public static setEmojiReplaceStrategy setMax(setTargetFragment settargetfragment, float f, float f2, getActivity getactivity, View view, float f3, float f4, long j) {
        setEmojiReplaceStrategy max = setMin.setMax();
        max.hashCode = settargetfragment;
        max.toDoubleRange = f;
        max.FastBitmap$CoordinateSystem = f2;
        max.invoke = getactivity;
        max.Grayscale$Algorithm = view;
        max.length = f3;
        max.getMax = f4;
        max.getMin.setDuration(j);
        return max;
    }

    private setEmojiReplaceStrategy() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.values[0] = this.length + ((this.toDoubleRange - this.length) * this.setMax);
        this.values[1] = this.getMax + ((this.FastBitmap$CoordinateSystem - this.getMax) * this.setMax);
        this.invoke.length(this.values);
        this.hashCode.getMin(this.values, this.Grayscale$Algorithm);
    }

    public final setInitialSavedState.setMax setMin() {
        return new setEmojiReplaceStrategy();
    }

    public final void getMin() {
        setMin.getMax(this);
    }
}
