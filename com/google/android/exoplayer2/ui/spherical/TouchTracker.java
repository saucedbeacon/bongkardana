package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;

class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final PointF accumulatedTouchOffsetDegrees = new PointF();
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final PointF previousTouchPointPx = new PointF();
    private final float pxPerDegrees;
    private volatile float roll;
    @Nullable
    private SingleTapListener singleTapListener;

    interface Listener {
        void onScrollChange(PointF pointF);
    }

    public TouchTracker(Context context, Listener listener2, float f) {
        this.listener = listener2;
        this.pxPerDegrees = f;
        this.gestureDetector = new GestureDetector(context, this);
        this.roll = 3.1415927f;
    }

    public void setSingleTapListener(@Nullable SingleTapListener singleTapListener2) {
        this.singleTapListener = singleTapListener2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = (motionEvent2.getY() - this.previousTouchPointPx.y) / this.pxPerDegrees;
        this.previousTouchPointPx.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.roll;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.accumulatedTouchOffsetDegrees.x -= (cos * x) - (sin * y);
        this.accumulatedTouchOffsetDegrees.y += (sin * x) + (cos * y);
        PointF pointF = this.accumulatedTouchOffsetDegrees;
        pointF.y = Math.max(-45.0f, Math.min(MAX_PITCH_DEGREES, pointF.y));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        SingleTapListener singleTapListener2 = this.singleTapListener;
        if (singleTapListener2 != null) {
            return singleTapListener2.onSingleTapUp(motionEvent);
        }
        return false;
    }

    @BinderThread
    public void setRoll(float f) {
        this.roll = -f;
    }
}
