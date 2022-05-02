package io.supercharge.shimmerlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import o.done;

public class ShimmerLayout extends FrameLayout {
    private int FastBitmap$CoordinateSystem;
    private ViewTreeObserver.OnPreDrawListener Grayscale$Algorithm;
    private boolean IsOverlapping;
    private Canvas equals;
    private Rect getMax;
    private Paint getMin;
    private int hashCode;
    private boolean isInside;
    /* access modifiers changed from: private */
    public int length;
    private Bitmap setMax;
    private ValueAnimator setMin;
    private float toDoubleRange;
    private boolean toFloatRange;
    private Bitmap toIntRange;
    private float toString;
    private int values;

    public ShimmerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, done.getMax.getMax, 0, 0);
        try {
            this.hashCode = obtainStyledAttributes.getInteger(done.getMax.getMin, 20);
            this.values = obtainStyledAttributes.getInteger(done.getMax.setMax, 1500);
            int i3 = done.getMax.length;
            int i4 = done.setMax.length;
            if (Build.VERSION.SDK_INT >= 23) {
                i2 = getContext().getColor(i4);
            } else {
                i2 = getResources().getColor(i4);
            }
            this.FastBitmap$CoordinateSystem = obtainStyledAttributes.getColor(i3, i2);
            this.toFloatRange = obtainStyledAttributes.getBoolean(done.getMax.setMin, false);
            this.toDoubleRange = obtainStyledAttributes.getFloat(done.getMax.isInside, 0.5f);
            this.toString = obtainStyledAttributes.getFloat(done.getMax.toIntRange, 0.1f);
            this.IsOverlapping = obtainStyledAttributes.getBoolean(done.getMax.equals, false);
            obtainStyledAttributes.recycle();
            setMaskWidth(this.toDoubleRange);
            setGradientCenterColorWidth(this.toString);
            setShimmerAngle(this.hashCode);
            if (this.toFloatRange && getVisibility() == 0) {
                startShimmerAnimation();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setMax();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.isInside || getWidth() <= 0 || getHeight() <= 0) {
            Canvas canvas2 = canvas;
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
        if (this.toIntRange == null) {
            this.toIntRange = getMin(this.getMax.width(), getHeight());
        }
        Bitmap bitmap = this.toIntRange;
        this.setMax = bitmap;
        if (bitmap != null) {
            if (this.equals == null) {
                this.equals = new Canvas(this.setMax);
            }
            this.equals.drawColor(0, PorterDuff.Mode.CLEAR);
            this.equals.save();
            this.equals.translate((float) (-this.length), 0.0f);
            super.dispatchDraw(this.equals);
            this.equals.restore();
            if (this.getMin == null) {
                int i = this.FastBitmap$CoordinateSystem;
                int argb = Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
                float width = ((float) (getWidth() / 2)) * this.toDoubleRange;
                float height = this.hashCode >= 0 ? (float) getHeight() : 0.0f;
                float cos = ((float) Math.cos(Math.toRadians((double) this.hashCode))) * width;
                float sin = height + (((float) Math.sin(Math.toRadians((double) this.hashCode))) * width);
                int i2 = this.FastBitmap$CoordinateSystem;
                int[] iArr = {argb, i2, i2, argb};
                float[] fArr = new float[4];
                fArr[0] = 0.0f;
                fArr[3] = 1.0f;
                float f = this.toString;
                fArr[1] = 0.5f - (f / 2.0f);
                fArr[2] = (f / 2.0f) + 0.5f;
                LinearGradient linearGradient = new LinearGradient(0.0f, height, cos, sin, iArr, fArr, Shader.TileMode.CLAMP);
                Bitmap bitmap2 = this.setMax;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                ComposeShader composeShader = new ComposeShader(linearGradient, new BitmapShader(bitmap2, tileMode, tileMode), PorterDuff.Mode.DST_IN);
                Paint paint = new Paint();
                this.getMin = paint;
                paint.setAntiAlias(true);
                this.getMin.setDither(true);
                this.getMin.setFilterBitmap(true);
                this.getMin.setShader(composeShader);
            }
            canvas.save();
            canvas.translate((float) this.length, 0.0f);
            canvas.drawRect((float) this.getMax.left, 0.0f, (float) this.getMax.width(), (float) this.getMax.height(), this.getMin);
            canvas.restore();
            this.setMax = null;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            stopShimmerAnimation();
        } else if (this.toFloatRange) {
            startShimmerAnimation();
        }
    }

    public void startShimmerAnimation() {
        final int i;
        ValueAnimator valueAnimator;
        if (!this.isInside) {
            if (getWidth() == 0) {
                this.Grayscale$Algorithm = new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        ShimmerLayout.this.startShimmerAnimation();
                        return true;
                    }
                };
                getViewTreeObserver().addOnPreDrawListener(this.Grayscale$Algorithm);
                return;
            }
            ValueAnimator valueAnimator2 = this.setMin;
            if (valueAnimator2 == null) {
                if (this.getMax == null) {
                    double width = (double) (((float) (getWidth() / 2)) * this.toDoubleRange);
                    double cos = Math.cos(Math.toRadians((double) Math.abs(this.hashCode)));
                    Double.isNaN(width);
                    double d = width / cos;
                    double height = (double) getHeight();
                    double tan = Math.tan(Math.toRadians((double) Math.abs(this.hashCode)));
                    Double.isNaN(height);
                    this.getMax = new Rect(0, 0, (int) (d + (height * tan)), getHeight());
                }
                int width2 = getWidth();
                if (getWidth() > this.getMax.width()) {
                    i = -width2;
                } else {
                    i = -this.getMax.width();
                }
                final int width3 = this.getMax.width();
                int i2 = width2 - i;
                int[] iArr = new int[2];
                if (this.IsOverlapping) {
                    iArr[0] = i2;
                    iArr[1] = 0;
                    valueAnimator = ValueAnimator.ofInt(iArr);
                } else {
                    iArr[0] = 0;
                    iArr[1] = i2;
                    valueAnimator = ValueAnimator.ofInt(iArr);
                }
                this.setMin = valueAnimator;
                valueAnimator.setDuration((long) this.values);
                this.setMin.setRepeatCount(-1);
                this.setMin.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int unused = ShimmerLayout.this.length = i + ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (ShimmerLayout.this.length + width3 >= 0) {
                            ShimmerLayout.this.invalidate();
                        }
                    }
                });
                valueAnimator2 = this.setMin;
            }
            valueAnimator2.start();
            this.isInside = true;
        }
    }

    public void stopShimmerAnimation() {
        if (this.Grayscale$Algorithm != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Grayscale$Algorithm);
        }
        setMax();
    }

    public void setShimmerColor(int i) {
        this.FastBitmap$CoordinateSystem = i;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    public void setShimmerAnimationDuration(int i) {
        this.values = i;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    public void setAnimationReversed(boolean z) {
        this.IsOverlapping = z;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    public void setShimmerAngle(int i) {
        if (i < -45 || 45 < i) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", new Object[]{(byte) -45, Byte.valueOf(Framer.STDIN_FRAME_PREFIX)}));
        }
        this.hashCode = i;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", new Object[]{(byte) 0, (byte) 1}));
        }
        this.toDoubleRange = f;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", new Object[]{(byte) 0, (byte) 1}));
        }
        this.toString = f;
        if (this.isInside) {
            setMax();
            startShimmerAnimation();
        }
    }

    private void setMax() {
        ValueAnimator valueAnimator = this.setMin;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.setMin.removeAllUpdateListeners();
        }
        this.setMin = null;
        this.getMin = null;
        this.isInside = false;
        this.equals = null;
        Bitmap bitmap = this.toIntRange;
        if (bitmap != null) {
            bitmap.recycle();
            this.toIntRange = null;
        }
    }

    private static Bitmap getMin(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }
}
