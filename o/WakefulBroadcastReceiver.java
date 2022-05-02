package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

public final class WakefulBroadcastReceiver implements SuccessContinuation {
    private final ConfigContainer getMin;
    private final boolean length;
    private final ConfigCacheClient setMax;

    public WakefulBroadcastReceiver(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer) {
        this.setMax = configCacheClient;
        this.length = z;
        this.getMin = configContainer;
    }

    public final Task then(Object obj) {
        return this.setMax.lambda$put$1(this.length, this.getMin, (Void) obj);
    }
}
