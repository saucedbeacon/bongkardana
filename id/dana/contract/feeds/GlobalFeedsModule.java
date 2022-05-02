package id.dana.contract.feeds;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getLocalMatrix;
import o.setTrimPathOffset;

@Module
public class GlobalFeedsModule {
    private final setTrimPathOffset.setMin setMin;

    @PerActivity
    @Provides
    public setTrimPathOffset.setMax setMax(getLocalMatrix getlocalmatrix) {
        return getlocalmatrix;
    }

    public GlobalFeedsModule(setTrimPathOffset.setMin setmin) {
        this.setMin = setmin;
    }

    @PerActivity
    @Provides
    public setTrimPathOffset.setMin length() {
        return this.setMin;
    }
}
