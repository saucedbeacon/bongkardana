package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.dispatchOnPageScrolled;
import o.infoForPosition;

@Module
public class OauthGrantModule {
    private dispatchOnPageScrolled.getMax getMin;

    @PerActivity
    @Provides
    public dispatchOnPageScrolled.length getMin(infoForPosition infoforposition) {
        return infoforposition;
    }

    public OauthGrantModule(dispatchOnPageScrolled.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public dispatchOnPageScrolled.getMax length() {
        return this.getMin;
    }
}
