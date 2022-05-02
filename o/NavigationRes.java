package o;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

public final class NavigationRes {
    private static final ThreadLocal<double[]> getMax = new ThreadLocal<>();

    public static int setMax(@ColorInt int i, @ColorInt int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - alpha2;
        int i4 = 255 - (((255 - alpha) * i3) / 255);
        int i5 = 0;
        int red = i4 == 0 ? 0 : (((Color.red(i) * 255) * alpha2) + ((Color.red(i2) * alpha) * i3)) / (i4 * 255);
        int green = i4 == 0 ? 0 : (((Color.green(i) * 255) * alpha2) + ((Color.green(i2) * alpha) * i3)) / (i4 * 255);
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i4 != 0) {
            i5 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i3)) / (i4 * 255);
        }
        return Color.argb(i4, red, green, i5);
    }

    @ColorInt
    public static int getMax(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & FlexItem.MAX_SIZE) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double getMin(@ColorInt int i) {
        double d;
        double d2;
        double d3;
        double d4;
        double[] dArr = getMax.get();
        if (dArr == null) {
            dArr = new double[3];
            getMax.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d5 = (double) red;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            if (d6 < 0.04045d) {
                d = d6 / 12.92d;
            } else {
                d = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            double d7 = (double) green;
            Double.isNaN(d7);
            double d8 = d7 / 255.0d;
            if (d8 < 0.04045d) {
                d3 = d8 / 12.92d;
                d2 = 2.4d;
            } else {
                d2 = 2.4d;
                d3 = Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
            }
            double d9 = (double) blue;
            Double.isNaN(d9);
            double d10 = d9 / 255.0d;
            if (d10 < 0.04045d) {
                d4 = d10 / 12.92d;
            } else {
                d4 = Math.pow((d10 + 0.055d) / 1.055d, d2);
            }
            dArr[0] = ((0.4124d * d) + (0.3576d * d3) + (0.1805d * d4)) * 100.0d;
            dArr[1] = ((0.2126d * d) + (0.7152d * d3) + (0.0722d * d4)) * 100.0d;
            dArr[2] = ((d * 0.0193d) + (d3 * 0.1192d) + (d4 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
}
