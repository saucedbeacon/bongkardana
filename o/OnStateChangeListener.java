package o;

import io.reactivex.annotations.NonNull;

public final class OnStateChangeListener extends setPeriodValue<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public OnStateChangeListener(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    public final void onDisposed(@NonNull Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
