package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.MultilevelSelectCallBack;
import o.getSelectedOption;

@Module
public class UserConfigModules {
    @PerActivity
    @Provides
    public MultilevelSelectCallBack.getMin setMin(getSelectedOption getselectedoption) {
        return getselectedoption;
    }
}
