package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;

class CameraFrontSightView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f10463a = new Paint();
    private boolean b = false;
    private boolean c = false;
    private long d = 0;
    private int e;
    private int f;
    private int g;
    private ViewGroup.LayoutParams h;
    protected int mHeight;
    protected int mWidth;

    public CameraFrontSightView(Context context) {
        super(context);
    }

    public CameraFrontSightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraFrontSightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void startDraw() {
        setVisibility(0);
        this.b = true;
        this.c = false;
        this.d = System.currentTimeMillis();
        invalidate();
    }

    public final void init(int i, int i2) {
        this.mWidth = a((float) i);
        this.mHeight = a((float) i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.h = layoutParams;
        if (layoutParams != null) {
            layoutParams.width = this.mWidth;
            this.h.height = this.mHeight;
        }
        setLayoutParams(this.h);
        this.e = this.mWidth / 2;
        this.f = this.mHeight / 2;
        this.g = a(1.0f);
        this.f10463a.setColor(-8393929);
        this.f10463a.setStrokeWidth((float) this.g);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.e / 2), (float) (this.f / 2));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (currentTimeMillis > 200) {
            this.b = false;
        }
        if (currentTimeMillis > BeaconManager.DEFAULT_FOREGROUND_SCAN_PERIOD) {
            this.c = true;
        }
        if (currentTimeMillis > 1300) {
            setVisibility(8);
            return;
        }
        if (this.b) {
            float f2 = (((float) (200 - currentTimeMillis)) / 200.0f) + 1.0f;
            canvas.scale(f2, f2, (float) (this.e / 2), (float) (this.f / 2));
            this.f10463a.setAlpha((int) ((2.0f - f2) * 255.0f));
        }
        if (this.c) {
            this.f10463a.setAlpha((int) (((1300.0f - ((float) currentTimeMillis)) / 200.0f) * 255.0f));
        }
        canvas.drawLine(0.0f, 0.0f, (float) this.e, 0.0f, this.f10463a);
        canvas.drawLine(0.0f, 0.0f, 0.0f, (float) this.f, this.f10463a);
        int i = this.e;
        canvas.drawLine((float) i, 0.0f, (float) i, (float) this.f, this.f10463a);
        int i2 = this.f;
        canvas.drawLine(0.0f, (float) i2, (float) this.e, (float) i2, this.f10463a);
        int i3 = this.f;
        canvas.drawLine(0.0f, (float) (i3 / 2), (float) (this.e / 10), (float) (i3 / 2), this.f10463a);
        int i4 = this.e;
        int i5 = this.f;
        canvas.drawLine((float) i4, (float) (i5 / 2), (float) ((i4 * 9) / 10), (float) (i5 / 2), this.f10463a);
        int i6 = this.e;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) (i6 / 2), 0.0f, (float) (i6 / 2), (float) (this.f / 10), this.f10463a);
        int i7 = this.e;
        int i8 = this.f;
        canvas2.drawLine((float) (i7 / 2), (float) i8, (float) (i7 / 2), (float) ((i8 * 9) / 10), this.f10463a);
        invalidate();
    }

    private int a(float f2) {
        return (int) ((f2 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
