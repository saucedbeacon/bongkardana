package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;
import o.IntRange;
import o.setMeasurementCacheEnabled;

public class AspectRatioTextView extends TextView {
    private float IsOverlapping;
    private String getMax;
    private int getMin;
    private Paint length;
    private final Rect setMax;
    private float setMin;
    private float toFloatRange;

    public AspectRatioTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMax = new Rect();
        setMin(context.obtainStyledAttributes(attributeSet, setMeasurementCacheEnabled.toFloatRange.ICustomTabsService));
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.setMax = new Rect();
        setMin(context.obtainStyledAttributes(attributeSet, setMeasurementCacheEnabled.toFloatRange.ICustomTabsService));
    }

    public void setActiveColor(@ColorInt int i) {
        setMax(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.setMax);
            int i = this.setMax.bottom;
            int i2 = this.getMin;
            canvas.drawCircle(((float) (this.setMax.right - this.setMax.left)) / 2.0f, (float) (i - i2), (float) (i2 / 2), this.length);
        }
    }

    private void setMin(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.getMax = typedArray.getString(setMeasurementCacheEnabled.toFloatRange.getInterfaceDescriptor);
        this.toFloatRange = typedArray.getFloat(setMeasurementCacheEnabled.toFloatRange.ICustomTabsCallback$Stub$Proxy, 0.0f);
        float f = typedArray.getFloat(setMeasurementCacheEnabled.toFloatRange.getDefaultImpl, 0.0f);
        this.IsOverlapping = f;
        float f2 = this.toFloatRange;
        if (f2 == 0.0f || f == 0.0f) {
            this.setMin = 0.0f;
        } else {
            this.setMin = f2 / f;
        }
        this.getMin = getContext().getResources().getDimensionPixelSize(setMeasurementCacheEnabled.setMin.isInside);
        Paint paint = new Paint(1);
        this.length = paint;
        paint.setStyle(Paint.Style.FILL);
        getMin();
        setMax(getResources().getColor(setMeasurementCacheEnabled.getMin.FastBitmap$CoordinateSystem));
        typedArray.recycle();
    }

    private void setMax(@ColorInt int i) {
        Paint paint = this.length;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, IntRange.setMax(getContext(), setMeasurementCacheEnabled.getMin.toIntRange)}));
    }

    private void getMin() {
        if (!TextUtils.isEmpty(this.getMax)) {
            setText(this.getMax);
            return;
        }
        setText(String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.toFloatRange), Integer.valueOf((int) this.IsOverlapping)}));
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.getMax = aspectRatio.getMin;
        this.toFloatRange = aspectRatio.length;
        float f = aspectRatio.setMax;
        this.IsOverlapping = f;
        float f2 = this.toFloatRange;
        if (f2 == 0.0f || f == 0.0f) {
            this.setMin = 0.0f;
        } else {
            this.setMin = f2 / f;
        }
        getMin();
    }

    public float getAspectRatio(boolean z) {
        if (z) {
            if (this.setMin != 0.0f) {
                float f = this.toFloatRange;
                float f2 = this.IsOverlapping;
                this.toFloatRange = f2;
                this.IsOverlapping = f;
                this.setMin = f2 / f;
            }
            getMin();
        }
        return this.setMin;
    }
}
