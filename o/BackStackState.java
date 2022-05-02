package o;

import android.view.View;
import o.setInitialSavedState;

public final class BackStackState extends ExtractButtonCompat {
    private static setInitialSavedState<BackStackState> setMax;

    static {
        setInitialSavedState<BackStackState> max = setInitialSavedState.getMax(2, new BackStackState((setTargetFragment) null, 0.0f, 0.0f, (getActivity) null, (View) null));
        setMax = max;
        max.setMax = 0.5f;
    }

    public static BackStackState getMin(setTargetFragment settargetfragment, float f, float f2, getActivity getactivity, View view) {
        BackStackState max = setMax.setMax();
        max.hashCode = settargetfragment;
        max.toDoubleRange = f;
        max.FastBitmap$CoordinateSystem = f2;
        max.invoke = getactivity;
        max.Grayscale$Algorithm = view;
        return max;
    }

    private BackStackState(setTargetFragment settargetfragment, float f, float f2, getActivity getactivity, View view) {
        super(settargetfragment, f, f2, getactivity, view);
    }

    public final void run() {
        this.values[0] = this.toDoubleRange;
        this.values[1] = this.FastBitmap$CoordinateSystem;
        this.invoke.length(this.values);
        this.hashCode.getMin(this.values, this.Grayscale$Algorithm);
        setMax.getMax(this);
    }

    public final setInitialSavedState.setMax setMin() {
        return new BackStackState(this.hashCode, this.toDoubleRange, this.FastBitmap$CoordinateSystem, this.invoke, this.Grayscale$Algorithm);
    }
}
