package id.dana.contract.feeds;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getScaleY;
import o.getTranslateX;

@Module
public class UserFeedsModule {
    private final getScaleY.getMin length;

    @PerActivity
    @Provides
    public getScaleY.length setMin(getTranslateX gettranslatex) {
        return gettranslatex;
    }

    public UserFeedsModule(getScaleY.getMin getmin) {
        this.length = getmin;
    }

    @PerActivity
    @Provides
    public getScaleY.getMin length() {
        return this.length;
    }
}
