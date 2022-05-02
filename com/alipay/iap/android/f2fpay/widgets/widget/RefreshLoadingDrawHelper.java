package com.alipay.iap.android.f2fpay.widgets.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.R;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.widgets.a.a;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;

public class RefreshLoadingDrawHelper {

    /* renamed from: a  reason: collision with root package name */
    private Resources f10688a;
    /* access modifiers changed from: private */
    public View b;
    private Paint c = new Paint();
    private int d;
    private int[] e = new int[2];
    private int[] f = new int[2];
    private Drawable g;
    private Drawable h;
    /* access modifiers changed from: private */
    public float i;
    private int j;
    /* access modifiers changed from: private */
    public ValueAnimator k;

    public RefreshLoadingDrawHelper(View view) {
        this.b = view;
        this.f10688a = view.getResources();
        this.c.setColor(-1);
        a();
    }

    private void a() {
        this.g = this.f10688a.getDrawable(R.drawable.iap_f2fpay_refresh);
        this.h = this.f10688a.getDrawable(R.drawable.iap_f2fpay_loading);
        this.d = a.a(this.f10688a, 40.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.k = ofFloat;
        ofFloat.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        this.k.setRepeatMode(1);
        this.k.setInterpolator(new LinearInterpolator());
        this.k.addListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                RefreshLoadingDrawHelper.this.k.setRepeatCount(0);
            }

            public void onAnimationStart(Animator animator) {
                RefreshLoadingDrawHelper.this.k.setRepeatCount(-1);
            }
        });
        this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RefreshLoadingDrawHelper.this.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                StringBuilder sb = new StringBuilder("onAnimationUpdate:");
                sb.append(RefreshLoadingDrawHelper.this.i);
                LoggerWrapper.i(F2FPayConstants.TAG, sb.toString());
                RefreshLoadingDrawHelper.this.b.invalidate();
            }
        });
    }

    private void a(Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight());
        int i2 = this.j;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.c);
    }

    public void calculatePosition() {
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        if (width > 0 && height > 0) {
            int paddingLeft = this.b.getPaddingLeft();
            int paddingRight = this.b.getPaddingRight();
            int paddingTop = this.b.getPaddingTop();
            int paddingBottom = this.b.getPaddingBottom();
            int[] iArr = this.f;
            iArr[0] = ((width - paddingLeft) - paddingRight) / 2;
            iArr[1] = ((height - paddingTop) - paddingBottom) / 2;
            int[] iArr2 = this.e;
            int i2 = iArr[0];
            int i3 = this.d;
            iArr2[0] = i2 - (i3 / 2);
            iArr2[1] = iArr[1] - (i3 / 2);
            this.h.setBounds(iArr2[0], iArr2[1], iArr2[0] + i3, iArr2[1] + i3);
            Drawable drawable = this.g;
            int[] iArr3 = this.e;
            int i4 = iArr3[0];
            int i5 = iArr3[1];
            int i6 = iArr3[0];
            int i7 = this.d;
            drawable.setBounds(i4, i5, i6 + i7, iArr3[1] + i7);
        }
    }

    public void cancelLoading() {
        this.k.cancel();
    }

    public void drawLoading(Canvas canvas) {
        canvas.save();
        a(canvas);
        canvas.translate((float) this.b.getPaddingLeft(), (float) this.b.getPaddingTop());
        StringBuilder sb = new StringBuilder("drawLoading:");
        sb.append(this.i);
        LoggerWrapper.i(F2FPayConstants.TAG, sb.toString());
        float f2 = this.i;
        int[] iArr = this.f;
        canvas.rotate(f2, (float) iArr[0], (float) iArr[1]);
        this.h.draw(canvas);
        canvas.restore();
    }

    public void drawRefresh(Canvas canvas) {
        canvas.save();
        a(canvas);
        canvas.translate((float) this.b.getPaddingLeft(), (float) this.b.getPaddingTop());
        this.g.draw(canvas);
        canvas.restore();
    }

    public void setLoadingBkgRadius(int i2) {
        this.j = i2;
    }

    public void startLoading() {
        this.k.start();
    }
}
