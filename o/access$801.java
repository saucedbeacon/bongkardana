package o;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import o.GriverProgressBar;

public abstract class access$801 implements GriverProgressBar.UpdateRunnable {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* access modifiers changed from: protected */
    public abstract void onDispose();

    public static void verifyMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder("Expected to be called on the main thread but was ");
            sb.append(Thread.currentThread().getName());
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    public final void dispose() {
        if (!this.unsubscribed.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onDispose();
        } else {
            hideProgress.length().scheduleDirect(new Runnable() {
                public final void run() {
                    access$801.this.onDispose();
                }
            });
        }
    }
}
