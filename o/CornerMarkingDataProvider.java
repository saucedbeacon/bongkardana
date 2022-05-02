package o;

import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;

public final class CornerMarkingDataProvider {
    public static boolean setMax() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean setMin() {
        return Build.VERSION.SDK_INT >= 18;
    }

    /* renamed from: o.CornerMarkingDataProvider$2  reason: invalid class name */
    public final class AnonymousClass2 {
        private static final AtomicInteger length = new AtomicInteger(1000);

        public static int setMax() {
            return length.incrementAndGet();
        }
    }

    public static boolean getMin() {
        return Build.VERSION.SDK_INT <= 18;
    }

    public static boolean getMax() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean length() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean toIntRange() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static boolean IsOverlapping() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean toFloatRange() {
        return Build.VERSION.SDK_INT > 23;
    }

    public static boolean equals() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isInside() {
        return Build.VERSION.SDK_INT < 26;
    }

    public static boolean FastBitmap$CoordinateSystem() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean values() {
        return Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25;
    }

    public static boolean toDoubleRange() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }

    public static boolean valueOf() {
        return Build.VERSION.SDK_INT <= 22;
    }

    public static boolean Mean$Arithmetic() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
