package id.dana.challenge.pinwithface;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setCoveredFadeColor;
import o.setParallaxDistance;

@Module
public class ChallengePinWithFaceModule {
    private setParallaxDistance.setMin getMax;

    @PerActivity
    @Provides
    public setParallaxDistance.length length(setCoveredFadeColor setcoveredfadecolor) {
        return setcoveredfadecolor;
    }

    public ChallengePinWithFaceModule(setParallaxDistance.setMin setmin) {
        this.getMax = setmin;
    }

    @PerActivity
    @Provides
    public setParallaxDistance.setMin getMax() {
        return this.getMax;
    }
}
