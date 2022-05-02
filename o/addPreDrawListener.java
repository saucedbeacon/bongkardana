package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import o.setPositiveButtonIcon;

public final class addPreDrawListener {
    private static final length<Object> getMax = new length<Object>() {
        public final void setMin(@NonNull Object obj) {
        }
    };

    public interface getMax<T> {
        T setMax();
    }

    public interface getMin {
        @NonNull
        isPointInChildBounds j_();
    }

    public interface length<T> {
        void setMin(@NonNull T t);
    }

    @NonNull
    public static <T extends getMin> setPositiveButtonIcon.length<T> getMin(int i, @NonNull getMax<T> getmax) {
        return new setMin(new setPositiveButtonIcon.setMax(i), getmax, getMax);
    }

    static final class setMin<T> implements setPositiveButtonIcon.length<T> {
        private final setPositiveButtonIcon.length<T> getMin;
        private final length<T> length;
        private final getMax<T> setMin;

        setMin(@NonNull setPositiveButtonIcon.length<T> length2, @NonNull getMax<T> getmax, @NonNull length<T> length3) {
            this.getMin = length2;
            this.setMin = getmax;
            this.length = length3;
        }

        public final T getMax() {
            T max = this.getMin.getMax();
            if (max == null) {
                max = this.setMin.setMax();
            }
            if (max instanceof getMin) {
                ((getMin) max).j_().getMax(false);
            }
            return max;
        }

        public final boolean getMin(@NonNull T t) {
            if (t instanceof getMin) {
                ((getMin) t).j_().getMax(true);
            }
            this.length.setMin(t);
            return this.getMin.getMin(t);
        }
    }

    @NonNull
    public static <T> setPositiveButtonIcon.length<List<T>> setMax() {
        return new setMin(new setPositiveButtonIcon.setMax(20), new getMax<List<T>>() {
            @NonNull
            public final /* synthetic */ Object setMax() {
                return new ArrayList();
            }
        }, new length<List<T>>() {
            public final /* synthetic */ void setMin(@NonNull Object obj) {
                ((List) obj).clear();
            }
        });
    }
}
