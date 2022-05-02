package com.alibaba.griver.ui.ant.basic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.AUImageView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class AUMaskImage extends AUImageView {

    /* renamed from: a  reason: collision with root package name */
    private static final Matrix f10546a = new Matrix();
    private static final Xfermode b = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    private static PaintFlagsDrawFilter c = new PaintFlagsDrawFilter(0, 3);
    private Bitmap d;
    private Paint e;
    private int f = 0;
    private int g = 0;
    protected boolean isCreateMask = true;

    public abstract Bitmap createMask(int i, int i2);

    public AUMaskImage(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public AUMaskImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public AUMaskImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public void setNeedMask(boolean z) {
        this.isCreateMask = z;
    }

    private void a(Context context, AttributeSet attributeSet) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-1916161767, oncanceled);
            onCancelLoad.getMin(-1916161767, oncanceled);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griver_MaskImage);
            this.isCreateMask = obtainStyledAttributes.getBoolean(R.styleable.griver_MaskImage_hasMask, true);
            obtainStyledAttributes.recycle();
        }
        this.e = new Paint();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.isCreateMask) {
            super.onDraw(canvas);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            int width = getWidth();
            int height = getHeight();
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) width, (float) height, (Paint) null, 31);
            if (this.d == null || this.d.isRecycled() || this.f != width || this.g != height) {
                this.d = createMask(width, height);
                this.g = height;
                this.f = width;
            }
            canvas.drawBitmap(this.d, f10546a, this.e);
            this.e.setXfermode(b);
            DrawFilter drawFilter = canvas.getDrawFilter();
            canvas.setDrawFilter(c);
            canvas.drawBitmap(drawableToBitmap(drawable), getImageMatrix(), this.e);
            canvas.setDrawFilter(drawFilter);
            this.e.setXfermode((Xfermode) null);
            canvas.restoreToCount(saveLayer);
        } catch (Exception unused) {
            super.onDraw(canvas);
        }
    }

    public Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = getWidth();
        int height = getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
