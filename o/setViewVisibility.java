package o;

import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;
import o.hasCornerMarking;

public final class setViewVisibility extends hasCornerMarking {
    private static final IRouterComponent setMin = new IRouterComponent("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory length;

    public setViewVisibility() {
        this(setMin);
    }

    private setViewVisibility(ThreadFactory threadFactory) {
        this.length = threadFactory;
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        return new neverAddHashQuery(this.length);
    }
}
