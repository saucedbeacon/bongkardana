package com.alibaba.griver.image.photo.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

@TargetApi(9)
public class PhotoView extends ImageView {
    public static final String TAG = "PhotoView";

    /* renamed from: a  reason: collision with root package name */
    private static int f10520a = 2048;
    private static boolean b = false;
    private static boolean c = (Build.VERSION.SDK_INT >= 14);
    private boolean A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public View.OnLongClickListener C;
    /* access modifiers changed from: private */
    public View.OnClickListener D;
    /* access modifiers changed from: private */
    public boolean E;
    private int F;
    /* access modifiers changed from: private */
    public boolean d;
    public int defaultDrawableHashCode;
    private int e;
    private DragDetector f;
    public int failDrawableHashCode;
    private ScaleGestureDetector g;
    private GestureDetector h;
    private GridDetector i;
    private Matrix j;
    private float[] k;
    /* access modifiers changed from: private */
    public State l;
    /* access modifiers changed from: private */
    public float m;
    /* access modifiers changed from: private */
    public float n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f10521o;
    /* access modifiers changed from: private */
    public float p;
    private float q;
    private int r;
    private int s;
    /* access modifiers changed from: private */
    public RectF t;
    public int thumbDrawableHashCode;
    /* access modifiers changed from: private */
    public int u;
    /* access modifiers changed from: private */
    public int v;
    private boolean w;
    private boolean x;
    /* access modifiers changed from: private */
    public FlingRunnable y;
    private boolean z;

    public interface SimpleDragListener {
        void onDrag(float f, float f2);

        void onDragBegin();

        void onDragEnd();
    }

    enum State {
        NONE,
        DRAG,
        SCALE,
        FLING,
        TRANSLATE
    }

    /* access modifiers changed from: private */
    public float a(float f2, float f3, float f4, float f5) {
        if (f5 - f4 <= f3 || f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f && f4 + f2 > 0.0f) {
            float f6 = 0.0f - f4;
            return f6 > f2 ? f2 : f6;
        } else if (f2 >= 0.0f || f5 + f2 >= f3) {
            return f2;
        } else {
            float f7 = f3 - f5;
            return f7 < f2 ? f2 : f7;
        }
    }

    @Deprecated
    public void setForceFullScreen(boolean z2) {
    }

    public void setDisplayType(int i2) {
        this.e = i2;
    }

    public void setInitToMaxSquare(boolean z2) {
        this.d = z2;
    }

