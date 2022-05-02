package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.ant.AUImageView;

public class TinyRoundImageView extends AUImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f10603a;
    private Paint b;
    private BitmapShader c;
    private Matrix d;
    private Path e;
    private RectF f;
    private RectF g;
    private RectF h;
    private long i;
    private int j;
    private int k;
    private int l;
    private int m;

    public TinyRoundImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TinyRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TinyRoundImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = 0;
        this.k = 0;
        this.l = DensityUtil.dip2px(context, 2.0f);
        this.m = 0;
        this.j = 0;
        this.k = 0;
        a();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private void a() {
        this.f10603a = new Paint();
        b();
        this.e = new Path();
        this.f = new RectF();
        this.h = new RectF();
        this.g = new RectF();
        this.d = new Matrix();
    }

    private void b() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setColor(this.k);
        this.b.setStrokeWidth((float) this.m);
        this.b.setStyle(Paint.Style.STROKE);
    }

    public void setRadius(int i2) {
        if (this.l != i2) {
            this.l = i2;
            c();
            postInvalidate();
        }
    }

    public void setDefaultImageColor(int i2) {
        if (this.j != i2) {
            this.j = i2;
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f.width() != ((float) getWidth()) || this.f.height() != ((float) getHeight())) {
            c();
        }
    }

    private void c() {
        this.f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.g.set(this.f);
        this.h.set(this.f);
        float f2 = (float) this.m;
        this.g.inset(f2, f2);
        this.h.inset(f2, f2);
        this.e.reset();
        Path path = this.e;
        RectF rectF = this.g;
        int i2 = this.l;
        path.addRoundRect(rectF, (float) i2, (float) i2, Path.Direction.CW);
    }

    private void a(BitmapDrawable bitmapDrawable) {
        this.c = null;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.c = new BitmapShader(bitmap, tileMode, tileMode);
            a(bitmap);
            this.c.setLocalMatrix(this.d);
        }
        this.f10603a.reset();
        this.f10603a.setAntiAlias(true);
        this.f10603a.setShader(this.c);
        if (this.c == null) {
            this.f10603a.setColor(this.j);
        }
    }

    private void a(Bitmap bitmap) {
        float f2;
        float f3;
        this.d.reset();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = (int) this.f.width();
        int height2 = (int) this.f.height();
        if (!((width < 0 || width2 == width) && (height < 0 || height2 == height))) {
            float f4 = 0.0f;
            if (width * height2 > width2 * height) {
                f2 = ((float) height2) / ((float) height);
                f4 = (((float) width2) - (((float) width) * f2)) * 0.5f;
                f3 = 0.0f;
            } else {
                float f5 = ((float) width2) / ((float) width);
                f3 = (((float) height2) - (((float) height) * f5)) * 0.5f;
                f2 = f5;
            }
            this.d.setScale(f2, f2);
            this.d.postTranslate((float) Math.round(f4), (float) Math.round(f3));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            if (this.l <= 0) {
                super.onDraw(canvas);
                return;
            }
            boolean z = false;
            boolean z2 = this.i != ((long) drawable.hashCode());
            if (z2) {
                this.i = (long) drawable.hashCode();
            }
            if (drawable instanceof BitmapDrawable) {
                if (z2) {
                    try {
                        a((BitmapDrawable) drawable);
                    } catch (Throwable th) {
                        RVLogger.e("SimpleRoundImageView", th);
                        a(canvas, drawable);
                    }
                }
                canvas.drawRoundRect(this.g, (float) this.l, (float) this.l, this.f10603a);
            } else if (drawable instanceof ColorDrawable) {
                if (z2) {
                    try {
                        int color = ((ColorDrawable) drawable).getColor();
                        this.f10603a.reset();
                        this.f10603a.setAntiAlias(true);
                        this.f10603a.setColor(color);
                    } catch (Throwable th2) {
                        RVLogger.e("SimpleRoundImageView", th2);
                        a(canvas, drawable);
                    }
                }
                canvas.drawRoundRect(this.g, (float) this.l, (float) this.l, this.f10603a);
            } else {
                int saveCount = canvas.getSaveCount();
                canvas.save();
                try {
                    canvas.clipPath(this.e);
                    if (getImageMatrix() != null) {
                        canvas.concat(getImageMatrix());
                    }
                    drawable.draw(canvas);
                } catch (Throwable th3) {
                    RVLogger.e("SimpleRoundImageView", th3);
                    z = true;
                }
                canvas.restoreToCount(saveCount);
                if (z) {
                    a(canvas, drawable);
                }
            }
            if (this.m > 0) {
                try {
                    canvas.drawRoundRect(this.h, (float) this.l, (float) this.l, this.b);
                } catch (Throwable th4) {
                    RVLogger.e("SimpleRoundImageView", th4);
                }
            }
        }
    }

    private void a(Canvas canvas, Drawable drawable) {
        int saveCount = canvas.getSaveCount();
        canvas.save();
        if (getImageMatrix() != null) {
            canvas.concat(getImageMatrix());
        }
        drawable.draw(canvas);
        canvas.restoreToCount(saveCount);
    }
}
