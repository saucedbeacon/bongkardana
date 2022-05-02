package o;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final class getParentFragmentManager implements SynchronizationGuard.CriticalSection {
    private final EventStore getMin;

    public getParentFragmentManager(EventStore eventStore) {
        this.getMin = eventStore;
    }

    public final Object execute() {
        return Integer.valueOf(this.getMin.cleanUp());
    }
}
