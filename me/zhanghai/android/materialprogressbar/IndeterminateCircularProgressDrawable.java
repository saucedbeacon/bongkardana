package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class IndeterminateCircularProgressDrawable extends BaseIndeterminateProgressDrawable implements MaterialProgressDrawable {
    @Dimension(unit = 0)
    private static final int PADDED_INTRINSIC_SIZE_DP = 48;
    @Dimension(unit = 0)
    private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);
    @Px
    private final int mPaddedIntrinsicSize;
    @Px
    private final int mProgressIntrinsicSize;
    @NonNull
    private final RingPathTransform mRingPathTransform = new RingPathTransform();
    @NonNull
    private final RingRotation mRingRotation = new RingRotation();

    public /* bridge */ /* synthetic */ void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @IntRange(from = 0, to = 255)
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Nullable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @NonNull
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return super.getUseIntrinsicPadding();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    public /* synthetic */ void setAlpha(@IntRange(from = 0, to = 255) int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(821997726, oncanceled);
            onCancelLoad.getMin(821997726, oncanceled);
        }
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setTint(@ColorInt int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(@Nullable ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
        super.setUseIntrinsicPadding(z);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public IndeterminateCircularProgressDrawable(@NonNull Context context) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mProgressIntrinsicSize = Math.round(42.0f * f);
        this.mPaddedIntrinsicSize = Math.round(f * 48.0f);
        this.mAnimators = new Animator[]{Animators.createIndeterminate(this.mRingPathTransform), Animators.createIndeterminateRotation(this.mRingRotation)};
    }

    @Px
    private int getIntrinsicSize() {
        return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicSize : this.mProgressIntrinsicSize;
    }

    @Px
    public int getIntrinsicWidth() {
        return getIntrinsicSize();
    }

    @Px
    public int getIntrinsicHeight() {
        return getIntrinsicSize();
    }

    /* access modifiers changed from: protected */
    public void onPreparePaint(@NonNull Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas, int i, int i2, @NonNull Paint paint) {
        if (this.mUseIntrinsicPadding) {
            canvas.scale(((float) i) / RECT_PADDED_BOUND.width(), ((float) i2) / RECT_PADDED_BOUND.height());
            canvas.translate(RECT_PADDED_BOUND.width() / 2.0f, RECT_PADDED_BOUND.height() / 2.0f);
        } else {
            canvas.scale(((float) i) / RECT_BOUND.width(), ((float) i2) / RECT_BOUND.height());
            canvas.translate(RECT_BOUND.width() / 2.0f, RECT_BOUND.height() / 2.0f);
        }
        drawRing(canvas, paint);
    }

    private void drawRing(@NonNull Canvas canvas, @NonNull Paint paint) {
        int save = canvas.save();
        canvas.rotate(this.mRingRotation.mRotation);
        Canvas canvas2 = canvas;
        canvas2.drawArc(RECT_PROGRESS, ((this.mRingPathTransform.mTrimPathOffset + this.mRingPathTransform.mTrimPathStart) * 360.0f) - 0.049804688f, (this.mRingPathTransform.mTrimPathEnd - this.mRingPathTransform.mTrimPathStart) * 360.0f, false, paint);
        canvas.restoreToCount(save);
    }

    static class RingPathTransform {
        public float mTrimPathEnd;
        public float mTrimPathOffset;
        public float mTrimPathStart;

        private RingPathTransform() {
        }

        @Keep
        public void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }

        @Keep
        public void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        @Keep
        public void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }
    }

    static class RingRotation {
        /* access modifiers changed from: private */
        public float mRotation;

        private RingRotation() {
        }

        @Keep
        public void setRotation(float f) {
            this.mRotation = f;
        }
    }
}
