package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GetAboutInfoResult;
import o.getLastModifiedDate;

@Module
public class MerchantModule {
    private final GetAboutInfoResult.getMin length;

    @Provides
    public GetAboutInfoResult.getMax setMax(getLastModifiedDate getlastmodifieddate) {
        return getlastmodifieddate;
    }

    public MerchantModule(GetAboutInfoResult.getMin getmin) {
        this.length = getmin;
    }

    @Provides
    public GetAboutInfoResult.getMin setMin() {
        return this.length;
    }
}
