package id.dana.service.favorites;

import dagger.Module;
import dagger.Provides;
import o.setFitSpace;
import o.setForceFullScreen;

@Module
public class FavoriteServicesModule {
    private setForceFullScreen.getMin getMin;

    @Provides
    public setForceFullScreen.setMin getMax(setFitSpace setfitspace) {
        return setfitspace;
    }

    public FavoriteServicesModule(setForceFullScreen.getMin getmin) {
        this.getMin = getmin;
    }

    @Provides
    public setForceFullScreen.getMin length() {
        return this.getMin;
    }
}
