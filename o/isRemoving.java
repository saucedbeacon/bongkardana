package o;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class isRemoving implements SynchronizationGuard.CriticalSection {
    private final WorkInitializer setMax;

    public isRemoving(WorkInitializer workInitializer) {
        this.setMax = workInitializer;
    }

    public final Object execute() {
        return this.setMax.lambda$ensureContextsScheduled$0();
    }
}
