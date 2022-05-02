package o;

import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.concurrent.Callable;

public final class completeWakefulIntent implements Callable {
    private final ConfigCacheClient setMax;
    private final ConfigContainer setMin;

    public completeWakefulIntent(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        this.setMax = configCacheClient;
        this.setMin = configContainer;
    }

    public final Object call() {
        return this.setMax.lambda$put$0(this.setMin);
    }
}
