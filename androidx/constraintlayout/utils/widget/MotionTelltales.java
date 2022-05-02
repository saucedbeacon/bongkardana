package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import o.to;

public class MotionTelltales extends MockView {
    private Paint getMax = new Paint();
    Matrix mInvertMatrix = new Matrix();
    MotionLayout mMotionLayout;
    int mTailColor = -65281;
    float mTailScale = 0.25f;
    int mVelocityMode = 0;
    float[] velocity = new float[2];

    public MotionTelltales(Context context) {
        super(context);
        setMax(context, (AttributeSet) null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMax(context, attributeSet);
    }

    private void setMax(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.setupDialog);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.dismiss) {
                    this.mTailColor = obtainStyledAttributes.getColor(index, this.mTailColor);
                } else if (index == to.length.createTextView) {
                    this.mVelocityMode = obtainStyledAttributes.getInt(index, this.mVelocityMode);
                } else if (index == to.length.createImageView) {
                    this.mTailScale = obtainStyledAttributes.getFloat(index, this.mTailScale);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.getMax.setColor(this.mTailColor);
        this.getMax.setStrokeWidth(5.0f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.mInvertMatrix);
        if (this.mMotionLayout == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.mMotionLayout = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.mMotionLayout.getViewVelocity(this, f2, f, this.velocity, this.mVelocityMode);
                this.mInvertMatrix.mapVectors(this.velocity);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.velocity;
                float f5 = fArr2[0];
                float f6 = this.mTailScale;
                float f7 = f4 - (fArr2[1] * f6);
                this.mInvertMatrix.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.getMax);
            }
        }
    }
}
