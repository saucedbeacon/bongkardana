package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.s;
import o.setTextSpacing;
import o.t;
import o.updateAdapter;

@Module
public class NearbyMeModule {
    private final setTextSpacing.getMin setMin;

    @PerActivity
    @Provides
    public t getMax(s sVar) {
        return sVar;
    }

    @PerActivity
    @Provides
    public setTextSpacing.setMin length(updateAdapter updateadapter) {
        return updateadapter;
    }

    public NearbyMeModule(setTextSpacing.getMin getmin) {
        this.setMin = getmin;
    }

    @PerActivity
    @Provides
    public setTextSpacing.getMin getMax() {
        return this.setMin;
    }
}
