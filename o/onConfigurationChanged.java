package o;

import android.os.Build;
import android.view.ScaleGestureDetector;

public final class onConfigurationChanged {
    public static void setMin(ScaleGestureDetector scaleGestureDetector, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }
}
