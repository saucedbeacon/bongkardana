package id.dana.contract.homeinfo;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.VersionedParcelize;
import o.jetifyAs;

@Module
public class HomeInfoModule {
    private final VersionedParcelize.setMin getMin;

    @PerActivity
    @Provides
    public VersionedParcelize.getMax getMin(jetifyAs jetifyas) {
        return jetifyas;
    }

    public HomeInfoModule(VersionedParcelize.setMin setmin) {
        this.getMin = setmin;
    }

    @PerActivity
    @Provides
    public VersionedParcelize.setMin getMin() {
        return this.getMin;
    }
}
