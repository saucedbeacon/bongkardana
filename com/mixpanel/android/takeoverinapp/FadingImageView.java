package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class FadingImageView extends ImageView {
    private int equals;
    private Shader getMax;
    private Shader getMin;
    private Matrix length;
    private Paint setMax;
    private Paint setMin;
    private boolean toFloatRange;
    private int toIntRange;

    public FadingImageView(Context context) {
        super(context);
        setMin();
    }

    public FadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin();
    }

    public FadingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.toFloatRange) {
            this.toIntRange = getMeasuredHeight();
            this.equals = getMeasuredWidth();
            this.length.setScale(1.0f, (float) View.MeasureSpec.getSize(i2));
            this.getMax.setLocalMatrix(this.length);
            this.getMin.setLocalMatrix(this.length);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        if (this.toFloatRange) {
            Rect clipBounds = canvas.getClipBounds();
            if (Build.VERSION.SDK_INT >= 26) {
                i = canvas.saveLayer(0.0f, 0.0f, (float) clipBounds.width(), (float) clipBounds.height(), (Paint) null);
            } else {
                i = canvas.saveLayer(0.0f, 0.0f, (float) clipBounds.width(), (float) clipBounds.height(), (Paint) null, 31);
            }
            super.draw(canvas);
            canvas.drawRect(0.0f, 0.0f, (float) this.equals, (float) this.toIntRange, this.setMin);
            canvas.restoreToCount(i);
            return;
        }
        super.draw(canvas);
    }

    private void setMin() {
        this.length = new Matrix();
        this.setMin = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -16777216, -452984832, 0}, new float[]{0.0f, 0.2f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        this.getMax = linearGradient;
        this.setMin.setShader(linearGradient);
        this.setMin.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.setMax = new Paint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 0, -16777216, -16777216}, new float[]{0.0f, 0.85f, 0.98f, 1.0f}, Shader.TileMode.CLAMP);
        this.getMin = linearGradient2;
        this.setMax.setShader(linearGradient2);
        this.setMin.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public void showShadow(boolean z) {
        this.toFloatRange = z;
    }
}
