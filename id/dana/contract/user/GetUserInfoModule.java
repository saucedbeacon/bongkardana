package id.dana.contract.user;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setAutoDismissEnabled$core;
import o.setBodyFont$core;

@Module
public class GetUserInfoModule {
    private final setAutoDismissEnabled$core.getMax getMin;

    @PerActivity
    @Provides
    public setAutoDismissEnabled$core.setMin length(setBodyFont$core setbodyfont_core) {
        return setbodyfont_core;
    }

    public GetUserInfoModule(setAutoDismissEnabled$core.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public setAutoDismissEnabled$core.getMax setMin() {
        return this.getMin;
    }
}
