package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setBadgeInfo;
import o.setMakeTitleMax;

@Module
public class SplitBillIntroductionModule {
    private setBadgeInfo.setMin setMin;

    @PerActivity
    @Provides
    public setBadgeInfo.getMax length(setMakeTitleMax setmaketitlemax) {
        return setmaketitlemax;
    }

    public SplitBillIntroductionModule(setBadgeInfo.setMin setmin) {
        this.setMin = setmin;
    }

    @PerActivity
    @Provides
    public setBadgeInfo.setMin length() {
        return this.setMin;
    }
}
