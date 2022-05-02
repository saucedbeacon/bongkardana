package o;

import android.view.View;

public final class ContentInfoCompat$Source {
    private static boolean setMax(int i, int i2, int i3, float f) {
        return i2 == Integer.MIN_VALUE && i == 0 && ((float) i3) >= f;
    }

    private static boolean setMax(int i, int i2, int i3, int i4, float f) {
        return i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE && i3 > i4 && f <= ((float) i4);
    }

    private static boolean setMax(int i, int i2, float f) {
        return i == 1073741824 && Math.abs(((float) i2) - f) < 0.5f;
    }

    public static boolean getMin(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        float f = (float) i3;
        return setMax(mode, size, f) || setMax(mode2, mode, size, f) || setMax(mode2, mode, size2, size, f);
    }
}
