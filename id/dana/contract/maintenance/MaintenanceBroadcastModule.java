package id.dana.contract.maintenance;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getDrawFullUnderline;
import o.setTabIndicatorColor;

@Module
public class MaintenanceBroadcastModule {
    private final setTabIndicatorColor.setMin setMax;

    @PerActivity
    @Provides
    public setTabIndicatorColor.getMax setMax(getDrawFullUnderline getdrawfullunderline) {
        return getdrawfullunderline;
    }

    public MaintenanceBroadcastModule(setTabIndicatorColor.setMin setmin) {
        this.setMax = setmin;
    }

    @PerActivity
    @Provides
    public setTabIndicatorColor.setMin length() {
        return this.setMax;
    }
}
