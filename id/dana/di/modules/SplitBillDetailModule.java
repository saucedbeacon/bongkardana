package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.AUNoticeDialog;

@Module
public class SplitBillDetailModule {
    private final AUNoticeDialog.AnonymousClass2.setMin getMax;

    @Provides
    public AUNoticeDialog.AnonymousClass2.setMax getMin(AUNoticeDialog.AnonymousClass3 r1) {
        return r1;
    }

    public SplitBillDetailModule(AUNoticeDialog.AnonymousClass2.setMin setmin) {
        this.getMax = setmin;
    }

    @Provides
    public AUNoticeDialog.AnonymousClass2.setMin getMin() {
        return this.getMax;
    }
}
