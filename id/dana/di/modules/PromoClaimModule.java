package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.isSupportCaptureFlush;
import o.openRecordMode;

@Module
public class PromoClaimModule {
    private openRecordMode.setMax getMax;

    @Provides
    public openRecordMode.setMin length(isSupportCaptureFlush issupportcaptureflush) {
        return issupportcaptureflush;
    }

    public PromoClaimModule(openRecordMode.setMax setmax) {
        this.getMax = setmax;
    }

    @Provides
    public openRecordMode.setMax setMin() {
        return this.getMax;
    }
}
