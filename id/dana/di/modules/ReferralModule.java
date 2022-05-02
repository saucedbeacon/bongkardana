package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import javax.inject.Named;
import o.MemoryWarningBridgeExtension;
import o.SendUPDMessageExtension;

@Module
public class ReferralModule {
    private MemoryWarningBridgeExtension.getMax getMax;

    @PerActivity
    @Provides
    @Named("verifyReferralCodePresenter")
    public MemoryWarningBridgeExtension.length setMin(SendUPDMessageExtension sendUPDMessageExtension) {
        return sendUPDMessageExtension;
    }

    public ReferralModule(MemoryWarningBridgeExtension.getMax getmax) {
        this.getMax = getmax;
    }

    @PerActivity
    @Provides
    public MemoryWarningBridgeExtension.getMax getMin() {
        return this.getMax;
    }
}
