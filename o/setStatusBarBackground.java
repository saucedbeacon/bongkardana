package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class setStatusBarBackground {
    private final List<setMin<?>> length = new ArrayList();

    @Nullable
    public final synchronized <T> setPivotX<T> length(@NonNull Class<T> cls) {
        for (setMin next : this.length) {
            if (next.getMax(cls)) {
                return next.getMax;
            }
        }
        return null;
    }

    public final synchronized <T> void getMin(@NonNull Class<T> cls, @NonNull setPivotX<T> setpivotx) {
        this.length.add(new setMin(cls, setpivotx));
    }

    static final class setMin<T> {
        final setPivotX<T> getMax;
        private final Class<T> getMin;

        setMin(@NonNull Class<T> cls, @NonNull setPivotX<T> setpivotx) {
            this.getMin = cls;
            this.getMax = setpivotx;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(@NonNull Class<?> cls) {
            return this.getMin.isAssignableFrom(cls);
        }
    }
}
