package o;

import androidx.annotation.NonNull;

public class getRoundPercent<T> implements fireTrigger<T> {
    protected final T getMax;

    public final void length() {
    }

    public final int setMax() {
        return 1;
    }

    public getRoundPercent(@NonNull T t) {
        if (t != null) {
            this.getMax = t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @NonNull
    public final Class<T> getMin() {
        return this.getMax.getClass();
    }

    @NonNull
    public final T setMin() {
        return this.getMax;
    }
}
