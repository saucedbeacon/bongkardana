package o;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;

public final class getTitleMarginTop {
    private static PointF getMax = new PointF();

    public static double getMax(double d, double d2, @FloatRange(from = 0.0d, to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    public static boolean getMax(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float getMin(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int getMin(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static PointF getMin(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void length(enoughToFilter enoughtofilter, Path path) {
        path.reset();
        PointF pointF = enoughtofilter.getMin;
        path.moveTo(pointF.x, pointF.y);
        getMax.set(pointF.x, pointF.y);
        for (int i = 0; i < enoughtofilter.length.size(); i++) {
            isQueryRefinementEnabled isqueryrefinementenabled = enoughtofilter.length.get(i);
            PointF pointF2 = isqueryrefinementenabled.getMin;
            PointF pointF3 = isqueryrefinementenabled.getMax;
            PointF pointF4 = isqueryrefinementenabled.setMin;
            if (!pointF2.equals(getMax) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            getMax.set(pointF4.x, pointF4.y);
        }
        if (enoughtofilter.getMin()) {
            path.close();
        }
    }

    public static int getMin(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float setMax(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static double setMin(double d) {
        return Math.max(0.0d, Math.min(1.0d, d));
    }

    public static void getMin(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2, onNothingSelected onnothingselected) {
        if (setmaxwidth.length(onnothingselected.setMin(), i)) {
            setMaxWidth setmaxwidth3 = new setMaxWidth(setmaxwidth2.setMax(onnothingselected.setMin()));
            setmaxwidth3.getMin = onnothingselected;
            list.add(setmaxwidth3);
        }
    }

    static int length(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
