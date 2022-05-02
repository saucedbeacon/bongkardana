package com.alibaba.griver.file.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import o.setNeutralButton;

public class ZoomRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    private ScaleGestureDetector f10438a;
    private setNeutralButton b;
    /* access modifiers changed from: private */
    public float c;
    /* access modifiers changed from: private */
    public float d;
    /* access modifiers changed from: private */
    public float e;
    /* access modifiers changed from: private */
    public float f;
    /* access modifiers changed from: private */
    public float g;
    private int h = -1;
    private float i;
    private float j;
    /* access modifiers changed from: private */
    public boolean k = false;
    private boolean l = false;
    private ValueAnimator m;
    /* access modifiers changed from: private */
    public float n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f10439o;
    /* access modifiers changed from: private */
    public float p;
    /* access modifiers changed from: private */
    public float q;

    public ZoomRecyclerView(Context context) {
        super(context);
        a();
    }

    public ZoomRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ZoomRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    private void a() {
        this.f10438a = new ScaleGestureDetector(getContext(), new ScaleListener());
        this.b = new setNeutralButton(getContext(), new GestureListener());
        this.g = 1.0f;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i2, int i3) {
        this.c = (float) View.MeasureSpec.getSize(i2);
        this.d = (float) View.MeasureSpec.getSize(i3);
        super.onMeasure(i2, i3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = this.b.setMin(motionEvent) || this.f10438a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    try {
                        int findPointerIndex = motionEvent.findPointerIndex(this.h);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        if (!this.k && this.g > 1.0f) {
                            a(this.e + (x - this.i), this.f + (y - this.j));
                            b();
                        }
                        invalidate();
                        this.i = x;
                        this.j = y;
                    } catch (Exception unused) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (!this.k && this.g > 1.0f) {
                            float f2 = this.i;
                            if (f2 != -1.0f) {
                                a(this.e + (x2 - f2), this.f + (y2 - this.j));
                                b();
                            }
                        }
                        invalidate();
                        this.i = x2;
                        this.j = y2;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.h) {
                            int i2 = actionIndex == 0 ? 1 : 0;
                            this.i = motionEvent.getX(i2);
                            this.j = motionEvent.getY(i2);
                            this.h = motionEvent.getPointerId(i2);
                        }
                    }
                }
            }
            this.h = -1;
            this.i = -1.0f;
            this.j = -1.0f;
        } else {
            int actionIndex2 = motionEvent.getActionIndex();
            float x3 = motionEvent.getX(actionIndex2);
            float y3 = motionEvent.getY(actionIndex2);
            this.i = x3;
            this.j = y3;
            this.h = motionEvent.getPointerId(0);
        }
        return super.onTouchEvent(motionEvent) || z;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.e, this.f);
        float f2 = this.g;
        canvas.scale(f2, f2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: private */
    public void a(float f2, float f3) {
        this.e = f2;
        this.f = f3;
    }

    private void b() {
        float[] b2 = b(this.e, this.f);
        this.e = b2[0];
        this.f = b2[1];
    }

    private float[] b(float f2, float f3) {
        if (this.g <= 1.0f) {
            return new float[]{f2, f3};
        }
        if (f2 > 0.0f) {
            f2 = 0.0f;
        } else {
            float f4 = this.p;
            if (f2 < f4) {
                f2 = f4;
            }
        }
        if (f3 > 0.0f) {
            f3 = 0.0f;
        } else {
            float f5 = this.q;
            if (f3 < f5) {
                f3 = f5;
            }
        }
        return new float[]{f2, f3};
    }

    /* access modifiers changed from: private */
    public void c(float f2, float f3) {
        if (this.m == null) {
            c();
        }
        if (!this.m.isRunning()) {
            float f4 = this.c;
            this.p = f4 - (f4 * f3);
            float f5 = this.d;
            this.q = f5 - (f5 * f3);
            float f6 = this.e;
            float f7 = this.f;
            float f8 = f3 - f2;
            float[] b2 = b(f6 - (this.n * f8), f7 - (f8 * this.f10439o));
            float f9 = b2[0];
            float f10 = b2[1];
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scale", new float[]{f2, f3});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("tranX", new float[]{f6, f9});
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("tranY", new float[]{f7, f10});
            this.m.setValues(new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3});
            this.m.setDuration(300);
            this.m.start();
        }
    }

    private void c() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.m = valueAnimator;
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = ZoomRecyclerView.this.g = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                ZoomRecyclerView.this.a(((Float) valueAnimator.getAnimatedValue("tranX")).floatValue(), ((Float) valueAnimator.getAnimatedValue("tranY")).floatValue());
                ZoomRecyclerView.this.invalidate();
            }
        });
        this.m.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                boolean unused = ZoomRecyclerView.this.k = true;
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = ZoomRecyclerView.this.k = false;
            }

            public void onAnimationCancel(Animator animator) {
                boolean unused = ZoomRecyclerView.this.k = false;
            }
        });
    }

    public boolean isEnableScale() {
        return this.l;
    }

    public void setEnableScale(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (!z) {
                float f2 = this.g;
                if (f2 != 1.0f) {
                    c(f2, 1.0f);
                }
            }
        }
    }

    class ScaleListener implements ScaleGestureDetector.OnScaleGestureListener {
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        private ScaleListener() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float access$200 = ZoomRecyclerView.this.g;
            ZoomRecyclerView zoomRecyclerView = ZoomRecyclerView.this;
            float unused = zoomRecyclerView.g = zoomRecyclerView.g * scaleGestureDetector.getScaleFactor();
            ZoomRecyclerView zoomRecyclerView2 = ZoomRecyclerView.this;
            float unused2 = zoomRecyclerView2.g = Math.max(0.5f, Math.min(zoomRecyclerView2.g, 5.0f));
            ZoomRecyclerView zoomRecyclerView3 = ZoomRecyclerView.this;
            float unused3 = zoomRecyclerView3.p = zoomRecyclerView3.c - (ZoomRecyclerView.this.c * ZoomRecyclerView.this.g);
            ZoomRecyclerView zoomRecyclerView4 = ZoomRecyclerView.this;
            float unused4 = zoomRecyclerView4.q = zoomRecyclerView4.d - (ZoomRecyclerView.this.d * ZoomRecyclerView.this.g);
            float unused5 = ZoomRecyclerView.this.n = scaleGestureDetector.getFocusX();
            float unused6 = ZoomRecyclerView.this.f10439o = scaleGestureDetector.getFocusY();
            float access$900 = ZoomRecyclerView.this.n * (access$200 - ZoomRecyclerView.this.g);
            float access$1000 = ZoomRecyclerView.this.f10439o * (access$200 - ZoomRecyclerView.this.g);
            ZoomRecyclerView zoomRecyclerView5 = ZoomRecyclerView.this;
            zoomRecyclerView5.a(zoomRecyclerView5.e + access$900, ZoomRecyclerView.this.f + access$1000);
            boolean unused7 = ZoomRecyclerView.this.k = true;
            ZoomRecyclerView.this.invalidate();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (ZoomRecyclerView.this.g <= 0.5f) {
                ZoomRecyclerView zoomRecyclerView = ZoomRecyclerView.this;
                float unused = zoomRecyclerView.n = (-zoomRecyclerView.e) / (ZoomRecyclerView.this.g - 1.0f);
                ZoomRecyclerView zoomRecyclerView2 = ZoomRecyclerView.this;
                float unused2 = zoomRecyclerView2.f10439o = (-zoomRecyclerView2.f) / (ZoomRecyclerView.this.g - 1.0f);
                ZoomRecyclerView zoomRecyclerView3 = ZoomRecyclerView.this;
                float f = 0.0f;
                float unused3 = zoomRecyclerView3.n = Float.isNaN(zoomRecyclerView3.n) ? 0.0f : ZoomRecyclerView.this.n;
                ZoomRecyclerView zoomRecyclerView4 = ZoomRecyclerView.this;
                if (!Float.isNaN(zoomRecyclerView4.f10439o)) {
                    f = ZoomRecyclerView.this.f10439o;
                }
                float unused4 = zoomRecyclerView4.f10439o = f;
                ZoomRecyclerView zoomRecyclerView5 = ZoomRecyclerView.this;
                zoomRecyclerView5.c(zoomRecyclerView5.g, 0.5f);
            }
            boolean unused5 = ZoomRecyclerView.this.k = false;
        }
    }

    class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return a(motionEvent);
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return a(motionEvent);
        }

        private boolean a(MotionEvent motionEvent) {
            float access$200 = ZoomRecyclerView.this.g;
            float f = 1.0f;
            if (ZoomRecyclerView.this.g == 1.0f) {
                float unused = ZoomRecyclerView.this.n = motionEvent.getX();
                float unused2 = ZoomRecyclerView.this.f10439o = motionEvent.getY();
                f = 5.0f;
            } else {
                ZoomRecyclerView zoomRecyclerView = ZoomRecyclerView.this;
                float unused3 = zoomRecyclerView.n = zoomRecyclerView.g == 1.0f ? motionEvent.getX() : (-ZoomRecyclerView.this.e) / (ZoomRecyclerView.this.g - 1.0f);
                ZoomRecyclerView zoomRecyclerView2 = ZoomRecyclerView.this;
                float unused4 = zoomRecyclerView2.f10439o = zoomRecyclerView2.g == 1.0f ? motionEvent.getY() : (-ZoomRecyclerView.this.f) / (ZoomRecyclerView.this.g - 1.0f);
            }
            ZoomRecyclerView.this.c(access$200, f);
            return super.onDoubleTap(motionEvent);
        }
    }
}
