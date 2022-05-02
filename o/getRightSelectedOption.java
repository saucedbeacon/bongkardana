package o;

import android.os.Build;

public final class getRightSelectedOption {
    public static boolean getMin() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean length() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
