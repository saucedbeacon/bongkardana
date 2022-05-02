package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import java.util.Collections;
import java.util.List;
import o.SolverVariable$Type;
import o.getViewVelocity;
import o.isUseOnHide;

public final class onViewAdded implements getViewVelocity, getViewVelocity.setMin {
    Object getMax;
    private int getMin;
    final getViewVelocity.setMin length;
    transitionToStart setMax;
    final requestLayout<?> setMin;
    private volatile SolverVariable$Type.setMax<?> toFloatRange;
    private getVelocity toIntRange;

    public onViewAdded(requestLayout<?> requestlayout, getViewVelocity.setMin setmin) {
        this.setMin = requestlayout;
        this.length = setmin;
    }

    /* JADX INFO: finally extract failed */
    public final boolean setMax() {
        Object obj = this.getMax;
        if (obj != null) {
            this.getMax = null;
            long max = getDependencySortedChildren.setMax();
            try {
                setPivotX<?> length2 = this.setMin.setMax.length.length.length(obj.getClass());
                if (length2 != null) {
                    transitionToEnd transitiontoend = new transitionToEnd(length2, obj, this.setMin.isInside);
                    this.setMax = new transitionToStart(this.toFloatRange.setMax, this.setMin.hashCode);
                    this.setMin.IsOverlapping.getMin().setMin(this.setMax, transitiontoend);
                    if (Log.isLoggable("SourceGenerator", 2)) {
                        StringBuilder sb = new StringBuilder("Finished encoding source to cache, key: ");
                        sb.append(this.setMax);
                        sb.append(", data: ");
                        sb.append(obj);
                        sb.append(", encoder: ");
                        sb.append(length2);
                        sb.append(", duration: ");
                        sb.append(getDependencySortedChildren.length(max));
                    }
                    this.toFloatRange.getMax.getMin();
                    this.toIntRange = new getVelocity(Collections.singletonList(this.toFloatRange.setMax), this.setMin, this);
                } else {
                    throw new Registry.NoSourceEncoderAvailableException(obj.getClass());
                }
            } catch (Throwable th) {
                this.toFloatRange.getMax.getMin();
                throw th;
            }
        }
        getVelocity getvelocity = this.toIntRange;
        if (getvelocity != null && getvelocity.setMax()) {
            return true;
        }
        this.toIntRange = null;
        this.toFloatRange = null;
        boolean z = false;
        while (!z && setMin()) {
            List<SolverVariable$Type.setMax<?>> min = this.setMin.setMin();
            int i = this.getMin;
            this.getMin = i + 1;
            this.toFloatRange = min.get(i);
            if (this.toFloatRange != null && (this.setMin.invoke.getMin(this.toFloatRange.getMax.length()) || this.setMin.getMax(this.toFloatRange.getMax.setMax()))) {
                final SolverVariable$Type.setMax<?> setmax = this.toFloatRange;
                this.toFloatRange.getMax.getMin(this.setMin.toString, new isUseOnHide.getMin<Object>() {
                    public final void getMax(@Nullable Object obj) {
                        if (onViewAdded.this.length(setmax)) {
                            onViewAdded onviewadded = onViewAdded.this;
                            SolverVariable$Type.setMax setmax = setmax;
                            evaluate evaluate = onviewadded.setMin.invoke;
                            if (obj == null || !evaluate.getMin(setmax.getMax.length())) {
                                onviewadded.length.setMin(setmax.setMax, obj, setmax.getMax, setmax.getMax.length(), onviewadded.setMax);
                                return;
                            }
                            onviewadded.getMax = obj;
                            onviewadded.length.getMin();
                        }
                    }

                    public final void setMax(@NonNull Exception exc) {
                        if (onViewAdded.this.length(setmax)) {
                            onViewAdded onviewadded = onViewAdded.this;
                            SolverVariable$Type.setMax setmax = setmax;
                            onviewadded.length.setMin(onviewadded.setMax, exc, setmax.getMax, setmax.getMax.length());
                        }
                    }
                });
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(SolverVariable$Type.setMax<?> setmax) {
        SolverVariable$Type.setMax<?> setmax2 = this.toFloatRange;
        return setmax2 != null && setmax2 == setmax;
    }

    private boolean setMin() {
        return this.getMin < this.setMin.setMin().size();
    }

    public final void getMax() {
        SolverVariable$Type.setMax<?> setmax = this.toFloatRange;
        if (setmax != null) {
            setmax.getMax.getMax();
        }
    }

    public final void getMin() {
        throw new UnsupportedOperationException();
    }

    public final void setMin(setPivotY setpivoty, Object obj, isUseOnHide<?> isuseonhide, DataSource dataSource, setPivotY setpivoty2) {
        this.length.setMin(setpivoty, obj, isuseonhide, this.toFloatRange.getMax.length(), setpivoty);
    }

    public final void setMin(setPivotY setpivoty, Exception exc, isUseOnHide<?> isuseonhide, DataSource dataSource) {
        this.length.setMin(setpivoty, exc, isuseonhide, this.toFloatRange.getMax.length());
    }
}
