package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import o.SolverVariable$Type;
import o.getViewVelocity;
import o.isUseOnHide;

public final class getVelocity implements getViewVelocity, isUseOnHide.getMin<Object> {
    private volatile SolverVariable$Type.setMax<?> IsOverlapping;
    private File equals;
    private setPivotY getMax;
    private final requestLayout<?> getMin;
    private List<SolverVariable$Type<File, ?>> isInside;
    private final getViewVelocity.setMin length;
    private final List<setPivotY> setMax;
    private int setMin;
    private int toFloatRange;

    public getVelocity(requestLayout<?> requestlayout, getViewVelocity.setMin setmin) {
        this(requestlayout.setMax(), requestlayout, setmin);
    }

    getVelocity(List<setPivotY> list, requestLayout<?> requestlayout, getViewVelocity.setMin setmin) {
        this.setMin = -1;
        this.setMax = list;
        this.getMin = requestlayout;
        this.length = setmin;
    }

    public final boolean setMax() {
        while (true) {
            boolean z = false;
            if (this.isInside == null || !getMin()) {
                int i = this.setMin + 1;
                this.setMin = i;
                if (i >= this.setMax.size()) {
                    return false;
                }
                setPivotY setpivoty = this.setMax.get(this.setMin);
                File min = this.getMin.IsOverlapping.getMin().getMin(new transitionToStart(setpivoty, this.getMin.hashCode));
                this.equals = min;
                if (min != null) {
                    this.getMax = setpivoty;
                    this.isInside = this.getMin.setMax.length.getMax(min);
                    this.toFloatRange = 0;
                }
            } else {
                this.IsOverlapping = null;
                while (!z && getMin()) {
                    List<SolverVariable$Type<File, ?>> list = this.isInside;
                    int i2 = this.toFloatRange;
                    this.toFloatRange = i2 + 1;
                    this.IsOverlapping = list.get(i2).setMin(this.equals, this.getMin.getMax, this.getMin.toFloatRange, this.getMin.isInside);
                    if (this.IsOverlapping != null && this.getMin.getMax(this.IsOverlapping.getMax.setMax())) {
                        this.IsOverlapping.getMax.getMin(this.getMin.toString, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    private boolean getMin() {
        return this.toFloatRange < this.isInside.size();
    }

    public final void getMax() {
        SolverVariable$Type.setMax<?> setmax = this.IsOverlapping;
        if (setmax != null) {
            setmax.getMax.getMax();
        }
    }

    public final void getMax(Object obj) {
        this.length.setMin(this.getMax, obj, this.IsOverlapping.getMax, DataSource.DATA_DISK_CACHE, this.getMax);
    }

    public final void setMax(@NonNull Exception exc) {
        this.length.setMin(this.getMax, exc, this.IsOverlapping.getMax, DataSource.DATA_DISK_CACHE);
    }
}
