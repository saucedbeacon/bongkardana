package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    CircularProgressBackgroundDrawable() {
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    public void setShowBackground(boolean z) {
        if (this.mShow != z) {
            this.mShow = z;
            invalidateSelf();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onDrawRing(@NonNull Canvas canvas, @NonNull Paint paint) {
        drawRing(canvas, paint, 0.0f, 360.0f);
    }
}