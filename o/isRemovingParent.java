package o;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class isRemovingParent implements SynchronizationGuard.CriticalSection {
    private final Uploader getMin;
    private final int setMax;
    private final TransportContext setMin;

    public isRemovingParent(Uploader uploader, TransportContext transportContext, int i) {
        this.getMin = uploader;
        this.setMin = transportContext;
        this.setMax = i;
    }

    public final Object execute() {
        return this.getMin.lambda$upload$0(this.setMin, this.setMax);
    }
}
