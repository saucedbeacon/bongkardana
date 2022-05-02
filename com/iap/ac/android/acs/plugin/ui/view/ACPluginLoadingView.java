package com.iap.ac.android.acs.plugin.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

public class ACPluginLoadingView extends View implements ValueAnimator.AnimatorUpdateListener {
    private static final int ANIMATION_DURATION = 1500;
    private static final float ANIMATION_PROGRESS_FLOAT = 1.0f;
    private static final String DEFAULT_COLOR = "#aacdff";
    private static final int DEFAULT_VIEW_HEIGHT = 50;
    private ValueAnimator mAnimator;
    private Path mBlueLoadingDestPath1;
    private Path mBlueLoadingDestPath2;
    private Path mBlueLoadingPath1;
    private Path mBlueLoadingPath2;
    private PathMeasure mBlueLoadingPathMeasure1;
    private PathMeasure mBlueLoadingPathMeasure2;
    private Paint mBluePaint;
    private Path mDefaultPath1;
    private Path mDefaultPath2;
    private float mProgress;
    private float mStrokeWidth;
    private Path mTransparentLoadingDestPath1;
    private Path mTransparentLoadingDestPath2;
    private Path mTransparentLoadingPath1;
    private Path mTransparentLoadingPath2;
    private PathMeasure mTransparentLoadingPathMeasure1;
    private PathMeasure mTransparentLoadingPathMeasure2;
    private Paint mTransparentPaint;

    public ACPluginLoadingView(@NonNull Context context) {
        super(context);
        initView();
    }

