package com.alibaba.griver.ui.blur;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

class AUBubbleDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private int f10573a;
    private int b;
    private int c = 1;
    private int d = -65536;
    private float e;
    private float f;
    private Paint g = new Paint(1);
    private Path h = new Path();
    private Path i = new Path();
    private RectF j = new RectF();

    public int getOpacity() {
        return -3;
    }

    public AUBubbleDrawable() {
        this.g.setColor(this.d);
        this.g.setStyle(Paint.Style.FILL);
        this.g.setStrokeCap(Paint.Cap.ROUND);
        this.g.setStrokeJoin(Paint.Join.ROUND);
    }

    public void draw(@NonNull Canvas canvas) {
        this.f = Math.min((float) this.f10573a, this.e) / 2.0f;
        int i2 = this.c;
        if (i2 == 0) {
            b(canvas);
        } else if (i2 == 1) {
            a(canvas);
        } else if (i2 != 2) {
            a(canvas);
        } else {
            c(canvas);
        }
    }

    private void a(Canvas canvas) {
        canvas.save();
        canvas.scale(-1.0f, 1.0f, (float) (this.f10573a / 2), (float) (this.b / 2));
        b(canvas);
        canvas.restore();
    }

    private void b(Canvas canvas) {
        a();
        b();
        this.g.setStyle(Paint.Style.FILL);
        this.g.setStrokeWidth(0.0f);
        canvas.drawPath(this.h, this.g);
        this.g.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.i, this.g);
    }

    private void c(Canvas canvas) {
        a();
        c();
        this.g.setStyle(Paint.Style.FILL);
        this.g.setStrokeWidth(0.0f);
        canvas.drawPath(this.h, this.g);
        canvas.drawPath(this.i, this.g);
    }

    private void a() {
        this.h.rewind();
        this.h.moveTo(this.f, 0.0f);
        this.h.lineTo(((float) this.f10573a) - this.f, 0.0f);
        RectF rectF = this.j;
        int i2 = this.f10573a;
        float f2 = this.f;
        rectF.set(((float) i2) - (f2 * 2.0f), 0.0f, (float) i2, f2 * 2.0f);
        this.h.arcTo(this.j, -90.0f, 90.0f, false);
        this.h.lineTo((float) this.f10573a, this.e - this.f);
        RectF rectF2 = this.j;
        int i3 = this.f10573a;
        float f3 = this.f;
        float f4 = this.e;
        rectF2.set(((float) i3) - (f3 * 2.0f), f4 - (f3 * 2.0f), (float) i3, f4);
        this.h.arcTo(this.j, 0.0f, 90.0f, false);
        this.h.lineTo(this.f, this.e);
        RectF rectF3 = this.j;
        float f5 = this.e;
        float f6 = this.f;
        rectF3.set(0.0f, f5 - (f6 * 2.0f), f6 * 2.0f, f5);
        this.h.arcTo(this.j, 90.0f, 90.0f, false);
        this.h.lineTo(0.0f, this.f);
        RectF rectF4 = this.j;
        float f7 = this.f;
        rectF4.set(0.0f, 0.0f, f7 * 2.0f, f7 * 2.0f);
        this.h.arcTo(this.j, -180.0f, 90.0f, false);
    }

    private void b() {
        this.i.rewind();
        Path path = this.i;
        float f2 = this.f;
        path.moveTo(((float) this.f10573a) - (f2 / 2.0f), this.e - (f2 / 2.0f));
        Path path2 = this.i;
        int i2 = this.f10573a;
        double d2 = (double) i2;
        float f3 = this.f;
        double d3 = (double) f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        path2.quadTo((float) (d2 - (d3 / 2.2d)), this.e, ((float) i2) - (f3 / 4.0f), (float) this.b);
        Path path3 = this.i;
        float f4 = this.f;
        path3.lineTo((((float) this.f10573a) - f4) - (f4 / 8.0f), this.e - (f4 / 20.0f));
        this.i.close();
    }

    private void c() {
        this.i.rewind();
        Path path = this.i;
        float f2 = this.e;
        path.moveTo(((float) (this.f10573a / 2)) - (((float) this.b) - f2), f2 - 2.0f);
        this.i.lineTo((float) (this.f10573a / 2), (float) this.b);
        Path path2 = this.i;
        float f3 = this.e;
        path2.lineTo(((float) (this.f10573a / 2)) + (((float) this.b) - f3), f3 - 2.0f);
        this.i.close();
    }

    public void setAlpha(int i2) {
        this.g.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: package-private */
    public void setWidth(int i2) {
        this.f10573a = i2;
    }

    /* access modifiers changed from: package-private */
    public void setHeight(int i2) {
        this.b = i2;
        this.e = this.c == 2 ? ((float) i2) - (((float) i2) / 6.6f) : (float) (i2 - (i2 / 14));
    }

    /* access modifiers changed from: package-private */
    public void setPosition(int i2) {
        this.c = i2;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void setColor(int i2) {
        this.d = i2;
        this.g.setColor(i2);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float getBubbleHeight() {
        return this.e;
    }
}
