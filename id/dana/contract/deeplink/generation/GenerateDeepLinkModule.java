package id.dana.contract.deeplink.generation;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.createAnimators;
import o.getTransitionProperties;
import o.matchInstances;
import o.matchNames;

@Module
public class GenerateDeepLinkModule {
    private getTransitionProperties.IsOverlapping getMax;
    private getTransitionProperties.length length;
    private getTransitionProperties.setMax setMax;

    @PerActivity
    @Provides
    public getTransitionProperties.getMin getMax(createAnimators createanimators) {
        return createanimators;
    }

    @PerActivity
    @Provides
    public getTransitionProperties.setMin getMax(matchInstances matchinstances) {
        return matchinstances;
    }

    @PerActivity
    @Provides
    public getTransitionProperties.getMax setMin(matchNames matchnames) {
        return matchnames;
    }

    public GenerateDeepLinkModule(getTransitionProperties.setMax setmax) {
        this.setMax = setmax;
    }

    public GenerateDeepLinkModule(getTransitionProperties.setMax setmax, getTransitionProperties.IsOverlapping isOverlapping) {
        this(setmax);
        this.getMax = isOverlapping;
    }

    public GenerateDeepLinkModule(getTransitionProperties.length length2) {
        this.length = length2;
    }

    @PerActivity
    @Provides
    public getTransitionProperties.setMax getMin() {
        return this.setMax;
    }

    @PerActivity
    @Provides
    public getTransitionProperties.IsOverlapping length() {
        return this.getMax;
    }

    @PerActivity
    @Provides
    public getTransitionProperties.length setMin() {
        return this.length;
    }
}
