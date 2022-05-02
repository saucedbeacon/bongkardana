package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public interface SolverVariable$Type<Model, Data> {
    boolean getMin(@NonNull Model model);

    @Nullable
    setMax<Data> setMin(@NonNull Model model, int i, int i2, @NonNull MotionHelper motionHelper);

    public static class setMax<Data> {
        public final isUseOnHide<Data> getMax;
        public final List<setPivotY> getMin;
        public final setPivotY setMax;

        public setMax(@NonNull setPivotY setpivoty, @NonNull isUseOnHide<Data> isuseonhide) {
            this(setpivoty, Collections.emptyList(), isuseonhide);
        }

        private setMax(@NonNull setPivotY setpivoty, @NonNull List<setPivotY> list, @NonNull isUseOnHide<Data> isuseonhide) {
            if (setpivoty != null) {
                this.setMax = setpivoty;
                if (list != null) {
                    this.getMin = list;
                    if (isuseonhide != null) {
                        this.getMax = isuseonhide;
                        return;
                    }
                    throw new NullPointerException("Argument must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
    }
}
