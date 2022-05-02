package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

public final class clearNestedRecyclerViewIfNotNested {
    public static int getMax(@Nullable onChildDetachedFromWindow onchilddetachedfromwindow, int i) {
        int i2;
        if (onchilddetachedfromwindow == null) {
            return 0;
        }
        if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
            onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
        }
        if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
            i2 = setMax(onchilddetachedfromwindow, i);
        } else {
            i2 = onchilddetachedfromwindow.getMax;
            if (onchilddetachedfromwindow.onPostMessage == null) {
                onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
            }
            if (onchilddetachedfromwindow.onPostMessage == AnimationType.DROP) {
                i2 *= 3;
            }
        }
        return i2 + onchilddetachedfromwindow.getMin;
    }

    public static int setMin(@Nullable onChildDetachedFromWindow onchilddetachedfromwindow, int i) {
        int i2;
        if (onchilddetachedfromwindow == null) {
            return 0;
        }
        if (onchilddetachedfromwindow.ICustomTabsCallback == null) {
            onchilddetachedfromwindow.ICustomTabsCallback = Orientation.HORIZONTAL;
        }
        if (onchilddetachedfromwindow.ICustomTabsCallback == Orientation.HORIZONTAL) {
            i2 = onchilddetachedfromwindow.getMax;
            if (onchilddetachedfromwindow.onPostMessage == null) {
                onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
            }
            if (onchilddetachedfromwindow.onPostMessage == AnimationType.DROP) {
                i2 *= 3;
            }
        } else {
            i2 = setMax(onchilddetachedfromwindow, i);
        }
        return i2 + onchilddetachedfromwindow.isInside;
    }

    private static int setMax(@NonNull onChildDetachedFromWindow onchilddetachedfromwindow, int i) {
        int i2 = onchilddetachedfromwindow.invoke;
        int i3 = onchilddetachedfromwindow.getMax;
        int i4 = onchilddetachedfromwindow.toIntRange;
        int i5 = onchilddetachedfromwindow.length;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i4 / 2;
            int i9 = i6 + i3 + i8;
            if (i == i7) {
                return i9;
            }
            i6 = i9 + i3 + i5 + i8;
        }
        if (onchilddetachedfromwindow.onPostMessage == null) {
            onchilddetachedfromwindow.onPostMessage = AnimationType.NONE;
        }
        return onchilddetachedfromwindow.onPostMessage == AnimationType.DROP ? i6 + (i3 * 2) : i6;
    }
}
