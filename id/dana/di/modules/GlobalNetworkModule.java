package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.BLEServiceUnit;
import o.onNext;

@Module
public class GlobalNetworkModule {
    private final onNext.length getMin;

    @PerActivity
    @Provides
    public onNext.setMin getMin(BLEServiceUnit bLEServiceUnit) {
        return bLEServiceUnit;
    }

    public GlobalNetworkModule(onNext.length length) {
        this.getMin = length;
    }

    @PerActivity
    @Provides
    public onNext.length setMin() {
        return this.getMin;
    }
}
