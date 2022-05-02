package id.dana.contract.account;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setDistanceToTriggerSync;
import o.setProgressBackgroundColorSchemeResource;

@Module
public class FirstTimeModule {
    private final setProgressBackgroundColorSchemeResource.setMin length;

    @PerActivity
    @Provides
    public setProgressBackgroundColorSchemeResource.setMax length(setDistanceToTriggerSync setdistancetotriggersync) {
        return setdistancetotriggersync;
    }

    public FirstTimeModule(setProgressBackgroundColorSchemeResource.setMin setmin) {
        this.length = setmin;
    }

    @PerActivity
    @Provides
    public setProgressBackgroundColorSchemeResource.setMin setMin() {
        return this.length;
    }
}
