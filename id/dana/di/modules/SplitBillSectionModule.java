package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.PopManager;
import o.dismissAll;

@Module
public class SplitBillSectionModule {
    private final PopManager.PopBean.setMin getMin;

    @PerActivity
    @Provides
    public PopManager.PopBean.getMax getMin(dismissAll dismissall) {
        return dismissall;
    }

    public SplitBillSectionModule(PopManager.PopBean.setMin setmin) {
        this.getMin = setmin;
    }

    @PerActivity
    @Provides
    public PopManager.PopBean.setMin getMax() {
        return this.getMin;
    }
}
