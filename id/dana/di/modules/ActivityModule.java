package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.base.BaseActivity;
import id.dana.di.PerActivity;

@Module
public class ActivityModule {
    private final BaseActivity setMin;

    public ActivityModule(BaseActivity baseActivity) {
        this.setMin = baseActivity;
    }

    /* access modifiers changed from: package-private */
    @PerActivity
    @Provides
    public BaseActivity setMin() {
        return this.setMin;
    }
}
