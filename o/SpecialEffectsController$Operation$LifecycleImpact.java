package o;

import android.content.Context;
import com.google.firebase.perf.config.DeviceCacheManager;

public final class SpecialEffectsController$Operation$LifecycleImpact implements Runnable {
    private final DeviceCacheManager getMax;
    private final Context setMin;

    public SpecialEffectsController$Operation$LifecycleImpact(DeviceCacheManager deviceCacheManager, Context context) {
        this.getMax = deviceCacheManager;
        this.setMin = context;
    }

    public final void run() {
        this.getMax.lambda$setContext$0(this.setMin);
    }
}
