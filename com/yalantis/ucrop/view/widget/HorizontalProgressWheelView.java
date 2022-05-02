package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import o.IntRange;
import o.setMeasurementCacheEnabled;

public class HorizontalProgressWheelView extends View {
    private float IsOverlapping;
    private boolean equals;
    private int getMax;
    private Paint getMin;
    private int isInside;
    private float length;
    private final Rect setMax;
    private getMin setMin;
    private int toFloatRange;
    private int toIntRange;

    public interface getMin {
        void getMin();

        void length(float f);

        void setMin();
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMax = new Rect();
        this.toIntRange = IntRange.setMax(getContext(), setMeasurementCacheEnabled.getMin.toFloatRange);
        this.getMax = getContext().getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.equals);
        this.isInside = getContext().getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.toFloatRange);
        this.toFloatRange = getContext().getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.IsOverlapping);
        Paint paint = new Paint(1);
        this.getMin = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.getMin.setStrokeWidth((float) this.getMax);
    }

    @TargetApi(21)
    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.setMax = new Rect();
    }

    public void setScrollingListener(getMin getmin) {
        this.setMin = getmin;
    }

    public void setMiddleLineColor(@ColorInt int i) {
        this.toIntRange = i;
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.length = motionEvent.getX();
        } else if (action == 1) {
            getMin getmin = this.setMin;
            if (getmin != null) {
                this.equals = false;
                getmin.getMin();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.length;
            if (x != 0.0f) {
                if (!this.equals) {
                    this.equals = true;
                    getMin getmin2 = this.setMin;
                    if (getmin2 != null) {
                        getmin2.setMin();
                    }
                }
                this.IsOverlapping -= x;
                postInvalidate();
                this.length = motionEvent.getX();
                getMin getmin3 = this.setMin;
                if (getmin3 != null) {
                    getmin3.length(-x);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.setMax);
        int width = this.setMax.width();
        int i = this.getMax;
        int i2 = this.toFloatRange;
        int i3 = width / (i + i2);
        float f = this.IsOverlapping % ((float) (i2 + i));
        this.getMin.setColor(getResources().getColor(setMeasurementCacheEnabled.getMin.toFloatRange));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.getMin.setAlpha((int) ((((float) i4) / ((float) i5)) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.getMin.setAlpha((int) ((((float) (i3 - i4)) / ((float) i5)) * 255.0f));
            } else {
                this.getMin.setAlpha(255);
            }
            float f2 = -f;
            canvas.drawLine(((float) this.setMax.left) + f2 + ((float) ((this.getMax + this.toFloatRange) * i4)), ((float) this.setMax.centerY()) - (((float) this.isInside) / 4.0f), f2 + ((float) this.setMax.left) + ((float) ((this.getMax + this.toFloatRange) * i4)), ((float) this.setMax.centerY()) + (((float) this.isInside) / 4.0f), this.getMin);
        }
        this.getMin.setColor(this.toIntRange);
        float centerX = (float) this.setMax.centerX();
        float centerY = ((float) this.setMax.centerY()) - (((float) this.isInside) / 2.0f);
        Canvas canvas2 = canvas;
        float f3 = centerY;
        canvas2.drawLine(centerX, f3, (float) this.setMax.centerX(), (((float) this.isInside) / 2.0f) + ((float) this.setMax.centerY()), this.getMin);
    }
}
