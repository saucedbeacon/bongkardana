package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import o.SolverVariable$Type;
import o.isUseOnHide;

public final class getSaturation<Model> implements SolverVariable$Type<Model, Model> {
    private static final getSaturation<?> length = new getSaturation<>();

    public final boolean getMin(@NonNull Model model) {
        return true;
    }

    public static <T> getSaturation<T> getMax() {
        return length;
    }

    public final SolverVariable$Type.setMax<Model> setMin(@NonNull Model model, int i, int i2, @NonNull MotionHelper motionHelper) {
        return new SolverVariable$Type.setMax<>(new layoutChild(model), new getMin(model));
    }

    static class getMin<Model> implements isUseOnHide<Model> {
        private final Model getMax;

        public final void getMax() {
        }

        public final void getMin() {
        }

        getMin(Model model) {
            this.getMax = model;
        }

        public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super Model> getmin) {
            getmin.getMax(this.getMax);
        }

        @NonNull
        public final Class<Model> setMax() {
            return this.getMax.getClass();
        }

        @NonNull
        public final DataSource length() {
            return DataSource.LOCAL;
        }
    }

    public static class length<Model> implements access$1900<Model, Model> {
        private static final length<?> getMax = new length<>();

        public static <T> length<T> length() {
            return getMax;
        }

        @NonNull
        public final SolverVariable$Type<Model, Model> getMax(setSaturation setsaturation) {
            return getSaturation.getMax();
        }
    }
}
