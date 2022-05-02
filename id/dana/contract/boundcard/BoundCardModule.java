package id.dana.contract.boundcard;

import dagger.Module;
import dagger.Provides;
import o.setColorSchemeColors;
import o.setOnChildScrollUpCallback;

@Module
public class BoundCardModule {
    private final setColorSchemeColors.getMin setMin;

    @Provides
    public setColorSchemeColors.length getMin(setOnChildScrollUpCallback setonchildscrollupcallback) {
        return setonchildscrollupcallback;
    }

    public BoundCardModule(setColorSchemeColors.getMin getmin) {
        this.setMin = getmin;
    }

    @Provides
    public setColorSchemeColors.getMin setMax() {
        return this.setMin;
    }
}
