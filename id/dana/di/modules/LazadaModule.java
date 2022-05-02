package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GriverSessionDataExtension;
import o.getResultFailedResponse;

@Module
public class LazadaModule {
    private GriverSessionDataExtension.length getMax;

    @Provides
    public GriverSessionDataExtension.setMax length(getResultFailedResponse getresultfailedresponse) {
        return getresultfailedresponse;
    }

    public LazadaModule(GriverSessionDataExtension.length length) {
        this.getMax = length;
    }

    @Provides
    public GriverSessionDataExtension.length getMin() {
        return this.getMax;
    }
}
