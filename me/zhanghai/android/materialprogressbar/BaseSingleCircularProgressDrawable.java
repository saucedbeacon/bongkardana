package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;

abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* access modifiers changed from: protected */
    public abstract void onDrawRing(@NonNull Canvas canvas, @NonNull Paint paint);

    BaseSingleCircularProgressDrawable() {
    }

    /* access modifiers changed from: protected */
    public void onPreparePaint(@NonNull Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint) {
        if (this.mUseIntrinsicPadding) {
            canvas.scale(((float) i) / RECT_PADDED_BOUND.width(), ((float) i2) / RECT_PADDED_BOUND.height());
            canvas.translate(RECT_PADDED_BOUND.width() / 2.0f, RECT_PADDED_BOUND.height() / 2.0f);
        } else {
            canvas.scale(((float) i) / RECT_BOUND.width(), ((float) i2) / RECT_BOUND.height());
            canvas.translate(RECT_BOUND.width() / 2.0f, RECT_BOUND.height() / 2.0f);
        }
        onDrawRing(canvas, paint);
    }

    /* access modifiers changed from: protected */
    public void drawRing(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f2) {
        canvas.drawArc(RECT_PROGRESS, f - 0.049804688f, f2, false, paint);
    }
}
