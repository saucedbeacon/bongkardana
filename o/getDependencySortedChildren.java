package o;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

public final class getDependencySortedChildren {
    private static final double length;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        length = d;
    }

    @TargetApi(17)
    public static long setMax() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    public static double length(long j) {
        long j2;
        if (Build.VERSION.SDK_INT >= 17) {
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = SystemClock.uptimeMillis();
        }
        double d = (double) (j2 - j);
        double d2 = length;
        Double.isNaN(d);
        return d * d2;
    }
}
