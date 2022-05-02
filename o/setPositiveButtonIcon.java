package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class setPositiveButtonIcon {

    public interface length<T> {
        @Nullable
        T getMax();

        boolean getMin(@NonNull T t);
    }

    public static class getMin<T> implements length<T> {
        private int getMax;
        private final Object[] getMin;

        public getMin(int i) {
            if (i > 0) {
                this.getMin = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public T getMax() {
            int i = this.getMax;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.getMin;
            T t = tArr[i2];
            tArr[i2] = null;
            this.getMax = i - 1;
            return t;
        }

        public boolean getMin(@NonNull T t) {
            if (!setMax(t)) {
                int i = this.getMax;
                Object[] objArr = this.getMin;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.getMax = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        private boolean setMax(@NonNull T t) {
            for (int i = 0; i < this.getMax; i++) {
                if (this.getMin[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class setMax<T> extends getMin<T> {
        private final Object getMax = new Object();

        public setMax(int i) {
            super(i);
        }

        public final T getMax() {
            T max;
            synchronized (this.getMax) {
                max = super.getMax();
            }
            return max;
        }

        public final boolean getMin(@NonNull T t) {
            boolean min;
            synchronized (this.getMax) {
                min = super.getMin(t);
            }
            return min;
        }
    }
}
