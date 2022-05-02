package o;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class getParentFragment implements SynchronizationGuard.CriticalSection {
    private final TransportContext getMax;
    private final int getMin;
    private final BackendResponse length;
    private final Uploader setMax;
    private final Iterable setMin;

    public getParentFragment(Uploader uploader, BackendResponse backendResponse, Iterable iterable, TransportContext transportContext, int i) {
        this.setMax = uploader;
        this.length = backendResponse;
        this.setMin = iterable;
        this.getMax = transportContext;
        this.getMin = i;
    }

    public final Object execute() {
        return this.setMax.lambda$logAndUpdateState$3(this.length, this.setMin, this.getMax, this.getMin);
    }
}
