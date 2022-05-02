package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class getShuffleMode {
    private static final int[] IsOverlapping = new int[1];
    static final int[] equals = {-16842919, -16842908};
    static final int[] getMax = {16842912};
    static final int[] getMin = {16843518};
    static final int[] isInside = new int[0];
    static final int[] length = {16842908};
    static final int[] setMax = {-16842910};
    static final int[] setMin = {16842919};
    private static final ThreadLocal<TypedValue> toFloatRange = new ThreadLocal<>();
    static final int[] toIntRange = {16842913};

    public static int getMax(@NonNull Context context, int i) {
        int[] iArr = IsOverlapping;
        iArr[0] = i;
        prepareFromUri min = prepareFromUri.setMin(context, (AttributeSet) null, iArr);
        try {
            return min.setMin.getColor(0, 0);
        } finally {
            min.setMin.recycle();
        }
    }

    @Nullable
    public static ColorStateList setMin(@NonNull Context context, int i) {
        int[] iArr = IsOverlapping;
        iArr[0] = i;
        prepareFromUri min = prepareFromUri.setMin(context, (AttributeSet) null, iArr);
        try {
            return min.length(0);
        } finally {
            min.setMin.recycle();
        }
    }

    public static int getMin(@NonNull Context context, int i) {
        ColorStateList min = setMin(context, i);
        if (min != null && min.isStateful()) {
            return min.getColorForState(setMax, min.getDefaultColor());
        }
        TypedValue typedValue = toFloatRange.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            toFloatRange.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int max = getMax(context, i);
        return NavigationRes.getMax(max, Math.round(((float) Color.alpha(max)) * f));
    }

    public static void getMax(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ITrustedWebActivityCallback.Stub.toIntRange.cancel);
        try {
            obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.IconCompatParcelizer);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
