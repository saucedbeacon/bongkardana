package o;

import io.reactivex.annotations.NonNull;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

abstract class setPeriodValue<T> extends AtomicReference<T> implements GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    public abstract void onDisposed(@NonNull T t);

    setPeriodValue(T t) {
        super(setRefreshAnimation.getMax(t, "value is null"));
    }

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            onDisposed(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
