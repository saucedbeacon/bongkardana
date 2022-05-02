package o;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class setChildImportantForAccessibilityInternal extends Scroller {
    private int mScrollDuration = 600;

    public setChildImportantForAccessibilityInternal(Context context) {
        super(context);
    }

    public setChildImportantForAccessibilityInternal(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public int getmScrollDuration() {
        return this.mScrollDuration;
    }

    public void setmScrollDuration(int i) {
        this.mScrollDuration = i;
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.mScrollDuration);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.mScrollDuration);
    }
}
