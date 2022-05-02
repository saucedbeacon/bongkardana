package com.alibaba.griver.ui.popmenu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class TinyMenuBgDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f10597a;
    private Paint b;
    private Rect c;
    private Rect d;
    private boolean e = false;

    public int getOpacity() {
        return -2;
    }

    public TinyMenuBgDrawable(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f10597a = bitmap;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        if (this.f10597a != null) {
            this.c = new Rect(i, i2, i3, i4);
        } else {
            this.c = new Rect(0, 0, 0, 0);
        }
        this.d = new Rect(i5, i6, i7, i8);
    }

    public void draw(@NonNull Canvas canvas) {
        try {
            if (this.f10597a == null || this.e) {
                canvas.drawColor(-285673224);
            } else if (this.c == null || this.c.width() <= 0 || this.c.height() <= 0) {
                canvas.drawColor(-285673224);
            } else {
                canvas.drawBitmap(this.f10597a, this.c, this.d, this.b);
            }
        } catch (Throwable th) {
            RVLogger.e("TinyMenuBgDrawable", th);
            this.e = true;
        }
    }

    public void setAlpha(int i) {
        Paint paint = this.b;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Paint paint = this.b;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
