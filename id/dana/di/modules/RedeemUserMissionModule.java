package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getTaskExecutor;
import o.isUsed;

@Module
public class RedeemUserMissionModule {
    private final isUsed.getMax getMin;

    @PerActivity
    @Provides
    public isUsed.length getMax(getTaskExecutor gettaskexecutor) {
        return gettaskexecutor;
    }

    public RedeemUserMissionModule(isUsed.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public isUsed.getMax length() {
        return this.getMin;
    }
}
