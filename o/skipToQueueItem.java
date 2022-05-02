package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class skipToQueueItem extends previous {
    @NonNull
    private static final Executor getMax = new Executor() {
        public final void execute(Runnable runnable) {
            skipToQueueItem.length().setMax.setMax(runnable);
        }
    };
    private static volatile skipToQueueItem getMin;
    @NonNull
    private static final Executor length = new Executor() {
        public final void execute(Runnable runnable) {
            skipToQueueItem.length().setMax.getMin(runnable);
        }
    };
    @NonNull
    public previous setMax;
    @NonNull
    private previous setMin;

    private skipToQueueItem() {
        playFromUri playfromuri = new playFromUri();
        this.setMin = playfromuri;
        this.setMax = playfromuri;
    }

    @NonNull
    public static skipToQueueItem length() {
        if (getMin != null) {
            return getMin;
        }
        synchronized (skipToQueueItem.class) {
            if (getMin == null) {
                getMin = new skipToQueueItem();
            }
        }
        return getMin;
    }

    public final void getMin(Runnable runnable) {
        this.setMax.getMin(runnable);
    }

    public final void setMax(Runnable runnable) {
        this.setMax.setMax(runnable);
    }

    @NonNull
    public static Executor setMin() {
        return getMax;
    }

    @NonNull
    public static Executor setMax() {
        return length;
    }

    public final boolean getMin() {
        return this.setMax.getMin();
    }
}
