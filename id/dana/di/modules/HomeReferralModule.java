package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.CaptureListener;
import o.onAction;

@Module
public class HomeReferralModule {
    private onAction.length getMax;

    @Provides
    public onAction.setMax getMax(CaptureListener captureListener) {
        return captureListener;
    }

    public HomeReferralModule(onAction.length length) {
        this.getMax = length;
    }

    @Provides
    public onAction.length getMax() {
        return this.getMax;
    }
}
