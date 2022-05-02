package com.alibaba.griver.image.photo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.base.common.utils.DensityUtil;

public class NumberProgressBar extends View {
    private static final int f = Color.parseColor("#80108EE9");
    private static final int g = Color.parseColor("#FFFFFF");
    private static int h;

    /* renamed from: a  reason: collision with root package name */
    private Paint f10509a;
    private RectF b;
    private RectF c;
    private String d;
    private float e;

    public NumberProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        this.e = -1.0f;
        Paint paint = new Paint();
        this.f10509a = paint;
        paint.setDither(true);
        h = DensityUtil.dip2px(context, 14.0f);
    }

    private void a(Canvas canvas) {
        this.f10509a.setColor(f);
        this.f10509a.setStyle(Paint.Style.FILL);
        RectF rectF = this.c;
        if (rectF != null) {
            canvas.drawRoundRect(rectF, 8.0f, 8.0f, this.f10509a);
        }
    }

    private void b(Canvas canvas) {
        this.f10509a.setStyle(Paint.Style.FILL);
        this.f10509a.setTextSize((float) h);
        Paint.FontMetricsInt fontMetricsInt = this.f10509a.getFontMetricsInt();
        if (this.e < 0.0f) {
            this.e = (this.b.top + ((((this.b.bottom - this.b.top) - ((float) fontMetricsInt.bottom)) + ((float) fontMetricsInt.top)) / 2.0f)) - ((float) fontMetricsInt.top);
        }
        this.f10509a.setTextAlign(Paint.Align.CENTER);
        this.f10509a.setColor(g);
        canvas.drawText(this.d, ((float) getWidth()) / 2.0f, this.e, this.f10509a);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null) {
            this.b = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        }
        a(canvas);
        b(canvas);
    }

    public NumberProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberProgressBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public NumberProgressBar setProgress(int i) {
        if (!(getWidth() == 0 || getHeight() == 0)) {
            if (((float) i) > 100.0f) {
                i = 100;
            }
            if (this.c == null) {
                this.c = new RectF(0.0f, 0.0f, 0.0f, (float) getHeight());
            }
            this.c.right = (((float) i) / 100.0f) * ((float) getWidth());
            invalidate();
        }
        return this;
    }

    public NumberProgressBar setText(String str) {
        this.d = str;
        invalidate();
        return this;
    }
}
