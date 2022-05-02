package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import o.onAdapterChanged;

public class GestureCropImageView extends CropImageView {
    private boolean equals;
    private GestureDetector getMax;
    private onAdapterChanged getMin;
    private int isInside;
    /* access modifiers changed from: private */
    public float length;
    private ScaleGestureDetector setMax;
    /* access modifiers changed from: private */
    public float setMin;
    private boolean toFloatRange;

    public GestureCropImageView(Context context) {
        super(context);
        this.toFloatRange = true;
        this.equals = true;
        this.isInside = 5;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.toFloatRange = true;
        this.equals = true;
        this.isInside = 5;
    }

    public void setScaleEnabled(boolean z) {
        this.equals = z;
    }

    public boolean isScaleEnabled() {
        return this.equals;
    }

    public void setRotateEnabled(boolean z) {
        this.toFloatRange = z;
    }

    public boolean isRotateEnabled() {
        return this.toFloatRange;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.isInside = i;
    }

    public int getDoubleTapScaleSteps() {
        return this.isInside;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            cancelAllAnimations();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.length = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.setMin = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.getMax.onTouchEvent(motionEvent);
        if (this.equals) {
            this.setMax.onTouchEvent(motionEvent);
        }
        if (this.toFloatRange) {
            this.getMin.length(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.getMax = new GestureDetector(getContext(), new getMin(this, (byte) 0), (Handler) null, true);
        this.setMax = new ScaleGestureDetector(getContext(), new setMin(this, (byte) 0));
        this.getMin = new onAdapterChanged(new getMax(this, (byte) 0));
    }

    /* access modifiers changed from: protected */
    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.isInside))));
    }

    class setMin extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private setMin() {
        }

        /* synthetic */ setMin(GestureCropImageView gestureCropImageView, byte b) {
            this();
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.postScale(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.length, GestureCropImageView.this.setMin);
            return true;
        }
    }

    class getMin extends GestureDetector.SimpleOnGestureListener {
        private getMin() {
        }

        /* synthetic */ getMin(GestureCropImageView gestureCropImageView, byte b) {
            this();
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.zoomImageToPosition(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.postTranslate(-f, -f2);
            return true;
        }
    }

    class getMax extends onAdapterChanged.setMax {
        private getMax() {
        }

        /* synthetic */ getMax(GestureCropImageView gestureCropImageView, byte b) {
            this();
        }

        public final boolean length(onAdapterChanged onadapterchanged) {
            GestureCropImageView.this.postRotate(onadapterchanged.getMax, GestureCropImageView.this.length, GestureCropImageView.this.setMin);
            return true;
        }
    }
}
