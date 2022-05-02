package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class getDataModel {
    private long equals;
    private final setInitialActivityCount getMax;
    private final RecyclerView getMin;
    private float isInside;
    private int length;
    private final ViewPager2 setMax;
    private VelocityTracker setMin;
    private int toFloatRange;

    public getDataModel(ViewPager2 viewPager2, setInitialActivityCount setinitialactivitycount, RecyclerView recyclerView) {
        this.setMax = viewPager2;
        this.getMax = setinitialactivitycount;
        this.getMin = recyclerView;
    }

    public final boolean setMin() {
        return this.getMax.length();
    }

    @UiThread
    public final boolean setMax() {
        if (this.getMax.getMin()) {
            return false;
        }
        this.toFloatRange = 0;
        this.isInside = 0.0f;
        this.equals = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = this.setMin;
        if (velocityTracker == null) {
            this.setMin = VelocityTracker.obtain();
            this.length = ViewConfiguration.get(this.setMax.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        setInitialActivityCount setinitialactivitycount = this.getMax;
        setinitialactivitycount.setMin = 4;
        setinitialactivitycount.setMin(true);
        if (!this.getMax.setMax()) {
            this.getMin.stopScroll();
        }
        long j = this.equals;
        MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        this.setMin.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    @UiThread
    public final boolean setMin(float f) {
        float f2;
        int i = 0;
        if (!this.getMax.length()) {
            return false;
        }
        float f3 = this.isInside - f;
        this.isInside = f3;
        int round = Math.round(f3 - ((float) this.toFloatRange));
        this.toFloatRange += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.setMax.getOrientation() == 0;
        int i2 = z ? round : 0;
        if (!z) {
            i = round;
        }
        float f4 = z ? this.isInside : 0.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = this.isInside;
        }
        this.getMin.scrollBy(i2, i);
        MotionEvent obtain = MotionEvent.obtain(this.equals, uptimeMillis, 2, f4, f2, 0);
        this.setMin.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    @UiThread
    public final boolean getMax() {
        if (!this.getMax.length()) {
            return false;
        }
        setInitialActivityCount setinitialactivitycount = this.getMax;
        if (!setinitialactivitycount.getMin() || setinitialactivitycount.toFloatRange) {
            setinitialactivitycount.toFloatRange = false;
            setinitialactivitycount.getMax();
            if (setinitialactivitycount.getMin.setMax == 0) {
                if (setinitialactivitycount.getMin.length != setinitialactivitycount.length) {
                    int i = setinitialactivitycount.getMin.length;
                    if (setinitialactivitycount.setMax != null) {
                        setinitialactivitycount.setMax.onPageSelected(i);
                    }
                }
                setinitialactivitycount.setMax(0);
                setinitialactivitycount.setMin();
            } else {
                setinitialactivitycount.setMax(2);
            }
        }
        VelocityTracker velocityTracker = this.setMin;
        velocityTracker.computeCurrentVelocity(1000, (float) this.length);
        if (this.getMin.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.setMax.snapToPage();
        return true;
    }
}
