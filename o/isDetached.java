package o;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;

public final class isDetached implements Runnable {
    private final WorkInitializer getMin;

    public isDetached(WorkInitializer workInitializer) {
        this.getMin = workInitializer;
    }

    public final void run() {
        this.getMin.lambda$ensureContextsScheduled$1();
    }
}
