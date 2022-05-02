package androidx.core.os;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresOptIn;

public class BuildCompat {

    @RequiresOptIn
    public @interface PrereleaseSdkCheck {
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 30)
    public static boolean getMax() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
