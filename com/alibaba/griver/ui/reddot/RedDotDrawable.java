package com.alibaba.griver.ui.reddot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RedDotDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f10609a;
    private boolean b;
    private Paint c;
    private int d;
    private int e = 17;
    int mDx;
    int mDy;

    public RedDotDrawable(Context context, Drawable drawable, int i, int i2, int i3, @ColorInt int i4) {
        this.f10609a = drawable;
        Paint paint = new Paint(5);
        this.c = paint;
        paint.setColor(i4);
        this.d = i;
        this.mDx = i2;
        this.mDy = i3;
    }

    public void setColor(int i) {
        this.c.setColor(i);
    }

    public void setShowRedPoint(boolean z) {
        this.b = z;
        invalidateSelf();
    }

    public void setRadius(int i) {
        this.d = i;
    }

    public void setGravity(int i) {
        this.e = i;
    }

    public void draw(@NonNull Canvas canvas) {
        this.f10609a.draw(canvas);
        if (this.b) {
            canvas.drawCircle((float) (getBounds().right - this.mDx), (float) (getBounds().top + this.mDy), (float) this.d, this.c);
        }
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.f10609a.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f10609a.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return this.f10609a.getOpacity();
    }

    public int getIntrinsicHeight() {
        return this.f10609a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10609a.getIntrinsicWidth();
    }

    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.f10609a.setBounds(rect);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f10609a.setBounds(i, i2, i3, i4);
    }

    public static void wrap(View view, int i, int i2, int i3, @ColorInt int i4) {
        View view2 = view;
        Drawable background = view.getBackground();
        if (background == null) {
            view2.setBackground(new RedDotDrawable(view.getContext(), new GradientDrawable(), i, i2, i3, i4));
        } else if (!(background instanceof RedDotDrawable)) {
            view2.setBackground(new RedDotDrawable(view.getContext(), background, i, i2, i3, i4));
        }
    }

    public static void showRedPoint(View view, boolean z) {
        Drawable background = view.getBackground();
        if (background instanceof RedDotDrawable) {
            ((RedDotDrawable) background).setShowRedPoint(z);
        }
    }
}
