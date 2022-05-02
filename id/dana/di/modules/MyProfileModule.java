package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.restorePullToRefresh;
import o.setInitScene;

@Module
public class MyProfileModule {
    private setInitScene.setMax getMax;

    @Provides
    public setInitScene.setMin getMax(restorePullToRefresh restorepulltorefresh) {
        return restorepulltorefresh;
    }

    public MyProfileModule(setInitScene.setMax setmax) {
        this.getMax = setmax;
    }

    @Provides
    public setInitScene.setMax length() {
        return this.getMax;
    }
}
