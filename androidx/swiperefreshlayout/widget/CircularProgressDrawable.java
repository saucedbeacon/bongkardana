package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.setWrappedDrawable;

public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final Interpolator length = new setWrappedDrawable();
    private static final Interpolator setMin = new LinearInterpolator();
    private static final int[] toFloatRange = {-16777216};
    private Animator IsOverlapping;
    private float equals;
    final getMin getMax;
    boolean getMin;
    float setMax;
    private Resources toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    public int getOpacity() {
        return -3;
    }

    public CircularProgressDrawable(@NonNull Context context) {
        if (context != null) {
            this.toIntRange = context.getResources();
            getMin getmin = new getMin();
            this.getMax = getmin;
            getmin.isInside = toFloatRange;
            getmin.toIntRange = 0;
            getmin.getCause = getmin.isInside[getmin.toIntRange];
            getMin getmin2 = this.getMax;
            getmin2.equals = 2.5f;
            getmin2.getMax.setStrokeWidth(2.5f);
            invalidateSelf();
            final getMin getmin3 = this.getMax;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressDrawable.setMin(floatValue, getmin3);
                    CircularProgressDrawable.this.setMin(floatValue, getmin3, false);
                    CircularProgressDrawable.this.invalidateSelf();
                }
            });
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(setMin);
            ofFloat.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    CircularProgressDrawable.this.setMax = 0.0f;
                }

                public final void onAnimationRepeat(Animator animator) {
                    CircularProgressDrawable.this.setMin(1.0f, getmin3, true);
                    getMin getmin = getmin3;
                    getmin.hashCode = getmin.setMax;
                    getmin.FastBitmap$CoordinateSystem = getmin.toFloatRange;
                    getmin.toDoubleRange = getmin.IsOverlapping;
                    getMin getmin2 = getmin3;
                    getmin2.toIntRange = (getmin2.toIntRange + 1) % getmin2.isInside.length;
                    getmin2.getCause = getmin2.isInside[getmin2.toIntRange];
                    if (CircularProgressDrawable.this.getMin) {
                        CircularProgressDrawable.this.getMin = false;
                        animator.cancel();
                        animator.setDuration(1332);
                        animator.start();
                        getMin getmin3 = getmin3;
                        if (getmin3.toString) {
                            getmin3.toString = false;
                            return;
                        }
                        return;
                    }
                    CircularProgressDrawable.this.setMax += 1.0f;
                }
            });
            this.IsOverlapping = ofFloat;
            return;
        }
        throw null;
    }

    private void length(float f, float f2, float f3, float f4) {
        getMin getmin = this.getMax;
        float f5 = this.toIntRange.getDisplayMetrics().density;
        float f6 = f2 * f5;
        getmin.equals = f6;
        getmin.getMax.setStrokeWidth(f6);
        getmin.invokeSuspend = f * f5;
        getmin.toIntRange = 0;
        getmin.getCause = getmin.isInside[getmin.toIntRange];
        getmin.invoke = (int) (f3 * f5);
        getmin.Grayscale$Algorithm = (int) (f4 * f5);
    }

    public final void getMax(int i) {
        if (i == 0) {
            length(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            length(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.equals, bounds.exactCenterX(), bounds.exactCenterY());
        getMin getmin = this.getMax;
        RectF rectF = getmin.setMin;
        float f = getmin.invokeSuspend + (getmin.equals / 2.0f);
        if (getmin.invokeSuspend <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) getmin.invoke) * getmin.valueOf) / 2.0f, getmin.equals / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, ((float) bounds.centerY()) + f);
        float f2 = (getmin.setMax + getmin.IsOverlapping) * 360.0f;
        float f3 = ((getmin.toFloatRange + getmin.IsOverlapping) * 360.0f) - f2;
        getmin.getMax.setColor(getmin.getCause);
        getmin.getMax.setAlpha(getmin.Mean$Arithmetic);
        float f4 = getmin.equals / 2.0f;
        rectF.inset(f4, f4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, getmin.getMin);
        float f5 = -f4;
        rectF.inset(f5, f5);
        canvas.drawArc(rectF, f2, f3, false, getmin.getMax);
        if (getmin.toString) {
            if (getmin.values == null) {
                getmin.values = new Path();
                getmin.values.setFillType(Path.FillType.EVEN_ODD);
            } else {
                getmin.values.reset();
            }
            getmin.values.moveTo(0.0f, 0.0f);
            getmin.values.lineTo(((float) getmin.invoke) * getmin.valueOf, 0.0f);
            getmin.values.lineTo((((float) getmin.invoke) * getmin.valueOf) / 2.0f, ((float) getmin.Grayscale$Algorithm) * getmin.valueOf);
            getmin.values.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) getmin.invoke) * getmin.valueOf) / 2.0f), rectF.centerY() + (getmin.equals / 2.0f));
            getmin.values.close();
            getmin.length.setColor(getmin.getCause);
            getmin.length.setAlpha(getmin.Mean$Arithmetic);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(getmin.values, getmin.length);
            canvas.restore();
        }
        canvas.restore();
    }

    public void setAlpha(int i) {
        this.getMax.Mean$Arithmetic = i;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.getMax.Mean$Arithmetic;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.getMax.getMax.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.IsOverlapping.isRunning();
    }

    public void start() {
        this.IsOverlapping.cancel();
        getMin getmin = this.getMax;
        getmin.hashCode = getmin.setMax;
        getmin.FastBitmap$CoordinateSystem = getmin.toFloatRange;
        getmin.toDoubleRange = getmin.IsOverlapping;
        if (this.getMax.toFloatRange != this.getMax.setMax) {
            this.getMin = true;
            this.IsOverlapping.setDuration(666);
            this.IsOverlapping.start();
            return;
        }
        getMin getmin2 = this.getMax;
        getmin2.toIntRange = 0;
        getmin2.getCause = getmin2.isInside[getmin2.toIntRange];
        getMin getmin3 = this.getMax;
        getmin3.hashCode = 0.0f;
        getmin3.FastBitmap$CoordinateSystem = 0.0f;
        getmin3.toDoubleRange = 0.0f;
        getmin3.setMax = 0.0f;
        getmin3.toFloatRange = 0.0f;
        getmin3.IsOverlapping = 0.0f;
        this.IsOverlapping.setDuration(1332);
        this.IsOverlapping.start();
    }

    public void stop() {
        this.IsOverlapping.cancel();
        this.equals = 0.0f;
        getMin getmin = this.getMax;
        if (getmin.toString) {
            getmin.toString = false;
        }
        getMin getmin2 = this.getMax;
        getmin2.toIntRange = 0;
        getmin2.getCause = getmin2.isInside[getmin2.toIntRange];
        getMin getmin3 = this.getMax;
        getmin3.hashCode = 0.0f;
        getmin3.FastBitmap$CoordinateSystem = 0.0f;
        getmin3.toDoubleRange = 0.0f;
        getmin3.setMax = 0.0f;
        getmin3.toFloatRange = 0.0f;
        getmin3.IsOverlapping = 0.0f;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final void setMin(float f, getMin getmin, boolean z) {
        float f2;
        float f3;
        if (this.getMin) {
            setMin(f, getmin);
            float floor = (float) (Math.floor((double) (getmin.toDoubleRange / 0.8f)) + 1.0d);
            getmin.setMax = getmin.hashCode + (((getmin.FastBitmap$CoordinateSystem - 0.01f) - getmin.hashCode) * f);
            getmin.toFloatRange = getmin.FastBitmap$CoordinateSystem;
            getmin.IsOverlapping = getmin.toDoubleRange + ((floor - getmin.toDoubleRange) * f);
        } else if (f != 1.0f || z) {
            float f4 = getmin.toDoubleRange;
            if (f < 0.5f) {
                f2 = getmin.hashCode;
                f3 = (length.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float f5 = getmin.hashCode + 0.79f;
                float f6 = f5;
                f2 = f5 - (((1.0f - length.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f6;
            }
            getmin.setMax = f2;
            getmin.toFloatRange = f3;
            getmin.IsOverlapping = f4 + (0.20999998f * f);
            this.equals = (f + this.setMax) * 216.0f;
        }
    }

    static class getMin {
        float FastBitmap$CoordinateSystem;
        int Grayscale$Algorithm;
        float IsOverlapping = 0.0f;
        int Mean$Arithmetic = 255;
        float equals = 5.0f;
        int getCause;
        final Paint getMax = new Paint();
        final Paint getMin = new Paint();
        float hashCode;
        int invoke;
        float invokeSuspend;
        int[] isInside;
        final Paint length = new Paint();
        float setMax = 0.0f;
        final RectF setMin = new RectF();
        float toDoubleRange;
        float toFloatRange = 0.0f;
        int toIntRange;
        boolean toString;
        float valueOf = 1.0f;
        Path values;

        getMin() {
            this.getMax.setStrokeCap(Paint.Cap.SQUARE);
            this.getMax.setAntiAlias(true);
            this.getMax.setStyle(Paint.Style.STROKE);
            this.length.setStyle(Paint.Style.FILL);
            this.length.setAntiAlias(true);
            this.getMin.setColor(0);
        }
    }

    static void setMin(float f, getMin getmin) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = getmin.isInside[getmin.toIntRange];
            int i2 = getmin.isInside[(getmin.toIntRange + 1) % getmin.isInside.length];
            int i3 = (i >> 24) & 255;
            int i4 = (i >> 16) & 255;
            int i5 = (i >> 8) & 255;
            int i6 = i & 255;
            getmin.getCause = ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & 255) - i6)))));
            return;
        }
        getmin.getCause = getmin.isInside[getmin.toIntRange];
    }
}
