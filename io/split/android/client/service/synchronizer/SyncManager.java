package io.split.android.client.service.synchronizer;

import androidx.annotation.VisibleForTesting;
import io.split.android.client.dtos.Event;
import io.split.android.client.lifecycle.SplitLifecycleAware;
import o.dynamicDecryptDDp;

@VisibleForTesting(otherwise = 4)
public interface SyncManager extends SplitLifecycleAware {
    void flush();

    void pushEvent(Event event);

    void pushImpression(dynamicDecryptDDp dynamicdecryptddp);

    void start();

    void stop();
}
