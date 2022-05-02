package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class setWindowInsets {
    private final List<setMax<?>> getMax = new ArrayList();

    public final synchronized <Z> void getMin(@NonNull Class<Z> cls, @NonNull setTranslationY<Z> settranslationy) {
        this.getMax.add(new setMax(cls, settranslationy));
    }

    @Nullable
    public final synchronized <Z> setTranslationY<Z> setMin(@NonNull Class<Z> cls) {
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            setMax setmax = this.getMax.get(i);
            if (setmax.setMin(cls)) {
                return setmax.getMin;
            }
        }
        return null;
    }

    static final class setMax<T> {
        final setTranslationY<T> getMin;
        private final Class<T> length;

        setMax(@NonNull Class<T> cls, @NonNull setTranslationY<T> settranslationy) {
            this.length = cls;
            this.getMin = settranslationy;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin(@NonNull Class<?> cls) {
            return this.length.isAssignableFrom(cls);
        }
    }
}
