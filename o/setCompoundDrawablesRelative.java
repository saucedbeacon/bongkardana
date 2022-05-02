package o;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class setCompoundDrawablesRelative implements Executor {
    private volatile Runnable getMax;
    private final Executor getMin;
    private final ArrayDeque<setMin> length = new ArrayDeque<>();
    private final Object setMin = new Object();

    public setCompoundDrawablesRelative(@NonNull Executor executor) {
        this.getMin = executor;
    }

    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.setMin) {
            this.length.add(new setMin(this, runnable));
            if (this.getMax == null) {
                setMax();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        synchronized (this.setMin) {
            Runnable poll = this.length.poll();
            this.getMax = poll;
            if (poll != null) {
                this.getMin.execute(this.getMax);
            }
        }
    }

    public final boolean length() {
        boolean z;
        synchronized (this.setMin) {
            z = !this.length.isEmpty();
        }
        return z;
    }

    static class setMin implements Runnable {
        final setCompoundDrawablesRelative getMax;
        final Runnable getMin;

        setMin(@NonNull setCompoundDrawablesRelative setcompounddrawablesrelative, @NonNull Runnable runnable) {
            this.getMax = setcompounddrawablesrelative;
            this.getMin = runnable;
        }

        public final void run() {
            try {
                this.getMin.run();
            } finally {
                this.getMax.setMax();
            }
        }
    }
}
