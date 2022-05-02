package id.dana.contract.staticqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.OnTouch;
import o.R;

@Module
public class GetStaticQrModule {
    private final OnTouch.length setMax;

    @PerActivity
    @Provides
    public OnTouch.setMin length(R.dimen dimen) {
        return dimen;
    }

    public GetStaticQrModule(OnTouch.length length) {
        this.setMax = length;
    }

    @PerActivity
    @Provides
    public OnTouch.length setMax() {
        return this.setMax;
    }
}
