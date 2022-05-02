package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class onInterceptFocusSearch extends Drawable {
    private int getMax;
    private final Paint getMin = new Paint(2);
    public Bitmap length;
    private int setMax = 255;
    private int setMin;

    public final int getOpacity() {
        return -3;
    }

    public onInterceptFocusSearch(Bitmap bitmap) {
        this.length = bitmap;
        if (bitmap != null) {
            this.getMax = bitmap.getWidth();
            this.setMin = this.length.getHeight();
            return;
        }
        this.setMin = 0;
        this.getMax = 0;
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.length;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.length, (Rect) null, getBounds(), this.getMin);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.getMin.setColorFilter(colorFilter);
    }

    public final void setFilterBitmap(boolean z) {
        this.getMin.setFilterBitmap(z);
    }

    public final int getAlpha() {
        return this.setMax;
    }

    public final void setAlpha(int i) {
        this.setMax = i;
        this.getMin.setAlpha(i);
    }

    public final int getIntrinsicWidth() {
        return this.getMax;
    }

    public final int getIntrinsicHeight() {
        return this.setMin;
    }

    public final int getMinimumWidth() {
        return this.getMax;
    }

    public final int getMinimumHeight() {
        return this.setMin;
    }
}
