package o;

import com.google.common.base.Preconditions;
import io.split.android.client.SplitClient;
import io.split.android.client.events.executors.SplitEventExecutorResources;

public final class dynamicEncryptDDp implements SplitEventExecutorResources {
    private SplitClient _client;

    public final void setSplitClient(SplitClient splitClient) {
        this._client = (SplitClient) Preconditions.checkNotNull(splitClient);
    }

    public final SplitClient getSplitClient() {
        return this._client;
    }
}
