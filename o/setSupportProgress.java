package o;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class setSupportProgress {
    public static Interpolator setMax(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new onPrepareSupportNavigateUpTaskStack(path);
    }

    public static Interpolator setMax(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new onPrepareSupportNavigateUpTaskStack(f, f2, f3, f4);
    }
}
