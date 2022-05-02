package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GriverH5Utils;
import o.loadOriginalImage;

@Module
public class RequestMoneyQrModule {
    private loadOriginalImage.setMin getMin;

    @Provides
    public loadOriginalImage.setMax setMin(GriverH5Utils griverH5Utils) {
        return griverH5Utils;
    }

    public RequestMoneyQrModule(loadOriginalImage.setMin setmin) {
        this.getMin = setmin;
    }

    @Provides
    public loadOriginalImage.setMin setMax() {
        return this.getMin;
    }
}
