package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.SolverVariable$Type;
import o.isUseOnHide;
import o.setPositiveButtonIcon;

final class ConstraintWidget$DimensionBehaviour<Model, Data> implements SolverVariable$Type<Model, Data> {
    private final List<SolverVariable$Type<Model, Data>> getMax;
    private final setPositiveButtonIcon.length<List<Throwable>> setMax;

    ConstraintWidget$DimensionBehaviour(@NonNull List<SolverVariable$Type<Model, Data>> list, @NonNull setPositiveButtonIcon.length<List<Throwable>> length) {
        this.getMax = list;
        this.setMax = length;
    }

    public final SolverVariable$Type.setMax<Data> setMin(@NonNull Model model, int i, int i2, @NonNull MotionHelper motionHelper) {
        SolverVariable$Type.setMax min;
        int size = this.getMax.size();
        ArrayList arrayList = new ArrayList(size);
        setPivotY setpivoty = null;
        for (int i3 = 0; i3 < size; i3++) {
            SolverVariable$Type solverVariable$Type = this.getMax.get(i3);
            if (solverVariable$Type.getMin(model) && (min = solverVariable$Type.setMin(model, i, i2, motionHelper)) != null) {
                setpivoty = min.setMax;
                arrayList.add(min.getMax);
            }
        }
        if (arrayList.isEmpty() || setpivoty == null) {
            return null;
        }
        return new SolverVariable$Type.setMax<>(setpivoty, new getMin(arrayList, this.setMax));
    }

    public final boolean getMin(@NonNull Model model) {
        for (SolverVariable$Type<Model, Data> min : this.getMax) {
            if (min.getMin(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.getMax.toArray()));
        sb.append('}');
        return sb.toString();
    }

    static class getMin<Data> implements isUseOnHide<Data>, isUseOnHide.getMin<Data> {
        private Priority getMax;
        private isUseOnHide.getMin<? super Data> getMin;
        private final setPositiveButtonIcon.length<List<Throwable>> length;
        private final List<isUseOnHide<Data>> setMax;
        private int setMin;
        private boolean toFloatRange;
        @Nullable
        private List<Throwable> toIntRange;

        getMin(@NonNull List<isUseOnHide<Data>> list, @NonNull setPositiveButtonIcon.length<List<Throwable>> length2) {
            this.length = length2;
            if (!list.isEmpty()) {
                this.setMax = list;
                this.setMin = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super Data> getmin) {
            this.getMax = priority;
            this.getMin = getmin;
            this.toIntRange = this.length.getMax();
            this.setMax.get(this.setMin).getMin(priority, this);
            if (this.toFloatRange) {
                getMax();
            }
        }

        public final void getMin() {
            List<Throwable> list = this.toIntRange;
            if (list != null) {
                this.length.getMin(list);
            }
            this.toIntRange = null;
            for (isUseOnHide<Data> min : this.setMax) {
                min.getMin();
            }
        }

        public final void getMax() {
            this.toFloatRange = true;
            for (isUseOnHide<Data> max : this.setMax) {
                max.getMax();
            }
        }

        @NonNull
        public final Class<Data> setMax() {
            return this.setMax.get(0).setMax();
        }

        @NonNull
        public final DataSource length() {
            return this.setMax.get(0).length();
        }

        public final void getMax(@Nullable Data data) {
            if (data != null) {
                this.getMin.getMax(data);
            } else {
                setMin();
            }
        }

        public final void setMax(@NonNull Exception exc) {
            List<Throwable> list = this.toIntRange;
            if (list != null) {
                list.add(exc);
                setMin();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }

        private void setMin() {
            if (!this.toFloatRange) {
                if (this.setMin < this.setMax.size() - 1) {
                    this.setMin++;
                    getMin(this.getMax, this.getMin);
                } else if (this.toIntRange != null) {
                    this.getMin.setMax(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.toIntRange)));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
        }
    }
}
