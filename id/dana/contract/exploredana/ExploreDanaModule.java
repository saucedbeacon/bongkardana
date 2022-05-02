package id.dana.contract.exploredana;

import dagger.Module;
import dagger.Provides;
import o.getTrimPathStart;
import o.setFillAlpha;

@Module
public class ExploreDanaModule {
    private final getTrimPathStart.length setMin;

    @Provides
    public getTrimPathStart.getMax getMin(setFillAlpha setfillalpha) {
        return setfillalpha;
    }

    public ExploreDanaModule(getTrimPathStart.length length) {
        this.setMin = length;
    }

    @Provides
    public getTrimPathStart.length setMax() {
        return this.setMin;
    }
}
