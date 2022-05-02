package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import o.getDecoratedLeft;
import o.getDecoratedTop;
import o.setMeasurementCacheEnabled;

public class UCropView extends FrameLayout {
    /* access modifiers changed from: private */
    public GestureCropImageView setMax;
    /* access modifiers changed from: private */
    public final OverlayView setMin;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(setMeasurementCacheEnabled.setMax.ucrop_view, this, true);
        this.setMax = (GestureCropImageView) findViewById(setMeasurementCacheEnabled.length.getMax);
        this.setMin = (OverlayView) findViewById(setMeasurementCacheEnabled.length.b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasurementCacheEnabled.toFloatRange.extraCommand);
        this.setMin.processStyledAttributes(obtainStyledAttributes);
        this.setMax.processStyledAttributes(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.setMax.setCropBoundsChangeListener(new getDecoratedTop() {
            public final void setMax(float f) {
                UCropView.this.setMin.setTargetAspectRatio(f);
            }
        });
        this.setMin.setOverlayViewChangeListener(new getDecoratedLeft() {
            public final void setMax(RectF rectF) {
                UCropView.this.setMax.setCropRect(rectF);
            }
        });
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.setMax;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.setMin;
    }

    public void resetCropImageView() {
        removeView(this.setMax);
        GestureCropImageView gestureCropImageView = new GestureCropImageView(getContext());
        this.setMax = gestureCropImageView;
        gestureCropImageView.setCropBoundsChangeListener(new getDecoratedTop() {
            public final void setMax(float f) {
                UCropView.this.setMin.setTargetAspectRatio(f);
            }
        });
        this.setMin.setOverlayViewChangeListener(new getDecoratedLeft() {
            public final void setMax(RectF rectF) {
                UCropView.this.setMax.setCropRect(rectF);
            }
        });
        this.setMax.setCropRect(getOverlayView().getCropViewRect());
        addView(this.setMax, 0);
    }
}
