package id.dana.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import o.updateActionSheetContent;

public class LockableViewPager extends ViewPager {
    private int getMax;
    private boolean getMin;
    private int length;
    private int setMax;

    public LockableViewPager(@NonNull Context context) {
        super(context);
        this.getMax = 0;
        this.setMax = 0;
    }

    public LockableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getMax = 0;
        this.setMax = 0;
        this.getMin = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.getMin && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.getMin) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onInterceptTouchEvent");
            sb.append(e.getMessage());
            updateActionSheetContent.e("LockableViewPager", sb.toString());
            return false;
        }
    }

    public void onMeasure(int i, int i2) {
        this.length = i;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            if (this.getMax == 0) {
                this.setMax = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams != null) {
                        if (layoutParams.setMax) {
                            int i4 = layoutParams.getMax & 112;
                            if (i4 == 48 || i4 == 80) {
                                this.setMax += childAt.getMeasuredHeight();
                            }
                        } else {
                            int i5 = this.getMax;
                            childAt.measure(getChildMeasureSpec(this.length, getPaddingLeft() + getPaddingRight(), childAt.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                            this.getMax = Math.max(i5, childAt.getMeasuredHeight());
                        }
                    }
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(this.getMax + this.setMax + getPaddingBottom() + getPaddingTop(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setSwipeable(boolean z) {
        this.getMin = z;
    }
}
