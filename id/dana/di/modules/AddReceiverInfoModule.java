package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.SystemAlarmService;
import o.SystemJobService;

@Module
public class AddReceiverInfoModule {
    private final SystemAlarmService.getMin getMax;

    @Provides
    public SystemAlarmService.setMin getMax(SystemJobService systemJobService) {
        return systemJobService;
    }

    public AddReceiverInfoModule(SystemAlarmService.getMin getmin) {
        this.getMax = getmin;
    }

    @Provides
    public SystemAlarmService.getMin setMin() {
        return this.getMax;
    }
}
