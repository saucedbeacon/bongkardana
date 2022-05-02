package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.GriverGlideExtensionImpl;
import o.onLoadFailed;

@Module
public class RecentContactModule {
    private final onLoadFailed.length setMax;

    @PerActivity
    @Provides
    public onLoadFailed.setMax getMax(GriverGlideExtensionImpl griverGlideExtensionImpl) {
        return griverGlideExtensionImpl;
    }

    public RecentContactModule(onLoadFailed.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public onLoadFailed.length getMin() {
        return this.setMax;
    }
}
