package com.alipay.zoloz.hardware.camera.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alipay.mobile.security.bio.utils.DisplayUtil;

public class FocusView extends View {
    private final String TAG;
    private ObjectAnimator animator;
    private int colorCurrent;
    private int colorFailed;
    private int colorNormal;
    private int colorSuccess;
    private RectF innerRectF;
    private RectF outerRectF;
    private Paint paint;
    private int previewHeight;
    private int previewWidth;
    private int radiusInner;
    private int radiusOuter;
    private int strokeWidth;

    public FocusView(Context context) {
        this(context, (AttributeSet) null);
    }

    public FocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = getClass().getSimpleName();
        this.radiusOuter = DisplayUtil.dip2px(context, 20.0f);
        this.radiusInner = DisplayUtil.dip2px(context, 10.0f);
        this.strokeWidth = DisplayUtil.dip2px(context, 2.0f);
        this.colorFailed = Color.parseColor("#FFC52E");
        this.colorSuccess = Color.parseColor("#FFC52E");
        int parseColor = Color.parseColor("#FFC52E");
        this.colorNormal = parseColor;
        this.colorCurrent = parseColor;
        int i2 = this.strokeWidth;
        int i3 = this.radiusOuter;
        this.outerRectF = new RectF((float) i2, (float) i2, (float) ((i3 * 2) - i2), (float) ((i3 * 2) - i2));
        int i4 = this.radiusOuter;
        int i5 = this.radiusInner;
        this.innerRectF = new RectF((float) (i4 - i5), (float) (i4 - i5), (float) (i4 + i5), (float) (i4 + i5));
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeWidth((float) this.strokeWidth);
        initAnimation();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.radiusOuter;
        setMeasuredDimension(i3 * 2, i3 * 2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCircle(canvas, this.colorCurrent);
    }

    private void drawCircle(Canvas canvas, int i) {
        this.paint.setColor(i);
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 90;
            canvas.drawArc(this.outerRectF, (float) (i3 + 5), 80.0f, false, this.paint);
            canvas.drawArc(this.innerRectF, (float) (i3 + 50), 80.0f, false, this.paint);
        }
    }

    public void startFocus() {
        setVisibility(0);
        this.colorCurrent = this.colorNormal;
        invalidate();
        setAnimator(0.0f, 90.0f, 500).start();
    }

    public void focusSuccess() {
        this.colorCurrent = this.colorSuccess;
        invalidate();
        setAnimator(90.0f, 0.0f, 200).start();
    }

    public void focusFailed() {
        this.colorCurrent = this.colorFailed;
        invalidate();
        setAnimator(180.0f, 0.0f, 200).start();
    }

    public void hideFocusView() {
        setVisibility(8);
    }

    public ObjectAnimator setAnimator(float f, float f2, long j) {
        this.animator.cancel();
        this.animator.setRepeatCount(-1);
        this.animator.setRepeatMode(2);
        this.animator.setFloatValues(new float[]{f, f2});
        this.animator.setDuration(j);
        return this.animator;
    }

    private void initAnimation() {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.animator = objectAnimator;
        objectAnimator.setTarget(this);
        this.animator.setPropertyName("rotation");
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public void moveToPosition(float f, float f2) {
        int i = this.radiusOuter;
        setTranslationX(f - ((float) i));
        setTranslationY(f2 - ((float) i));
        setVisibility(0);
        this.colorCurrent = this.colorNormal;
        invalidate();
    }

    public void resetToDefaultPosition() {
        int i = this.radiusOuter;
        setTranslationX((float) ((this.previewWidth / 2) - i));
        setTranslationY((float) ((this.previewHeight / 2) - i));
    }

    public void initFocusArea(int i, int i2) {
        this.previewWidth = i;
        this.previewHeight = i2;
        resetToDefaultPosition();
    }

    public static RectF rectToRectF(Rect rect) {
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
