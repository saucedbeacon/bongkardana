package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class getTargetFragment {
    private static Paint.FontMetrics FastBitmap$CoordinateSystem = new Paint.FontMetrics();
    private static Rect IsOverlapping = new Rect();
    private static closeDrawers equals = new openDrawer(1);
    private static int getMax = 8000;
    private static DisplayMetrics getMin = null;
    private static Rect hashCode = new Rect();
    private static Rect isInside = new Rect();
    public static final double length = Double.longBitsToDouble(1);
    private static int setMax = 50;
    public static final float setMin = Float.intBitsToFloat(1);
    private static final int[] toFloatRange = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
    private static Paint.FontMetrics toIntRange = new Paint.FontMetrics();
    private static Rect toString = new Rect();

    public static float getMin(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static void length(Context context) {
        if (context == null) {
            setMax = ViewConfiguration.getMinimumFlingVelocity();
            getMax = ViewConfiguration.getMaximumFlingVelocity();
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        setMax = viewConfiguration.getScaledMinimumFlingVelocity();
        getMax = viewConfiguration.getScaledMaximumFlingVelocity();
        getMin = context.getResources().getDisplayMetrics();
    }

    public static float setMax(float f) {
        DisplayMetrics displayMetrics = getMin;
        if (displayMetrics == null) {
            return f;
        }
        return f * displayMetrics.density;
    }

    public static int getMin(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static int setMax(Paint paint, String str) {
        Rect rect = IsOverlapping;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float getMax(Paint paint) {
        Paint.FontMetrics fontMetrics = toIntRange;
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getMin(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float length(Paint paint) {
        Paint.FontMetrics fontMetrics = toIntRange;
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static float setMax(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static getArguments length(Paint paint, String str) {
        getArguments length2 = getArguments.length(0.0f, 0.0f);
        Rect rect = isInside;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        length2.length = (float) rect.width();
        length2.setMax = (float) rect.height();
        return length2;
    }

    public static closeDrawers setMin() {
        return equals;
    }

    public static float setMin(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < 0.0d ? -d : d)))))));
        double d2 = (double) pow;
        Double.isNaN(d2);
        return ((float) Math.round(d * d2)) / pow;
    }

    public static int length(float f) {
        float min = setMin((double) f);
        if (Float.isInfinite(min)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) min))) + 2;
    }

    public static double getMax(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1 : -1));
    }

    public static void setMax(setArguments setarguments, float f, float f2, setArguments setarguments2) {
        double d = (double) setarguments.length;
        double d2 = (double) f;
        double d3 = (double) f2;
        double cos = Math.cos(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d);
        setarguments2.length = (float) (d + (cos * d2));
        double d4 = (double) setarguments.getMin;
        double sin = Math.sin(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d4);
        setarguments2.getMin = (float) (d4 + (d2 * sin));
    }

    public static void setMax(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, (float) getMax);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void getMin(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10);
        }
    }

    public static int setMax() {
        return setMax;
    }

    public static int getMin() {
        return getMax;
    }

    public static void setMax(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        setArguments length2 = setArguments.length();
        length2.length = (float) (i - (i3 / 2));
        length2.getMin = (float) (i2 - (i4 / 2));
        drawable.copyBounds(toString);
        drawable.setBounds(toString.left, toString.top, toString.left + i3, toString.top + i3);
        int save = canvas.save();
        canvas.translate(length2.length, length2.getMin);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void setMax(Canvas canvas, String str, float f, float f2, Paint paint, setArguments setarguments, float f3) {
        float fontMetrics = paint.getFontMetrics(FastBitmap$CoordinateSystem);
        paint.getTextBounds(str, 0, str.length(), hashCode);
        float f4 = 0.0f - ((float) hashCode.left);
        float f5 = (-FastBitmap$CoordinateSystem.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = f4 - (((float) hashCode.width()) * 0.5f);
            float f6 = f5 - (fontMetrics * 0.5f);
            if (!(setarguments.length == 0.5f && setarguments.getMin == 0.5f)) {
                getArguments min = setMin((float) hashCode.width(), fontMetrics, 0.017453292f * f3);
                f -= min.length * (setarguments.length - 0.5f);
                f2 -= min.setMax * (setarguments.getMin - 0.5f);
                getArguments.setMin(min);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, width, f6, paint);
            canvas.restore();
        } else {
            if (!(setarguments.length == 0.0f && setarguments.getMin == 0.0f)) {
                f4 -= ((float) hashCode.width()) * setarguments.length;
                f5 -= fontMetrics * setarguments.getMin;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static getArguments getMax(float f, float f2, float f3) {
        return setMin(f, f2, f3 * 0.017453292f);
    }

    private static getArguments setMin(float f, float f2, float f3) {
        double d = (double) f3;
        return getArguments.length(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    public static int getMax() {
        return Build.VERSION.SDK_INT;
    }
}
