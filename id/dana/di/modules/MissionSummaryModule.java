package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getBackgroundExecutor;
import o.isRunInForeground;

@Module
public class MissionSummaryModule {
    private final getBackgroundExecutor.length setMin;

    @PerActivity
    @Provides
    public getBackgroundExecutor.setMin length(isRunInForeground isruninforeground) {
        return isruninforeground;
    }

    public MissionSummaryModule(getBackgroundExecutor.length length) {
        this.setMin = length;
    }

    @PerActivity
    @Provides
    public getBackgroundExecutor.length getMin() {
        return this.setMin;
    }
}
