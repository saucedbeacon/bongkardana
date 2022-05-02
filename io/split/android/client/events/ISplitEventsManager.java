package io.split.android.client.events;

import io.split.android.client.events.executors.SplitEventExecutorResources;
import o.atlasSafeEncrypt;

public interface ISplitEventsManager {
    boolean eventAlreadyTriggered(SplitEvent splitEvent);

    SplitEventExecutorResources getExecutorResources();

    void notifyInternalEvent(SplitInternalEvent splitInternalEvent);

    void register(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt);
}
