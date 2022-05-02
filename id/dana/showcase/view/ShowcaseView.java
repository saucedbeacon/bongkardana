package id.dana.showcase.view;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import o.IntRange;
import o.PhotoView;
import o.getLogUploadURL;
import o.setLogProductId;
import o.setOnLongClickListener;
import o.setUseAmcsLite;

public class ShowcaseView extends FrameLayout {
    private final Paint getMax = new Paint();
    @ColorRes
    private int getMin;
    private setUseAmcsLite length;
    private final Paint setMax = new Paint();
    private ValueAnimator setMin;

    public ShowcaseView(@NonNull Context context) {
        super(context);
    }

    public ShowcaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShowcaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShowcaseView(@NonNull Context context, @ColorRes int i, PhotoView.DragListener dragListener) {
        super(context, (AttributeSet) null);
        this.getMin = i;
        bringToFront();
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        this.setMax.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new setLogProductId(this, dragListener));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.getMax.setColor(IntRange.setMax(getContext(), this.getMin));
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.getMax);
        if (this.setMin != null && hasActiveTarget()) {
            PointF pointF = new PointF();
            if (length(this.length)) {
                PointF pointF2 = this.length.setMin;
                PointF pointF3 = new PointF();
                pointF3.x = pointF2.x - (((float) SplitBillIntroductionActivity.SPOTLIGHT_SIZE) * 0.6f);
                pointF3.y = pointF2.y;
                pointF = pointF3;
            } else {
                pointF.x = this.length.setMin.x;
            }
            pointF.y = this.length.setMin.y;
            this.length.getMin.setMin(canvas, this.setMax, pointF, ((Float) this.setMin.getAnimatedValue()).floatValue());
        }
    }

    private void setMax(long j, TimeInterpolator timeInterpolator, setOnLongClickListener setonlongclicklistener, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addListener(setonlongclicklistener);
        ofFloat.start();
    }

    private void getMax(setOnLongClickListener setonlongclicklistener, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.setMin = ofFloat;
        ofFloat.addUpdateListener(new getLogUploadURL(this));
        this.setMin.setInterpolator(this.length.getMax);
        this.setMin.setDuration(this.length.length);
        this.setMin.addListener(setonlongclicklistener);
        this.setMin.start();
    }

    public void startShowcase(long j, TimeInterpolator timeInterpolator, setOnLongClickListener setonlongclicklistener) {
        setMax(j, timeInterpolator, setonlongclicklistener, 0.0f, 1.0f);
    }

    public void finishShowcase(long j, TimeInterpolator timeInterpolator, setOnLongClickListener setonlongclicklistener) {
        setMax(j, timeInterpolator, setonlongclicklistener, 1.0f, 0.0f);
    }

    public void startSpotlight(setUseAmcsLite setuseamcslite, setOnLongClickListener setonlongclicklistener) {
        this.length = setuseamcslite;
        getMax(setonlongclicklistener, 0.0f, 1.0f);
    }

    public void finishSpotlight(setOnLongClickListener setonlongclicklistener) {
        if (hasActiveTarget()) {
            getMax(setonlongclicklistener, 1.0f, 0.0f);
        }
    }

    public boolean hasActiveTarget() {
        return this.length != null;
    }

    private boolean length(setUseAmcsLite setuseamcslite) {
        return setuseamcslite.setMin.x + (((float) SplitBillIntroductionActivity.SPOTLIGHT_SIZE) * 0.6f) >= ((float) getWidth());
    }

    public static /* synthetic */ void getMax(ShowcaseView showcaseView, PhotoView.DragListener dragListener) {
        ValueAnimator valueAnimator = showcaseView.setMin;
        if (valueAnimator != null && !valueAnimator.isRunning() && ((Float) showcaseView.setMin.getAnimatedValue()).floatValue() > 0.0f && dragListener != null) {
            dragListener.length();
        }
    }
}
