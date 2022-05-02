package o;

import android.os.Build;

public final class getNegativeString {
    private getNegativeString() {
    }

    public static boolean isJellyBeanAndAbove() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isBelowLollipopMR1() {
        return Build.VERSION.SDK_INT < 22;
    }

    public static boolean isOreoAndAbove() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
