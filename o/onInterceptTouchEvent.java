package o;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class onInterceptTouchEvent implements Executor {
    private final Executor getMax;
    private Runnable getMin;
    private final ArrayDeque<Runnable> setMin = new ArrayDeque<>();

    public onInterceptTouchEvent(@NonNull Executor executor) {
        this.getMax = executor;
    }

    public final synchronized void execute(final Runnable runnable) {
        this.setMin.offer(new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    onInterceptTouchEvent.this.setMax();
                }
            }
        });
        if (this.getMin == null) {
            setMax();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMax() {
        Runnable poll = this.setMin.poll();
        this.getMin = poll;
        if (poll != null) {
            this.getMax.execute(poll);
        }
    }
}
