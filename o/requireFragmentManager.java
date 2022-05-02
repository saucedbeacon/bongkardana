package o;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class requireFragmentManager implements SynchronizationGuard.CriticalSection {
    private final TransportContext getMin;
    private final Uploader setMin;

    public requireFragmentManager(Uploader uploader, TransportContext transportContext) {
        this.setMin = uploader;
        this.getMin = transportContext;
    }

    public final Object execute() {
        return this.setMin.lambda$logAndUpdateState$2(this.getMin);
    }
}
