package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.canChildScrollUp;
import o.moveToStart;

@Module
public class DanaContactModule {
    private moveToStart.getMin setMin;

    @Provides
    public moveToStart.setMin getMin(canChildScrollUp canchildscrollup) {
        return canchildscrollup;
    }

    public DanaContactModule(moveToStart.getMin getmin) {
        this.setMin = getmin;
    }

    @Provides
    public moveToStart.getMin getMax() {
        return this.setMin;
    }
}