    public PhotoView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 2;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.m = 1.0f;
        this.x = true;
        this.w = false;
        this.j = new Matrix();
        this.l = State.NONE;
        this.t = new RectF();
        this.k = new float[9];
        Context context = getContext();
        this.f = new DragDetector(new DragListener());
        this.g = new ScaleGestureDetector(context, new ScaleListener());
        this.h = new GestureDetector(context.getApplicationContext(), new GestureListener());
        setEnableCrop(false);
        setClickable(true);
        setEnableScale(true);
        if (!c) {
            f10520a = getMaxTextureSize();
        }
    }

    public void setFitSpace(boolean z2) {
        this.x = z2;
    }

    public void setEnableScale(boolean z2) {
        this.z = z2;
    }

    public void setCropSquare(boolean z2) {
        this.B = z2;
    }

    public boolean getEnableCrop() {
        return this.A;
    }

    public void setEnableCrop(boolean z2) {
        this.A = z2;
        if (z2) {
            GridDetector gridDetector = new GridDetector();
            this.i = gridDetector;
            gridDetector.initRect();
        } else {
            this.i = null;
        }
        invalidate();
    }

    public Bitmap applyCrop() {
        if (this.j == null || !this.w || !this.A) {
            return null;
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof BitmapDrawable)) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        RectF rect = this.i.getRect();
        Bitmap createBitmap = Bitmap.createBitmap((int) (rect.right - rect.left), (int) (rect.bottom - rect.top), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-rect.left, -rect.top);
        canvas.drawBitmap(bitmap, this.j, (Paint) null);
        return createBitmap;
    }

    public void setImageResource(int i2) {
        super.setImageResource(i2);
        e();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e();
        a(bitmap, (Drawable) null);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e();
        a((Bitmap) null, drawable);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e();
    }

    /* access modifiers changed from: private */
    public void b() {
        setImageMatrix(this.j);
    }

    /* access modifiers changed from: private */
    public void setState(State state) {
        this.l = state;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (c) {
            a(canvas);
        }
        if (this.A) {
            this.i.draw(canvas);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.A ? this.i.onTouchEvent(motionEvent) : false;
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            this.E = false;
        }
        if (action == 5) {
            this.E = true;
        }
        if (!onTouchEvent && this.z) {
            this.g.onTouchEvent(motionEvent);
            this.h.onTouchEvent(motionEvent);
            this.f.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onShow() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            a((Bitmap) null, drawable);
        }
    }

    private boolean c() {
        if (!PhotoBrowseView.gDisablePhotoViewHardwareAcc) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 11 && isHardwareAccelerated()) {
            setLayerType(1, (Paint) null);
        }
        return true;
    }

    private void a(Bitmap bitmap, Drawable drawable) {
        if (!c() && Build.VERSION.SDK_INT >= 11) {
            int i2 = 0;
            if (bitmap == null && drawable != null) {
                i2 = Math.max(drawable.getMinimumHeight(), drawable.getMinimumWidth());
            }
            if (bitmap != null) {
                i2 = Math.max(bitmap.getWidth(), bitmap.getHeight());
            }
            if (i2 > f10520a) {
                if (getLayerType() != 1) {
                    setLayerType(1, (Paint) null);
                }
            } else if (getLayerType() != 2) {
                setLayerType(2, (Paint) null);
            }
        }
    }

    class GridDetector {

        /* renamed from: a  reason: collision with root package name */
        private PointF f10524a = new PointF();
        private Paint b = new Paint();
        private int c;
        private RectF d = new RectF();
        private RectF e = new RectF();
        private int f;
        private int g;
        private float h;
        private int i;

        public GridDetector() {
            this.g = PhotoUtil.dp2px(PhotoView.this.getContext(), 30);
            this.f = PhotoUtil.dp2px(PhotoView.this.getContext(), 4);
            this.i = PhotoUtil.dp2px(PhotoView.this.getContext(), 2);
            this.h = ((float) this.g) * 4.0f;
            this.b.setColor(-1);
            this.b.setStyle(Paint.Style.STROKE);
        }

        public RectF getRect() {
            return this.d;
        }

        public void draw(Canvas canvas) {
            int dp2px = PhotoUtil.dp2px(PhotoView.this.getContext(), 6);
            int i2 = dp2px * 2;
            int i3 = this.f;
            this.b.setStrokeWidth((float) (i3 / 3));
            float f2 = (float) (i3 / 2);
            this.e.set(this.d.left + f2, this.d.top + f2, this.d.right - f2, this.d.bottom - f2);
            Canvas canvas2 = canvas;
            canvas2.drawLine(this.d.centerX(), this.d.top, this.d.centerX(), this.d.bottom, this.b);
            canvas2.drawLine(this.d.left, this.d.centerY(), this.d.right, this.d.centerY(), this.b);
            this.b.setStyle(Paint.Style.FILL);
            Path path = new Path();
            float f3 = (float) dp2px;
            path.moveTo(this.d.centerX() - f3, this.d.centerY());
            path.lineTo(this.d.centerX(), this.d.centerY() - f3);
            path.lineTo(this.d.centerX() + f3, this.d.centerY());
            path.lineTo(this.d.centerX(), this.d.centerY() + f3);
            path.close();
            canvas.drawPath(path, this.b);
            path.reset();
            path.moveTo(this.d.left, this.d.top);
            float f4 = (float) i2;
            path.lineTo(this.d.left + f4, this.d.top);
            path.lineTo(this.d.left, this.d.top + f4);
            path.close();
            canvas.drawPath(path, this.b);
            path.reset();
            path.moveTo(this.d.right, this.d.top);
            path.lineTo(this.d.right - f4, this.d.top);
            path.lineTo(this.d.right, this.d.top + f4);
            path.close();
            canvas.drawPath(path, this.b);
            path.reset();
            path.moveTo(this.d.left, this.d.bottom);
            path.lineTo(this.d.left + f4, this.d.bottom);
            path.lineTo(this.d.left, this.d.bottom - f4);
            path.close();
            canvas.drawPath(path, this.b);
            path.reset();
            path.moveTo(this.d.right, this.d.bottom);
            path.lineTo(this.d.right - f4, this.d.bottom);
            path.lineTo(this.d.right, this.d.bottom - f4);
            path.close();
            canvas.drawPath(path, this.b);
            if (Build.VERSION.SDK_INT >= 28) {
                this.b.setStrokeWidth((float) this.f);
                this.b.setStyle(Paint.Style.STROKE);
                this.b.setStrokeWidth((float) this.f);
                canvas.drawRect(this.d, this.b);
                return;
            }
            canvas.clipRect(this.e, Region.Op.XOR);
            canvas.drawColor(1711276032);
            this.b.setStrokeWidth((float) this.f);
            this.b.setStyle(Paint.Style.STROKE);
            canvas.drawRect(this.e, this.b);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.c = a(motionEvent);
                this.f10524a.set(motionEvent.getX(), motionEvent.getY());
            } else if (action == 5 || action == 1 || action == 6) {
                this.c = 0;
            } else if (action == 2 && this.c != 0) {
                b(motionEvent);
                PhotoView.this.invalidate();
            }
            return this.c != 0;
        }

        public void initRect() {
            float f2;
            float width = ((float) PhotoView.this.u) > PhotoView.this.t.width() ? PhotoView.this.t.width() : (float) PhotoView.this.u;
            float height = ((float) PhotoView.this.v) > PhotoView.this.t.height() ? PhotoView.this.t.height() : (float) PhotoView.this.v;
            if (PhotoView.this.d) {
                f2 = Math.min(width, height) - ((float) this.i);
            } else {
                f2 = (Math.min(width, height) * 2.0f) / 3.0f;
            }
            this.d.set((((float) PhotoView.this.u) - f2) / 2.0f, (((float) PhotoView.this.v) - f2) / 2.0f, (((float) PhotoView.this.u) + f2) / 2.0f, (((float) PhotoView.this.v) + f2) / 2.0f);
        }

        private int a(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i2 = 0;
            if (y >= this.d.top - ((float) this.g) && y <= this.d.bottom + ((float) this.g)) {
                if (Math.abs(x - this.d.left) < ((float) this.g)) {
                    i2 = 1;
                }
                if (Math.abs(x - this.d.right) < ((float) this.g)) {
                    i2 |= 4;
                }
            }
            if (x >= this.d.left - ((float) this.g) && x <= this.d.right + ((float) this.g)) {
                if (Math.abs(y - this.d.top) < ((float) this.g)) {
                    i2 |= 2;
                }
                if (Math.abs(y - this.d.bottom) < ((float) this.g)) {
                    i2 |= 8;
                }
            }
            if (Math.abs(x - ((this.d.left + this.d.right) / 2.0f)) < ((float) this.g) && Math.abs(y - ((this.d.top + this.d.bottom) / 2.0f)) < ((float) this.g)) {
                i2 = 16;
            }
            if (!PhotoView.this.B || !PhotoUtil.isPowerOfTwo(i2)) {
                return i2;
            }
            return 16;
        }

        private void b(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.f10524a.x;
            float y = motionEvent.getY() - this.f10524a.y;
            this.f10524a.set(motionEvent.getX(), motionEvent.getY());
            float f2 = PhotoView.this.t.left > 0.0f ? PhotoView.this.t.left : 0.0f;
            float f3 = PhotoView.this.t.top > 0.0f ? PhotoView.this.t.top : 0.0f;
            float access$300 = PhotoView.this.t.right > ((float) PhotoView.this.u) ? (float) PhotoView.this.u : PhotoView.this.t.right;
            float access$500 = PhotoView.this.t.bottom > ((float) PhotoView.this.v) ? (float) PhotoView.this.v : PhotoView.this.t.bottom;
            if ((this.c & 16) != 0) {
                RectF rectF = new RectF(this.d);
                rectF.offset(x, y);
                if (rectF.top >= f3 && rectF.left >= f2 && rectF.right <= access$300 && rectF.bottom <= access$500) {
                    this.d.offset(x, y);
                    return;
                }
                return;
            }
            if (PhotoView.this.B && this.c != 16) {
                float f4 = this.d.left - f2;
                float f5 = this.d.top - f3;
                float f6 = access$300 - this.d.right;
                float f7 = access$500 - this.d.bottom;
                if (x > 0.0f) {
                    if (x >= f6) {
                        x = f6;
                    }
                } else if ((-x) >= f4) {
                    x = -f4;
                }
                if (y > 0.0f) {
                    if (y >= f7) {
                        y = f7;
                    }
                } else if ((-y) >= f5) {
                    y = -f5;
                }
                float min = Math.min(Math.abs(x), Math.abs(y));
                if (min != 0.0f) {
                    x = (x / Math.abs(x)) * min;
                    y = (y / Math.abs(y)) * min;
                } else {
                    return;
                }
            }
            if ((this.c & 1) != 0) {
                if (this.d.left + x < f2) {
                    x = f2 - this.d.left;
                }
                if (this.d.left + x + this.h > this.d.right) {
                    x = (this.d.right - this.d.left) - this.h;
                }
                this.d.left += x;
            }
            if ((this.c & 2) != 0) {
                if (this.d.top + y < f3) {
                    y = f3 - this.d.top;
                }
                if (this.d.top + y + this.h > this.d.bottom) {
                    y = (this.d.bottom - this.d.top) - this.h;
                }
                this.d.top += y;
            }
            if ((this.c & 4) != 0) {
                if (this.d.right + x > access$300) {
                    x = access$300 - this.d.right;
                }
                if ((this.d.right + x) - this.h < this.d.left) {
                    x = this.d.left + (this.h - this.d.right);
                }
                this.d.right += x;
            }
            if ((this.c & 8) != 0) {
                if (this.d.bottom + y > access$500) {
                    y = access$500 - this.d.bottom;
                }
                if ((this.d.bottom + y) - this.h < this.d.top) {
                    y = (this.h - this.d.bottom) + this.d.top;
                }
                this.d.bottom += y;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            this.u = ((i4 - i2) - getPaddingLeft()) - getPaddingRight();
            this.v = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            e();
        }
    }

    class DragListener implements SimpleDragListener {
        private DragListener() {
        }

        public void onDragBegin() {
            PhotoView.this.setState(State.DRAG);
        }

        public void onDrag(float f, float f2) {
            if (PhotoView.this.l == State.DRAG) {
                float f3 = PhotoView.this.t.left;
                float f4 = PhotoView.this.t.top;
                float f5 = PhotoView.this.t.bottom;
                float f6 = PhotoView.this.t.right;
                PhotoView photoView = PhotoView.this;
                float access$1000 = photoView.a(f, (float) photoView.u, f3, f6);
                PhotoView photoView2 = PhotoView.this;
                PhotoView.this.a(access$1000, photoView2.a(f2, (float) photoView2.v, f4, f5));
            }
        }

        public void onDragEnd() {
            if (PhotoView.this.l == State.DRAG) {
                PhotoView.this.setState(State.NONE);
            }
        }
    }

    class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        private GestureListener() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            RVLogger.d(PhotoView.TAG, "onSingleTapConfirmed");
            if (PhotoView.this.D == null) {
                return true;
            }
            PhotoView.this.D.onClick(PhotoView.this);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (PhotoView.this.C != null) {
                PhotoView.this.C.onLongClick(PhotoView.this);
            }
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PhotoView.this.l == State.NONE || PhotoView.this.l == State.FLING || PhotoView.this.l == State.DRAG) {
                if (PhotoView.this.y != null) {
                    PhotoView.this.y.cancelFling();
                }
                PhotoView photoView = PhotoView.this;
                FlingRunnable unused = photoView.y = new FlingRunnable(photoView, (int) f, (int) f2);
                PhotoView photoView2 = PhotoView.this;
                photoView2.a((Runnable) photoView2.y);
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            if (PhotoView.this.l != State.NONE) {
                return false;
            }
            int i = (((double) Math.abs(PhotoView.this.m - PhotoView.this.f10521o)) > 0.001d ? 1 : (((double) Math.abs(PhotoView.this.m - PhotoView.this.f10521o)) == 0.001d ? 0 : -1));
            PhotoView photoView = PhotoView.this;
            if (i <= 0) {
                f = photoView.p;
            } else {
                f = photoView.f10521o;
            }
            PhotoView.this.a((Runnable) new ScaleRunnable(f, PhotoView.this.a(f, new PointF(motionEvent.getX(), motionEvent.getY()))));
            return true;
        }
    }

    class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10526a;

        private ScaleListener() {
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (!PhotoView.this.E) {
                return true;
            }
            this.f10526a = PhotoView.this.m >= PhotoView.this.p;
            PhotoView.this.setState(State.SCALE);
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float access$2100;
            float access$1600;
            if (PhotoView.this.l != State.NONE && PhotoView.this.l != State.SCALE) {
                return true;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float access$16002 = PhotoView.this.m * scaleFactor;
            if (access$16002 >= PhotoView.this.p) {
                access$2100 = PhotoView.this.p;
                access$1600 = PhotoView.this.m;
            } else if (this.f10526a || access$16002 <= PhotoView.this.p) {
                if (access$16002 < PhotoView.this.n) {
                    access$2100 = PhotoView.this.n;
                    access$1600 = PhotoView.this.m;
                }
                PhotoView.this.a(scaleFactor, focusX, focusY);
                PhotoView.this.b();
                return true;
            } else {
                access$2100 = PhotoView.this.p;
                access$1600 = PhotoView.this.m;
            }
            scaleFactor = access$2100 / access$1600;
            PhotoView.this.a(scaleFactor, focusX, focusY);
            PhotoView.this.b();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            this.f10526a = false;
            if (PhotoView.this.l == State.SCALE) {
                PhotoView.this.setState(State.NONE);
                if (PhotoView.this.a(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()))) {
                    RVLogger.d(PhotoView.TAG, "adjustToScale");
                } else if (PhotoView.this.d()) {
                    RVLogger.d(PhotoView.TAG, "adjustToBounds");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean d() {
        float f2 = this.t.left;
        float f3 = this.t.top;
        float f4 = this.t.right;
        float f5 = this.t.bottom;
        float width = (((float) this.u) - this.t.width()) / 2.0f;
        float height = (((float) this.v) - this.t.height()) / 2.0f;
        float f6 = f2 > 0.0f ? width > 0.0f ? width - f2 : -f2 : 0.0f;
        float f7 = f3 > 0.0f ? height > 0.0f ? height - f3 : -f3 : 0.0f;
        int i2 = this.u;
        if (f4 < ((float) i2)) {
            f6 = width > 0.0f ? (((float) i2) - f4) - width : ((float) i2) - f4;
        }
        int i3 = this.v;
        if (f5 < ((float) i3)) {
            f7 = height > 0.0f ? (((float) i3) - f5) - height : ((float) i3) - f5;
        }
        if (!((f6 == 0.0f && f7 == 0.0f) ? false : true)) {
            return false;
        }
        post(new TransRunnable(f6, f7));
        return true;
    }

    /* access modifiers changed from: private */
    public boolean a(PointF pointF) {
        float f2 = this.m;
        float f3 = this.p;
        if (f2 >= f3) {
            return true;
        }
        float f4 = this.q;
        if (f2 > f4) {
            f3 = f4;
        } else if (f2 <= f3) {
            f3 = this.f10521o;
            if (f2 >= f3) {
                f3 = -1.0f;
            }
        }
        if (f3 == -1.0f) {
            return false;
        }
        a((Runnable) new ScaleRunnable(f3, a(f3, pointF)));
        return true;
    }

    /* access modifiers changed from: private */
    public PointF a(float f2, PointF pointF) {
        if (pointF == null) {
            pointF = new PointF((float) (this.u / 2), (float) (this.v / 2));
        }
        Matrix matrix = new Matrix(this.j);
        float f3 = f2 / this.m;
        matrix.postScale(f3, f3, pointF.x, pointF.y);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f4 = fArr[2];
        float f5 = fArr[5];
        float f6 = (((float) this.r) * f2) + f4;
        float f7 = (((float) this.s) * f2) + f5;
        if (f4 <= 0.0f && f5 <= 0.0f && f6 >= ((float) this.u) && f7 >= ((float) this.v)) {
            return pointF;
        }
        float f8 = ((float) this.r) * f2;
        float f9 = ((float) this.s) * f2;
        float f10 = this.t.left;
        float f11 = this.t.top;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        if (f5 >= 0.0f) {
            f5 = 0.0f;
        }
        int i2 = this.u;
        if (f8 <= ((float) i2)) {
            f4 = (((float) i2) - f8) / 2.0f;
        } else if (f6 < ((float) i2)) {
            f4 = ((float) i2) - f8;
        }
        int i3 = this.v;
        if (f9 <= ((float) i3)) {
            f5 = (((float) i3) - f9) / 2.0f;
        } else if (f7 < ((float) i3)) {
            f5 = ((float) i3) - f9;
        }
        return new PointF(((f10 * f8) - (f4 * this.t.width())) / (f8 - this.t.width()), ((f11 * f9) - (f5 * this.t.height())) / (f9 - this.t.height()));
    }

    /* access modifiers changed from: private */
    @TargetApi(16)
    public void a(Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }

    class TransRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f10528a;
        private float b;
        private float c = 0.0f;
        private PhotoInter d;

        public TransRunnable(float f, float f2) {
            this.d = new PhotoInter(new LinearInterpolator(), 150.0f);
            this.f10528a = f;
            this.b = f2;
            PhotoView.this.setState(State.TRANSLATE);
        }

        public void run() {
            if (PhotoView.this.l == State.NONE || PhotoView.this.l == State.TRANSLATE) {
                float calInterpolate = this.d.calInterpolate();
                float f = calInterpolate - this.c;
                this.c = calInterpolate;
                PhotoView.this.a(this.f10528a * f, this.b * f);
                if (calInterpolate < 1.0f) {
                    PhotoView.this.a((Runnable) this);
                } else {
                    PhotoView.this.setState(State.NONE);
                }
            } else {
                StringBuilder sb = new StringBuilder("cancel translate for current state ");
                sb.append(PhotoView.this.l);
                RVLogger.d(PhotoView.TAG, sb.toString());
            }
        }
    }

    class PhotoInter {

        /* renamed from: a  reason: collision with root package name */
        private Interpolator f10525a;
        private long b = System.currentTimeMillis();
        private float c;

        public PhotoInter(Interpolator interpolator, float f) {
            this.f10525a = interpolator;
            this.c = f;
        }

        public float calInterpolate() {
            return this.f10525a.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.b)) / this.c));
        }
    }

    class ScaleRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f10527a;
        private float b;
        private PhotoInter c;
        private PointF d;

        ScaleRunnable(float f, PointF pointF) {
            PhotoView.this.setState(State.SCALE);
            this.c = new PhotoInter(new LinearInterpolator(), 200.0f);
            this.f10527a = PhotoView.this.m;
            this.b = f;
            this.d = pointF;
        }

        public void run() {
            float calInterpolate = this.c.calInterpolate();
            PhotoView.this.a(a(calInterpolate), this.d.x, this.d.y);
            if (calInterpolate < 1.0f) {
                PhotoView.this.a((Runnable) this);
            } else {
                PhotoView.this.setState(State.NONE);
            }
        }

        private float a(float f) {
            float f2 = this.b;
            float f3 = this.f10527a;
            return (f3 + (f * (f2 - f3))) / PhotoView.this.m;
        }
    }

    private void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.w = false;
            return;
        }
        this.j.reset();
        this.m = 1.0f;
        this.l = State.NONE;
        this.r = drawable.getIntrinsicWidth();
        this.s = drawable.getIntrinsicHeight();
        int i2 = this.r;
        if (i2 <= 0 || i2 <= 0) {
            this.w = false;
            return;
        }
        this.w = true;
        this.u = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.v = measuredHeight;
        if (this.u != 0 && measuredHeight != 0) {
            f();
            d(this.f10521o);
            float width = (((float) this.u) - this.t.width()) / 2.0f;
            float height = (((float) this.v) - this.t.height()) / 2.0f;
            if (this.t.height() > ((float) this.v)) {
                a(width, 0.0f);
            } else {
                a(width, height);
            }
            if (this.A) {
                this.i.initRect();
            }
        }
    }

    private void f() {
        int hashCode = getDrawable().hashCode();
        this.F = hashCode;
        if (hashCode == this.defaultDrawableHashCode || hashCode == this.failDrawableHashCode) {
            RVLogger.d(TAG, "default drawable or fial drawable,disable scale");
            this.f10521o = 1.0f;
            this.n = 1.0f;
            this.p = 1.0f;
            this.q = 1.0f;
            return;
        }
        float f2 = ((float) this.u) / ((float) this.r);
        float f3 = ((float) this.v) / ((float) this.s);
        RVLogger.d(TAG, "PhotoView displayType = ");
        int i2 = this.e;
        if (i2 == 0) {
            RVLogger.d(TAG, "TYPE_THUMBORI_ORI");
            a(f2);
        } else if (i2 == 1) {
            RVLogger.d(TAG, "TYPE_THUMBORI_ORIFITWIDTH");
            if (this.F == this.thumbDrawableHashCode) {
                a(f2);
            } else {
                b(f2);
            }
        } else if (i2 == 2) {
            RVLogger.d(TAG, "TYPE_THUMBORI_ORIFITWITDH_3P2LIMIT");
            if (this.F == this.thumbDrawableHashCode) {
                a(f2);
            } else {
                c(f2);
            }
        } else if (i2 == 4) {
            RVLogger.d(TAG, "TYPE_THUMBFITWIDTH_ORIFITWIDTH");
            b(f2);
        } else if (i2 == 8) {
            RVLogger.d(TAG, "TYPE_THUMBFITWITDH_LIMIT_ORIFITWITD_LIMIT");
            c(f2);
        }
        if (f2 <= f3) {
            f2 = f3;
        }
        float f4 = this.f10521o;
        if (f2 <= f4 * 2.5f) {
            f2 = f4 * 2.5f;
        }
        this.n = this.f10521o * 0.6f;
        this.p = f2;
        this.q = f2 * 1.2f;
    }

    public boolean isPhotoScaled() {
        return this.m != this.f10521o;
    }

    public boolean isPhotoUpTop() {
        return this.t.top < 0.0f;
    }

    private void a(float f2) {
        StringBuilder sb = new StringBuilder("is thumbnail = ");
        sb.append(this.F == this.thumbDrawableHashCode);
        RVLogger.d(TAG, sb.toString());
        if (!this.x || f2 >= 1.0f) {
            this.f10521o = 1.0f;
        } else {
            this.f10521o = f2 * 1.0f;
        }
    }

    private void b(float f2) {
        StringBuilder sb = new StringBuilder("is thumbnail = ");
        sb.append(this.F == this.thumbDrawableHashCode);
        RVLogger.d(TAG, sb.toString());
        if (this.x) {
            this.f10521o = f2 * 1.0f;
        } else {
            this.f10521o = 1.0f;
        }
    }

    private void c(float f2) {
        StringBuilder sb = new StringBuilder("is thumbnail = ");
        sb.append(this.F == this.thumbDrawableHashCode);
        RVLogger.d(TAG, sb.toString());
        if (this.x) {
            float f3 = f2 * 1.0f;
            this.f10521o = f3;
            if (f3 > 3.2f) {
                this.f10521o = 3.2f;
                return;
            }
            return;
        }
        this.f10521o = 1.0f;
    }

    /* access modifiers changed from: private */
    public void a(float f2, float f3) {
        if (!this.w) {
            RVLogger.d(TAG, "invalid photo content");
            return;
        }
        this.j.postTranslate(f2, f3);
        g();
        b();
    }

    private void d(float f2) {
        if (!this.w) {
            RVLogger.d(TAG, "invalid photo content");
            return;
        }
        this.m *= f2;
        this.j.postScale(f2, f2);
        g();
        b();
    }

    /* access modifiers changed from: private */
    public void a(float f2, float f3, float f4) {
        if (!this.w) {
            RVLogger.d(TAG, "invalid photo content");
            return;
        }
        this.m *= f2;
        this.j.postScale(f2, f2, f3, f4);
        g();
        b();
    }

    public void postRotate(float f2) {
        if (!this.w) {
            RVLogger.d(TAG, "invlaid photo content!");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Matrix matrix = new Matrix();
            matrix.postRotate(f2, (float) (this.r / 2), (float) (this.s / 2));
            setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, this.r, this.s, matrix, true));
        }
    }

    public RectF getPhotoRect() {
        return this.t;
    }

    private void g() {
        this.j.getValues(this.k);
        float[] fArr = this.k;
        float f2 = fArr[2];
        float f3 = fArr[5];
        float f4 = this.m;
        this.t.set(f2, f3, (((float) this.r) * f4) + f2, (f4 * ((float) this.s)) + f3);
    }

    class DragDetector {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDragListener f10522a;
        private float b;
        private float c;
        private boolean d = true;

        public DragDetector(SimpleDragListener simpleDragListener) {
            this.f10522a = simpleDragListener;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (PhotoView.this.l != State.NONE && PhotoView.this.l != State.DRAG) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                return false;
            } else if (this.f10522a == null || !this.d) {
                return false;
            } else {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.b = motionEvent.getX();
                    this.c = motionEvent.getY();
                    this.f10522a.onDragBegin();
                } else if (action == 5) {
                    this.d = false;
                } else if (action == 2) {
                    float x = motionEvent.getX() - this.b;
                    float y = motionEvent.getY() - this.c;
                    this.b = motionEvent.getX();
                    this.c = motionEvent.getY();
                    if (x == 0.0f && y == 0.0f) {
                        return false;
                    }
                    this.f10522a.onDrag(x, y);
                } else if (action == 1) {
                    this.f10522a.onDragEnd();
                    this.b = 0.0f;
                    this.c = 0.0f;
                    this.d = true;
                }
                return true;
            }
        }
    }

    class FlingRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private CompactScroller f10523a;
        private int b;
        private int c;
        final /* synthetic */ PhotoView this$0;

        @SuppressLint({"NewApi"})
        FlingRunnable(PhotoView photoView, int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            PhotoView photoView2 = photoView;
            this.this$0 = photoView2;
            photoView2.setState(State.FLING);
            this.f10523a = new CompactScroller(photoView.getContext());
            int i7 = (int) photoView.t.left;
            int i8 = (int) photoView.t.top;
            float width = photoView.t.width();
            float height = photoView.t.height();
            if (width > ((float) photoView.u)) {
                i4 = photoView.u - ((int) width);
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (height > ((float) photoView.v)) {
                i6 = photoView.v - ((int) height);
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.f10523a.fling(i7, i8, i, i2, i4, i3, i6, i5, 1, 1);
            this.b = i7;
            this.c = i8;
        }

        public void cancelFling() {
            if (this.f10523a != null) {
                this.this$0.setState(State.NONE);
                this.f10523a.forceFinished(true);
            }
        }

        public void run() {
            CompactScroller compactScroller = this.f10523a;
            if (compactScroller == null || compactScroller.isFinished() || !this.f10523a.computeScrollOffset()) {
                if (this.this$0.l == State.FLING) {
                    this.this$0.setState(State.NONE);
                }
                this.f10523a = null;
                return;
            }
            int currX = this.f10523a.getCurrX();
            int currY = this.f10523a.getCurrY();
            int i = currX - this.b;
            int i2 = currY - this.c;
            this.b = currX;
            this.c = currY;
            this.this$0.a((float) i, (float) i2);
            this.this$0.a((Runnable) this);
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (!this.w) {
            RVLogger.d(TAG, "canScrollHorizontally false");
            return false;
        }
        float f2 = this.t.left;
        float width = this.t.width();
        if (width <= ((float) this.u)) {
            return false;
        }
        if (i2 < 0 && f2 >= 0.0f) {
            return false;
        }
        if (i2 <= 0 || f2 + width > ((float) this.u)) {
            return true;
        }
        return false;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.C = onLongClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
    }

    public static int getMaxTextureSize() {
        if (b) {
            return f10520a;
        }
        new Canvas().getMaximumBitmapHeight();
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
        EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
        egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
        int[] iArr2 = new int[1];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr[0]; i3++) {
            egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i3], 12330, iArr2);
            if (i2 < iArr2[0]) {
                i2 = iArr2[0];
            }
        }
        egl10.eglTerminate(eglGetDisplay);
        StringBuilder sb = new StringBuilder("getMaxTextureSize = ");
        sb.append(Math.max(i2, 2048));
        RVLogger.w(TAG, sb.toString());
        b = true;
        return Math.max(i2, 2048);
    }

    private static void a(Canvas canvas) {
        if (!b && canvas.isHardwareAccelerated()) {
            int min = Math.min(canvas.getMaximumBitmapHeight(), canvas.getMaximumBitmapWidth());
            if (2048 > min || min >= 32766) {
                RVLogger.w(TAG, "getMaxTextureSizeV2 size abnormal,handle to  previous method!");
                f10520a = getMaxTextureSize();
            } else {
                f10520a = min;
                StringBuilder sb = new StringBuilder("getMaxTextureSizeV2 = ");
                sb.append(f10520a);
                RVLogger.w(TAG, sb.toString());
            }
            b = true;
        }
    }

    public boolean isShowingThumbnail() {
        return this.F == this.thumbDrawableHashCode;
    }

    public Bitmap getValidShowingPhoto() {
        int i2 = this.F;
        if (i2 == this.defaultDrawableHashCode || i2 == this.failDrawableHashCode || !(getDrawable() instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) getDrawable()).getBitmap();
    }
}
