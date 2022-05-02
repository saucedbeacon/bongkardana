package o;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class requireHost implements SynchronizationGuard.CriticalSection {
    private final EventInternal getMin;
    private final DefaultScheduler setMax;
    private final TransportContext setMin;

    public requireHost(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        this.setMax = defaultScheduler;
        this.setMin = transportContext;
        this.getMin = eventInternal;
    }

    public final Object execute() {
        return this.setMax.lambda$schedule$0(this.setMin, this.getMin);
    }
}
