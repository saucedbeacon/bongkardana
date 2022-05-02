package io.split.android.client.events.executors;

import io.split.android.client.SplitClient;

public interface SplitEventExecutorResources {
    SplitClient getSplitClient();

    void setSplitClient(SplitClient splitClient);
}
