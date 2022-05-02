package o;

import id.dana.di.modules.PayMethodModule;
import o.ForceStopRunnable$BroadcastReceiver;

public final class GriverEvent implements getAdapterPosition<ForceStopRunnable$BroadcastReceiver.length> {
    private final PayMethodModule getMax;

    private GriverEvent(PayMethodModule payMethodModule) {
        this.getMax = payMethodModule;
    }

    public static GriverEvent setMax(PayMethodModule payMethodModule) {
        return new GriverEvent(payMethodModule);
    }

    public final /* synthetic */ Object get() {
        ForceStopRunnable$BroadcastReceiver.length max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
