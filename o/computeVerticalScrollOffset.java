package o;

import android.content.res.TypedArray;
import android.util.TypedValue;

final class computeVerticalScrollOffset {
    private static final TypedValue getMin = new TypedValue();

    computeVerticalScrollOffset() {
    }

    static boolean setMin(TypedArray typedArray, int i) {
        boolean z;
        synchronized (getMin) {
            typedArray.getValue(i, getMin);
            z = getMin.type >= 28 && getMin.type <= 31;
        }
        return z;
    }
}
