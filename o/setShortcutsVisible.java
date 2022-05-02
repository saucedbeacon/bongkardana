package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.changeMenuMode;

public final class setShortcutsVisible<T> {
    @NonNull
    public final changeMenuMode.setMin<T> getMin;
    @Nullable
    final Executor setMax;
    @NonNull
    public final Executor setMin;

    setShortcutsVisible(@Nullable Executor executor, @NonNull Executor executor2, @NonNull changeMenuMode.setMin<T> setmin) {
        this.setMax = executor;
        this.setMin = executor2;
        this.getMin = setmin;
    }

    public static final class setMax<T> {
        private static final Object getMin = new Object();
        private static Executor setMax = null;
        private final changeMenuMode.setMin<T> getMax;
        @Nullable
        private Executor length;
        private Executor setMin;

        public setMax(@NonNull changeMenuMode.setMin<T> setmin) {
            this.getMax = setmin;
        }

        @NonNull
        public final setShortcutsVisible<T> setMin() {
            if (this.setMin == null) {
                synchronized (getMin) {
                    if (setMax == null) {
                        setMax = Executors.newFixedThreadPool(2);
                    }
                }
                this.setMin = setMax;
            }
            return new setShortcutsVisible<>(this.length, this.setMin, this.getMax);
        }
    }
}
