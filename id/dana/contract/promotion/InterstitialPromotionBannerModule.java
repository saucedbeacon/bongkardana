package id.dana.contract.promotion;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.WorkManagerInitializer;
import o.WorkerParameters;

@Module
public class InterstitialPromotionBannerModule {
    private final WorkerParameters.length setMax;

    @PerActivity
    @Provides
    public WorkerParameters.getMax length(WorkManagerInitializer workManagerInitializer) {
        return workManagerInitializer;
    }

    public InterstitialPromotionBannerModule(WorkerParameters.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public WorkerParameters.length getMin() {
        return this.setMax;
    }
}
