package id.dana.showcase.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.resetInternal;

public class RoundedView extends FrameLayout {
    private float getMax;
    private float getMin;
    private float length;
    private float setMax;
    private float setMin;

    public RoundedView(@NonNull Context context) {
        super(context);
        setMin(context, (AttributeSet) null, 0);
    }

    public RoundedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin(context, attributeSet, 0);
    }

    public RoundedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin(context, attributeSet, i);
    }

    public void setCornerRadius(float f) {
        this.setMax = f;
        invalidate();
    }

    public void setTopLeftCornerRadius(float f) {
        this.getMax = f;
        invalidate();
    }

    public void setTopRightCornerRadius(float f) {
        this.getMin = f;
        invalidate();
    }

    public void setBottomLeftCornerRadius(float f) {
        this.length = f;
        invalidate();
    }

    public void setBottomRightCornerRadius(float f) {
        this.setMin = f;
        invalidate();
    }

    private void setMin(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.addOnContextAvailableListener, i, 0);
        this.setMax = obtainStyledAttributes.getDimension(2, -1.0f);
        this.getMax = obtainStyledAttributes.getDimension(3, 0.0f);
        this.getMin = obtainStyledAttributes.getDimension(4, 0.0f);
        this.length = obtainStyledAttributes.getDimension(0, 0.0f);
        this.setMin = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
        setLayerType(1, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        int save = canvas.save();
        Path path = new Path();
        float f = this.setMax;
        if (f == -1.0f) {
            float f2 = this.getMax;
            float f3 = this.getMin;
            float f4 = this.setMin;
            float f5 = this.length;
            fArr = new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        } else {
            fArr = new float[]{f, f, f, f, f, f, f, f};
        }
        path.addRoundRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), fArr, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
}
