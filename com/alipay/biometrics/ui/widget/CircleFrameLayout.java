package com.alipay.biometrics.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alipay.android.phone.mobilecommon.biometric.bio.R;

public class CircleFrameLayout extends FrameLayout {
    private final String BRAND = "Meizu";
    private float circleX = -1.0f;
    private float circleY = -1.0f;
    boolean isEnable;
    WidgetListener widgetListener;

    public interface WidgetListener {
        void notifyError(int i);
    }

    public CircleFrameLayout(Context context) {
        super(context);
    }

    public CircleFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CircleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.bio_circle_frrameLayout);
        this.isEnable = obtainStyledAttributes.getBoolean(R.styleable.bio_circle_frrameLayout_bio_facesdk_enabled, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.isEnable) {
            if (this.circleX < 0.0f) {
                this.circleX = (((float) canvas.getWidth()) * 1.0f) / 2.0f;
                this.circleY = (((float) canvas.getHeight()) * 1.0f) / 2.0f;
            }
            Path path = new Path();
            float f = this.circleX;
            path.addCircle(f, this.circleY, f, Path.Direction.CCW);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            try {
                canvas.clipPath(path, Region.Op.REPLACE);
            } catch (UnsupportedOperationException unused) {
            }
        }
        super.dispatchDraw(canvas);
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
        postInvalidate();
    }

    public void setWidgetListener(WidgetListener widgetListener2) {
        this.widgetListener = widgetListener2;
    }
}