    public ACPluginLoadingView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public ACPluginLoadingView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getMode(i2) == 1073741824 ? View.MeasureSpec.getSize(i2) : 50;
        float f = (float) size;
        float f2 = (140.0f * f) / 600.0f;
        this.mStrokeWidth = f2;
        double sqrt = Math.sqrt(2.0d);
        double d = (double) this.mStrokeWidth;
        Double.isNaN(d);
        float f3 = ((f - f2) * 2.0f) + ((float) (sqrt * d));
        StringBuilder sb = new StringBuilder("ACPluginLoadingView#onMeasure, width: ");
        sb.append(f3);
        sb.append(", height: ");
        sb.append(size);
        ACLog.d(Constants.TAG, sb.toString());
        super.setMeasuredDimension((int) f3, size);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("ACPluginLoadingView#onSizeChanged, width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        ACLog.d(Constants.TAG, sb.toString());
        initPaint();
        initPath((float) i, (float) i2);
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mProgress <= 0.5f) {
            canvas.drawPath(this.mDefaultPath1, this.mBluePaint);
            drawBlueLoadingPath1(canvas);
            drawTransparentLoadingPath1(canvas);
            return;
        }
        canvas.drawPath(this.mDefaultPath2, this.mBluePaint);
        drawBlueLoadingPath2(canvas);
        drawTransparentLoadingPath2(canvas);
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.mAnimator != null) {
            if (z) {
                ACLog.d(Constants.TAG, "ACPluginLoadingView#onWindowFocusChanged, focus, start animation");
                this.mAnimator.start();
            } else {
                ACLog.d(Constants.TAG, "ACPluginLoadingView#onWindowFocusChanged, lost focus, end animation");
                this.mAnimator.end();
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.mProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void stop() {
        if (this.mAnimator != null) {
            ACLog.d(Constants.TAG, "ACPluginLoadingView#stop");
            this.mAnimator.end();
        }
    }

    private void initView() {
        setLayerType(1, (Paint) null);
        initAnimator();
    }

    private void initAnimator() {
        if (this.mAnimator == null) {
            ACLog.d(Constants.TAG, "ACPluginLoadingView#initAnimator");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.mAnimator = ofFloat;
            ofFloat.setDuration(1500);
            this.mAnimator.setRepeatMode(1);
            this.mAnimator.setRepeatCount(-1);
            this.mAnimator.addUpdateListener(this);
        }
    }

    private void initPaint() {
        if (this.mBluePaint == null) {
            ACLog.d(Constants.TAG, "ACPluginLoadingView#initPaint, init blue paint");
            Paint paint = new Paint(1);
            this.mBluePaint = paint;
            paint.setColor(Color.parseColor(DEFAULT_COLOR));
            this.mBluePaint.setStyle(Paint.Style.STROKE);
            this.mBluePaint.setStrokeWidth(this.mStrokeWidth);
        }
        if (this.mTransparentPaint == null) {
            ACLog.d(Constants.TAG, "ACPluginLoadingView#initPaint, init transparent paint");
            Paint paint2 = new Paint(1);
            this.mTransparentPaint = paint2;
            paint2.setColor(Color.parseColor(DEFAULT_COLOR));
            this.mTransparentPaint.setStyle(Paint.Style.STROKE);
            this.mTransparentPaint.setStrokeWidth(this.mStrokeWidth + 2.0f);
            this.mTransparentPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
    }

    private void initPath(float f, float f2) {
        if (this.mDefaultPath1 == null) {
            initDefaultPath1(f, f2);
        }
        if (this.mDefaultPath2 == null) {
            initDefaultPath2(f, f2);
        }
        if (this.mBlueLoadingPath1 == null) {
            initBlueLoadingPath1(f, f2);
        }
        if (this.mBlueLoadingPath2 == null) {
            initBlueLoadingPath2(f, f2);
        }
        if (this.mTransparentLoadingPath1 == null) {
            initTransparentLoadingPath1(f, f2);
        }
        if (this.mTransparentLoadingPath2 == null) {
            initTransparentLoadingPath2(f, f2);
        }
    }

    private void initDefaultPath1(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initDefaultPath1");
        Path path = new Path();
        this.mDefaultPath1 = path;
        float f3 = f / 2.0f;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = f2 / 2.0f;
        double d2 = (double) this.mStrokeWidth;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path.moveTo(f3 - ((float) ((d / sqrt) / 2.0d)), f4 - ((float) ((d2 / sqrt2) / 2.0d)));
        Path path2 = this.mDefaultPath1;
        float f5 = f - f4;
        double d3 = (double) this.mStrokeWidth;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d3);
        float f6 = this.mStrokeWidth;
        double d4 = (double) f6;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        path2.lineTo(f5 - ((float) ((d3 / sqrt3) / 2.0d)), (f2 - f6) + ((float) ((d4 / sqrt4) / 2.0d)));
        Path path3 = this.mDefaultPath1;
        double d5 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d5);
        float f7 = this.mStrokeWidth;
        path3.quadTo(f5 - ((float) ((d5 * tan) / 2.0d)), f2 - (f7 / 2.0f), f5, f2 - (f7 / 2.0f));
        float f8 = this.mStrokeWidth;
        this.mDefaultPath1.arcTo(new RectF((f - f2) + (f8 / 2.0f), f8 / 2.0f, f - (f8 / 2.0f), f2 - (f8 / 2.0f)), 90.0f, -180.0f, false);
        Path path4 = this.mDefaultPath1;
        double d6 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d6);
        float f9 = f5 - ((float) ((d6 * tan2) / 2.0d));
        float f10 = this.mStrokeWidth;
        float f11 = f10 / 2.0f;
        double d7 = (double) f10;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        float f12 = f5 - ((float) ((d7 / sqrt5) / 2.0d));
        float f13 = this.mStrokeWidth;
        double d8 = (double) f13;
        double sqrt6 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        path4.quadTo(f9, f11, f12, f13 - ((float) ((d8 / sqrt6) / 2.0d)));
        Path path5 = this.mDefaultPath1;
        double d9 = (double) this.mStrokeWidth;
        double sqrt7 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        float f14 = f3 - ((float) ((d9 / sqrt7) / 2.0d));
        double d10 = (double) this.mStrokeWidth;
        double sqrt8 = Math.sqrt(2.0d);
        Double.isNaN(d10);
        path5.lineTo(f14, f4 + ((float) ((d10 / sqrt8) / 2.0d)));
    }

    private void initDefaultPath2(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initDefaultPath2");
        Path path = new Path();
        this.mDefaultPath2 = path;
        float f3 = f / 2.0f;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = f2 / 2.0f;
        double d2 = (double) this.mStrokeWidth;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path.moveTo(((float) ((d / sqrt) / 2.0d)) + f3, f4 - ((float) ((d2 / sqrt2) / 2.0d)));
        Path path2 = this.mDefaultPath2;
        double d3 = (double) this.mStrokeWidth;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d3);
        float f5 = this.mStrokeWidth;
        double d4 = (double) f5;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        path2.lineTo(((float) ((d3 / sqrt3) / 2.0d)) + f4, (f2 - f5) + ((float) ((d4 / sqrt4) / 2.0d)));
        Path path3 = this.mDefaultPath2;
        double d5 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d5);
        float f6 = this.mStrokeWidth;
        path3.quadTo(((float) ((d5 * tan) / 2.0d)) + f4, f2 - (f6 / 2.0f), f4, f2 - (f6 / 2.0f));
        float f7 = this.mStrokeWidth;
        this.mDefaultPath2.arcTo(new RectF(f7 / 2.0f, f7 / 2.0f, f2 - (f7 / 2.0f), f2 - (f7 / 2.0f)), 90.0f, 180.0f, false);
        Path path4 = this.mDefaultPath2;
        double d6 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d6);
        float f8 = this.mStrokeWidth;
        double d7 = (double) f8;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        float f9 = this.mStrokeWidth;
        double d8 = (double) f9;
        double sqrt6 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        path4.quadTo(((float) ((d6 * tan2) / 2.0d)) + f4, f8 / 2.0f, ((float) ((d7 / sqrt5) / 2.0d)) + f4, f9 - ((float) ((d8 / sqrt6) / 2.0d)));
        Path path5 = this.mDefaultPath2;
        double d9 = (double) this.mStrokeWidth;
        double sqrt7 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        float f10 = f3 + ((float) ((d9 / sqrt7) / 2.0d));
        double d10 = (double) this.mStrokeWidth;
        double sqrt8 = Math.sqrt(2.0d);
        Double.isNaN(d10);
        path5.lineTo(f10, f4 + ((float) ((d10 / sqrt8) / 2.0d)));
    }

    private void initBlueLoadingPath1(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initBlueLoadingPath1");
        Path path = new Path();
        this.mBlueLoadingPath1 = path;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        path.moveTo(f3, f4);
        Path path2 = this.mBlueLoadingPath1;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f5 = this.mStrokeWidth;
        double d2 = (double) f5;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path2.lineTo(((float) ((d / sqrt) / 2.0d)) + f4, (f2 - f5) + ((float) ((d2 / sqrt2) / 2.0d)));
        Path path3 = this.mBlueLoadingPath1;
        double d3 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d3);
        float f6 = this.mStrokeWidth;
        path3.quadTo(((float) ((d3 * tan) / 2.0d)) + f4, f2 - (f6 / 2.0f), f4, f2 - (f6 / 2.0f));
        float f7 = this.mStrokeWidth;
        this.mBlueLoadingPath1.arcTo(new RectF(f7 / 2.0f, f7 / 2.0f, f2 - (f7 / 2.0f), f2 - (f7 / 2.0f)), 90.0f, 180.0f, false);
        Path path4 = this.mBlueLoadingPath1;
        double d4 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d4);
        float f8 = this.mStrokeWidth;
        double d5 = (double) f8;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        float f9 = this.mStrokeWidth;
        double d6 = (double) f9;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        path4.quadTo(((float) ((d4 * tan2) / 2.0d)) + f4, f8 / 2.0f, ((float) ((d5 / sqrt3) / 2.0d)) + f4, f9 - ((float) ((d6 / sqrt4) / 2.0d)));
        this.mBlueLoadingPath1.lineTo(f3, f4);
        this.mBlueLoadingPathMeasure1 = new PathMeasure(this.mBlueLoadingPath1, false);
        this.mBlueLoadingDestPath1 = new Path();
    }

    private void initBlueLoadingPath2(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initBlueLoadingPath2");
        Path path = new Path();
        this.mBlueLoadingPath2 = path;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        path.moveTo(f3, f4);
        Path path2 = this.mBlueLoadingPath2;
        float f5 = f - f4;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f6 = this.mStrokeWidth;
        double d2 = (double) f6;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path2.lineTo(f5 - ((float) ((d / sqrt) / 2.0d)), (f2 - f6) + ((float) ((d2 / sqrt2) / 2.0d)));
        Path path3 = this.mBlueLoadingPath2;
        double d3 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d3);
        float f7 = this.mStrokeWidth;
        path3.quadTo(f5 - ((float) ((d3 * tan) / 2.0d)), f2 - (f7 / 2.0f), f5, f2 - (f7 / 2.0f));
        float f8 = this.mStrokeWidth;
        this.mBlueLoadingPath2.arcTo(new RectF((f - f2) + (f8 / 2.0f), f8 / 2.0f, f - (f8 / 2.0f), f2 - (f8 / 2.0f)), 90.0f, -180.0f, false);
        Path path4 = this.mBlueLoadingPath2;
        double d4 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d4);
        float f9 = f5 - ((float) ((d4 * tan2) / 2.0d));
        float f10 = this.mStrokeWidth;
        float f11 = f10 / 2.0f;
        double d5 = (double) f10;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        float f12 = f5 - ((float) ((d5 / sqrt3) / 2.0d));
        float f13 = this.mStrokeWidth;
        double d6 = (double) f13;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d6);
        path4.quadTo(f9, f11, f12, f13 - ((float) ((d6 / sqrt4) / 2.0d)));
        this.mBlueLoadingPath2.lineTo(f3, f4);
        this.mBlueLoadingPathMeasure2 = new PathMeasure(this.mBlueLoadingPath2, false);
        this.mBlueLoadingDestPath2 = new Path();
    }

    private void initTransparentLoadingPath1(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initTransparentLoadingPath1");
        Path path = new Path();
        this.mTransparentLoadingPath1 = path;
        float f3 = f / 2.0f;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = f2 / 2.0f;
        double d2 = (double) this.mStrokeWidth;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path.moveTo(((float) ((d / sqrt) / 2.0d)) + f3, ((float) ((d2 / sqrt2) / 2.0d)) + f4);
        Path path2 = this.mTransparentLoadingPath1;
        float f5 = f - f4;
        double d3 = (double) this.mStrokeWidth;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d3);
        float f6 = this.mStrokeWidth;
        double d4 = (double) f6;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        path2.lineTo(f5 - ((float) ((d3 / sqrt3) / 2.0d)), (f2 - f6) + ((float) ((d4 / sqrt4) / 2.0d)));
        Path path3 = this.mTransparentLoadingPath1;
        double d5 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d5);
        float f7 = this.mStrokeWidth;
        path3.quadTo(f5 - ((float) ((d5 * tan) / 2.0d)), f2 - (f7 / 2.0f), f5, f2 - (f7 / 2.0f));
        float f8 = this.mStrokeWidth;
        this.mTransparentLoadingPath1.arcTo(new RectF((f - f2) + (f8 / 2.0f), f8 / 2.0f, f - (f8 / 2.0f), f2 - (f8 / 2.0f)), 90.0f, -180.0f, false);
        Path path4 = this.mTransparentLoadingPath1;
        double d6 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d6);
        float f9 = f5 - ((float) ((d6 * tan2) / 2.0d));
        float f10 = this.mStrokeWidth;
        float f11 = f10 / 2.0f;
        double d7 = (double) f10;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        float f12 = f5 - ((float) ((d7 / sqrt5) / 2.0d));
        float f13 = this.mStrokeWidth;
        double d8 = (double) f13;
        double sqrt6 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        path4.quadTo(f9, f11, f12, f13 - ((float) ((d8 / sqrt6) / 2.0d)));
        Path path5 = this.mTransparentLoadingPath1;
        double d9 = (double) this.mStrokeWidth;
        double sqrt7 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        float f14 = f3 + ((float) ((d9 / sqrt7) / 2.0d));
        double d10 = (double) this.mStrokeWidth;
        double sqrt8 = Math.sqrt(2.0d);
        Double.isNaN(d10);
        path5.lineTo(f14, f4 - ((float) ((d10 / sqrt8) / 2.0d)));
        this.mTransparentLoadingPathMeasure1 = new PathMeasure(this.mTransparentLoadingPath1, false);
        this.mTransparentLoadingDestPath1 = new Path();
    }

    private void initTransparentLoadingPath2(float f, float f2) {
        ACLog.d(Constants.TAG, "ACPluginLoadingView#initTransparentLoadingPath2");
        Path path = new Path();
        this.mTransparentLoadingPath2 = path;
        float f3 = f / 2.0f;
        double d = (double) this.mStrokeWidth;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = f2 / 2.0f;
        double d2 = (double) this.mStrokeWidth;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        path.moveTo(f3 - ((float) ((d / sqrt) / 2.0d)), ((float) ((d2 / sqrt2) / 2.0d)) + f4);
        Path path2 = this.mTransparentLoadingPath2;
        double d3 = (double) this.mStrokeWidth;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d3);
        float f5 = this.mStrokeWidth;
        double d4 = (double) f5;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d4);
        path2.lineTo(((float) ((d3 / sqrt3) / 2.0d)) + f4, (f2 - f5) + ((float) ((d4 / sqrt4) / 2.0d)));
        Path path3 = this.mTransparentLoadingPath2;
        double d5 = (double) this.mStrokeWidth;
        double tan = Math.tan(0.19634954084936207d);
        Double.isNaN(d5);
        float f6 = this.mStrokeWidth;
        path3.quadTo(((float) ((d5 * tan) / 2.0d)) + f4, f2 - (f6 / 2.0f), f4, f2 - (f6 / 2.0f));
        float f7 = this.mStrokeWidth;
        this.mTransparentLoadingPath2.arcTo(new RectF(f7 / 2.0f, f7 / 2.0f, f2 - (f7 / 2.0f), f2 - (f7 / 2.0f)), 90.0f, 180.0f, false);
        Path path4 = this.mTransparentLoadingPath2;
        double d6 = (double) this.mStrokeWidth;
        double tan2 = Math.tan(0.19634954084936207d);
        Double.isNaN(d6);
        float f8 = this.mStrokeWidth;
        float f9 = f8 / 2.0f;
        double d7 = (double) f8;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d7);
        float f10 = this.mStrokeWidth;
        double d8 = (double) f10;
        double sqrt6 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        path4.quadTo(((float) ((d6 * tan2) / 2.0d)) + f4, f9, ((float) ((d7 / sqrt5) / 2.0d)) + f4, f10 - ((float) ((d8 / sqrt6) / 2.0d)));
        Path path5 = this.mTransparentLoadingPath2;
        double d9 = (double) this.mStrokeWidth;
        double sqrt7 = Math.sqrt(2.0d);
        Double.isNaN(d9);
        float f11 = f3 - ((float) ((d9 / sqrt7) / 2.0d));
        double d10 = (double) this.mStrokeWidth;
        double sqrt8 = Math.sqrt(2.0d);
        Double.isNaN(d10);
        path5.lineTo(f11, f4 - ((float) ((d10 / sqrt8) / 2.0d)));
        this.mTransparentLoadingPathMeasure2 = new PathMeasure(this.mTransparentLoadingPath2, false);
        this.mTransparentLoadingDestPath2 = new Path();
    }

    private void drawBlueLoadingPath1(Canvas canvas) {
        this.mBlueLoadingDestPath1.reset();
        this.mBlueLoadingPathMeasure1.getSegment(0.0f, this.mBlueLoadingPathMeasure1.getLength() * this.mProgress * 2.0f, this.mBlueLoadingDestPath1, true);
        canvas.drawPath(this.mBlueLoadingDestPath1, this.mBluePaint);
    }

    private void drawBlueLoadingPath2(Canvas canvas) {
        this.mBlueLoadingDestPath2.reset();
        this.mBlueLoadingPathMeasure2.getSegment(0.0f, this.mBlueLoadingPathMeasure2.getLength() * ((this.mProgress * 2.0f) - 1.0f), this.mBlueLoadingDestPath2, true);
        canvas.drawPath(this.mBlueLoadingDestPath2, this.mBluePaint);
    }

    private void drawTransparentLoadingPath1(Canvas canvas) {
        this.mTransparentLoadingDestPath1.reset();
        this.mTransparentLoadingPathMeasure1.getSegment(0.0f, this.mTransparentLoadingPathMeasure1.getLength() * this.mProgress * 2.0f, this.mTransparentLoadingDestPath1, true);
        canvas.drawPath(this.mTransparentLoadingDestPath1, this.mTransparentPaint);
    }

    private void drawTransparentLoadingPath2(Canvas canvas) {
        this.mTransparentLoadingDestPath2.reset();
        this.mTransparentLoadingPathMeasure2.getSegment(0.0f, this.mTransparentLoadingPathMeasure2.getLength() * ((this.mProgress * 2.0f) - 1.0f), this.mTransparentLoadingDestPath2, true);
        canvas.drawPath(this.mTransparentLoadingDestPath2, this.mTransparentPaint);
    }
}
