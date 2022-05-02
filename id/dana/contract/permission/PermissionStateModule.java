package id.dana.contract.permission;

import dagger.Module;
import dagger.Provides;
import o.ViewPager2;

@Module
public class PermissionStateModule {
    private final ViewPager2.OffscreenPageLimit.setMin setMax;

    @Provides
    public ViewPager2.OffscreenPageLimit.length setMax(ViewPager2.SavedState savedState) {
        return savedState;
    }

    public PermissionStateModule(ViewPager2.OffscreenPageLimit.setMin setmin) {
        this.setMax = setmin;
    }

    @Provides
    public ViewPager2.OffscreenPageLimit.setMin length() {
        return this.setMax;
    }
}
