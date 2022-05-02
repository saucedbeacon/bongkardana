package com.alibaba.griver.image.photo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.image.R;

public class CircleProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f10506a = -1;
    private int b = 0;
    private int c = -1;
    private int d = 100;
    private int e = -1;
    private Paint f;
    private int g;
    private int h;
    private RectF i;

    public CircleProgressBar(Context context) {
        super(context);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.griver_image_video_pregress_radius);
        this.h = dimensionPixelOffset;
        this.f10506a = dimensionPixelOffset - DensityUtil.dip2px(context, 3.0f);
        this.b = 0;
        this.c = -1;
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.g = DensityUtil.dip2px(context, 1.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f10506a != -1 && getVisibility() == 0) {
            c(canvas);
            b(canvas);
            a(canvas);
        }
    }

    private void a(Canvas canvas) {
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth((float) this.g);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.h, this.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r8.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.d
            if (r0 <= 0) goto L_0x0011
            int r1 = r8.e
            if (r1 < 0) goto L_0x0011
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            r5 = r1
            goto L_0x0013
        L_0x0011:
            r1 = 0
            r5 = 0
        L_0x0013:
            android.graphics.Paint r0 = r8.f
            int r1 = r8.c
            r0.setColor(r1)
            r8.a()
            android.graphics.RectF r3 = r8.i
            r4 = 1132920832(0x43870000, float:270.0)
            r6 = 1
            android.graphics.Paint r7 = r8.f
            r2 = r9
            r2.drawArc(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.photo.widget.CircleProgressBar.b(android.graphics.Canvas):void");
    }

    private void c(Canvas canvas) {
        this.f.setColor(this.b);
        this.f.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f10506a, this.f);
    }

    private void a() {
        float width = (((float) getWidth()) - ((float) (this.f10506a * 2))) / 2.0f;
        float height = (((float) getHeight()) - (((float) this.f10506a) * 2.0f)) / 2.0f;
        float width2 = ((float) getWidth()) - ((((float) getWidth()) - ((float) (this.f10506a * 2))) / 2.0f);
        float height2 = ((float) getHeight()) - ((((float) getHeight()) - (((float) this.f10506a) * 2.0f)) / 2.0f);
        RectF rectF = this.i;
        if (rectF == null) {
            this.i = new RectF(width, height, width2, height2);
            return;
        }
        rectF.left = width;
        this.i.top = height;
        this.i.right = width2;
        this.i.bottom = height2;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            invalidate();
        }
    }

    public void setRadius(int i2) {
        this.f10506a = i2;
    }

    public void setRadius(int i2, int i3) {
        this.h = i2;
        this.f10506a = i3;
        invalidate();
    }

    public void setProgressBackground(int i2) {
        this.b = i2;
    }

    public void setProgressColor(int i2) {
        this.c = i2;
    }

    public void setMax(int i2) {
        this.d = i2;
    }

    public void setProgress(int i2) {
        this.e = i2;
        invalidate();
    }

    public void safeSetProgress(final int i2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new Runnable() {
                public void run() {
                    CircleProgressBar.this.setProgress(i2);
                }
            });
        } else {
            setProgress(i2);
        }
    }
}
