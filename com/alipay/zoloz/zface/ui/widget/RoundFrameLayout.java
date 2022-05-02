package com.alipay.zoloz.zface.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class RoundFrameLayout extends FrameLayout {
    private Path mPath;

    public RoundFrameLayout(Context context) {
        super(context);
        init();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.mPath = new Path();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF();
        rectF.left = (float) getPaddingLeft();
        rectF.top = (float) getPaddingTop();
        rectF.right = (float) (i - getPaddingRight());
        rectF.bottom = (float) (i2 - getPaddingBottom());
        float f = (rectF.right - rectF.left) / 2.0f;
        this.mPath.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        canvas.clipPath(this.mPath);
        return super.drawChild(canvas, view, j);
    }
}
