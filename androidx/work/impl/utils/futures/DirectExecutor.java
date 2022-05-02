package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public enum DirectExecutor implements Executor {
    INSTANCE;

    public final String toString() {
        return "DirectExecutor";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
