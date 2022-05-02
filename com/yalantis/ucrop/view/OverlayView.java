package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.getDecoratedLeft;
import o.isFocusedChildVisibleAfterScrolling;
import o.setMeasurementCacheEnabled;

public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private Paint FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm;
    private int ICustomTabsCallback;
    private boolean IsOverlapping;
    private int Mean$Arithmetic;
    private int b;
    private boolean create;
    private float[] equals;
    private getDecoratedLeft getCause;
    private float getMax;
    private int getMin;
    private Paint hashCode;
    private float invoke;
    private int invokeSuspend;
    private int isInside;
    private final RectF length;
    protected float[] mCropGridCenter;
    protected float[] mCropGridCorners;
    protected int mThisHeight;
    protected int mThisWidth;
    private int setMax;
    private final RectF setMin;
    private Paint toDoubleRange;
    private boolean toFloatRange;
    private boolean toIntRange;
    private Path toString;
    private float valueOf;
    private Paint values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, (AttributeSet) null);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMin = new RectF();
        this.length = new RectF();
        this.equals = null;
        this.toString = new Path();
        this.toDoubleRange = new Paint(1);
        this.hashCode = new Paint(1);
        this.values = new Paint(1);
        this.FastBitmap$CoordinateSystem = new Paint(1);
        this.Grayscale$Algorithm = 0;
        this.valueOf = -1.0f;
        this.invoke = -1.0f;
        this.invokeSuspend = -1;
        this.Mean$Arithmetic = getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.length);
        this.b = getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.getMax);
        this.ICustomTabsCallback = getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.setMin);
        init();
    }

    public getDecoratedLeft getOverlayViewChangeListener() {
        return this.getCause;
    }

    public void setOverlayViewChangeListener(getDecoratedLeft getdecoratedleft) {
        this.getCause = getdecoratedleft;
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.setMin;
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.Grayscale$Algorithm == 1;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.Grayscale$Algorithm = z ? 1 : 0;
    }

    public int getFreestyleCropMode() {
        return this.Grayscale$Algorithm;
    }

    public void setFreestyleCropMode(int i) {
        this.Grayscale$Algorithm = i;
        postInvalidate();
    }

    public void setCircleDimmedLayer(boolean z) {
        this.IsOverlapping = z;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i) {
        this.getMin = i;
        this.equals = null;
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i) {
        this.setMax = i;
        this.equals = null;
    }

    public void setShowCropFrame(boolean z) {
        this.toFloatRange = z;
    }

    public void setShowCropGrid(boolean z) {
        this.toIntRange = z;
    }

    public void setDimmedColor(@ColorInt int i) {
        this.isInside = i;
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i) {
        this.values.setStrokeWidth((float) i);
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i) {
        this.hashCode.setStrokeWidth((float) i);
    }

    public void setCropFrameColor(@ColorInt int i) {
        this.values.setColor(i);
    }

    public void setCropGridColor(@ColorInt int i) {
        this.hashCode.setColor(i);
    }

    public void setTargetAspectRatio(float f) {
        this.getMax = f;
        if (this.mThisWidth > 0) {
            setupCropBounds();
            postInvalidate();
            return;
        }
        this.create = true;
    }

    public void setupCropBounds() {
        int i = this.mThisWidth;
        float f = this.getMax;
        int i2 = (int) (((float) i) / f);
        int i3 = this.mThisHeight;
        if (i2 > i3) {
            int i4 = (int) (((float) i3) * f);
            int i5 = (i - i4) / 2;
            this.setMin.set((float) (getPaddingLeft() + i5), (float) getPaddingTop(), (float) (getPaddingLeft() + i4 + i5), (float) (getPaddingTop() + this.mThisHeight));
        } else {
            int i6 = (i3 - i2) / 2;
            this.setMin.set((float) getPaddingLeft(), (float) (getPaddingTop() + i6), (float) (getPaddingLeft() + this.mThisWidth), (float) (getPaddingTop() + i2 + i6));
        }
        getDecoratedLeft getdecoratedleft = this.getCause;
        if (getdecoratedleft != null) {
            getdecoratedleft.setMax(this.setMin);
        }
        length();
    }

    private void length() {
        this.mCropGridCorners = isFocusedChildVisibleAfterScrolling.setMax(this.setMin);
        RectF rectF = this.setMin;
        this.mCropGridCenter = new float[]{rectF.centerX(), rectF.centerY()};
        this.equals = null;
        this.toString.reset();
        this.toString.addCircle(this.setMin.centerX(), this.setMin.centerY(), Math.min(this.setMin.width(), this.setMin.height()) / 2.0f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void init() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.mThisWidth = (getWidth() - getPaddingRight()) - paddingLeft;
            this.mThisHeight = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.create) {
                this.create = false;
                setTargetAspectRatio(this.getMax);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.setMin.isEmpty() || this.Grayscale$Algorithm == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if ((motionEvent.getAction() & 255) == 0) {
            double d = (double) this.Mean$Arithmetic;
            int i = -1;
            for (int i2 = 0; i2 < 8; i2 += 2) {
                double sqrt = Math.sqrt(Math.pow((double) (x - this.mCropGridCorners[i2]), 2.0d) + Math.pow((double) (y - this.mCropGridCorners[i2 + 1]), 2.0d));
                if (sqrt < d) {
                    i = i2 / 2;
                    d = sqrt;
                }
            }
            int i3 = (this.Grayscale$Algorithm != 1 || i >= 0 || !this.setMin.contains(x, y)) ? i : 4;
            this.invokeSuspend = i3;
            boolean z = i3 != -1;
            if (!z) {
                this.valueOf = -1.0f;
                this.invoke = -1.0f;
            } else if (this.valueOf < 0.0f) {
                this.valueOf = x;
                this.invoke = y;
            }
            return z;
        } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.invokeSuspend != -1) {
            float min = Math.min(Math.max(x, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
            float min2 = Math.min(Math.max(y, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
            this.length.set(this.setMin);
            int i4 = this.invokeSuspend;
            if (i4 == 0) {
                this.length.set(min, min2, this.setMin.right, this.setMin.bottom);
            } else if (i4 == 1) {
                this.length.set(this.setMin.left, min2, min, this.setMin.bottom);
            } else if (i4 == 2) {
                this.length.set(this.setMin.left, this.setMin.top, min, min2);
            } else if (i4 == 3) {
                this.length.set(min, this.setMin.top, this.setMin.right, min2);
            } else if (i4 == 4) {
                this.length.offset(min - this.valueOf, min2 - this.invoke);
                if (this.length.left > ((float) getLeft()) && this.length.top > ((float) getTop()) && this.length.right < ((float) getRight()) && this.length.bottom < ((float) getBottom())) {
                    this.setMin.set(this.length);
                    length();
                    postInvalidate();
                }
                this.valueOf = min;
                this.invoke = min2;
                return true;
            }
            boolean z2 = this.length.height() >= ((float) this.b);
            boolean z3 = this.length.width() >= ((float) this.b);
            RectF rectF = this.setMin;
            rectF.set(z3 ? this.length.left : rectF.left, (z2 ? this.length : this.setMin).top, (z3 ? this.length : this.setMin).right, (z2 ? this.length : this.setMin).bottom);
            if (z2 || z3) {
                length();
                postInvalidate();
            }
            this.valueOf = min;
            this.invoke = min2;
            return true;
        } else if ((motionEvent.getAction() & 255) != 1) {
            return false;
        } else {
            this.valueOf = -1.0f;
            this.invoke = -1.0f;
            this.invokeSuspend = -1;
            getDecoratedLeft getdecoratedleft = this.getCause;
            if (getdecoratedleft == null) {
                return false;
            }
            getdecoratedleft.setMax(this.setMin);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void drawDimmedLayer(@NonNull Canvas canvas) {
        canvas.save();
        if (this.IsOverlapping) {
            canvas.clipPath(this.toString, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.setMin, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.isInside);
        canvas.restore();
        if (this.IsOverlapping) {
            canvas.drawCircle(this.setMin.centerX(), this.setMin.centerY(), Math.min(this.setMin.width(), this.setMin.height()) / 2.0f, this.toDoubleRange);
        }
    }

    /* access modifiers changed from: protected */
    public void drawCropGrid(@NonNull Canvas canvas) {
        if (this.toIntRange) {
            if (this.equals == null && !this.setMin.isEmpty()) {
                this.equals = new float[((this.getMin * 4) + (this.setMax * 4))];
                int i = 0;
                int i2 = 0;
                while (i < this.getMin) {
                    int i3 = i2 + 1;
                    this.equals[i2] = this.setMin.left;
                    int i4 = i3 + 1;
                    float f = ((float) i) + 1.0f;
                    this.equals[i3] = (this.setMin.height() * (f / ((float) (this.getMin + 1)))) + this.setMin.top;
                    int i5 = i4 + 1;
                    this.equals[i4] = this.setMin.right;
                    this.equals[i5] = (this.setMin.height() * (f / ((float) (this.getMin + 1)))) + this.setMin.top;
                    i++;
                    i2 = i5 + 1;
                }
                for (int i6 = 0; i6 < this.setMax; i6++) {
                    int i7 = i2 + 1;
                    float f2 = ((float) i6) + 1.0f;
                    this.equals[i2] = (this.setMin.width() * (f2 / ((float) (this.setMax + 1)))) + this.setMin.left;
                    int i8 = i7 + 1;
                    this.equals[i7] = this.setMin.top;
                    int i9 = i8 + 1;
                    this.equals[i8] = (this.setMin.width() * (f2 / ((float) (this.setMax + 1)))) + this.setMin.left;
                    i2 = i9 + 1;
                    this.equals[i9] = this.setMin.bottom;
                }
            }
            float[] fArr = this.equals;
            if (fArr != null) {
                canvas.drawLines(fArr, this.hashCode);
            }
        }
        if (this.toFloatRange) {
            canvas.drawRect(this.setMin, this.values);
        }
        if (this.Grayscale$Algorithm != 0) {
            canvas.save();
            this.length.set(this.setMin);
            RectF rectF = this.length;
            int i10 = this.ICustomTabsCallback;
            rectF.inset((float) i10, (float) (-i10));
            canvas.clipRect(this.length, Region.Op.DIFFERENCE);
            this.length.set(this.setMin);
            RectF rectF2 = this.length;
            int i11 = this.ICustomTabsCallback;
            rectF2.inset((float) (-i11), (float) i11);
            canvas.clipRect(this.length, Region.Op.DIFFERENCE);
            canvas.drawRect(this.setMin, this.FastBitmap$CoordinateSystem);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public void processStyledAttributes(@NonNull TypedArray typedArray) {
        this.IsOverlapping = typedArray.getBoolean(setMeasurementCacheEnabled.toFloatRange.warmup, false);
        int color = typedArray.getColor(setMeasurementCacheEnabled.toFloatRange.mayLaunchUrl, getResources().getColor(setMeasurementCacheEnabled.getMin.getMin));
        this.isInside = color;
        this.toDoubleRange.setColor(color);
        this.toDoubleRange.setStyle(Paint.Style.STROKE);
        this.toDoubleRange.setStrokeWidth(1.0f);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(setMeasurementCacheEnabled.toFloatRange.requestPostMessageChannelWithExtras, getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.getMin));
        int color2 = typedArray.getColor(setMeasurementCacheEnabled.toFloatRange.postMessage, getResources().getColor(setMeasurementCacheEnabled.getMin.setMin));
        this.values.setStrokeWidth((float) dimensionPixelSize);
        this.values.setColor(color2);
        this.values.setStyle(Paint.Style.STROKE);
        this.FastBitmap$CoordinateSystem.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.FastBitmap$CoordinateSystem.setColor(color2);
        this.FastBitmap$CoordinateSystem.setStyle(Paint.Style.STROKE);
        this.toFloatRange = typedArray.getBoolean(setMeasurementCacheEnabled.toFloatRange.IPostMessageService, true);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(setMeasurementCacheEnabled.toFloatRange.ICustomTabsService$Default, getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.setMax));
        int color3 = typedArray.getColor(setMeasurementCacheEnabled.toFloatRange.updateVisuals, getResources().getColor(setMeasurementCacheEnabled.getMin.setMax));
        this.hashCode.setStrokeWidth((float) dimensionPixelSize2);
        this.hashCode.setColor(color3);
        this.getMin = typedArray.getInt(setMeasurementCacheEnabled.toFloatRange.validateRelationship, 2);
        this.setMax = typedArray.getInt(setMeasurementCacheEnabled.toFloatRange.requestPostMessageChannel, 2);
        this.toIntRange = typedArray.getBoolean(setMeasurementCacheEnabled.toFloatRange.receiveFile, true);
    }
}
