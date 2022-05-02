package com.synnapps.carouselview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import o.initFastScroller;
import o.setChildImportantForAccessibilityInternal;

public class CarouselViewPager extends ViewPager {
    private initFastScroller imageClickListener;
    private setChildImportantForAccessibilityInternal mScroller = null;
    private float newX = 0.0f;
    private float oldX = 0.0f;
    private float sens = 5.0f;

    public void setImageClickListener(initFastScroller initfastscroller) {
        this.imageClickListener = initfastscroller;
    }

    public CarouselViewPager(Context context) {
        super(context);
        postInitViewPager();
    }

    public CarouselViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        postInitViewPager();
    }

    private void postInitViewPager() {
        Class<ViewPager> cls = ViewPager.class;
        try {
            Field declaredField = cls.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("sInterpolator");
            declaredField2.setAccessible(true);
            setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal = new setChildImportantForAccessibilityInternal(getContext(), (Interpolator) declaredField2.get((Object) null));
            this.mScroller = setchildimportantforaccessibilityinternal;
            declaredField.set(this, setchildimportantforaccessibilityinternal);
        } catch (Exception unused) {
        }
    }

    public void setTransitionVelocity(int i) {
        this.mScroller.setmScrollDuration(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oldX = motionEvent.getX();
        } else if (action == 1) {
            float x = motionEvent.getX();
            this.newX = x;
            if (Math.abs(this.oldX - x) < this.sens) {
                initFastScroller initfastscroller = this.imageClickListener;
                if (initfastscroller != null) {
                    initfastscroller.onClick(getCurrentItem());
                }
                return true;
            }
            this.oldX = 0.0f;
            this.newX = 0.0f;
        }
        return super.onTouchEvent(motionEvent);
    }
}
