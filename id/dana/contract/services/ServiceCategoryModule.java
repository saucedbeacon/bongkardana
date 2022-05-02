package id.dana.contract.services;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.BindColor;
import o.BindDimen;

@Module
public class ServiceCategoryModule {
    private final BindDimen.setMin setMin;

    @PerActivity
    @Provides
    public BindDimen.setMax length(BindColor bindColor) {
        return bindColor;
    }

    public ServiceCategoryModule(BindDimen.setMin setmin) {
        this.setMin = setmin;
    }

    @PerActivity
    @Provides
    public BindDimen.setMin getMax() {
        return this.setMin;
    }
}
