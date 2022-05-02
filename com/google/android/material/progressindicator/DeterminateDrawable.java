package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import o.createCheckedTextView;
import o.createImageButton;
import o.createRadioButton;
import o.getOverflowIcon;

public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private static final createRadioButton<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = new createRadioButton<DeterminateDrawable>("indicatorLevel") {
        public final float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.getIndicatorFraction() * 10000.0f;
        }

        public final void setValue(DeterminateDrawable determinateDrawable, float f) {
            determinateDrawable.setIndicatorFraction(f / 10000.0f);
        }
    };
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private DrawingDelegate<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange = false;
    private final createCheckedTextView springAnimator;
    private final createImageButton springForce;

    public final /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public final /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public final /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public final /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    public final /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    public final /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public final /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    public final /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull getOverflowIcon.getMax getmax) {
        super.registerAnimationCallback(getmax);
    }

    public final /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public final /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public final /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public final /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull getOverflowIcon.getMax getmax) {
        return super.unregisterAnimationCallback(getmax);
    }

    DeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate2) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate2);
        createImageButton createimagebutton = new createImageButton();
        this.springForce = createimagebutton;
        createimagebutton.getMin = 1.0d;
        createimagebutton.length = false;
        createImageButton createimagebutton2 = this.springForce;
        createimagebutton2.setMax = Math.sqrt(50.0d);
        createimagebutton2.length = false;
        createCheckedTextView createcheckedtextview = new createCheckedTextView(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimator = createcheckedtextview;
        createcheckedtextview.getCause = this.springForce;
        setGrowFraction(1.0f);
    }

    @NonNull
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    @NonNull
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    /* access modifiers changed from: package-private */
    public final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            createImageButton createimagebutton = this.springForce;
            float f = SPRING_FORCE_STIFFNESS / systemAnimatorDurationScale;
            if (f > 0.0f) {
                createimagebutton.setMax = Math.sqrt((double) f);
                createimagebutton.length = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return visibleInternal;
    }

    public final void jumpToCurrentState() {
        createCheckedTextView createcheckedtextview = this.springAnimator;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (createcheckedtextview.Grayscale$Algorithm) {
                createcheckedtextview.length();
            }
            setIndicatorFraction(((float) getLevel()) / 10000.0f);
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            createCheckedTextView createcheckedtextview = this.springAnimator;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (createcheckedtextview.Grayscale$Algorithm) {
                    createcheckedtextview.length();
                }
                setIndicatorFraction(((float) i) / 10000.0f);
            } else {
                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
            }
        } else {
            createCheckedTextView createcheckedtextview2 = this.springAnimator;
            createcheckedtextview2.Mean$Arithmetic = getIndicatorFraction() * 10000.0f;
            createcheckedtextview2.valueOf = true;
            createCheckedTextView createcheckedtextview3 = this.springAnimator;
            float f = (float) i;
            if (createcheckedtextview3.setMin()) {
                createcheckedtextview3.b = f;
            } else {
                if (createcheckedtextview3.getCause == null) {
                    createcheckedtextview3.getCause = new createImageButton(f);
                }
                createcheckedtextview3.getCause.toFloatRange = (double) f;
                createcheckedtextview3.getMax();
            }
        }
        return true;
    }

    public final int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    public final int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    /* access modifiers changed from: package-private */
    public final void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getGrowFraction());
            this.drawingDelegate.fillTrack(canvas, this.paint);
            Canvas canvas2 = canvas;
            this.drawingDelegate.fillIndicator(canvas2, this.paint, 0.0f, getIndicatorFraction(), MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], getAlpha()));
            canvas.restore();
        }
    }

    /* access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.indicatorFraction;
    }

    /* access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.indicatorFraction = f;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    /* access modifiers changed from: package-private */
    public final void setDrawingDelegate(@NonNull DrawingDelegate<S> drawingDelegate2) {
        this.drawingDelegate = drawingDelegate2;
        drawingDelegate2.registerDrawable(this);
    }
}
