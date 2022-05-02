package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchInterceptFrameLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TapListener f10468a;
    private GestureDetector b = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (TouchInterceptFrameLayout.this.f10468a != null) {
                TouchInterceptFrameLayout.this.f10468a.onTap(TouchInterceptFrameLayout.this);
            }
            return super.onSingleTapUp(motionEvent);
        }
    });

    public interface TapListener {
        void onTap(View view);
    }

    public TouchInterceptFrameLayout(Context context) {
        super(context);
    }

    public TouchInterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.b.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnTapListener(TapListener tapListener) {
        this.f10468a = tapListener;
    }
}
