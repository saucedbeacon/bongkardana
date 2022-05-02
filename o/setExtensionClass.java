package o;

import id.dana.di.modules.PayMethodModule;
import o.ForceStopRunnable$BroadcastReceiver;
import o.b;

public final class setExtensionClass implements getAdapterPosition<ForceStopRunnable$BroadcastReceiver.setMin> {
    private final b.C0007b<SystemForegroundService> setMax;
    private final PayMethodModule setMin;

    public static ForceStopRunnable$BroadcastReceiver.setMin setMin(PayMethodModule payMethodModule, SystemForegroundService systemForegroundService) {
        ForceStopRunnable$BroadcastReceiver.setMin length = payMethodModule.length(systemForegroundService);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ForceStopRunnable$BroadcastReceiver.setMin length = this.setMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
