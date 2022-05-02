package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.ForceStopRunnable$BroadcastReceiver;
import o.SystemForegroundService;

@Module
public class PayMethodModule {
    private final ForceStopRunnable$BroadcastReceiver.length getMax;

    @Provides
    public ForceStopRunnable$BroadcastReceiver.setMin length(SystemForegroundService systemForegroundService) {
        return systemForegroundService;
    }

    public PayMethodModule(ForceStopRunnable$BroadcastReceiver.length length) {
        this.getMax = length;
    }

    @Provides
    public ForceStopRunnable$BroadcastReceiver.length getMax() {
        return this.getMax;
    }
}
