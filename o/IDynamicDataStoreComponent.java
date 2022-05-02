package o;

import com.google.common.base.Preconditions;
import io.split.android.client.impressions.ImpressionListener;
import io.split.android.client.service.synchronizer.SyncManager;

public final class IDynamicDataStoreComponent implements ImpressionListener {
    private final SyncManager mSyncManager;

    public final void close() {
    }

    public IDynamicDataStoreComponent(SyncManager syncManager) {
        this.mSyncManager = (SyncManager) Preconditions.checkNotNull(syncManager);
    }

    public final void log(dynamicDecryptDDp dynamicdecryptddp) {
        this.mSyncManager.pushImpression(dynamicdecryptddp);
    }
}
