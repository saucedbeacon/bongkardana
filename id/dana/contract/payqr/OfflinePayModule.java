package id.dana.contract.payqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getPageSize;
import o.requestTransform;

@Module
public class OfflinePayModule {
    private final getPageSize.getMin getMax;

    @PerActivity
    @Provides
    public getPageSize.setMin setMax(requestTransform requesttransform) {
        return requesttransform;
    }

    public OfflinePayModule(getPageSize.getMin getmin) {
        this.getMax = getmin;
    }

    @PerActivity
    @Provides
    public getPageSize.getMin setMin() {
        return this.getMax;
    }
}
