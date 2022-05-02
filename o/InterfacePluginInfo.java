package o;

import java.util.concurrent.atomic.AtomicReference;

public final class InterfacePluginInfo extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final boolean addThrowable(Throwable th) {
        return utAvaiable.length(this, th);
    }

    public final Throwable terminate() {
        return utAvaiable.setMin(this);
    }

    public final boolean isTerminated() {
        return get() == utAvaiable.setMax;
    }
}
